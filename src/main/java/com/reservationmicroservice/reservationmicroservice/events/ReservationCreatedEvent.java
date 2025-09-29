/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservationmicroservice.reservationmicroservice.events;

public class ReservationCreatedEvent {
    private Long reservationId;
    private Long customerId;
    private Long carId;
    private Long locationId;

    public ReservationCreatedEvent(Long reservationId, Long customerId, Long carId, Long locationId) {
        this.reservationId = reservationId;
        this.customerId = customerId;
        this.carId = carId;
        this.locationId = locationId;
    }

    public Long getReservationId() { return reservationId; }
    public Long getCustomerId() { return customerId; }
    public Long getCarId() { return carId; }
    public Long getLocationId() { return locationId; }
}