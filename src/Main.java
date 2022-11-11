import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy;
        double kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (METRE CİNSİNDEN!) Giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu (KG CİNSİNDEN!) Giriniz : ");
        kilo = input.nextDouble();

        /* Formül
        kg / boy * boy
         */
        double indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);





    }
}


