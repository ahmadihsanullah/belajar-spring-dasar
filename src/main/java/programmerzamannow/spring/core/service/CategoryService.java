package programmerzamannow.spring.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import programmerzamannow.spring.core.repository.CategoryRepository;

@Component
public class CategoryService {
    
    @Getter
    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
