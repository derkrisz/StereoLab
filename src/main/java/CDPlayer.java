public class CDPlayer extends Component{

    int cdno;

    public CDPlayer(int cdno, String make, String model){
        super(make, model);
        this.cdno = cdno;

    }

    public String playCD(String cd) {
        return cd;
    }
}
