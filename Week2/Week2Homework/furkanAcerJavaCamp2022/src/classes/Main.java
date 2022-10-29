package classes;

public class Main {

	public static void main(String[] args) {
		//classlar referans tiptir
		// classların ilk ve temel özelliği gruplama yapmaktır.Buradan sonbra başka klassı nasıl çağıracağımızı göreceğiz.
		CustomerManager customerManager = new CustomerManager();//bellekte o an customermanager türünde bir nesne üretmiş oluyoruz.
		customerManager.Add();
		customerManager.Update();
		customerManager.Remove();
		
		//bellekte iki tane alan vardır:Stack ve Heap
		//new dediğimiz zaman o nesneden bellekte bir alan oluşturuyor
		int x = 10;
		int y = 20;
		y = x;
		x= 30;
		System.out.println(y);//
		
		//diziler referans tiptir
		
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		numbers2=numbers1;
		numbers1[0]=10;
		System.out.println(numbers2[0]);
	}
}

