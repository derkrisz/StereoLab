import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    CDPlayer testCDPlayer;
    RecordPlayer testRecordPlayer;
    Radio testRadio;
    Stereo testStereo;

    @Before
    public void before(){
        testCDPlayer = new CDPlayer(4, "Sony", "Cool Model");
        testRecordPlayer = new RecordPlayer(5, "Sony", "Record Player Cool");
        testRadio = new Radio("Sony", "Cool Radio");
        testStereo = new Stereo(testCDPlayer, testRecordPlayer, testRadio, "DA RADIO");
    }

    @Test
    public void stereoCanTuneRadio(){
        assertEquals(testStereo.tuneTheRadio("Radio Cool Times"), "Radio Cool Times");
    }



}
