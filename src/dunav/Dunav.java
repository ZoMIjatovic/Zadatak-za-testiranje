package dunav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dunav {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.manage().window().maximize();

        driver.get("http://shop.dunav.com/");

        /* prvi slucaj
        a) registracija korisnika
         */
//        WebElement mojNalog = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu-item-68")));
//        mojNalog.click();
//        WebElement registracija = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#frmlogin > div:nth-child(3) > div > a:nth-child(1)")));
//        registracija.click();
//        WebElement ime = wait.until(ExpectedConditions.elementToBeClickable(By.id("FirstName")));
//        ime.sendKeys("Zo");
//        WebElement prezime = wait.until(ExpectedConditions.elementToBeClickable(By.id("LastName")));
//        prezime.sendKeys("Mi");
//        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.id("Email")));
//        email.sendKeys("zo_mi_test@yahoo.com");
//        WebElement lozinka = wait.until(ExpectedConditions.elementToBeClickable(By.id("Password")));
//        lozinka.sendKeys("DunavSh");
//        WebElement potvrdaLozinke = wait.until(ExpectedConditions.elementToBeClickable(By.id("ConfirmPassword")));
//        potvrdaLozinke.sendKeys("DunavSh");
//        WebElement prihvatam = wait.until(ExpectedConditions.elementToBeClickable(By.id("chkagree")));
//        prihvatam.click();
//        WebElement prihvatamUslove = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[2]/div/form/div[3]/div[1]/input")));
//        prihvatamUslove.click();
//        WebElement robot = wait.until(ExpectedConditions.elementToBeClickable(By.className("recaptcha-checkbox-border")));
//        robot.click();
//        WebElement registrujSe = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[2]/div/form/div[5]/div/button/span")));
//        registrujSe.click();
//
//selenium recaptcha
//https://stackoverflow.com/questions/55501524/how-does-recaptcha-3-know-im-using-selenium-chromedriver
//      
//c) POZITIVAN
//        WebElement mojRNalog = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu-item-68")));
//        mojRNalog.click();
//
//        WebElement mailKorisnika = wait.until(ExpectedConditions.elementToBeClickable(By.id(("UserEmail"))));
//        mailKorisnika.sendKeys("zo_mi_test@yahoo.com");
//        //zo_mi_test@yahoo.com zo.mijatovic@gmail.com
//        WebElement sifraKorisnika = wait.until(ExpectedConditions.elementToBeClickable(By.id(("UserPassword"))));
//        sifraKorisnika.sendKeys("DunavSh");
////        DunavSh Quiddita
//        WebElement prijavaKorisnika = wait.until(ExpectedConditions.elementToBeClickable(By.id(("login"))));
//        prijavaKorisnika.click();
//c) NEGATIVAN
//        WebElement mojNegativanNalog = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu-item-68")));
//        mojNegativanNalog.click();
//
//        WebElement mailNKorisnika = wait.until(ExpectedConditions.elementToBeClickable(By.id(("UserEmail"))));
//        mailNKorisnika.sendKeys("4jeMojSrecanbroj!?@yaho.com");
//
//
//        WebElement sifraNKorisnika = wait.until(ExpectedConditions.elementToBeClickable(By.id("UserPassword")));
//        sifraNKorisnika.sendKeys("44444");
//
//
//        WebElement prijavaNKorisnika = wait.until(ExpectedConditions.elementToBeClickable(By.id(("login"))));
//        prijavaNKorisnika.click();



//        e)
        WebElement individualano = wait.until(ExpectedConditions.elementToBeClickable(By.className("my-work-info")));
        individualano.click();

        WebElement teritorijalnoPokrice = wait.until(ExpectedConditions.elementToBeClickable(By.id("TerritoryId")));
        teritorijalnoPokrice.click();
          

        WebElement teritorija = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#TerritoryId > option:nth-child(1)")));
        teritorija.click();
        
        WebElement pokrice = wait.until(ExpectedConditions.elementToBeClickable(By.id("TerritoryId")));
        pokrice.click();
        
        WebElement glavnaDestinacija = wait.until(ExpectedConditions.elementToBeClickable(By.id("DestinationId")));
        glavnaDestinacija.click();
//
        WebElement destinacija = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id="DestinationId"]/option[5]")));
        destinacija.click();
        
        
        WebElement datumRodjenja = wait.until(ExpectedConditions.elementToBeClickable(By.id("DateOfBirth")));
        datumRodjenja.click();

        WebElement datum = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/div[2]/div/span[4])")));
        datum.click();
        WebElement pocetakOsiguranja = wait.until(ExpectedConditions.elementToBeClickable(By.id("InsuranceStartDate")));
        pocetakOsiguranja.click();
//
        WebElement pocetak = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[9]")));
        pocetak.click();

        WebElement trajanjeOsiguranja = wait.until(ExpectedConditions.elementToBeClickable(By.id("nsuranceDurationInDays")));
        trajanjeOsiguranja.sendKeys("12");

        WebElement zavrsetakOsiguranja = wait.until(ExpectedConditions.elementToBeClickable(By.id("InsuranceEndDate")));
        zavrsetakOsiguranja.click();

//d)
        WebElement registrovaniKorisnik = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu-item-685")));
        registrovaniKorisnik.click();




        WebElement jmbg = wait.until(ExpectedConditions.elementToBeClickable(By.id("PersonalIdentificationNumber")));
        jmbg.sendKeys("0410200071174");



        WebElement brojMobilnog = wait.until(ExpectedConditions.elementToBeClickable(By.id("user_MobileNumber")));
        brojMobilnog.sendKeys("123456");

        WebElement brojFiksnog = wait.until(ExpectedConditions.elementToBeClickable(By.id("user_PhoneNumber")));
        brojFiksnog.sendKeys("45678");


        WebElement adresa = wait.until(ExpectedConditions.elementToBeClickable(By.id("user_Street")));
        adresa.sendKeys("Beograd");

        WebElement kucniBroj = wait.until(ExpectedConditions.elementToBeClickable(By.id("user_HomeNumber")));
        kucniBroj.sendKeys("444");

        WebElement postanskiBroj = wait.until(ExpectedConditions.elementToBeClickable(By.id("user_ZipCode")));
        postanskiBroj.sendKeys("11000");

        WebElement opstina = wait.until(ExpectedConditions.elementToBeClickable(By.className("select2-chosen")));
        opstina.click();


        WebElement opstinaMesto = wait.until(ExpectedConditions.elementToBeClickable(By.className("select2-input")));
        opstinaMesto.sendKeys("Zemun");


        WebElement izabranaOpstina = wait.until(ExpectedConditions.elementToBeClickable(By.className("select2-match")));
        izabranaOpstina.click();


        WebElement sacuvajPromene = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnstep1 btnchangedata")));
        sacuvajPromene.click();


    }
}
