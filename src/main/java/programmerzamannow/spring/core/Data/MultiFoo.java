package programmerzamannow.spring.core.Data;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class MultiFoo {
    
    @Getter
    private List<Foo> foos;

    public MultiFoo(ObjectProvider<Foo> objectProvider){
        foos = objectProvider.stream().collect(Collectors.toList());
    }
}
