package com.project.meteorito.model;

public class Meteorite {

	private Long id;
	private String name;
	private String nametype;
	private String recclass;
	private String massG;

	private String fall;
	private Integer year;
	private Double reclat;
	private Double reclong;
	private String GeoLocation;

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

	public Meteorite() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNametype() {
		return nametype;
	}

	public void setNametype(String nametype) {
		this.nametype = nametype;
	}

	public String getRecclass() {
		return recclass;
	}

	public void setRecclass(String recclass) {
		this.recclass = recclass;
	}

	public String getMassG() {
		return massG;
	}

	public void setMassG(String massG) {
		this.massG = massG;
	}

	@Override
	public String toString() {
		return "Meteorite [id=" + id + ", name=" + name + ", nametype=" + nametype + ", recclass=" + recclass
				+ ", massG=" + massG + ", fall=" + fall + ", year=" + year + ", reclat=" + reclat + ", reclong="
				+ reclong + ", GeoLocation=" + GeoLocation + "]";
	}

}
