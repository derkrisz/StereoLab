import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3PlayerTest {

    CDPlayer testCDPlayer;
    RecordPlayer testRecordPlayer;
    Radio testRadio;
    Stereo testStereo;
    Mp3Player testmp3player;



    @Before
    public void before(){
        testmp3player = new Mp3Player();
        testCDPlayer = new CDPlayer(4, "Sony", "Cool Model");
        testRecordPlayer = new RecordPlayer(5, "Sony", "Record Player Cool");
        testRadio = new Radio("Sony", "Cool Radio");
        testStereo = new Stereo(testCDPlayer, testRecordPlayer, testRadio, "DA RADIO");
    }

    @Test
    public void testConnect(){
        assertEquals("DA RADIO", testmp3player.connect(testStereo));

}
}
