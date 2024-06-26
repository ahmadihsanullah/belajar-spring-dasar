package programmerzamannow.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import programmerzamannow.spring.core.listener.LoginSuccessListener;
import programmerzamannow.spring.core.listener.UserListener;
import programmerzamannow.spring.core.service.UserService;

public class EventListenerTest {
    @Configuration
    @Import({
        LoginSuccessListener.class,
        UserService.class,
        UserListener.class
    })
    public static class TestConfiguration{}

    private ConfigurableApplicationContext applicationContext;
    
    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testName() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("eko", "eko");
        userService.login("eko", "budi");
        userService.login("kurninawan", "salah");
    }


    
}
