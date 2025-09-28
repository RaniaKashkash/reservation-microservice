/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservationmicroservice.reservationmicroservice.VO;

import com.reservationmicroservice.reservationmicroservice.models.Reservation;
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

public class ResponseTemplateVO {
    private Reservation reservation;
    private Location location;
    private Car car;
    private Customer customer;
}
