package com.cellars.cellars.Services;


import com.cellars.cellars.Models.Beverage;
import com.cellars.cellars.Repository.BeverageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeverageService {

    @Autowired
    private BeverageRepository baverageRepository;


    public void createBeverage(Beverage beverage) {
        baverageRepository.save(beverage);
    }


    public List<Beverage> getAllBeverages() {
        return baverageRepository.findAll();
    }


}
