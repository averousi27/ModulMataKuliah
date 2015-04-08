package com.AIS.Modul.MataKuliah.Service;

import java.util.List;

import com.AIS.Modul.MataKuliah.Model.SatMan;

public interface SatManService {

	public List<SatMan> findAll();
    public SatMan findById(String idSatMan);
 
    public void addSatMan(SatMan satMan);
    public void editSatMan(SatMan satMan, String idSatMan);
    
}
