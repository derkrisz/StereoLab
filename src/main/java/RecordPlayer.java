public class RecordPlayer extends Component {

    int playSpeed;

    public RecordPlayer(int playSpeed, String make, String model){
        super(make, model);
        this.playSpeed = playSpeed;

    }

    public int getPlaySpeed() {
        return playSpeed;
    }


    public void setPlaySpeed(int playSpeed) {
        this.playSpeed = playSpeed;
    }
}
