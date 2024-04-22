package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import programmerzamannow.spring.core.Data.Foo;
import programmerzamannow.spring.core.Data.FooBar;
import programmerzamannow.spring.core.Data.MultiFoo;
import programmerzamannow.spring.core.configuration.OptionalConfiguration;

public class OptionalTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testOptional(){
        Foo foo = applicationContext.getBean(Foo.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertNull(fooBar.getBar());
        Assertions.assertSame(foo, fooBar.getFoo());
    }

    @Test
    void testOptionalWithProvide(){
        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);
        Assertions.assertEquals(3, multiFoo.getFoos().size());
    }    
}
