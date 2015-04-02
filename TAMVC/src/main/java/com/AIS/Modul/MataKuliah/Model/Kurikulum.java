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
@Table(name="kurikulum")
public class Kurikulum{
	
	@Id
	@Column(name="id_kurikulum")
	private String idKurikulum;

	@ManyToOne
	@JoinColumn(name="id_sat_man")
	private SatMan satman;
	
	@Column(name="tahun_mulai")
	private String tahunMulai;
	
	@Column(name="tahun_akhir")
	private String tahunAkhir;
	
	@Column(name="statusKurikulum")
	private Boolean statusKurikulum;

	public String getIdKurikulum() {
		return idKurikulum;
	}

	public void setIdKurikulum(String idKurikulum) {
		this.idKurikulum = idKurikulum;
	}

	public SatMan getSatman() {
		return satman;
	}

	public void setSatman(SatMan satman) {
		this.satman = satman;
	}

	public String getTahunMulai() {
		return tahunMulai;
	}

	public void setTahunMulai(String tahunMulai) {
		this.tahunMulai = tahunMulai;
	}

	public String getTahunAkhir() {
		return tahunAkhir;
	}

	public void setTahunAkhir(String tahunAkhir) {
		this.tahunAkhir = tahunAkhir;
	}

	public Boolean getStatusKurikulum() {
		return statusKurikulum;
	}

	public void setStatusKurikulum(Boolean statusKurikulum) {
		this.statusKurikulum = statusKurikulum;
	}

}