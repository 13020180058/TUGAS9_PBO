
/**
 * nama : APRIANI MAGFIRA 
 * Kelas : B1
 * tanggal/ waktu : jumat, 08 mei 2020, 7:40
 */

public class GenericUpperBoundedTest {
   public static <T extends Number> double add(T first, T second) {
      return first.doubleValue() + second.doubleValue();
   }
 
   public static void main(String[] args) {
      System.out.println(add(55, 66));     // int -> Integer
      System.out.println(add(5.5f, 6.6f)); // float -> Float
      System.out.println(add(5.5, 6.6));   // double -> Double
   }
}
