package com.cellars.cellars.Services;

import com.cellars.cellars.Errors.ErrorResponse;
import com.cellars.cellars.Models.Category;
import com.cellars.cellars.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public ResponseEntity<?> createCategory(Category category) {
        if (category.getName() == null || category.getName().trim().isEmpty()) {
            return ResponseEntity
                    .badRequest()
                    .body(new ErrorResponse("Category name cannot be null or empty"));
        }
        Category  savedCategory  = categoryRepository.save(category);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedCategory);
    }


    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
