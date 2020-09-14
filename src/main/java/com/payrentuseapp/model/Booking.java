package com.payrentuseapp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@OneToOne(fetch = FetchType.EAGER, optional = false)      
    @JoinColumn(name = "vehicle_id", nullable = false,unique = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    // @JsonIgnore
	private Vehicle vehicleId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)      
    @JoinColumn(name = "user_id", nullable = false,unique = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    // @JsonIgnore
	private User userId;
	
	private int noOfHours;
	
	private long totalAmount;
	
	

	public Booking() {
		
	}



	public Vehicle getVehicleId() {
		return vehicleId;
	}



	public void setVehicleId(Vehicle vehicleId) {
		this.vehicleId = vehicleId;
	}



	public User getUserId() {
		return userId;
	}



	public void setUserId(User userId) {
		this.userId = userId;
	}



	public Long getId() {
		return Id;
	}



	public void setId(Long id) {
		Id = id;
	}



	


	


	public int getNoOfHours() {
		return noOfHours;
	}



	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}



	public long getTotalAmount() {
		return totalAmount;
	}



	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}



	@Override
	public String toString() {
		return "Booking [Id=" + Id + ", vehicleId=" + vehicleId + ", userId=" + userId + ", noOfHours=" + noOfHours
				+ ", totalAmount=" + totalAmount + "]";
	}
	
	
}
