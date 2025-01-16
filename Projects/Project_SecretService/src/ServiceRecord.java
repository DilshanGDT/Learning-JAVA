
public class ServiceRecord {

	private String previousRank; 
	public String currentRank;
	private int yearsOfService;
	private int successfulMissonCount;
	
	public ServiceRecord(String previousRank, String currentRank, int yearsOfService, int successfulMissonCount) {
 		this.previousRank = previousRank;
		this.currentRank = currentRank;
		this.yearsOfService = yearsOfService;
		this.successfulMissonCount = successfulMissonCount;
	}

	public String getCurrentRank() {
		return currentRank;
	}

	public void setCurrentRank(String currentRank) {
		this.currentRank = currentRank;
	}

	public String getPreviousRank() {
		return previousRank;
	}

	public void setPreviousRank(String previousRank) {
		this.previousRank = previousRank;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

	public int getSuccessfulMissonCount() {
		return successfulMissonCount;
	}

	public void setSuccessfulMissonCount(int successfulMissonCount) {
		this.successfulMissonCount = successfulMissonCount;
	}

	void incYearsOfService() {
		this.yearsOfService += 1;
	}
	
	void incSuccessfulMissonCount() {
		this.successfulMissonCount += 1;
	}
}
