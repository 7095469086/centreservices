package com.htc.bookingservice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.bookingservice.entity.Booking;

public interface IBooking extends JpaRepository<Booking,Long> {

}
