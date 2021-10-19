import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"})

class IsItFriday {
    static String isItFriday(String today){
        return "Friday".equals(today) ? "Yes" : "No";
    }
}

public class Cucumber_test {
    private String today;
    private String actualAnswer;

    @Given("today is Monday")
    public void today_is_Monday(){
        today = "Monday";
    }

    @Given("today is Friday")
    public void today_is_Friday(){
        today = "Friday";
    }

    @When("I ask whether it's Friday")
    public void i_ask_whether_it_s_Friday(){
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer){
     //   assertEquals(expectedAnswer, actualAnswer);
    }




}
