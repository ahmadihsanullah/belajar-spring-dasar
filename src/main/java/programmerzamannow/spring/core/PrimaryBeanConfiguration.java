package programmerzamannow.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import programmerzamannow.spring.core.Data.Foo;

@Configuration
public class PrimaryBeanConfiguration {
  @Primary
  @Bean(value = "fooFirst")
  public Foo foo1() {
    return new Foo();
  }

  @Bean(value = "fooSecond")
  public Foo foo2() {
    return new Foo();
  }
}
    