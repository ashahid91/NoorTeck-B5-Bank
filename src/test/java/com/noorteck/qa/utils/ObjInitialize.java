package com.noorteck.qa.utils;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoanPage;
import com.noorteck.qa.pages.TransfersPage;

public class ObjInitialize extends Constants {

	public static  void initializeClassObj() {
		homePageObj = new HomePage();
		transfersPageObj= new TransfersPage();
		loanPageObj= new LoanPage();
	}

}
