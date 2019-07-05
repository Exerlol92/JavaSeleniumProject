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
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Scanner sc = new Scanner(System.in);

		try {
			// Automatski registrujemo sve podatke iz Excel fajla
			RegistrationTest.AutomaticTestAll(driver);
			// Manualno registrovanje korisnika
			RegistrationTest.ManualFill(driver);
			// Automatski proveravamo da li smo uspesno registrovali sve podatke,
			// login/logout metodom
			LoginTest.AutomaticTestAll(driver);
			// Manualno logovanje preko konzole
			LoginTest.ManualFill(driver);
			// Automatsko objavljivnanje svih postova iz Excel fajla
			PostTest.AutomaticPostAll(driver);
			// Manualno kreiranje objava
			PostTest.ManualFill(driver);
			// Brisanje poslednja dva posta
			DeleteTest.AutomaticDelete(driver);
			// Manualno editovanje posta
			EditTest.ManualFill(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
