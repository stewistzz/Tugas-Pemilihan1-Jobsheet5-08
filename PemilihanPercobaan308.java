import java.util.Scanner;

public class PemilihanPercobaan308 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama = ");
        angka1 = input08.nextDouble();
        System.out.print("Masukkan angka kedua = ");
        angka2 = input08.nextDouble();
        System.out.print("Masukkan Operator (+ - * /) : ");
        operator = input08.next().charAt(0);

        // switch case
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + tambah " + angka2 + " = " + hasil);
                // break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
        
            default:
                break;
        }
    }
}
