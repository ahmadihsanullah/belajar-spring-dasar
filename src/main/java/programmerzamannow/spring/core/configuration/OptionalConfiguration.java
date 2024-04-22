package programmerzamannow.spring.core.configuration;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import programmerzamannow.spring.core.Data.Bar;
import programmerzamannow.spring.core.Data.Foo;
import programmerzamannow.spring.core.Data.FooBar;
import programmerzamannow.spring.core.Data.MultiFoo;

@Configuration
@Import(MultiFoo.class)
public class OptionalConfiguration {
    
    @Bean
    public Foo foo(){
        return new Foo();
    };

    @Bean
    public Foo foo1(){
        return new Foo();
    };

    @Bean
    public Foo foo2(){
        return new Foo();
    };

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
