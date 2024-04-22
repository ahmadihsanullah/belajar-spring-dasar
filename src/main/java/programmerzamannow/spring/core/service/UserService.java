package programmerzamannow.spring.core.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import programmerzamannow.spring.core.Data.User;
import programmerzamannow.spring.core.event.LoginSuccessEvent;

@Component
@Slf4j
public class UserService implements ApplicationEventPublisherAware{

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password){
        if(isLogin(username, password)){
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        }else{
            return false;
        }
    }

    private boolean isLogin(String username, String password) {
        return "eko".equals(username) && "eko".equals(password);
    }
    
}
