
/**
 * nama : APRIANI MAGFIRA 
 * Kelas : B1
 * tanggal/ waktu : jumat, 08 mei 2020, 8:28
 */

//Outer Class/Kelas Luar
public class InnerClass{
    
    //Class dalam/Inner Class Pertama
    private class Mobil{
        private String merk = "Honda Jazz";
        private float kecepatan = 360.0f;
        private void jalankan(){
            System.out.println("Merk Mobil: "+merk);
            System.out.println("Kecepatan Mobil: "+kecepatan);
        }
    }
    
    //Class dalam/Inner Class Kedua
    private class Pengguna{
        private String nama = "Magfira";
        private int umur = 19;
        private void identitas(){
            System.out.println("Nama Saya: "+nama);
            System.out.println("Usia Saya: "+umur);
        }
    }
    
    public static void main(String[] args){
        //Membuat Instance dari KelasLuar
       InnerClass outerclass = new InnerClass();
        //Membuat Instance dari KelasDalam (Mobil)
        InnerClass.Mobil data1 = outerclass.new Mobil();
        //Membuat Instance dari KelasDalam (Pengguna)
        InnerClass.Pengguna data2 = outerclass.new Pengguna();
        
        //Menampilkan Hasil Output
        System.out.println("===== DATA DARI CLASS MOBIL ========");
        data1.jalankan();
        System.out.println("===== DATA DARI CLASS PENGGUNA =====");
        data2.identitas();
    }
}
