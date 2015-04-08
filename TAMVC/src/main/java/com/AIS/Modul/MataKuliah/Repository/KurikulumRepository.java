package com.AIS.Modul.MataKuliah.Repository;

import java.util.List;
import com.AIS.Modul.MataKuliah.Model.Kurikulum;
import com.AIS.Modul.MataKuliah.Model.SatMan;

public interface KurikulumRepository {
	public List<Kurikulum> findAll();
    public Kurikulum findById(String idKurikulum);
    public void addKurikulum(Kurikulum kurikulum);
    public void editKurikulum(Kurikulum kurikulum, String idKurikulum); 
}
