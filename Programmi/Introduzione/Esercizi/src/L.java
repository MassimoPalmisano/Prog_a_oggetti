//import java.io.IntegerInputStream;

public class L {

    private IntegerInputStream In;

    public L(){
        In = new IntegerInputStream();
    }

    public int GetValore(){
        return In.read();
    }
}
