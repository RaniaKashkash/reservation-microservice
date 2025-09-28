
package com.reservationmicroservice.reservationmicroservice.services;

import com.reservationmicroservice.reservationmicroservice.VO.Car;
import com.reservationmicroservice.reservationmicroservice.VO.Customer;
import com.reservationmicroservice.reservationmicroservice.VO.Location;
import com.reservationmicroservice.reservationmicroservice.VO.ResponseTemplateVO;
import com.reservationmicroservice.reservationmicroservice.models.Reservation;
import com.reservationmicroservice.reservationmicroservice.repositories.ReservationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository ReservationRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public List<Reservation> getAllReservations(){
    return this.ReservationRepository.findAll();
    }
    
    public Reservation getReservationById(Long id){
    return this.ReservationRepository.findById(id).get();
    }
    
    public Reservation addReservation(Reservation reservation){
    return  this.ReservationRepository.save(reservation);
    }


    
  
    public ResponseTemplateVO getReservationWithDetailsByReservationId(Long reservationId) {
        Reservation reservation=this.getReservationById(reservationId);
        Car car=this.restTemplate.getForObject("http://carmicroservice/cars/"+reservation.getCarId(), Car.class);
        Location location=this.restTemplate.getForObject("http://locationmicroservice/locations/"+reservation.getLocationId(), Location.class);
        Customer customer=this.restTemplate.getForObject("http://customermicroservice/customers/"+reservation.getCustomerId(), Customer.class);

        ResponseTemplateVO vo= new ResponseTemplateVO();
        vo.setReservation(reservation);
        vo.setLocation(location);
        vo.setCar(car);
        vo.setCustomer(customer);
        return vo;
    }  

    
}
