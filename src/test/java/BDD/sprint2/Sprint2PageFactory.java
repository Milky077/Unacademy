package BDD.sprint2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sprint2PageFactory {

WebDriver driver = null;
	
	@FindBy(xpath="//button[@class='e1q9ftw5 aquilla-button button css-94wbnh-StyButton']")
	WebElement gotit;
	
	@FindBy(xpath="//button[@class='e13239452 aquilla-button button css-oxn9q9-NewLoginCTA']")
	WebElement loginlogo;
	
	@FindBy(xpath="//input[@placeholder='Enter your mobile number']")
	WebElement phnum;
	
	@FindBy(xpath="//button[@aria-label='Login']")
	WebElement login;
	
	
	@FindBy(xpath="//button[@aria-label='Verify OTP']")
	WebElement otp;
	
	@FindBy(xpath="//input[@class='seachInput aquilla-input input css-1i3foa3']")
	WebElement search;
	
	//@FindBy(xpath="//input[@class='seachInput aquilla-input input css-1i3foa3']")
	//WebElement 1;
	//@FindBy(xpath="//input[@class='seachInput aquilla-input input css-1i3foa3']")
	//WebElement 1;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[1]/div[3]/div[5]/button[1]/span")
	WebElement subplan;
	
	@FindBy(xpath="//button[@class='e1g0gkis6 aquilla-button button css-1w1kul9-StyledButton']")
	WebElement getlite;
	
	@FindBy(xpath="//button[@aria-label='Proceed to pay']")
	WebElement ptopay;
	
	@FindBy(xpath="//div[@data-id='7']")
	WebElement upi;
	
	@FindBy(xpath="//input[@placeholder='Enter UPI ID']")
	WebElement upidetails;
	
	@FindBy(xpath="//button[@aria-label='Pay']")
	WebElement pay;
	
	@FindBy(xpath="//button[@class='e1g0gkis6 aquilla-button button css-1uqqeul-StyledButton']")
	WebElement getplus;
	
	@FindBy(xpath="//button[@class='e1g0gkis6 aquilla-button button css-9iroz1-StyledButton']")
	WebElement geticonic;
	
	@FindBy(xpath="//div[@data-id='8']")
	WebElement emi;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div/div[2]/div[1]")
	WebElement cplan;
	
	@FindBy(xpath="//button[@class='e1g0gkis6 aquilla-button button css-1asql11-StyledButton']")
	WebElement ccenter;
	
	@FindBy(xpath="//button[@aria-label='View batches']")
	WebElement vbatches;
	
	@FindBy(xpath="//button[@aria-label='Accept']")
	WebElement accept_popup;
	
	public Sprint2PageFactory(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver, this);
    }
	
	public void gotit_popup() {
		gotit.click();
	}
	
	public void login_logo() {
		loginlogo.click();
	}
	
	public void phnum()  {
		phnum.sendKeys("9742190947");
	}
	public void login() {
		login.click();
	}
	
	public void verify_otp() {
		otp.click();
	}
	public WebElement search_btn() {
		search.click();
		return search;
	}
	public WebElement sub_plan() {
		subplan.click();
		return subplan;
	}
	public WebElement getlite_btn() {
		getlite.click();
		return getlite;
	}
	public void ptopay_btn() {
		ptopay.click();
	}
	public void upi_btn() {
		upi.click();
	}
	public void upi_details() throws InterruptedException {
		upidetails.click();
		Thread.sleep(2000);
		upidetails.sendKeys("abc");
	}
	public void pay() {
		pay.click();
	}
	public WebElement getplus_btn() {
		getplus.click();
		return getplus;
	}
	public WebElement geticonic_btn() {
		geticonic.click();
		return geticonic;
	}
	public void emi_btn() {
		emi.click();
	}
	public void c_plan() {
		cplan.click();
	}
	public WebElement c_center() {
		ccenter.click();
		return accept_popup;
	}
	public void v_batches() {
		vbatches.click();
	}
	public void accept_popup() {
		accept_popup.click();
	}
	
	public boolean ispagedisplayed() {
		return search.isDisplayed();
	}

	public void searchForEducator(String educatorName, String courseName) {
		// TODO Auto-generated method stub
		
	}

	
	
}
