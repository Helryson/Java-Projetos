package model.services;

import java.time.Duration;

import model.entities.CarRental;

public class RentalService {

	private Double pricePerHour;
	private double pricePerday;
	
	private BrazilTaxService taxService;
	
	public RentalService(Double pricePerHour, double pricePerday, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerday = pricePerday;
		this.taxService = taxService;
	}
	
	public Double getPricePerHour() {
		return pricePerHour;
	}
	
	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	
	public double getPricePerday() {
		return pricePerday;
	}
	
	public void setPricePerday(double pricePerday) {
		this.pricePerday = pricePerday;
	}
	
	public void processInvoice(CarRental carRental) {
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60;
	}
	
}
