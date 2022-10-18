package com.project.meteorito.model;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvRecurse;

public class Meteorite {

	@CsvBindByName(column = "id")
	private Integer id;

	@CsvBindByName(column = "name")
	private String name;

	@CsvBindByName(column = "nametype")
	private String nametype;

	@CsvBindByName(column = "recclass")
	private String recclass;

	@CsvBindByName(column = "massG")
	private String massG;

	@CsvRecurse
	private Metricas metricas;

	public Meteorite() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Metricas getMetricas() {
		return metricas;
	}

	public void setMetricas(Metricas metricas) {
		this.metricas = metricas;
	}

}
