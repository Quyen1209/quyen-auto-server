package com.vti.quyenauto.repository;

import com.vti.quyenauto.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Car.PrimaryKey> {
}
