
/**
 * nama : APRIANI MAGFIRA 
 * Kelas : B1
 * tanggal/ waktu : jumat, 08 mei 2020, 10:00
 */

class OuterMethodLocalInner
{
public void  outerMethod()
{
	class InnerMethodLocalInner //Inner class cannot have a public/private modifier as it's local to a method
	{
		public void innerMethod() //but it's method can have any modifier because it's declared inside a class.
		{
			System.out.println("Inner method");
		}
	}
	System.out.println("Outer method");
}


public static void main(String... ar)
{
OuterMethodLocalInner ob= new OuterMethodLocalInner();
ob.outerMethod();
}

}