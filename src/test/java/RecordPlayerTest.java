import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {

    RecordPlayer testRecordPlayer;

    @Before
    public void before(){
        testRecordPlayer = new RecordPlayer(4, "Sony", "Cool Record");
    }

    @Test
    public void hasPlaySpeed(){
        assertEquals(4, testRecordPlayer.getPlaySpeed());
    }

}
