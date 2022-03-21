package com.dev.myfinances.controller;

import com.dev.myfinances.model.Category;
import com.dev.myfinances.rest.CategoryRestService;
import com.dev.myfinances.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController implements CategoryRestService {

    private final CategoryService categoryService;

    @Override
    public List<Category> getCategories() {
        return categoryService.getCategories();
    }
}
