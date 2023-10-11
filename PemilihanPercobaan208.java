import java.util.Scanner;

public class PemilihanPercobaan208 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        float uas, uts, kuis, tugas, total;

        System.out.print("Nilai UAS : ");
        uas = input08.nextFloat();;
        System.out.print("Nilai uts : " );
        uts = input08.nextFloat();
        System.out.print("Nilai kuis : " );
        kuis = input08.nextFloat();
        System.out.print("Nilai tugas : " );
        tugas = input08.nextFloat();

        //hitung total hasl
        total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);

        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai Akhir = " + total + " sehingga " + message);

        // konversi nilai ke char
        if (total >= 80) {
            System.out.println("Konversi nilai anda = A");
        } else if (total >= 73) {
            System.out.println("Konversi nilai anda = B+");
        } else if (total >= 65) {
            System.out.println("Konversi nilai anda = B");
        } else if (total >= 60) {
            System.out.println("Konversi nilai anda = C+");
        } else if (total >= 50) {
            System.out.println("Konvesi nilai anda = C");
        } else if (total >= 39) {
            System.out.println("Konversi nilai anda = D");
        } else {
            System.out.println("Konversi nilai anda = E");
        }
    }
}
