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
public class MarketingDTO {
private String title;
private String description;
private Double discountPercent;
private String status;
private Long reservationId;

}
