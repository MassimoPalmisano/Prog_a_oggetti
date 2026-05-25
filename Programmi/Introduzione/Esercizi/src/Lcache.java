public class Lcache extends L{

    private int[] Cache;

    public Lcache(int N){
        super();
        Cache = new int[N];
    }

    public Lcache(){
        super();
        Cache = new int[256];
    }

    @Override
    public int GetValore(){
        if(Cache[0] == 0){
            for(int i = 0; i<Cache.length; i++){
                Cache[i] = super.GetValore();
            }
            return Cache[0];
        }
    }
}
