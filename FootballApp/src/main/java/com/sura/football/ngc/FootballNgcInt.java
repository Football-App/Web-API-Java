package com.sura.football.ngc;

import java.util.List;

import com.sura.dominio.CiudadDTO;
import com.sura.dominio.PartidoDTO;

public interface FootballNgcInt {
	
	public List<CiudadDTO> getCuidades();
	public List<PartidoDTO> getPartidosXCiudad(String ciudad);

}
