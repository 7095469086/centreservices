package com.htc.bookingservice.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bookings")
public class Booking {
	@Column
	private Long bookingId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long centreId;
	@Column
	private Long pincode;
	@Column 
	private Date bookingDate;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(Long bookingId, Long centreId, Long pincode, Date bookingDate) {
		super();
		this.bookingId = bookingId;
		this.centreId = centreId;
		this.pincode = pincode;
		this.bookingDate = bookingDate;
	}
	
	
	
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public Long getCentreId() {
		return centreId;
	}
	public void setCentreId(Long centreId) {
		this.centreId = centreId;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookingId, centreId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		return Objects.equals(bookingId, other.bookingId) && Objects.equals(centreId, other.centreId);
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", centreId=" + centreId + ", pincode=" + pincode + ", bookingDate="
				+ bookingDate + "]";
	}

	
}
