package main;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.RegistrationObjects;
import page.tests.DeleteTest;
import page.tests.EditTest;
import page.tests.LoginTest;
import page.tests.PostTest;
import page.tests.RegistrationTest;

public class MainClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(RegistrationObjects.URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Scanner sc = new Scanner(System.in);
		// Automatski registrujemo sve podatke iz Excel fajla
		/*try {
			RegistrationTest.AutomaticTestAll(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Manualno registrovanje korisnika
		try {
			RegistrationTest.ManualFill(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Automatski proveravamo da li smo uspesno registrovali sve podatke, login/logout metodom
		try {
			LoginTest.AutomaticTestAll(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		// Manualno logovanje preko konzole
		try {
			LoginTest.ManualFill(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Automatsko objavljivnanje svih postova iz Excel fajla
		try {
			PostTest.AutomaticPostAll(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Manualno kreiranje objava
		try {
			PostTest.ManualFill(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Brisanje poslednja dva posta
		try {
			DeleteTest.AutomaticDelete(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Manualno editovanje posta
		try {
			EditTest.ManualFill(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
