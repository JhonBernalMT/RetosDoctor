package com.usa.retosdoctor.repository.CrudRepository;


import com.usa.retosdoctor.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
