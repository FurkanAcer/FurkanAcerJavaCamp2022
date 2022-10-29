package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		//OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		//ogretmenKrediManager.calculate();
		
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
	}
} //bu polymorphism örneğidir.