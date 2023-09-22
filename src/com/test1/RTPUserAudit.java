package com.test1;

public class RTPUserAudit {
	private Integer userId;
	private String uploadTime;
	private String uploadFileName;
	private String uploadDuration;
	private Integer uploadSize;
	private String remarks;
	private String dataHashingDone;
	private String hashingAlgorithm;
	private String uploadHost;
	private String intentedUsage;
	private String creation_date;
	private String entityState;
	private String modifiedDate;

	public RTPUserAudit() {

	}

	public RTPUserAudit(Integer userId, String uploadTime, String uploadFileName, String uploadDuration,
			Integer uploadSize, String remarks, String dataHashingDone, String hashingAlgorithm, String uploadHost,
			String intentedUsage, String creation_date, String entityState, String modifiedDate) {
		super();
		this.userId = userId;
		this.uploadTime = uploadTime;
		this.uploadFileName = uploadFileName;
		this.uploadDuration = uploadDuration;
		this.uploadSize = uploadSize;
		this.remarks = remarks;
		this.dataHashingDone = dataHashingDone;
		this.hashingAlgorithm = hashingAlgorithm;
		this.uploadHost = uploadHost;
		this.intentedUsage = intentedUsage;
		this.creation_date = creation_date;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadDuration() {
		return uploadDuration;
	}

	public void setUploadDuration(String uploadDuration) {
		this.uploadDuration = uploadDuration;
	}

	public Integer getUploadSize() {
		return uploadSize;
	}

	public void setUploadSize(Integer uploadSize) {
		this.uploadSize = uploadSize;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDataHashingDone() {
		return dataHashingDone;
	}

	public void setDataHashingDone(String dataHashingDone) {
		this.dataHashingDone = dataHashingDone;
	}

	public String getHashingAlgorithm() {
		return hashingAlgorithm;
	}

	public void setHashingAlgorithm(String hashingAlgorithm) {
		this.hashingAlgorithm = hashingAlgorithm;
	}

	public String getUploadHost() {
		return uploadHost;
	}

	public void setUploadHost(String uploadHost) {
		this.uploadHost = uploadHost;
	}

	public String getIntentedUsage() {
		return intentedUsage;
	}

	public void setIntentedUsage(String intentedUsage) {
		this.intentedUsage = intentedUsage;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
