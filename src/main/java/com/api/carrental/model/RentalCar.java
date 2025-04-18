package com.api.carrental.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rental_cars")
public class RentalCar {

//    public enum CarStatus {
//        AVAILABLE,
//        RENTED_OUT,
//        MAINTENANCE
//    }
//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rentalcarId;
//
//    @Column(nullable = false)
//    private String model;
//
//    @Column(nullable = false)
//    private String year;
//
//    @Column(nullable = false)
//    private double price;
//
//    @Column(nullable = false)
//    private String brand;
//
//    @Column(nullable = false)
//    private String fuelType;
//
//    @Column(nullable = false)
//    private String transmission;
//
//    @Column(nullable = false)
//    private String mileage;
//
//    @Enumerated(EnumType.STRING)
//    @Column(nullable = false)
//    private CarStatus carStatus;
//    
    @Column(nullable = false)
    private double dailyRate;

    private Double weeklyRate;

    private Double monthlyRate;

    @Column(nullable = false)
    private double securityDeposit;

    private String additionalFees;
    
    @ManyToOne
    private Customer customer;

	public int getRentalcarId() {
		return rentalcarId;
	}

	public void setRentalcarId(int rentalcarId) {
		this.rentalcarId = rentalcarId;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public Double getWeeklyRate() {
		return weeklyRate;
	}

	public void setWeeklyRate(Double weeklyRate) {
		this.weeklyRate = weeklyRate;
	}

	public Double getMonthlyRate() {
		return monthlyRate;
	}

	public void setMonthlyRate(Double monthlyRate) {
		this.monthlyRate = monthlyRate;
	}

	public double getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	public String getAdditionalFees() {
		return additionalFees;
	}

	public void setAdditionalFees(String additionalFees) {
		this.additionalFees = additionalFees;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


}
