package programmerzamannow.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import programmerzamannow.spring.core.Data.Foo;

@Configuration
public class DuplicateBeanConfiguration {
    
    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
