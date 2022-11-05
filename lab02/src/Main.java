import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        rownanie();
    }


public static void rownanie() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj 3 liczby:");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double PotB;
    double PomAC;
    PotB=Math.pow(b ,2);
    PomAC = 4*a*c;
    double delta = PotB-PomAC;
    double x0, x1, x2;
    x0= -b/2*a;
    x1=(-b+Math.sqrt(delta))/2*a;
    x2=(-b-Math.sqrt(delta))/2*a;
    if (delta>0)        System.out.println("Rozwiązaniem tego równania są: "+x1+" i "+x2);
    else if (delta==0)  System.out.println("Rozwiązaniem tego równania jest miejsce zerowe: " +x0);
    else                System.out.println("To równanie nie ma rozwiązań");

}
public static double WyznaczanieWartosciF1(double a){
        if (a > 0) {
    return 2 * a;
}
        else if (a == 0) {
    return 0;
}
        else {
            return -3 * a;
        }
}
    public static double WyznaczanieWartosciF2(double a){
        if (a >= 1) {
            return a * a;
        } else {
            return a;
        }
    }
    public static double WyznaczanieWartosciF3(double a){

        if (a > 2) {
            return 2 + a;
        } else if (a == 2) {
            return 8;
        } else {
            return a - 4;
        }
    }
public static void Sortowanie(double a, double b, double c){

        double first=0;
        double second=0;
        double third=0;
    if (a>b&&a>c&&b>c)
    {
        first=a;
        second=b;
        third=c;
    }
        else if (b>a && a>c  && b>c){
        first=b;
        second=a;
        third=c;

    }
        else if (c>a && a>b && c>b){

        first=c;
        second=a;
        third=b;
    }
        else if ( a>b && c>b && a>b){
        first=a;
        second=c;
        third=b;
    }
    else if ( b>a && c>a && b>c) {
        first = b;
        second = c;
        third = a;
    }
    else if ( c>a && c>b && b>a) {
        first = c;
        second = b;
        third = a;
    }

    System.out.println("Pierwsza:"+first + "druga:"+second +"trzecia:"+third);



}

public static void Komunikaty1(boolean Pada, boolean JestAutobus ){
        if (Pada && JestAutobus)
            System.out.println("Weź parasol" + "Dostaniesz sie na uczelnie");
        else if (Pada && !JestAutobus  )
            System.out.println("Nie dostaniesz sie na uczelnie");
        else if(!Pada && JestAutobus)
            System.out.println("Dostaniesz sie na uczelnie "+ "Miłego dnia i pięknej pogody");


}
public static void Komunikaty2 (boolean Znizka, boolean Premia){
        if (!Znizka || Premia)
            System.out.println("Możesz kupić samochód " + "Zniżki na samochód nie ma");
        else if (!Znizka || !Premia)
            System.out.println("Zakup samochodu trzeba odłożyć na później");
        else if (Znizka || Premia)
            System.out.println("Możesz kupić samochód");
}
public static double kalkulator (int start, double a, double b){
    switch ( start) {
        case 1:
            return a + b;
        case 2:
            return a - b;
        case 3:
            return a * b;
        case 4:
            if(b==0)
                System.out.println("Nie można dzielić przez 0!");
            return a / b;
        case 5:
            if(b==0)
                System.out.println("Nie można dzielić przez 0!");
            return a%b;
        default:
            System.out.println("Niepoprawny wybór działania");
            return 0;
    }
}
}








