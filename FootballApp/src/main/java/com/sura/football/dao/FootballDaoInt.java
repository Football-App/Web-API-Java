package com.sura.football.dao;

import java.util.List;

import com.sura.dominio.CiudadDTO;
import com.sura.dominio.PartidoDTO;
import com.sura.gencode.TGameInfo;

public interface FootballDaoInt {
	
	public List<CiudadDTO> getCiudades() throws Exception;
	public List<TGameInfo> getPartidosXCiudad(String ciudad) throws Exception;

}
