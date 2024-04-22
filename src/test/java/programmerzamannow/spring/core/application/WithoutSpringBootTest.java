package programmerzamannow.spring.core.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import programmerzamannow.spring.core.Data.Foo;

public class WithoutSpringBootTest {
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(FooApplication.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testWithSpringboot(){
        Foo foo = applicationContext.getBean(Foo.class);
    }

}
