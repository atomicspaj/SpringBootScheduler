package com.popvalue.util;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesScan("scheduler")
public class SchedulerProperties {

	private String MR;

	private String CT;

	private String EC;

	public String getMR() {
		return MR;
	}

	public void setMR(String mR) {
		MR = mR;
	}

	public String getCT() {
		return CT;
	}

	public void setCT(String cT) {
		CT = cT;
	}

	public String getEC() {
		return EC;
	}

	public void setEC(String eC) {
		EC = eC;
	}

	
}
