package com.sura.football.dao.soap;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import com.sura.dominio.CiudadDTO;
import com.sura.dominio.PartidoDTO;
import com.sura.dominio.TeamDTO;
import com.sura.football.dao.FootballDaoInt;
import com.sura.football.dao.soap.client.Info;
import com.sura.football.dao.soap.client.InfoSoapType;
import com.sura.gencode.ArrayOfString;
import com.sura.gencode.ArrayOftGameInfo;
import com.sura.gencode.TGameInfo;

public class FootballDaoSoap implements FootballDaoInt{
	
	private FootballServiceSoapClient soapClient;
	
	public FootballDaoSoap(){
		soapClient = new FootballServiceSoapClient();
	}
	
	public List<CiudadDTO> getCiudades() throws Exception {
		try{
			List<CiudadDTO> listaCuidades = new ArrayList<CiudadDTO>();
	    	ArrayOfString _cities__return = soapClient.getPort().cities();
	    	for(String nombre : _cities__return.getString()){
	    		listaCuidades.add(new CiudadDTO(nombre));
	    	}
			return listaCuidades;
	    } catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
	    }
	}

	public List<TGameInfo> getPartidosXCiudad(String ciudad) throws Exception {
		try{
	        ArrayOftGameInfo _gamesPerCity__return = soapClient.getPort().gamesPerCity(ciudad);
	        System.out.println("gamesPerCity.result=" + _gamesPerCity__return);
			return _gamesPerCity__return.getTGameInfo();
		} catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
	    }
	}

}
