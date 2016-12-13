package com.sura.football.ngc;

import java.util.List;

import com.sura.dominio.CiudadDTO;
import com.sura.dominio.PartidoDTO;
import com.sura.gencode.TGameInfo;

public interface FootballNgcInt {
	
	public List<CiudadDTO> getCuidades();
	public List<TGameInfo> getPartidosXCiudad(String ciudad);

}
