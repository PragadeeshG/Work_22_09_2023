package com.test1;

public class RTPStoreSession {
	private Integer storeIndicator;
	private Integer sessionId;
	private Integer sessionDuration;
	private String ipAddress;
	private String SystemUser;
	private String sessionStartTime;
	private String sessionEndTime;
	private boolean isLongSession;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RTPStoreSession() {

	}

	public RTPStoreSession(Integer storeIndicator, Integer sessionId, Integer sessionDuration, String ipAddress,
			String systemUser, String sessionStartTime, String sessionEndTime, boolean isLongSession,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.storeIndicator = storeIndicator;
		this.sessionId = sessionId;
		this.sessionDuration = sessionDuration;
		this.ipAddress = ipAddress;
		SystemUser = systemUser;
		this.sessionStartTime = sessionStartTime;
		this.sessionEndTime = sessionEndTime;
		this.isLongSession = isLongSession;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getStoreIndicator() {
		return storeIndicator;
	}

	public void setStoreIndicator(Integer storeIndicator) {
		this.storeIndicator = storeIndicator;
	}

	public Integer getSessionId() {
		return sessionId;
	}

	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}

	public Integer getSessionDuration() {
		return sessionDuration;
	}

	public void setSessionDuration(Integer sessionDuration) {
		this.sessionDuration = sessionDuration;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getSystemUser() {
		return SystemUser;
	}

	public void setSystemUser(String systemUser) {
		SystemUser = systemUser;
	}

	public String getSessionStartTime() {
		return sessionStartTime;
	}

	public void setSessionStartTime(String sessionStartTime) {
		this.sessionStartTime = sessionStartTime;
	}

	public String getSessionEndTime() {
		return sessionEndTime;
	}

	public void setSessionEndTime(String sessionEndTime) {
		this.sessionEndTime = sessionEndTime;
	}

	public boolean isLongSession() {
		return isLongSession;
	}

	public void setLongSession(boolean isLongSession) {
		this.isLongSession = isLongSession;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
