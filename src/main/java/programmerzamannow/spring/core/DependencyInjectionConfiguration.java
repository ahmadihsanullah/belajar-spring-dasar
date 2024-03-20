package programmerzamannow.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerzamannow.spring.core.Data.Bar;
import programmerzamannow.spring.core.Data.Foo;
import programmerzamannow.spring.core.Data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {
    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }


}
