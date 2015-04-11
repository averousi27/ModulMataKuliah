package com.AIS.Modul.MataKuliah.Model;

import java.util.List;
import java.util.Set;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sat_man")
public class SatMan{
	
	@Id
	@Column(name="id_sat_man")
	private String idSatMan; 
	
	@Column(name="nama_sat_man")
	private String namaSatMan;
	
	@Column(name="status_sat_man")
	private String statusSatMan; 
 
	@OneToMany(fetch=FetchType.LAZY, mappedBy="satman")
	private List<Kurikulum> kurikulums;

	public String getIdSatMan() {
		return idSatMan;
	}

	public void setIdSatMan(String idSatMan) {
		this.idSatMan = idSatMan;
	}

	public String getNamaSatMan() {
		return namaSatMan;
	}

	public void setNamaSatMan(String namaSatMan) {
		this.namaSatMan = namaSatMan;
	}

	public String getStatusSatMan() {
		return statusSatMan;
	}

	public void setStatusSatMan(String statusSatMan) {
		this.statusSatMan = statusSatMan;
	}

	public List<Kurikulum> getKurikulums() {
		return kurikulums;
	}

	public void setKurikulums(List<Kurikulum> kurikulums) {
		this.kurikulums = kurikulums;
	}
	
	
	
}