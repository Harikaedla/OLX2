package test_Scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom_scripts.JobsPage;

public class Olxproject extends Base_Test {

	@Test()
	public void test( )throws InterruptedException {
		JobsPage J1 = new JobsPage(driver);
		J1.click_AllCategories();
		J1.Click_Jobs();
		J1.Click_Teacher();
		J1.Click_Receptionist();
		J1.Click_ITEngineerandDeveloper();
		J1.Click_OtherJobs();
		J1.Click_DataEntry();
		J1.Click_Telangana();
		J1.Click_Hyderabad();
		J1.Click_Ameerpet();
		J1.Click_Fulltime();
		J1.Click_Monthly();
		J1.Click_SortBy();
		J1.Click_Relevance();
		J1.Click_Sort1();
		J1.Click_Filter2();
		J1.Click_Sort2();
		J1.Click_Filter3();
		J1.Click_ClearAll();
		
	}

}
