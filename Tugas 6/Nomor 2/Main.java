import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        if (n <= 10) {
            // Cetak header tabel
            System.out.print("\t");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + "\t");
            }
            System.out.println();

            // Cetak pembatas
            for (int i = 0; i <= n; i++) {
                System.out.print("---------");
            }
            System.out.println();

            // Cetak baris tabel
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " |\t");
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai n harus lebih kecil atau sama dengan 10");
        }

        scanner.close();
    }
}