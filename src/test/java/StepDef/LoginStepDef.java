package StepDef;

import Base.TestBase;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Base.TestBase.driver;

public class LoginStepDef {


    @When("I navigate to URl")
   public  void navigateToUrl(){
        driver.get("https://www.saucedemo.com/");
    }


    @When("I entered UserName and Password")
    public  void enterUserNamePassword(DataTable data){
        //driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
        //driver .findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
      List<Map < String,String>> val = data.asMaps(String.class,String.class);//this is list of Maps

        TestBase.driver.findElement(By.xpath("//*[@id='password']")).sendKeys(val.get(0).get("password"));
       TestBase.driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys(val.get(0).get("userName"));
    }
       // ToDo:use list of list to implement the datatable and For loop
       //for(<Map < String,String>> val:data.asMaps(String.class,String.class)){


    //}//this for loop

    @When("I clicked on Login button")
    public  void clickedUserName(){

        driver.findElement(By.id("login-button")).click();


    }

    @When("verify login Successfully")
    public  void verifyLoginSuccessfully(){

        driver.getTitle();


    }

}
