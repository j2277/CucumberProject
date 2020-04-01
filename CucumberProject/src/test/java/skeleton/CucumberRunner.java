package skeleton;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:cucumber-reports"},features = {"src/test/resources/skeleton/shout.feature"},tags= {"@bag,@nonui"})

public class CucumberRunner {

}
