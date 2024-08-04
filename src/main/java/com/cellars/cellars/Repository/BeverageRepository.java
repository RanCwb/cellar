package com.cellars.cellars.Repository;

import com.cellars.cellars.Models.Beverage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeverageRepository extends  JpaRepository<Beverage, Long> {
}
