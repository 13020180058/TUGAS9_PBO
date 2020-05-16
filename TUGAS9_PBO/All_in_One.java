

/**
 * 08 MEI 2020
 * APRIANI MAGFIRA/ 13020180058
 */
public class All_in_One<T> {
    
    //T Adalah Kepanjangan dari Tipe Parameter
    private T Manusia;
    
    //Method Void Set Dengan Tipe Parameter T
    protected void setManusia(T Manusia){
        this.Manusia = Manusia;
    }
    
    //Method Return Get Yang Mengembalikan Nilai Manusia
    protected T getManusia(){
        return Manusia;
    }
}