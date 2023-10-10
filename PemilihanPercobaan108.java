import java.util.Scanner;

public class PemilihanPercobaan108 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        // Masukkan angka(input)
        System.out.print("Masukkan angka = ");
        int angka = input08.nextInt();

        // if (angka % 2 == 0) {
        //     System.out.println("Angka " + angka + "Bilangan Genap");
        // } else {
        //     System.out.println("Angka " + angka + "BIlangan Ganjil");
        // }

        //Mengubah ke ternary operator
        String result;
        result = (angka %2 == 0) ? ("Angka " + angka + " bilangan genap") : ("Angka " + angka + " bilangan ganjil");
        System.out.println(result);
    }
}