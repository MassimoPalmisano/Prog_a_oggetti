public class Tmax extends T {

    private int Tmax;

    public Tmax(){
        super();
        Tmax = 0;
    }

    public Tmax(int n , int m){
        super(n);
        Tmax = m;
    }

    public int GetTempMax(){return Tmax;}
    
    public void ResetTMax(){Tmax = 0;}

    @Override
    public void setTemp(int n){
        if(Tmax < n){
            Tmax = n;
        }
        super.setTemp(n);
    }
}
