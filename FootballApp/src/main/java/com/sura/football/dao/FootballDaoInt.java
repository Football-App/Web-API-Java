package com.sura.football.dao;

import java.util.List;

import com.sura.dominio.CiudadDTO;
import com.sura.dominio.PartidoDTO;

public interface FootballDaoInt {
	
	public List<CiudadDTO> getCiudades();
	public List<PartidoDTO> getPartidosXCiudad(String ciudad);

}
