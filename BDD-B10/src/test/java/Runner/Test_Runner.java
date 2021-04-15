package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions (features = {"src/test/resources/Login/Login.feature"},
glue ={"StepDefinition"},
tags="@Login",
dryRun=false,//this is basically to check did i implemet all the method//incase if i missed any method this will help me to identify
monochrome=true,//basically to get the right format in console
strict=true,//this is going to check very strictly wheter any steps are missed in step definition.
plugin = {"html:testoutput/sunil.html","junit:testoutput/sunil.xml","json:testoutput/sunil.json"}
		)
public class Test_Runner {
	


}
