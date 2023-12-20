package org.learning.seleniumdesign;

import org.junit.jupiter.api.Test;

import org.learning.seleniumdesign.factory.GoogleEnglish;
import org.learning.seleniumdesign.factory.GoogleFrench;
import org.learning.seleniumdesign.util.HeaderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;


@SpringBootTest
class SeleniumdesignApplicationTests {

	@Autowired
	GoogleEnglish googleEnglish;

	@Autowired
	GoogleFrench googleFrench;

@Autowired
	public HeaderUtil headerUtil;

	@Test
	void contextLoads() {

		System.out.println(headerUtil.getEnv());
		googleEnglish.launchSite();
		googleEnglish.search("hello madam");
		//int resultsCount = googleEnglish.getResultsCount();
		//System.out.println("resultsCount" + resultsCount);

		googleFrench.launchSite();
		googleFrench.search("hello french");
	//	int resultsCountFrench = googleFrench.getResultsCount();
	//	System.out.println("resultsCount" + resultsCountFrench);


	}





}
