package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import programmerzamannow.spring.core.repository.CategoryRepository;
import programmerzamannow.spring.core.repository.CustomerRepository;
import programmerzamannow.spring.core.repository.ProductRepository;
import programmerzamannow.spring.core.service.CategoryService;
import programmerzamannow.spring.core.service.CustomerService;
import programmerzamannow.spring.core.service.ProductService;

public class ComponentTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @Test
    void testComponent() {
        ProductService productService = applicationContext.getBean(ProductService.class);

        Assertions.assertNotNull(productService);
    }

    @Test
    void testConstructorBaseOnParameterComponent() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        Assertions.assertNotNull(productService);

        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
        Assertions.assertNotNull(productRepository);

        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    void testSetterDependencyInjection(){
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        CategoryService categoryService = applicationContext.getBean(CategoryService.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }

    @Test
    void testFieldDependencyInjection(){
        CustomerService customerService = applicationContext.getBean(CustomerService.class);

        CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository", CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository", CustomerRepository.class);

        Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
        Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
    }

}
