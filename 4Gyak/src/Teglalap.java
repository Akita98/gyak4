public class Teglalap {
private int AOldal;
private int BOldal;

public Teglalap(int AOldal, int BOldal) {
this.AOldal = AOldal;
this.BOldal = BOldal;
}
public Teglalap(int Oldal) {
AOldal = Oldal;
BOldal = Oldal;
}
int Terulet(){
return AOldal*BOldal;
}
String Adatok(){
	return "Aoldal="+AOldal+" Boldal="+BOldal+" Ter�let="+Terulet();
	}
	void setOldal(int AOldal, int BOldal) {
	this.AOldal = AOldal;
	this.BOldal = BOldal;
	}
	void setOldal(int Oldal) {
	AOldal = Oldal;
	BOldal = Oldal;
	}
	boolean NagyobbTer�letu(Teglalap Masik){
	return Terulet() > Masik.Terulet();
	}
	boolean Egyforma(Teglalap Masik){
	return AOldal==Masik.AOldal && BOldal==Masik.BOldal;
	}
	}