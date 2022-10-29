package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.addition(2,3));
		dortIslem.addition(2, 30, 10);// burada ikinci methodu kullandık 
	}

}
