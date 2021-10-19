import com.company.Analogue;
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
    private double actualDataSize;
    private double expectedDigitalSize;
    private String digitalAudiobookTitle;
//////////////////////////////////film title/////////////////////////////////
    @Given("Film title is default")
    public void title_is_default(){
        testTitle = "Default film title";
    }

    @When("I ask is the title the default")
    public void set_film_title(){
        Films testFilm = new Films();
        actualAnswer = testFilm.getName();
    }
    /////////////////////////////////////////////////audiobook availibility/////////////////////////////////
    @Given("Audiobook has default avalibility")
    public void audiobook_avalibility_is_default() {
        audiobookAvalibility = "You can take this out of the library";
    }
    @When("I ask if I can take audiobooks out of the library")
    public void audiobook_is_availible(){
        Digital testDigitalAudiobook = new Digital();
        actualAnswer = testDigitalAudiobook.checkAvalibility();
    }

    /////////////////////////////////Analogue audiobook title/////////////////////////////////
    @Given("Analogue audiobook name is unset")
    public void digitalAudiobookTitleIsDefault() {
        digitalAudiobookTitle = "You can take this out of the library";
    }
    @When("I ask what the analogue audiobook title is")
    public void digitalAudiobookAskTitle(){
        Analogue testAnalogueAudiobook = new Analogue();
        actualAnswer = testAnalogueAudiobook.getName();
    }



    ///////////////////////////////// i should be told string /////////////////////////////////
    @Then("I should be told {string}")
    public void i_should_be_told_string(String expectedAnswer){
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Given("Digital audiobook data size is unset")
    public void digital_audiobook_data_size() {
        expectedDigitalSize = 0.0;
    }

    @When("I ask what the data size is")
    public void digital_audiobook(){
        Digital  testDigitalAudiobook= new Digital();
        actualDataSize = testDigitalAudiobook.getDataSize();
    }

    @Then("I should be told {double}")
    public void i_should_be_told_double(double expectedDigitalSize){
        assertEquals(expectedDigitalSize, actualDataSize,0.1);
    }


}
