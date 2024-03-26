package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.repository.ProductRepository;
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
}
