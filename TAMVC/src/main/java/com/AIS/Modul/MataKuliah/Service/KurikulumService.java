package com.AIS.Modul.MataKuliah.Service;

import com.AIS.Modul.MataKuliah.Model.Kurikulum;
import com.AIS.Modul.MataKuliah.Controller.KurikulumController;
import java.util.List;

public interface KurikulumService {
	public List<Kurikulum> findAll();
    public Kurikulum findById(String idKurikulum);
 
    public void addKurikulum(Kurikulum kurikulum);
    public void editKurikulum(Kurikulum kurikulum, String idKurikulum);
	boolean addKurikulumAction(String idKurikulum, String idSatMan, String tahunMulai, String tahunAkhir, Boolean statusKurikulum);
    boolean editKurikulumAction(String idKurikulum, String idSatMan, String tahunMulai, String tahunAkhir, Boolean statusKurikulum);
}
