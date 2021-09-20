package com.htc.bookingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.htc.bookingservice.entity.Booking;
import com.htc.bookingservice.persistence.IBooking;

@RestController
@RequestMapping("/api")
public class BookingController {
	private IBooking repo;
	 
	@GetMapping("/bookings/{bookingId}")
	Booking getBooking(@RequestParam Long bookingId)
	{
		Booking booking=null;
		booking=repo.findById(bookingId).get();
		return booking;
		
	}

	@GetMapping("/bookings/centreId")
	Booking getBookingByCentreId(@RequestParam("centreId") Long centreId)
	{
		Booking booking=null;
		booking=repo.findById(centreId).get();
		return booking;
		
	}
	@PostMapping("/bookings")
	Booking createBooking(@RequestBody Booking booking)
	{
		return repo.save(booking);
		
	}


	@Autowired
	public void setRepo(IBooking repo) {
		this.repo = repo;
	}
		

}
