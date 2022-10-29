package methodOverloading;

public class DortIslem {
	public int addition(int number1,int number2) {
		return number1+number2;
	}
	public int addition(int number1,int number2,int number3) {
		return number1+number2+number3;
	}// farklı parametrelere sahip olduğu için additionı iki kere kullanabiliriz
	//çünkü aslında ikisi farklı methodlar. 

}
