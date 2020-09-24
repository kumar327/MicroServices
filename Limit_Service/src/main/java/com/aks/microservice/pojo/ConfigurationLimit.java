package com.aks.microservice.pojo;

public class ConfigurationLimit {

	private long minLimit;
	private long maxLimit;

	public long getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(long maxLimit) {
		this.maxLimit = maxLimit;
	}

	public long getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(long minLimit) {
		this.minLimit = minLimit;
	}

}
