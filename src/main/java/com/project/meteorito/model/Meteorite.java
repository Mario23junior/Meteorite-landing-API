package com.project.meteorito.model;

import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.CsvRecurse;

public class Meteorite {

	private Long id;
	private String name;
	private String nametype;
	private String recclass;
	private String massG;

	@CsvRecurse
	private List<Metricas> metricas = new ArrayList<>();

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

	public List<Metricas> getMetricas() {
		return metricas;
	}

	public void setMetricas(List<Metricas> metricas) {
		this.metricas = metricas;
	}

	@Override
	public String toString() {
		return "Meteorite [id=" + id + ", name=" + name + ", nametype=" + nametype + ", recclass=" + recclass
				+ ", massG=" + massG + ", metricas=" + metricas + "]";
	}

}
