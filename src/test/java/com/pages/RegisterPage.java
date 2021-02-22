package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.runner.BaseClass;

import junit.framework.Assert;

public class RegisterPage extends BaseClass{
	
	public static By EMAIADDRESS = By.id("register_email");
	public static By FIRSTNAME = By.id("register_firstName");
	public static By SURNAME = By.id("register_lastName");
	public static By PASSWORD = By.id("password");
	public static By CHECKPASSWORD = By.id("register_checkPwd");
	public static By  NECTARONE= By.id("regNectarPointsOne");
	public static By  NECTARTWO= By.id("regNectarPointsTwo");


	/*public void userRegistration(String email,String tit,String fname,String sname,String passwd,String conpasswd,String nectar1,String nectar2 )
	{
		action.sendText(EMAIADDRESS,email );
		Select titleDropDown = new Select(driver.findElement(By.id("register_title")));
		titleDropDown.selectByValue(tit);
		action.sendText(FIRSTNAME,fname );
		action.sendText(SURNAME, sname);
		action.sendText(PASSWORD, passwd);
		action.sendText(CHECKPASSWORD, conpasswd);
		action.sendText(NECTARONE, nectar1);
		action.sendText(NECTARTWO, nectar2);
	
	}*/
	
	public void logRegistrationDetails_UsingMap(Map<String,String> registrationDetailsMap)
	{
		action.sendText(EMAIADDRESS,registrationDetailsMap.get("email") );
		Select titleDropDown = new Select(driver.findElement(By.id("register_title")));
		titleDropDown.selectByValue(registrationDetailsMap.get("title"));
		action.sendText(FIRSTNAME,registrationDetailsMap.get("firstname") );
		action.sendText(SURNAME, registrationDetailsMap.get("surname"));
		action.sendText(PASSWORD, registrationDetailsMap.get("password"));
		action.sendText(CHECKPASSWORD, registrationDetailsMap.get("confirmpassword"));
		action.sendText(NECTARONE, registrationDetailsMap.get("nectarone"));
		action.sendText(NECTARTWO, registrationDetailsMap.get("nectartwo"));
		
	}
	
	public void logRegistrationDetails_UsingList(List<String> registrationDetailsList)
	{
		action.sendText(EMAIADDRESS,registrationDetailsList.get(0) );
		Select titleDropDown = new Select(driver.findElement(By.id("register_title")));
		titleDropDown.selectByValue(registrationDetailsList.get(1));
		action.sendText(FIRSTNAME,registrationDetailsList.get(2) );
		action.sendText(SURNAME, registrationDetailsList.get(3));
		action.sendText(PASSWORD, registrationDetailsList.get(4));
		action.sendText(CHECKPASSWORD, registrationDetailsList.get(5));
		action.sendText(NECTARONE, registrationDetailsList.get(6));
		action.sendText(NECTARTWO, registrationDetailsList.get(7));
	
	}
	
	public void logRegistrationDetails_UsingListOfMap(List<Map<String,String>> regDetailsList)
	{
		System.out.print(regDetailsList.size());
		for(int i=0;i<regDetailsList.size();i++)
		{
			System.out.println(regDetailsList.get(i));
			System.out.println(regDetailsList.get(i).get("email"));
			System.out.println(regDetailsList.get(i).get("title"));
			System.out.println(regDetailsList.get(i).get("firstname"));
			System.out.println(regDetailsList.get(i).get("surname"));
            System.out.println("-------");		
		}
		
		action.sendText(EMAIADDRESS,regDetailsList.get(0).get("email") );
		Select titleDropDown = new Select(driver.findElement(By.id("register_title")));
		titleDropDown.selectByValue(regDetailsList.get(0).get("title"));
		action.sendText(FIRSTNAME,regDetailsList.get(0).get("firstname"));
		action.sendText(SURNAME, regDetailsList.get(0).get("surname"));
		action.sendText(PASSWORD, regDetailsList.get(0).get("password"));
		action.sendText(CHECKPASSWORD, regDetailsList.get(0).get("confirmpassword"));
		action.sendText(NECTARONE, regDetailsList.get(0).get("nectarone"));
		action.sendText(NECTARTWO, regDetailsList.get(0).get("nectartwo"));
		
		
	}
	
	
	
}


/* IN LIST<MAP>  1st line in the feature file taken as headers, from line 2 the list starts

2{email=abcd@gmail.com, title=mrs, firstname=Swa, surname=Seem, password=ss12345, confirmpassword=ss12345, nectarone=55555, nectartwo=4444}
abcd@gmail.com
mrs
Swa
Seem
-------
{email=efgd@gmail.com, title=mrs, firstname=Edg, surname=Klop, password=klop345, confirmpassword=kl  345, nectarone=66666, nectartwo=9999}
efgd@gmail.com
mrs
Edg
Klop
-------
//  List<Map>>
     email title firstname
0    abc@   mrs   Swa

1    efg@   mrs   Edg
*/