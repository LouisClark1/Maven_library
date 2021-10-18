package test_folder;

import com.company.Digital;
import com.company.Films;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class First_test {

    @Test
    public void test_for_Films(){
        Films testFilm = new Films();
        assertEquals("This is the film test message","Default film title",testFilm.getName());

    }
    //must call on a method otherwise nothing will happen
    @Test
    public void test_for_digital_audiobook_size(){
        double tempSize = 0.0;
        Digital testDigitalAudiobook = new Digital();
        assertEquals("Digital audiobook data size fail",tempSize,testDigitalAudiobook.getDataSize(),0.1);

    }
    @Test
    public void test_for_digital_audiobook_avalibility(){
        Digital testDigitalAudiobook1 = new Digital();
        String expectedMessage = "You can take this out of the library";
        String actualMessage = testDigitalAudiobook1.checkAvalibility();
        assertEquals("Avalibility failure",expectedMessage,actualMessage );
    }
}

