
/**
 * nama : APRIANI MAGFIRA 
 * Kelas : B1
 * tanggal/ waktu : jumat, 08 mei 2020, 8:05
 */

public class MultipleTypeParameters {
 
    public static void main(String a[]){
         
        SimpleGen<String, Integer> sample
                    = new SimpleGen<String, Integer>("multypel parameters", 100);
        sample.printTypes();
    }
}
 
/**
 * Simple generics class with two type parameters U, V. 
 */
class SimpleGen<U, V>{
     
    //type U object reference
    private U objUreff;
    //type V object reference
    private V objVreff;
     
    //constructor to accept object type U and object type V
    public SimpleGen(U objU, V objV){
        this.objUreff = objU;
        this.objVreff = objV;
    }
     
    public void printTypes(){
        System.out.println("U Type: "+this.objUreff.getClass().getName());
        System.out.println("V Type: "+this.objVreff.getClass().getName());
    }
}

