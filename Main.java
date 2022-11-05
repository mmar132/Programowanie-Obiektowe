import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Wypisz();
        System.out.println(getName());
        System.out.println(getWiek());
        System.out.println(CzyParzysta(4));
        System.out.println(CzyPodzielna(10));
    }

    public static void Wypisz() {

        int a = -2, b = 23;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj c:");
        int c = input.nextInt();
        System.out.println("a=" + a + "b=" + b);

    }

    public static int getInt() {

        return new Scanner(System.in).nextInt();
    }

    public static int getWiek() {
        return 24;
    }

    public static String getName() {
        return "Marcin";
    }

    public static void Obliczenia(){
        int a=getInt();
        int b=getInt();
        System.out.println("Suma "+ a + "+" +b+"="+(a+b));
        System.out.println("Różnica "+ a + "+" +b+"="+(a-b));
        System.out.println("Iloczyn "+ a + "+" +b+"="+(a*b));
        a=Math.abs(a);

    }
public  static boolean CzyParzysta(int a){

        if(a%2==0)
            return  true;
        else
            return false;
}
    public  static boolean CzyPodzielna(int a){

        if(a%3==0 && a%5==0)
            return  true;
        else
            return false;
    }
    public  static double Podniesienie(int a){

        return Math.pow(a,3);
    }
    public  static double Pierwiastek(int a){

        return Math.sqrt(a);
    }
    public static boolean Trojkąt(int a, int b, int c){
        int a = input.NextInt();
        int b =input.NextInt();
        int c=input.NextInt();
        if (a+b>c&&a+c>b&&b+c>a)
            return true;
        else return false;



    }



}

