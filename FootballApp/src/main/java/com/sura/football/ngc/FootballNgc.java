package com.sura.football.ngc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sura.dominio.CiudadDTO;
import com.sura.dominio.PartidoDTO;
import com.sura.football.dao.FootballDaoInt;
import com.sura.gencode.TGameInfo;

@RestController
@RequestMapping(value = "/football")
public class FootballNgc implements FootballNgcInt {
	
	@Autowired
	FootballDaoInt footballDao;
	
	public void setFootballDao(FootballDaoInt footballDao) {
		this.footballDao = footballDao;
	}

	@RequestMapping(value = "/ciudades", method = RequestMethod.GET)
	public List<CiudadDTO> getCuidades() {
		try {
			return footballDao.getCiudades();
		} catch (Exception e) {
			// TODO: Manejo de la expeción en cara al front-end y en log lo técnico 
			e.printStackTrace();
			return null; //TODO: Mala práctica, falta mejorar el tratamiento de las excepciones 
		}
		
	}

	@RequestMapping(value = "/partidosXciudad", method = RequestMethod.POST	)
	public List<TGameInfo> getPartidosXCiudad(@RequestParam("ciudad") String ciudad) {
		System.out.println("Cuidad: "+ciudad);
		try {
			return footballDao.getPartidosXCiudad(ciudad);
		} catch (Exception e) {
			// TODO: Manejo de la expeción en cara al front-end y en log lo técnico
			e.printStackTrace();
			return null; //TODO: Mala práctica, falta mejorar el tratamiento de las excepciones 
		}
	}

}
