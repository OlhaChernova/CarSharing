package org.example.carsharing.repository;

import org.example.carsharing.domain.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarModelRepositoty extends JpaRepository<CarModel, Long> {
}
