package pom_scripts;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobsPage extends BasePage {
	public JobsPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//div[@class='_3wAbV']")
	WebElement AllCategories;
	public void click_AllCategories()
	{
		clickAction(AllCategories);
	}
	
	
	@FindBy(linkText="Jobs")
	WebElement Jobs;
	public void Click_Jobs() {
		clickAction(Jobs);
	}
	
	
	@FindBy(xpath="(//span[text()='Teacher'])[2]")
	WebElement Teacher;
	public void Click_Teacher() {
		clickAction(Teacher);
	}
	
	
	@FindBy(xpath="(//span[text()='Receptionist & Front office'])[2]")
	WebElement Receptionist ;
	public void Click_Receptionist() {
		clickAction(Receptionist);
	}
	
	
	@FindBy(xpath="(//span[text()='IT Engineer & Developer'])[2]")
	WebElement ITEngineerandDeveloper;
	public void Click_ITEngineerandDeveloper() {
		clickAction(ITEngineerandDeveloper);
	}
	
	
	@FindBy(xpath="(//span[text()='Other Jobs'])[2]")
	WebElement OtherJobs;
	public void Click_OtherJobs() {
		clickAction(OtherJobs);
	}
	
	
	@FindBy(xpath="//a[@data-aut-id='subcategory_1737']")
	WebElement DataEntry;
	public void Click_DataEntry() {
		clickAction(DataEntry);
	}
	@FindBy(xpath="//a[@data-aut-id='location_Telangana']")
	WebElement Telangana;
	public void Click_Telangana() {
		clickAction(Telangana);
	}
	
	@FindBy(xpath="//a[@data-aut-id='location_Hyderabad']")
	WebElement Hyderabad;
	public void Click_Hyderabad() {
		clickAction(Hyderabad);
	}
	@FindBy(xpath="//a[@data-aut-id='location_Ameerpet']")
	WebElement Ameerpet;
	public void Click_Ameerpet() {
		clickAction(Ameerpet);
	}
	@FindBy(xpath="//label[@for='f-job_type-fulltime']")
	WebElement Fulltime;
	public void Click_Fulltime() {
		clickAction(Fulltime);
	}
	@FindBy(xpath="(//div[@class='rui-U7OXn'])[8]")
	WebElement Monthly;
	public void Click_Monthly() {
		clickAction(Monthly);
	}
	@FindBy(xpath="//span[text()='Sort By']")
	WebElement SortBy;
	public void Click_SortBy() {
		clickAction(SortBy);
	}
	@FindBy(xpath="//span[text()='Relevance']")
	WebElement Relevance;
	public void Click_Relevance() {
		clickAction(Relevance);
	}
	
	@FindBy(xpath="//span[text()='Sort By']")
	WebElement Sort1;
	public void Click_Sort1() {
		clickAction(Sort1);
	}
	@FindBy(xpath="(//div[@class='_2-IT4'])[3]")
	WebElement Filter2;
	public void Click_Filter2() {
		clickAction(Filter2);
	}
	@FindBy(xpath="//span[text()='Sort By']")
	WebElement Sort2;
	public void Click_Sort2() {
		clickAction(Sort2);
	}
	@FindBy(xpath="//span[text()='Distance']")
	WebElement Filter3;
	public void Click_Filter3() {
		clickAction(Filter3);
	}
	@FindBy(xpath="(//span[text()='Clear All'])[2]")
	WebElement ClearAll;
	public void Click_ClearAll() {
		clickAction(ClearAll);
	}
	
}
