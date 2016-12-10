package com.sura.dominio;

public class PartidoDTO implements java.io.Serializable {
	
	private String iId;
	private String sDescription;
	private String dPlayDate;
	private TeamDTO team1;
	private TeamDTO team2;
	private String sResult;
	private String sScore;
	
	
	
	public PartidoDTO(String iId, String sDescription, TeamDTO team1, TeamDTO team2, String sScore) {
		this.iId = iId;
		this.sDescription = sDescription;
		this.team1 = team1;
		this.team2 = team2;
		this.sScore = sScore;
	}
	
	public String getiId() {
		return iId;
	}
	public void setiId(String iId) {
		this.iId = iId;
	}
	public String getsDescription() {
		return sDescription;
	}
	public void setsDescription(String sDescription) {
		this.sDescription = sDescription;
	}
	public String getdPlayDate() {
		return dPlayDate;
	}
	public void setdPlayDate(String dPlayDate) {
		this.dPlayDate = dPlayDate;
	}
	public TeamDTO getTeam1() {
		return team1;
	}
	public void setTeam1(TeamDTO team1) {
		this.team1 = team1;
	}
	public TeamDTO getTeam2() {
		return team2;
	}
	public void setTeam2(TeamDTO team2) {
		this.team2 = team2;
	}
	public String getsResult() {
		return sResult;
	}
	public void setsResult(String sResult) {
		this.sResult = sResult;
	}
	public String getsScore() {
		return sScore;
	}
	public void setsScore(String sScore) {
		this.sScore = sScore;
	}

	
}
