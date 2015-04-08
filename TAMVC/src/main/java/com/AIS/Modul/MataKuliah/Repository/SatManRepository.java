package com.AIS.Modul.MataKuliah.Repository;

import java.util.List;

import com.AIS.Modul.MataKuliah.Model.SatMan;

public interface SatManRepository {
	public List<SatMan> findAll();
    public SatMan findById(String idSatMan);
    public void addSatMan(SatMan satMan);
    public void editSatMan(SatMan satMan, String idSatMan); 
}
