package com.dev.myfinances.service;

import com.dev.myfinances.model.Category;
import com.dev.myfinances.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public Category insertCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category getCategoryById(Integer id) {
        return categoryRepository.getById(id);
    }

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public void deleteCategory(Category category) {
        categoryRepository.delete(category);
    }

    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }
}
