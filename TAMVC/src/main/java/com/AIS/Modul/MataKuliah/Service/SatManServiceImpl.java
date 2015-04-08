package com.AIS.Modul.MataKuliah.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AIS.Modul.MataKuliah.Model.SatMan;
import com.AIS.Modul.MataKuliah.Repository.SatManRepository;

@Service
public class SatManServiceImpl implements SatManService{

	@Autowired
	private SatManRepository satManRepo;
		
	@Override
	public List<SatMan> findAll() {
		return satManRepo.findAll();
	}

	@Override
	public SatMan findById(String idSatMan) {
		return satManRepo.findById(idSatMan);
	}

	@Override
	public void addSatMan(SatMan satMan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editSatMan(SatMan kurikulum, String idSatMan) {
		// TODO Auto-generated method stub
		
	}

}
