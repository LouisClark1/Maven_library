import com.company.Digital;
import com.company.Films;
import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;


//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"})


public class Cucumber_Test {
    private String testTitle;
    private String actualAnswer;
    private String audiobookAvalibility;

    @Given("Film title is default")
    public void title_is_default(){
        testTitle = "Default film title";
    }


    @Given("Audiobook has default avalibility")
    public void audiobook_avalibility_is_default() {
        audiobookAvalibility = "You can take this out of the library";
    }

    @When("I ask is the title the default")
    public void set_film_title(){
        Films testFilm = new Films();
        actualAnswer = testFilm.getName();
    }


    @When("I ask if I can take audiobooks out of the library")
    public void audiobook_is_availible(){
        Digital testDigitalAudiobook = new Digital();
        actualAnswer = testDigitalAudiobook.checkAvalibility();
    }

    @Then("I should be told {string}")
    public void i_should_be_told_film(String expectedAnswer){
        assertEquals(expectedAnswer, actualAnswer);
    }



    @Then("I should be told {string}")
    public void i_should_be_told_audiobook(String expectedAnswer){
        assertEquals(expectedAnswer, actualAnswer);
    }




}