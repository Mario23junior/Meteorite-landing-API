package com.project.meteorito.dto;

import com.opencsv.bean.CsvRecurse;
import com.project.meteorito.model.Metricas;

public class MeteoriteDTO {
  
	private Long id;
	private String name;
	private String nametype;
	private String recclass;
	private String massG;

	@CsvRecurse
	private Metricas metricas;

	public MeteoriteDTO() {
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

	public Metricas getMetricas() {
		return metricas;
	}

	public void setMetricas(Metricas metricas) {
		this.metricas = metricas;
	}

	@Override
	public String toString() {
		return "Meteorite [id=" + id + ", name=" + name + ", nametype=" + nametype + ", recclass=" + recclass
				+ ", massG=" + massG + ", metricas=" + metricas + "]";
	}
}
