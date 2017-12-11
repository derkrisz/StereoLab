public class Stereo {

    CDPlayer CDPlayer;
    RecordPlayer RecordPlayer;
    Radio Radio;
    String name;


    public Stereo(CDPlayer CDPlayer, RecordPlayer RecordPlayer, Radio Radio, String name){
        this.CDPlayer = CDPlayer;
        this.RecordPlayer = RecordPlayer;
        this.Radio = Radio;
        this.name = name;
    }

    public String tuneTheRadio(String station){
        return Radio.tuneRadio(station);
    }

    public String playTheCD(String CD){
        return CDPlayer.playCD(CD);
    }

    public int adjustSpeed(int speed){
        RecordPlayer.setPlaySpeed(speed);
        return RecordPlayer.getPlaySpeed();
    }

}
