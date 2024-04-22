package programmerzamannow.spring.core.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.aware.IdAware;

import java.util.UUID;

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix id Generator after for beanName{}", beanName);
        if(bean instanceof IdAware){
            log.info("Prefix setId  for beanName{}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("PZN-"+idAware.getId());
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
