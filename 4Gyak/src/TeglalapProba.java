public class TeglalapProba {
public static void main(String[] args) {
Teglalap A = new Teglalap(4, 7);
Teglalap B = new Teglalap(5);
Teglalap C = A;
A.setOldal(5);
System.out.println(A.Adatok());
System.out.println(B.Adatok());
System.out.println(A==B);
System.out.println(A==C);
System.out.println(A.Egyforma(B));
}
}