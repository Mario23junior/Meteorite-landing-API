package com.project.meteorito.model;

public class Metricas {

	private String fall;
	private Integer year;
	private Double reclat;
	private Double reclong;
	private String GeoLocation;

	public Metricas() {
		// TODO Auto-generated constructor stub
	}

	public String getFall() {
		return fall;
	}

	public void setFall(String fall) {
		this.fall = fall;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getReclat() {
		return reclat;
	}

	public void setReclat(Double reclat) {
		this.reclat = reclat;
	}

	public Double getReclong() {
		return reclong;
	}

	public void setReclong(Double reclong) {
		this.reclong = reclong;
	}

	public String getGeoLocation() {
		return GeoLocation;
	}

	public void setGeoLocation(String geoLocation) {
		GeoLocation = geoLocation;
	}

	@Override
	public String toString() {
		return "Metricas [fall=" + fall + ", year=" + year + ", reclat=" + reclat + ", reclong=" + reclong
				+ ", GeoLocation=" + GeoLocation + "]";
	}

	 
	 

}
