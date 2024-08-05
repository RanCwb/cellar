package com.cellars.cellars.Repository;

import com.cellars.cellars.Models.Beverage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

public interface BeverageRepository extends JpaRepository<Beverage, Long> {

  boolean existsByName(String name);

  @Query("SELECT b FROM Beverage b WHERE b.name = ?1")
  Optional<Beverage> findExists(String name);
}
