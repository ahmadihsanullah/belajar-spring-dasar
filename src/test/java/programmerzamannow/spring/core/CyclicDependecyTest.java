package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicDependecyTest {
    
    @Test
    void testCyclicDepends(){
        Assertions.assertThrows(Throwable.class, 
            ()->{
                ApplicationContext applicationContext = 
                new AnnotationConfigApplicationContext(CyclicConfiguration.class);
            });
    }
}
