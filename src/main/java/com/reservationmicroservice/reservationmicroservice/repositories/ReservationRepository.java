/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.reservationmicroservice.reservationmicroservice.repositories;

import com.reservationmicroservice.reservationmicroservice.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rania
 */
@Repository

public interface ReservationRepository extends JpaRepository<Reservation , Long>{
    
}
