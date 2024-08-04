package com.cellars.cellars.Controllers;

import com.cellars.cellars.Models.Category;
import com.cellars.cellars.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/api/categories")


    public class CategoryController {

        @Autowired
        private CategoryService categoryService;

        @PostMapping("/create")
        public ResponseEntity<?> createCategory(@RequestBody Category category) {
            return categoryService.createCategory(category);
        }


        @GetMapping("/all" )
        public List<Category> getAllCategories() {
            return categoryService.getAllCategories();
        }



    }

