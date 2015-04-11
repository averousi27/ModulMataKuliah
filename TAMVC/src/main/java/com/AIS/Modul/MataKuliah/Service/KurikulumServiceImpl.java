package com.AIS.Modul.MataKuliah.Service;

import java.util.List;

import com.AIS.Modul.MataKuliah.Model.Kurikulum;
import com.AIS.Modul.MataKuliah.Repository.KurikulumRepository;
import com.AIS.Modul.MataKuliah.Service.KurikulumService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Service
public class KurikulumServiceImpl implements KurikulumService {

	@Autowired
	private KurikulumRepository kurikulumRepo;
	
	@Autowired
	private SatManService satManServ;
	
	
	@Override
	public List<Kurikulum> findAll() {
		return kurikulumRepo.findAll();
	}

	@Override
	public Kurikulum findById(String idKurikulum) {
		return kurikulumRepo.findById(idKurikulum);
	
	}

	@Override
	public void editKurikulum(Kurikulum kurikulum, String idKurikulum) {
		kurikulumRepo.editKurikulum(kurikulum, idKurikulum);
		
	}

	@Override
	public void addKurikulum(Kurikulum kurikulum) {
		kurikulumRepo.addKurikulum(kurikulum);
		
	}

	@Override
	public boolean addKurikulumAction(String idKurikulum, String idSatMan,
			String tahunMulai, String tahunAkhir, Boolean statusKurikulum) {
		if(idSatMan != null && tahunMulai != null 
				&& tahunAkhir != null && statusKurikulum != null){
			Kurikulum kurikulum = new Kurikulum();
			kurikulum.setIdKurikulum(idKurikulum);
			kurikulum.setSatMan(satManServ.findById(idSatMan));
			kurikulum.setTahunMulai(tahunMulai);
			kurikulum.setTahunAkhir(tahunAkhir);
			kurikulum.setStatusKurikulum(statusKurikulum);
			
			this.editKurikulum(kurikulum, idKurikulum);;
			return true;
		}
		return false;
	}

	@Override
	public boolean editKurikulumAction(String idKurikulum, String idSatMan, String tahunMulai,
			String tahunAkhir, Boolean statusKurikulum) {
		if(idSatMan != null && tahunMulai != null 
				&& tahunAkhir != null && statusKurikulum != null){
			Kurikulum kurikulum = kurikulumRepo.findById(idKurikulum);
			kurikulum.setSatMan(satManServ.findById(idSatMan));
			kurikulum.setTahunMulai(tahunMulai);
			kurikulum.setTahunAkhir(tahunAkhir);
			kurikulum.setStatusKurikulum(statusKurikulum);
			this.editKurikulum(kurikulum, idKurikulum);
			
			return true;
		}
		return false;
	}
	
	
}
