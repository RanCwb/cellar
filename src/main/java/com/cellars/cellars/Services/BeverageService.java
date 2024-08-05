package com.cellars.cellars.Services;

import com.cellars.cellars.Errors.ErrorResponse;
import com.cellars.cellars.Models.Beverage;
import com.cellars.cellars.Repository.BeverageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeverageService {

    @Autowired
    private BeverageRepository baverageRepository;

    public ResponseEntity<?> createDrink(Beverage beverage) {
        if (baverageRepository.findExists(beverage.getName()).isPresent()) {
            return ResponseEntity
                    .badRequest()
                    .body(new ErrorResponse("Beverage with name " + beverage.getName() + " already exists"));

        }
        return new ResponseEntity<>(baverageRepository.save(beverage), HttpStatus.CREATED);
    }

}
