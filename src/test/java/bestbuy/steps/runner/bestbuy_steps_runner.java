package bestbuy.steps.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

 @RunWith(Cucumber.class)
 @CucumberOptions(features = { "src/test/resources/" }, 
               glue = { "bestbuy.steps.defination" },
               plugin = { "pretty","html:cucumber-report" },
               tags = { "@nr" }, 
               snippets = SnippetType.CAMELCASE)

public class bestbuy_steps_runner {	
}
