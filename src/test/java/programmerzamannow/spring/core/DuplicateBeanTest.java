package programmerzamannow.spring.core;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import programmerzamannow.spring.core.Data.Foo;

public class DuplicateBeanTest {
    
    @Test
    void testDuplicate(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, ()->{
            context.getBean(Foo.class);
        });
    }

    @Test
    void testGetDuplicateBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }
}
