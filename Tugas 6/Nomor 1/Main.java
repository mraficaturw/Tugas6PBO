public class Main {
    public static void main(String[] args) {
        
        System.out.println("Deret bilangan prima dan bukan dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " bukan bilangan prima");
            }
        }

        
        System.out.println("\nDeret bilangan ganjil dan genap dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }

        
        System.out.println("\nHuruf Z - A:");
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.println(i);
        }

        
        int N = 5; 
        System.out.println("\nLagu \"Anak Ayam Turun " + N + "\":");
        for (int i = N; i > 0; i--) {
            System.out.println("Anak ayam turunlah " + i);
            if (i != 1) {
                System.out.println("Mati satu tinggallah " + (i - 1));
            } else {
                System.out.println("Mati satu tinggallah induknya");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}