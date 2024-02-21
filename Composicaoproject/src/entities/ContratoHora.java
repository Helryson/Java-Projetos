package entities;

import java.util.Date;

public class ContratoHora {
	
	private Date data;
	private Double valuePerHour;
	private Integer hours;
	
	public ContratoHora() {
	}

	public ContratoHora(Date data, Double valuePerHour, Integer hours) {
		super();
		this.data = data;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour*hours;
	}
	
}
