package programmerzamannow.spring.core.Scope;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import programmerzamannow.spring.core.BarConfiguration;
import programmerzamannow.spring.core.FooConfiguration;

@Configuration
@Import(value = {
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
    
}
