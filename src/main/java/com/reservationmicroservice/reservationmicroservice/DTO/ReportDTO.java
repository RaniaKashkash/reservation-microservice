/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservationmicroservice.reservationmicroservice.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Rania
 */
@Data
@NoArgsConstructor
public class ReportDTO {
    
    private Long reservationId;
    private Long customerId;
    private Long carId;
    private Double totalPrice;
    private String month;


}
