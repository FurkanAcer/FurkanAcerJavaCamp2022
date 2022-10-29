package methods;

public class Main {
	public static void main(String[] args) {
        findNumber();//bir mertodu main de çağırmak yeterli olacaktır
    }
    public static void findNumber() {//methodlar mainin içinde oluşturuluyoır ve farklı 
        //ekranlarda bu method 

        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int findNumber = 5;
        boolean exists=false;

        for (int number : numbers) {
            if (number == findNumber) {
                exists = true;
                break;
            }

        }
        if (exists) {
            printMsg("sayı mevcuttur "+findNumber);
        }else {
            printMsg("sayı mevcut değildir "+findNumber);
        }

    }
    public static void printMsg(String message) {
        System.out.println(message);
    }
}
