package com.AIS.Modul.MataKuliah.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.AIS.Modul.MataKuliah.Model.Kurikulum;
import com.AIS.Modul.MataKuliah.Model.SatMan;
import com.AIS.Modul.MataKuliah.Service.KurikulumService;
import com.AIS.Modul.MataKuliah.Service.SatManService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KurikulumController {
	 
	@Autowired
	private KurikulumService kurikulumServ;
	
	@Autowired
	private SatManService satManServ;
	 
	@RequestMapping(value="/tambahkurikulum", method=RequestMethod.GET)
	public ModelAndView showSatManOption(){
		ModelAndView mav = new ModelAndView();
		List<SatMan> satManList = satManServ.findAll();
		mav.addObject("satMans", satManList);
		mav.setViewName("TambahKurikulum");
		return mav;
	}
	
		//tambah kurikulum
		@RequestMapping(value="/tambahkurikulum/aksi", method=RequestMethod.POST)
		public ModelAndView addKurikulumAction(String idKurikulumTxt, String idSatManTxt, String tahunMulaiTxt, 
				String tahunAkhirTxt, Boolean statusKurikulumOpt){
			ModelAndView mav = new ModelAndView();
			//System.out.println("ini tambah kurikulum" + idKurikulumTxt + " " + idSatManTxt + " " 
					//+ tahunMulaiTxt + " " + tahunAkhirTxt + " " + statusKurikulumOpt);
			Boolean flag = kurikulumServ.addKurikulumAction(idKurikulumTxt, idSatManTxt, tahunMulaiTxt, tahunAkhirTxt, statusKurikulumOpt);
			//System.out.println("ini hasil fungsi" + flag);
			if(flag){
				mav.setViewName("redirect:/kurikulum");
			}
			else{
				mav.setViewName("redirect:/tambahkurikulum");
			}
			return mav;
		}
		//end of tambah kurikulum
		
		@RequestMapping(value="/ubahkurikulum/kurikulum-{idKurikulum}", method=RequestMethod.GET)
		public ModelAndView getKurikulumData(@PathVariable String idKurikulum){
			ModelAndView mav = new ModelAndView();
			Kurikulum kurikulumUbah = kurikulumServ.findById(idKurikulum);
			mav.addObject("kurikulumObj", kurikulumUbah);
			List<SatMan> satManList = satManServ.findAll();
			mav.addObject("satMans", satManList);
			mav.setViewName("UbahKurikulum");
			return mav;
		}
		//ubah kurikulum
				@RequestMapping(value="ubahkurikulum/kurikulum-{idKurikulum}", method=RequestMethod.POST)
				public ModelAndView changeKurikulumAction(@PathVariable String idKurikulum, String idSatManTxt, String tahunMulaiTxt, 
						String tahunAkhirTxt, Boolean statusKurikulumOpt){
					ModelAndView mav = new ModelAndView();
					System.out.println("ini ubah kurikulum" + idKurikulum + " " + idSatManTxt + " " 
							+ tahunMulaiTxt + " " + tahunAkhirTxt + " " + statusKurikulumOpt);
					Boolean flag = kurikulumServ.editKurikulumAction(idKurikulum, idSatManTxt, 
							tahunMulaiTxt, tahunAkhirTxt, statusKurikulumOpt);
					System.out.println("ini hasil fungsi" + flag);
					if(flag){
						mav.setViewName("redirect:/kurikulum");
					}
					return mav;
				}
		//end of ubah kurikulum
}
