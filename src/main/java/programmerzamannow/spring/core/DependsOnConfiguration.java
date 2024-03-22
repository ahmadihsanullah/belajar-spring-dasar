package programmerzamannow.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import lombok.extern.slf4j.Slf4j;
import programmerzamannow.spring.core.Data.Bar;
import programmerzamannow.spring.core.Data.Foo;

@Slf4j
@Configuration
public class DependsOnConfiguration {
    @Bean
    @DependsOn({
        "bar"
    })
    @Lazy
    public Foo foo(){
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Create new Bar");
        return new Bar();
    }
}
