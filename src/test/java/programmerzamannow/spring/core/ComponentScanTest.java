package programmerzamannow.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.Data.Bar;
import programmerzamannow.spring.core.Data.Foo;

public class ComponentScanTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testComponentScan() {
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
    }
}
