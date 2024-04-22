package programmerzamannow.spring.core;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import programmerzamannow.spring.core.factory.PaymentGatewayClientFactoryBean;

@Component
@Import({
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
    
}
