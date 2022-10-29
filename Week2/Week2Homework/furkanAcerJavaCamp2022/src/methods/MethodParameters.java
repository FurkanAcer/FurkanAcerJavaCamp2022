package methods;

public class MethodParameters {

    public static void main(String[] args) {
    	//String message ="Bugünhava çok Güzel!";
    	//String newMessage = message.substring(0,2);//substring birşey oluşturdu ve bunu sonuç olarak bize yeni bir değer ile verdi 
    	//ama void bize birşey vermez.bellekte bir değer oluşuyor ama aşağıdaki gibi değeri atamazsak bize bir sonuç vermez ve değer bellekte kalır.
    	//bir void değeri Stringolan bya da değişken olan birşeye atayamazsın.
        //void operasyonlar birşey yapmasını istediğimiz operasyonlardır.
    	String cityMessage = printCity();
    	System.out.println(cityMessage);
    	int number = multiple(5,7);
    	System.out.println(number);
    	int total = multiple2(2,3,4,5,6,10);
    	System.out.println(total);
    }
    public static void add() {//void bir operasyon işlemi yaptıktan sonra içinde return yapılabilir operasyonlardır.
        System.out.println("eklendi");
    }
    public static void delete() {
        System.out.println("silindi");
    }
    public static void update() {
        System.out.println("guncellendi");
    }
    public static int multiple(int number1, int number2) {//bu fonksiyon integer türünde bir değer döndürür demek
		return number1+number2;//bunu yazmazsak missing return ifadesini arar.
	}
    
    public static int multiple2(int...numbers) {
    	int total = 0;
    	for (int number:numbers){
    		total+=number;
    	}
    	return total;
    	
    }
    
    public static String printCity() {
		return "Ankara";
    }
}
//dinamik parametrelerle bu metodları çağırarak kullanabiliriz.
//Variable Arguments 