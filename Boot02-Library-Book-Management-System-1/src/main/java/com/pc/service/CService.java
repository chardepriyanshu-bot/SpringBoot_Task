package com.pc.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CService {
	// Don't use try with resource because it closes the object as soon as object 
	// so that scheduling not performed.
	
	@Scheduled(cron="*/4 * * * * *")
	public void backupDatabase() {
		System.out.println("CService::backupDatabase()");
		System.out.println("Database Backup Started...");
	}
}
