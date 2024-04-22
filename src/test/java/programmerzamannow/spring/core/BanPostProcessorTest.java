package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerzamannow.spring.core.Data.Car;
import programmerzamannow.spring.core.processor.IdGeneratorBeanPostProcessor;

public class BanPostProcessorTest {

    @Configuration
    @Import({
            Car.class,
            IdGeneratorBeanPostProcessor.class
    })
    public static class TestConfiguration{
    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testIdAware() {
        Car car = applicationContext.getBean(Car.class);
        Assertions.assertNotNull(car.getId());
        System.out.println(car.getId());
    }
}
