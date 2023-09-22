package com.test1;

public class RTPStoreConfig {
	private Integer storeIndicator;
	private String storeName;
	private String storeURL;
	private String hostName;
	private String password;
	private boolean encrypted;
	private String encryptionType;
	private String creation_date;
	private String entityState;
	private String modifiedDate;
	private String remarks;

	public RTPStoreConfig() {

	}

	public RTPStoreConfig(Integer storeIndicator, String storeName, String storeURL, String hostName, String password,
			boolean encrypted, String encryptionType, String creation_date, String entityState, String modifiedDate,
			String remarks) {
		super();
		this.storeIndicator = storeIndicator;
		this.storeName = storeName;
		this.storeURL = storeURL;
		this.hostName = hostName;
		this.password = password;
		this.encrypted = encrypted;
		this.encryptionType = encryptionType;
		this.creation_date = creation_date;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
		this.remarks = remarks;
	}

	public Integer getStoreIndicator() {
		return storeIndicator;
	}

	public void setStoreIndicator(Integer storeIndicator) {
		this.storeIndicator = storeIndicator;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreURL() {
		return storeURL;
	}

	public void setStoreURL(String storeURL) {
		this.storeURL = storeURL;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEncrypted() {
		return encrypted;
	}

	public void setEncrypted(boolean encrypted) {
		this.encrypted = encrypted;
	}

	public String getEncryptionType() {
		return encryptionType;
	}

	public void setEncryptionType(String encryptionType) {
		this.encryptionType = encryptionType;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
