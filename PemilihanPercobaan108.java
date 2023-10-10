import java.util.Scanner;

public class PemilihanPercobaan108 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        // Masukkan angka(input)
        System.out.print("Masukkan angka = ");
        int angka = input08.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + "Bilangan Genap");
        } else {
            System.out.println("Angka " + angka + "BIlangan Ganjil");
        }
    }
}