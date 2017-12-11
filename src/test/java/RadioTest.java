import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RadioTest {

    Radio testRadio;

    @Before
    public void before() {
        testRadio = new Radio("Sony", "The Big One");
    }

    @Test
    public void radioCanTune(){
        Assert.assertEquals(testRadio.tuneRadio("Radio 1"), "Radio 1");
    }

}
