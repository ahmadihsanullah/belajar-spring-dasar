package programmerzamannow.spring.core.factory;

import org.springframework.beans.factory.FactoryBean;

import programmerzamannow.spring.core.client.PaymentGatewayClient;

public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient>{

    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient paymentGatewayClient = new PaymentGatewayClient();
        paymentGatewayClient.setEndPoint("https://example.com");
        paymentGatewayClient.setPrivateKey("private");
        paymentGatewayClient.setPublicKey("public");
        return paymentGatewayClient;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
    
}
