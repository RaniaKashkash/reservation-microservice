/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservationmicroservice.reservationmicroservice.controllers;

import com.reservationmicroservice.reservationmicroservice.VO.ResponseTemplateVO;
import com.reservationmicroservice.reservationmicroservice.models.Reservation;
import com.reservationmicroservice.reservationmicroservice.services.ReservationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Rania
 */
@RestController
@RequestMapping("/reservations")

public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    
    @GetMapping("/")
    public ResponseEntity<List<Reservation>> showAllReservations(){
    List<Reservation> reservations=this.reservationService.getAllReservations();
    return new ResponseEntity<>(reservations,HttpStatus.OK);
    }

    
    @PostMapping("/add")
    public ResponseEntity<Reservation> addReservation(@RequestBody Reservation reservation){
        Reservation newReservation=this.reservationService.addReservation(reservation);
        return new ResponseEntity<>(newReservation,HttpStatus.CREATED);
    }
    

    
    @GetMapping("/{id}")
    public ResponseEntity<ResponseTemplateVO> getReservationWithFullDetailsByReservationId(@PathVariable("id") Long reservationId){
       ResponseTemplateVO vo=this.reservationService.getReservationWithDetailsByReservationId(reservationId); 
       return new ResponseEntity<>(vo,HttpStatus.OK);
    }
    
}

