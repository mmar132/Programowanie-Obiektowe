import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    public static void Zad1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podah n:");
        int n = scanner.nextInt();
        int i=0;
        int suma=0;
        System.out.println("Podaj punkty studentow:");
        while(i<n){
            System.out.println("Podaj punkty" +(i+1));
            int punkty = scanner.nextInt();
            suma +=punkty;
            i++;
        }
        double srednia = suma/n;
        System.out.println("Srednia punktow ="+ srednia);

    }
    public static void Zad2(){
        Scanner scanner = new Scanner(System.in);
        int LiczbyDodatnie=0;
        int LiczbyUjemne=0;
        int SumaDodatnich=0;
        var SumaUjemnych=0;
        int i=0;
        int l=10;
        while(i<l){
            System.out.println("Podaj liczbe"+(i+1));
            int liczba=scanner.nextInt();
             if(liczba>=0) {
                 LiczbyDodatnie++;
                 SumaDodatnich += liczba;
             }
             else {
                 LiczbyUjemne++;
                 SumaUjemnych += liczba;
             }
        }
        System.out.println("Ilość liczb dodatnich:"+ LiczbyDodatnie + "Suma liczb dodatnich" + SumaDodatnich  );
        System.out.println("Ilość liczb ujemnych:" + LiczbyUjemne + "Suma liczb ujemnych:" + SumaUjemnych);
    }
    public static void Zad3(int[] tab){
        int suma=0;
        for (int i=0;i<tab.length;i++){
            int liczba=tab[i];
            if(liczba%2==0){
                suma +=liczba;
            }
        }
        System.out.println("Suma liczb parzystych:"+suma);
    }
public static void zad4(){
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Podaj liczbę:");
    int n = scanner.nextInt();
    int[] tablica = new int[n];
    for(int i=0; i<n; i++){
        tablica[i]= rand.nextInt(56)-10;
    }
Zad3(tablica);
}



}
