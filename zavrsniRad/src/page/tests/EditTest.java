package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import page.objects.EditObjects;

public class EditTest {
	private static Scanner sc;

	public static void ManualFill(WebDriver driver) throws Exception {
		sc = new Scanner(System.in);
		// Expand
		EditObjects.clickExpand(driver);
		// Edit
		EditObjects.clickEdit(driver);
		// Name
		EditObjects.clickName(driver);
		System.out.println("Enter new Name: ");
		String strName = sc.next();
		EditObjects.sendKeysName(driver, strName);
		// Location
		EditObjects.clickLocation(driver);
		System.out.println("Enter new Location: ");
		String strLocation = sc.next();
		EditObjects.sendKeysLocation(driver, strLocation);
		// Change
		EditObjects.sendKeysChangeButton(driver);
		// Drop down
		EditObjects.clickDropDown(driver);
		System.out.println("Choose Walk, Car, Motorbike, Bus or Bicycle: ");
		String strDropDown = sc.next();
		EditObjects.selectDropDown(driver, strDropDown);
		// Description
		EditObjects.clickDescription(driver);
		System.out.println("Enter new description: ");
		String strDescription = sc.next();
		EditObjects.sendDescription(driver, strDescription);
		// ClickPost
		EditObjects.clickPost(driver);

	}

}
