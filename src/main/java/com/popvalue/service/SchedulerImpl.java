package com.popvalue.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerImpl {

	private static final String YYYY_MM_DD_HH_MM_SS_SSS = "yyyy-MM-dd HH:mm:ss.SSS";

	@Scheduled(fixedRateString = "${scheduler.CT}")
	public void getCTSData() {
		SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS_SSS);

		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Fixed Rate scheduler CTS:: " + strDate);
	}

	@Scheduled(fixedRateString = "${scheduler.EC}")
	public void getECGData() {
		SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS_SSS);

		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Fixed Rate scheduler ECG:: " + strDate);
	}

	@Scheduled(fixedRateString = "${scheduler.MR}")
	public void getMRIData() {
		SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS_SSS);

		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Fixed Rate scheduler MRI:: " + strDate);
	}

}
