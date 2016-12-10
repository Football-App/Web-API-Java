package com.sura.dominio;

public class TeamDTO implements java.io.Serializable{

	private String iId;
	private String sName;
	private String sCountryFlag;
	
	public TeamDTO(String iId, String sName) {
		super();
		this.iId = iId;
		this.sName = sName;
	}
	
	public TeamDTO(String iId, String sName, String sCountryFlag) {
		super();
		this.iId = iId;
		this.sName = sName;
		this.sCountryFlag = sCountryFlag;
	}

	public String getiId() {
		return iId;
	}

	public void setiId(String iId) {
		this.iId = iId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsCountryFlag() {
		return sCountryFlag;
	}

	public void setsCountryFlag(String sCountryFlag) {
		this.sCountryFlag = sCountryFlag;
	}
	
	
}
