
public class Agent {

	public String codeName;
	private String realName;
	private int idNo;
	private ServiceRecord serviceRec;
	
	public Agent(String codeName, String realName, int idNo, String pre, String crnt, int years, int mission) {
		this.codeName = codeName;
		this.realName = realName;
		this.idNo = idNo;
		
		this.serviceRec = new ServiceRecord(pre, crnt, years, mission);
	}

	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public int getIdNo() {
		return idNo;
	}
	
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	
	public ServiceRecord getServiceRec() {
		return serviceRec;
	}
	
	public void setServiceRec(ServiceRecord serviceRec) {
		this.serviceRec = serviceRec;
	}
	
	public void promote(String rank) {
		this.serviceRec.setPreviousRank(this.serviceRec.getCurrentRank());
		this.serviceRec.setCurrentRank(rank);
	}
	
	public String printCurrentRank() {
		return this.serviceRec.currentRank;
	}
	
	public void missionSuccess() {
		this.serviceRec.incSuccessfulMissonCount();
	}
	
	public void addExperience() {
		this.serviceRec.incYearsOfService();
	}
	
	public void catchTerrorist(Terrorist trst) {
		System.out.println("Terrorsit " + trst.compromise() + " caught by " + this.realName);
	}
}
