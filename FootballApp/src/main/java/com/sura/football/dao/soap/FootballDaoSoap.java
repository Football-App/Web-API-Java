package com.sura.football.dao.soap;

import java.util.ArrayList;
import java.util.List;

import com.sura.dominio.CiudadDTO;
import com.sura.dominio.PartidoDTO;
import com.sura.dominio.TeamDTO;
import com.sura.football.dao.FootballDaoInt;

public class FootballDaoSoap implements FootballDaoInt{

	public List<CiudadDTO> getCiudades() {
		List<CiudadDTO> listaCuidades = new ArrayList<CiudadDTO>();
		listaCuidades.add(new CiudadDTO("Bordeaux"));
		listaCuidades.add(new CiudadDTO("Lens"));
		listaCuidades.add(new CiudadDTO("Lille"));
		listaCuidades.add(new CiudadDTO("Lyon"));
		listaCuidades.add(new CiudadDTO("Marseille"));
		listaCuidades.add(new CiudadDTO("Nice"));
		listaCuidades.add(new CiudadDTO("Paris"));
		listaCuidades.add(new CiudadDTO("Saint-Denis"));
		listaCuidades.add(new CiudadDTO("Saint-Étienne"));
		listaCuidades.add(new CiudadDTO("Toulouse"));
		return listaCuidades;
	}

	public List<PartidoDTO> getPartidosXCiudad(String ciudad) {
		List<PartidoDTO> listaPartidos = new ArrayList<PartidoDTO>();
		listaPartidos.add(new PartidoDTO("1", "Match 1", new TeamDTO("19", "France", "http://footballpool.dataaccess.eu/images/flags/fr.gif"), 
								new TeamDTO("28", "Romania", "http://footballpool.dataaccess.eu/images/flags/ro.gif"), "2-1"));
		return listaPartidos;
	}

}
