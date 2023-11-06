package com.vti.quyenauto.service;

import com.vti.quyenauto.dto.CarDto;
import com.vti.quyenauto.entity.Car;
import com.vti.quyenauto.form.CarCreateForm;
import com.vti.quyenauto.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    Page<CarDto> findAll(Pageable pageable);

    CarDto create(CarCreateForm form);

    CarDto update(CarUpdateForm form);

    void deleteById(Car.PrimaryKey pk);
}
