package rmg.smoke;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_ {

	static final Point WINDOW_POSITION = new Point(50, 50);
	static final Dimension WINDOW_SIZE = new Dimension(1300, 900);
	static final int LEVEL_0_INDENT = 0;
	static final int LEVEL_1_INDENT = 2;
	static final int LEVEL_2_INDENT = 4;
	
	static WebDriver driver = null;
	
	// Initialise Strings
	public static final String strGlobalAdminUserName = "global1";
	public static final String strAdminUserName = "master1";
//	public static String strRequesterUserName;
	public static String strNativeRequesterUserName;
	public static String strThirdPartyRequesterUserName;
	public static final String strSurveyorUserName = "surveyor2";
	public static final String strNativeSurveyorUserName = "surveyor1";
	public static final String strThirdPartySurveyorUserName = "surveyor3";
	public static final String strPassword = "Test1234!";
	public boolean isAcceptTerms;
	public String strLoggedOnUserName;
	public String strUserType;
	public static String strCustomer;
	public String strWorkItemStatus;
	public boolean isUrgent;
	public static String strSurveyType;
	public static String strWorkItem;
	public static boolean isWorkRequestFieldsOptional;
	public static boolean isWorkRequestSubmit;
	public static boolean isThirdPartySurvey;
	public static boolean isRIPSubscribed;
	public boolean isInSecondBranch;
	public boolean isSelectedCountryUK;
	public static final String strPriorityUrgent = "Urgent ";
	public static final String strPriorityRoutine = "Routine ";
	public static final String strCCISurveyType = "CCI Survey";
	public static final String strCHSSurveyType = "CHS Survey";
	public static final String strLIASurveyType = "LIA Survey";
	public static final String strPACSurveyType = "PAC Survey";
	public static final String strPOSSurveyType = "POS Survey";
	public static final String strRBSSurveyType = "RBS Survey";
	public static final String strTHPSurveyType = "THP Survey";
	public static final String strAutoAdd = "Test auto add ";
	
	//public static final String strSurveyorUser = "Surveyor ";
	//public static final String strDevSurveyorUser = "Native Surveyor ";
	//public static final String strThirdPartySurveyorUser = "Third-Party Surveyor ";
	public static final String strRequestInDraftStatus = "Request In Draft";
	public static final String strRequestRejectedStatus = "Request Rejected";
	public static final String strRequestInQueryStatus = "Request In Query";
	public static final String strRequestAcceptedStatus = "Request Accepted";
	public static final String strSurveyAcceptedUnallocatedStatus = "Survey Accepted Unallocated";
	public static final String strSurveyAllocatedStatus = "Survey Pending Acceptance";
	public static final String strSurveyUnscheduledStatus = "Survey Accepted Unscheduled";
	public static final String strSurveyBookedStatus = "Survey Booked";
	public static final String strSurveyInProgressStatus = "Survey In Progress";
	public static String strSelectedCountry;
	
	public String strBusinessDescription = "Optional business description";
	
	// Initialise Strings required to test Distribution list
	public String strBrokerName = " Optional Broker Name";
	public String strBrokerContactName = " Optional Broker Contact Name";
	public String strBrokerEmailAddress = "broker-host.name@domainname.com";
	public String strSubBrokerName = " Optional Sub Broker/Managing agent Name";
	public String strSubBrokerContactName = " Optional Sub Broker Contact Name";
	public String strSubBrokerEmailAddress = "sub_broker-host.name@domainname.com";
	
	public String strOtherReqdServices = "Request Other Services Required";
	public String strBrokerPrimaryTelephone = "Request Broker Primary Telephone Number";
	public String strBrokerMobile = "Request Broker Mobile";
	public String strBrokerAddress = "Request Broker Address";
	public String strSubBrokerPrimaryTelephone = "Request Sub Broker Primary Telephone Number";
	public String strSubBrokerMobile = "Request Sub Broker Mobile";
	public String strSubBrokerAddress = "Request Sub Broker Address";
	public String strAdditionalInformation = "Request Additional information";
	public String strOtherMaterialDamage = "Request Other Material Damage";
	public String strIndemnityPeriod = "12";
	
	/* MaterialDamageBuildings;
	MaterialDamageContents;
	MaterialDamageMachinery;
	MaterialDamageComputer;
	MaterialDamageStockWorkInProgress;
	MaterialDamageOther;
	
	BusinessInterruptionGross;
	BusinessInterruptionAicow;
	BusinessInterruptionRentLoss;
	BusinessInterruptionMisc;
	
	LiabilityManagementWageRoll;*/
	public String strLiabilityManagementFTECount = "1";
	//LiabilityClericalWageRoll;
	public String strLiabilityClericalFTECount = "2";
	//LiabilityManaulLabourWageRoll;
	public String strLiabilityManaulLabourFTECount = "3";
	//LiabilityOtherWageRoll;
	public String strLiabilityOtherFTECount = "4";
	public String strLiabilityOther = "Other Liability";
	
	/*Buildings
	GeneralContents
	SpecifiedAntiques
	UnspecifiedAntiques
	SpecifiedFineArt
	UnspecifiedFineArt
	PreciousMetals
	MiscOther */	
	public String strContentsOther;
	
//	MoneyInSafeBusinessHours;
//	MoneyInSafeLeisureHours;
	public String strMoneyOther = "Other Money";
	public String strMoneyOtherState = "Sate Other Money";
//	MoneyCashInTransit;
//	MoneyAnnualCarryingsStaff;
//	MoneyAnnualCarryingsSecurityStaff;
	public String strMoneySafeOneDetailsMake = "Safe one Make";
	public String strMoneySafeOneDetailsModel = "Safe one Model";
//	MoneyPolicyLimit;
	public String strMoneySafeTwoDetailsMake = "Safe two Make";
	public String strMoneySafeTwoDetailsModel = "Safe two Model";
	
//	TheftStock;
//	TheftContents;
//	TheftElectronicEquipment;
//	TheftOther;
	public String strTheftOtherState;
//	TheftTargetGoods;
	public String strTheftStateTargetGoods;
	
//	AdditionalSumInsured;
	
	public boolean IsSetRisk = true;
	public static final String strSelectedRisk = "Selected Risk";
	
//	public String strBrokerName = " Optional Broker Name";
	
	String uniqueReference = String.valueOf(new Date().getTime()/10000).substring(2); 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().setPosition(WINDOW_POSITION);
		driver.manage().window().setSize(WINDOW_SIZE);
		driver.get("http://ukegdevweb:450/Indigo/Cardinus/");
	}
	
	protected static boolean isElementPresent(By searchBy){
	    try {
		    WebDriverWait wait = new WebDriverWait(driver, 5);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(searchBy));
			return true;
		} catch (TimeoutException e){
			return false;
		}
	}
	
	protected static boolean isElementPresent(By searchBy, String expectedValue){
		    try {
			    WebDriverWait wait = new WebDriverWait(driver, 5);
			    wait.until(ExpectedConditions.textToBePresentInElementLocated(searchBy, expectedValue));
				return true;
			} catch (TimeoutException e){
				return false;
			}
	}
	
	protected static boolean isElementEnabled(By searchBy){
	    try {
		    WebDriverWait wait = new WebDriverWait(driver, 5);
		    wait.until(ExpectedConditions.elementToBeClickable(searchBy));
			return true;
		} catch (TimeoutException e){
			return false;
		}
	}
	

	protected static void checkPresence(String objectDescription, By searchBy){
		if (isElementPresent(searchBy)){
			write("- The '" + objectDescription + "' is visible", LEVEL_1_INDENT);
		} else {
			System.out.println("***ERROR*** The '" + objectDescription + "' is not visible");
		}
	}
	
	protected static void getText(String fieldDescription, By searchBy){
		if (isElementPresent(searchBy)){
			WebElement textField = driver.findElement(searchBy);
			String text = textField.getText();
			write("- The '" + fieldDescription + "' reads '" + text + "'", LEVEL_1_INDENT);
		} else {
			System.out.println("***ERROR*** The '" + fieldDescription + "' field was not present");
		}	
	}

	protected static void getText(String fieldDescription, By searchBy, String expectedValue){
		String actualText = null;;	
		if (isElementPresent(searchBy,expectedValue)){
			WebElement textField = driver.findElement(searchBy);
			actualText = textField.getText();	
				write("- The '" + fieldDescription + "' reads '" + actualText + "' as expected", LEVEL_1_INDENT);
		} else {
			if (isElementPresent(searchBy)){
				WebElement textField = driver.findElement(searchBy);
				String text = textField.getText();
				System.out.println("***ERROR*** The '" + fieldDescription + "' field is present and reads '" + text + "', '" + expectedValue + "' was expected" );
			} else {
				System.out.println("***ERROR*** The '" + fieldDescription + "' field was not present");
			}	
		}	
	}

	protected static void getDate(String fieldDescription, By searchBy){
		if (isElementPresent(searchBy)){
			WebElement dateField = driver.findElement(searchBy);
			String date = dateField.getAttribute("value").toString();
			write("- The '" + fieldDescription + "' is '" + date + "'", LEVEL_1_INDENT);
		} else {
			System.out.println("***ERROR*** The '" + fieldDescription + "' field was not present");
		}	
	}

	protected static void clickLink(String linkDescription, By searchBy){
		if (isElementPresent(searchBy)){
			WebElement link = driver.findElement(searchBy);
			link.click();
			write("- The '" + linkDescription + "' link was clicked", LEVEL_1_INDENT);
		} else {
			System.out.println("***ERROR*** The '" + linkDescription + "' link was not present");
		}
	}
	
	protected static void clickTab(String tabDescription, By searchBy){
		if (isElementPresent(searchBy)){
			WebElement tab = driver.findElement(searchBy);
			tab.click();
			write("- The '" + tabDescription + "' tab was clicked", LEVEL_1_INDENT);
		} else {
			System.out.println("***ERROR*** The '" + tabDescription + "' tab was not present");
		}
	}

	protected static void clickButton(String buttonDescription, By searchBy){
		if (isElementPresent(searchBy)){
			WebElement button = driver.findElement(searchBy);
			button.click();
			write("- The '" + buttonDescription + "' button was clicked", LEVEL_1_INDENT);
		} else {
			System.out.println("***ERROR*** The '" + buttonDescription + "' button was not present");
		}
	}	

	protected static void clickPanel(String panelDescription, By searchBy, String expectedTitle){
		if (isElementPresent(searchBy)){
			WebElement panel = driver.findElement(searchBy);
			panel.click();
			String actualTitle =  panel.getText();
			if (actualTitle.equalsIgnoreCase(expectedTitle)){
				write("- The '" + panelDescription + "' panel was clicked, with the title as expected", LEVEL_1_INDENT);	
			} else {
				write("***ERROR*** The '" + panelDescription + "' panel was clicked, the title '" + expectedTitle + "' was Expected", LEVEL_1_INDENT);	
			}
		} else {
			System.out.println("***ERROR*** The '" + panelDescription + "' panel was not present");
		}
	}	

	protected static void clickRadioButton(String buttonDescription, By searchBy){
		if (isElementPresent(searchBy)){
			WebElement button = driver.findElement(searchBy);
			button.click();
			write("- The '" + buttonDescription + "' radio button was clicked", LEVEL_1_INDENT);
			
		} else {
			System.out.println("***ERROR*** The '" + buttonDescription + "' radio button was not present");
		}
	}	
	
	protected static void inputText(String fieldDescription, By searchBy, String inputText){
		if (isElementPresent(searchBy)){
			WebElement textBox = driver.findElement(searchBy);
			textBox.click();
			textBox.clear();
			textBox.sendKeys(inputText);
			write("- The '" + fieldDescription + "' field was set to '" + inputText + "'", LEVEL_1_INDENT);
		} else {
			System.out.println("***ERROR*** The '" + fieldDescription + "' field was not present");
		}
	}
	
	protected static void inputInteger(String fieldDescription, By searchBy, int inputInt){
		if (isElementPresent(searchBy)){
			WebElement numericTextBox = driver.findElement(searchBy);
			numericTextBox.click();
			numericTextBox.clear();
			numericTextBox.sendKeys(String.valueOf(inputInt));
			write("- The '" + fieldDescription + "' field was set to '" + (String.valueOf(inputInt)) + "'", LEVEL_1_INDENT);
		} else {
			System.out.println("***ERROR*** The '" + fieldDescription + "' field was not present");
		}
	}
	
	protected static void logIn(String userName, String password){
		inputText("Username", By.id("UserName"), userName);
		inputText("Password", By.id("Password"), strPassword);
		clickButton("Login", By.id("loginSubmit"));
		getText("RMG Build", By.className("copyright"));
		getText("Logged In as", By.xpath("//div[@class='userInfo']/p"));
	}
	
	protected static void selectDropdownByOption(String fieldDescription, By searchBy, int optionIndex){
		if (isElementPresent(searchBy)){
			Select option = new Select(driver.findElement(searchBy));
			option.selectByIndex(optionIndex);
			write("- The '" + fieldDescription + "' dropdown was set to '" + option.getFirstSelectedOption().getText() + "'", LEVEL_1_INDENT);
		} else {
			System.out.println("***ERROR*** The '" + fieldDescription + "' dropdown was not present");
		}
	}

	protected static void selectDropdownByVisibleText(String fieldDescription, By searchBy, String visibleText){
		if (isElementPresent(searchBy)){
			if (isElementEnabled(searchBy)){
				Select option = new Select(driver.findElement(searchBy));
				option.selectByVisibleText(visibleText);
				write("- The '" + fieldDescription + "' dropdown was set to '" + option.getFirstSelectedOption().getText() + "'", LEVEL_1_INDENT);
			} else {
				System.out.println("***ERROR*** The '" + fieldDescription + "' dropdown was not enabled");
			}
		} 
		else {
			System.out.println("***ERROR*** The '" + fieldDescription + "' dropdown was not present");
		}
	}

	protected static void setCheckBox(String checkBoxDescription, By searchBy, String setCheckBox){
		if (isElementPresent(searchBy)){
			WebElement checkBox = driver.findElement(searchBy);
			if (checkBox.isSelected() & setCheckBox.equals("Off")) checkBox.click();
			if (!checkBox.isSelected() & setCheckBox.equals("On")) checkBox.click();
			write("- The '" + checkBoxDescription + "' checkbox was set '" + setCheckBox + "'",LEVEL_1_INDENT);
		} else {
			System.out.println("***ERROR*** The '" + checkBoxDescription + "' checkbox was not present");
		}
	}
	
	protected static void setSurveyType(String survey) {
		switch (survey) {
		case "CCI":
			strSurveyType = strCCISurveyType;
			break;
		case "CHS":
			strSurveyType = strCHSSurveyType;
			break;
		case "LIA":
			strSurveyType = strLIASurveyType;
			break;
		case "PAC":
			strSurveyType = strPACSurveyType;
			break;
		case "POS":
			strSurveyType = strPOSSurveyType;
			break;
		case "RBS":
			strSurveyType = strRBSSurveyType;
			break;
		default:
			strSurveyType = strTHPSurveyType;
			break;
		}
	}
	
	protected static String getCurrentDateTime(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date currentDateTime = new Date();
		return dateFormat.format(currentDateTime);
	}
	
	protected static String getCurrentDate(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date currentDate = new Date();
		return dateFormat.format(currentDate);
	}
	
	protected static void write(String outputString, int offset){
		String newString = outputString;
		if (offset > 0){
			for (int i = 0 ; i < offset; i++) {
				newString = " ".concat(newString);
			} 
		System.out.println(newString);	
		}
	}

	protected static void write(String outputString, int offset, String toCase){
		String newString = outputString;
		if (offset > 0){
			for (int i = 0 ; i < offset; i++) {
				newString = " ".concat(newString);
			}
		}
		if (toCase.equalsIgnoreCase("UpperCase")){
			System.out.println(newString.toUpperCase());
		} else {
			System.out.println(newString);	
		}
	}
}
