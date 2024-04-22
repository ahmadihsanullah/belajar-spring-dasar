package programmerzamannow.spring.core.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import programmerzamannow.spring.core.event.LoginSuccessEvent;

@Component
@Slf4j
public class UserListener {
    
    @EventListener(LoginSuccessEvent.class)
    public void onLoginSuccess(LoginSuccessEvent event){
        log.info("Success login for user {}", event.getUser());
    }
    @EventListener(LoginSuccessEvent.class)
    public void onLoginSuccess2(LoginSuccessEvent event){
        log.info("Success login for user {}", event.getUser());
    }
    @EventListener(LoginSuccessEvent.class)
    public void onLoginSuccess3(LoginSuccessEvent event){
        log.info("Success login for user {}", event.getUser());
    }
}
