/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservationmicroservice.reservationmicroservice.VO;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Rania
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
   private Long id;
    
    private String name;
    
    private String address;
    
    private String opening_hours;
    
    private LocalDateTime created_at;
    
    private LocalDateTime updated_at; 
}
