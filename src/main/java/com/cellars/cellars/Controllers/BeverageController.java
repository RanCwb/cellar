package com.cellars.cellars.Controllers;


import com.cellars.cellars.Models.Beverage;
import com.cellars.cellars.Repository.BeverageRepository;
import com.cellars.cellars.Services.BeverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/beverages")
public class BeverageController {

        @Autowired
        private BeverageRepository beverageRepository;

        @Autowired
        private BeverageService beverageService;


        @PostMapping("/create")
        public void createBeverage(Beverage beverage) {
            beverageService.createBeverage(beverage);
        }


}
