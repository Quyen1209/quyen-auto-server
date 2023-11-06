package com.vti.quyenauto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "car")
public class Car {
    @EmbeddedId
    private PrimaryKey pk;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "catalog", nullable = false)
    private String catalog;

    @Column(name = "car_maker", nullable = false)
    private String carMaker;

    @OneToMany(mappedBy = "car")
    private List<Accessory> accessories;

    @Getter
    @Setter
    @EqualsAndHashCode
    @Embeddable
    public static class PrimaryKey {
        @Column(name = "license_plate")
        private String licensePlate;

        @Column(name = "repair_date")
        private LocalDate repairDate;
    }
}
