package com.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class OrangeHRM_AddEmployee {
	
	public static void main(String[] args) throws InterruptedException {
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		//<input name="txtUsername" id="txtUsername" type="text">
		String userNameTestData="Sahithya";
		By userNameProperty=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameProperty);
		userName.sendKeys(userNameTestData);
		
		String passwordTestData="Sahithy@24";
		By passwordProperty=By.id("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
		
		By buttonProperty=By.className("button");
		WebElement button=driver.findElement(buttonProperty);
		button.click();
		
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		By pimElementProperty=By.linkText("PIM");
		WebElement pimElementLink=driver.findElement(pimElementProperty);
		//pimElementLink.click();
		
		Actions mouseHoverOperation = new Actions(driver);
		mouseHoverOperation.moveToElement(pimElementLink).build().perform();
	    
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		By addEmployeeElementProperty=By.linkText("Add Employee");
		WebElement addEmployeeElementLink=driver.findElement(addEmployeeElementProperty);
		addEmployeeElementLink.click();
		
		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		
		String expected_FirstNameTestData="Sannyu";
		By firstNameProperty=By.id("firstName");
		WebElement firstName=driver.findElement(firstNameProperty);
		firstName.sendKeys(expected_FirstNameTestData);
		
		//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		
		String expected_MiddleNameTestData="Bunny";
		By middleNameProperty=By.id("middleName");
		WebElement middleName=driver.findElement(middleNameProperty);
		middleName.sendKeys(expected_MiddleNameTestData);
		
		//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		
		String expected_LastNameTestData="Kakkerla";
		By lastNameProperty=By.id("lastName");
		WebElement lastName=driver.findElement(lastNameProperty);
		lastName.sendKeys(expected_LastNameTestData);
		
		//<input class="formInputText" maxlength="10" type="text" name="employeeId" value="0002" id="employeeId">
	     // String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		
		By employeeIdProperty=By.id("employeeId");
		WebElement employeeId=driver.findElement(employeeIdProperty);
		
		String expected_EmployeeId=employeeId.getAttribute("value");
		System.out.println("The expected EmployeeId : - " + expected_EmployeeId);
		
		//<input type="button" class="" id="btnSave" value="Save">
		
		By saveButtonProperty=By.id("btnSave");
		WebElement saveButton=driver.findElement(saveButtonProperty);
		saveButton.click();
		
		
		//<input value="Sannyu" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
		
		By actual_FirstNameProperty=By.id("personal_txtEmpFirstName");
		WebElement firstNameElement=driver.findElement(actual_FirstNameProperty);
		
		String actual_FirstName=firstNameElement.getAttribute("value");
		System.out.println("Actual FirstName : - " + actual_FirstName);
		
		//<input value="Bunny" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
		
		By actual_MiddleNameProperty=By.id("personal_txtEmpMiddleName");
		WebElement middleNameElement=driver.findElement(actual_MiddleNameProperty);
		
		String actual_MiddleName=middleNameElement.getAttribute("value");
		System.out.println("Actual MiddleName : - " + actual_MiddleName);
		
		//<input value="Kakkerla" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
		
		By actual_LastNameProperty=By.id("personal_txtEmpLastName");
		WebElement lastNameElement=driver.findElement(actual_LastNameProperty);
		
		String actual_LastName=lastNameElement.getAttribute("value");
		System.out.println("Actual LastName : - " + actual_LastName);
		
		
		
		By employeeId_Property=By.id("personal_txtEmployeeId");
		WebElement empolyeeId=driver.findElement(employeeId_Property);
		
		String actual_EmployeeId=empolyeeId.getAttribute("value");
		System.out.println("Actual EmployeeId : - " + actual_EmployeeId);
		
		
		System.out.println("#########Validating FirstName##########");
		
		if(expected_FirstNameTestData.equals(actual_FirstName))
		{
			System.out.println(" Employee FirstName Added successfully");
		}
		else
		{
			System.out.println(" Failed to Add Employee FirstName ");
		}
		
		System.out.println("#########Validating MiddleName##########");

		if(expected_MiddleNameTestData.equals(actual_MiddleName))
		{
			System.out.println(" Employee MiddleName Added successfully");
		}
		else
		{
			System.out.println(" Failed to Add Employee MiddleName ");	
		}
		
		System.out.println("#########Validating LastName##########");

		if(expected_LastNameTestData.equals(actual_LastName))
		{
			System.out.println(" Employee LastName Added successfully");
		}
		else
		{
			System.out.println(" Failed to Add Employee LastName ");
		}
		
		System.out.println("#########Validating EmployeeId##########");

		if(expected_EmployeeId.equals(actual_EmployeeId))
		{
			System.out.println(" Employee LastName Added successfully");
		}
		else
		{
			System.out.println(" Failed to Add Employee LastName ");
		}
		
		
		
		 By welcomeProperty=By.id("welcome");
         WebElement welcomeAdmin=driver.findElement(welcomeProperty);
         welcomeAdmin.click();
         
         Thread.sleep(1000);
  		    By logoutProperty=By.linkText("Logout");
       		 WebElement innerElement1 = driver.findElement(logoutProperty);     			
       		 innerElement1.click();
		
		driver.quit();
	}
	
	

}
