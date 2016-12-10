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
		return footballDao.getCiudades();
	}

	@RequestMapping(value = "/partidosXciudad", method = RequestMethod.POST	)
	public List<PartidoDTO> getPartidosXCiudad(@RequestParam("ciudad") String ciudad) {
		System.out.println("Cuidad: "+ciudad);
		return footballDao.getPartidosXCiudad(ciudad);
	}

}
