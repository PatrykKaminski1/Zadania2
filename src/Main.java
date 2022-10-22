import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println ("Liczba 1");
        double a = scan.nextDouble();

        System.out.println ("Liczba 2");
        double b = scan.nextDouble();

        System.out.println("Czynność");
        String wybor = scan.next();

        switch (wybor) {
            case "+" -> Kalkulator.Dodawanie(a, b);
            case "-" -> Kalkulator.Odejmowanie(a, b);
            case "*" -> Kalkulator.Mnozenie(a, b);
            case "/" -> Kalkulator.Dzielenie(a, b);
            case "%" -> Kalkulator.Modulo(a, b);
        }




    }
}
