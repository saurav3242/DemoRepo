package myrunner;


    import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;


		@RunWith(Cucumber.class)
		@CucumberOptions(
				features = "D:\\FREECRMBDDFRAMEWORK\\src\\main\\java\\Feature\\login.feature", //the path of the feature files
				glue={"step_defenition"}, //the path of the step definition files
				format = {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
				monochrome = true, //display the console output in a proper readable format
				strict = true, //it will check if any step is not defined in step definition file
				dryRun = true //to check the mapping is proper between feature file and step def file,is is just checking everything is fine or not not executint test case in true condtn
				//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
				)
		public class TestRunner {
		 
		}
	
	