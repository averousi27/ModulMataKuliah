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
	
	//Show kurikulum
	@RequestMapping(value="/menukurikulum", method=RequestMethod.GET)
	public ModelAndView showKurikulum(){
		ModelAndView mav = new ModelAndView(); 
		List<Kurikulum> kurikulumList = kurikulumServ.findAll();
		mav.addObject("kurikulums", kurikulumList);
		mav.setViewName("Kurikulum");
		return mav;
	}
	
	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public ModelAndView showSatManOption(){
		ModelAndView mav = new ModelAndView();
		List<SatMan> satManList = satManServ.findAll();
		mav.addObject("satmans", satManList);
		mav.setViewName("TambahKurikulum");
		return mav;
	}
	
		//tambah kurikulum
		@RequestMapping(value="/addNewKurikulumAction", method={RequestMethod.POST, RequestMethod.GET})
		public ModelAndView addKurikulumAction(String idKurikulumTxt, String idSatManTxt, String tahunMulaiTxt, 
				String tahunAkhirTxt, Boolean statusKurikulumTxt){
			ModelAndView mav = new ModelAndView();
			Boolean flag = kurikulumServ.addKurikulumAction(idKurikulumTxt, idSatManTxt, tahunMulaiTxt, tahunAkhirTxt, statusKurikulumTxt);
			if(flag){
				mav.setViewName("Kurikulum");
			}
			else{
				mav.setViewName("redirect:/menukurikulum/tambah");
			}
			return mav;
		}
}
