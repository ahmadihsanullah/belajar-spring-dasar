package programmerzamannow.spring.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import programmerzamannow.spring.core.repository.CustomerRepository;

@Configuration
public class CustomerCofiguration {
    
    @Bean
    @Primary
    public CustomerRepository normalCustomerRepository(){
        return new CustomerRepository();
    };

    @Bean
    public CustomerRepository premiumCustomerRepository(){
        return new CustomerRepository();
    };
}
