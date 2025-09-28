/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservationmicroservice.reservationmicroservice.VO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Rania
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id; 

    private String brand; 

    private String model;

    private int year;

    private String color;

    private String licensePlate;

    private double pricePerDay;

    private String status;

    private LocalDateTime createdAt;
    
    private LocalDateTime updatedAt;
 
}

