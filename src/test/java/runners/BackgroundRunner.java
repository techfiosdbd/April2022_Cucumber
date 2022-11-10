package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	//	features = "src\\test\\java\\features\\Background.feature", 
		features = "C:\\Users\\12248\\eclipse-workspace\\cucumberfinalproject\\CucumberFinal", 
		glue ="steps",// here you have to put step package name which ever you have as steps put that package name here.
		tags =" @BackgroundFeature",
		monochrome = true,//keep this always true
		dryRun = false,// keep dryRun always false
		plugin = {
				"pretty",
				"html:target/Cucumber", // you save in target folder as html report in cucumber file
				"json:target/Cucumber.json" // you save report in json formate under target folder
		}
		
		)		
		
			
		


public class BackgroundRunner {

}
