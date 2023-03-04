package BDD.sprint2;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HS41\\eclipse-workspace\\sprint2\\src\\test\\resources\\Sprint2.feature")
public class Sprint2Runner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
}
