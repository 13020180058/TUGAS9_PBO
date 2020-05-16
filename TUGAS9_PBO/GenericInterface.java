
/**
 *
 * nama : apriani magfira
 * stambuk : 13020180058
 * tanggal /waktu: 15 mei 22.28
 */
interface Mathematics<T extends Number> {
    
    int powerOf(T t);
}

class PowerOfThree<T extends Number> implements Mathematics<T>{
    
    public int powerOf(T i){
        
        return i.intValue()*i.intValue()*i.intValue();
    }
}

public class GenericInterface{

    public static void main(String[] args) {
        
        PowerOfThree<Float> pthree = new PowerOfThree<Float>();
        System.out.println("5^3 -> "+pthree.powerOf(5f));
    }
}
