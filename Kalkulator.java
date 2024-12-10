import java.util.Scanner;

public class Kalkulator{
    static Scanner input = new Scanner(System.in);

    public static void main (String [] args){

        judul();
        int pilihan = inputMenu("Masukkan Pilihan: ");

        while (true) { 
            if (pilihan == 0){
                System.out.println("Terima kasih atas waktunya!!!");
                System.out.print("Keluar dari program...");
                System.out.println("=".repeat(50));
                break;
            } else if (pilihan > 0 && pilihan < 7){
                switch (pilihan){
                    case 1 -> {
                        System.out.print("Banyak angka yang akan dijumlahkan: ");
                        int n = input.nextInt();
                        int[] angkaArray = new int[n];

                        for (int i = 0; i < n; i++){
                            System.out.printf("%s", "Masukkan angka ke-" + (i+1) + ": ");
                            angkaArray[i] = input.nextInt();
                        }
                        System.out.println("=".repeat(50));
                        for (int i = 0; i < n; i++){
                            System.out.printf("%48d\n", angkaArray[i]);
                        }

                        int total = penjumlahan(angkaArray);

                        System.out.println("-".repeat(48) + " +");
                        System.out.printf("%48d \n", total);
                        System.out.println("=".repeat(50));
                        break; 
                    } 
                    case 2 -> {
                        System.out.print("Banyak angka yang akan dikurangkan: ");
                        int n = input.nextInt();
                        int[] angkaArray = new int[n];

                        for (int i = 0; i < n; i++){
                            System.out.printf("%s", "Masukkan angka ke-" + (i+1) + ": ");
                            angkaArray[i] = input.nextInt();
                        }
                        System.out.println("=".repeat(50));
                        for (int i = 0; i < n; i++){
                            System.out.printf("%48d\n", angkaArray[i]);
                        }

                        int total = pengurangan(angkaArray);

                        System.out.println("-".repeat(48) + " +");
                        System.out.printf("%48d \n", total);
                        System.out.println("=".repeat(50));
                        break; 
                    } 
                    case 3 -> {
                        System.out.printf("%s", "Masukkan angka pertama: ");
                        int angka1 = input.nextInt();
                        System.out.printf("%s", "Masukkan angka kedua: ");
                        int angka2 = input.nextInt();

                        System.out.println("=".repeat(50));
                        System.out.printf("%48d\n", angka1);
                        System.out.printf("%48d\n", angka2);

                        System.out.println("-".repeat(48) + " x");
                        int hasil = perkalian(angka1, angka2);
                        System.out.printf("%48d\n", hasil);
                        System.out.println("=".repeat(50));
                        break; 
                    } 
                    case 4 -> {
                        System.out.printf("%s", "Masukkan angka pertama: ");
                        int angka1 = input.nextInt();
                        System.out.printf("%s", "Masukkan angka kedua: ");
                        int angka2 = input.nextInt();

                        System.out.println("=".repeat(50));
                        System.out.printf("%48d\n", angka1);
                        System.out.printf("%48d\n", angka2);

                        System.out.println("-".repeat(48) + " ÷");
                        int hasil = pembagian(angka1, angka2);
                        System.out.printf("%48d\n", hasil);
                        System.out.println("=".repeat(50));
                        break; 
                    } 
                    case 5 -> {
                        System.out.printf("%s", "Masukkan angka pertama: ");
                        int angka1 = input.nextInt();
                        System.out.printf("%s", "Masukkan angka kedua: ");
                        int angka2 = input.nextInt();

                        System.out.println("=".repeat(50));
                        System.out.printf("%48d\n", angka1);
                        System.out.printf("%48d\n", angka2);

                        System.out.println("-".repeat(48) + " ^");
                        int hasil = perpangkatan(angka1, angka2);
                        System.out.printf("%48d\n", hasil);
                        System.out.println("=".repeat(50));
                        break; 
                    } 
                    case 6 -> {
                        System.out.printf("%s", "Masukkan angka: ");
                        int angka1 = input.nextInt();

                        System.out.println("=".repeat(50));
                        System.out.printf("%48s\n", ("√" + angka1));

                        System.out.println("-".repeat(50));
                        int hasil = akar(angka1);
                        System.out.printf("%48d\n", hasil);
                        System.out.println("=".repeat(50));
                        break; 
                    } 
                }
            }
            pilihan = inputMenu("Masukkan Pilihan: ");
        }
    }
    

    public static void judul (){
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.printf("%" + (50+20)/2 + "s", "Kalkulator Sederhana\n");
        System.out.printf("%" + (50+39)/2 + "s", "Dibuat Oleh Muhamad Fahry Pratama Putra\n");
        System.out.println("=".repeat(50));
    }

    public static int inputMenu(String beriPilihan){
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Perpangkatan");
        System.out.println("6. Akar");
        System.out.println("0. Keluar\n");

        System.out.print(beriPilihan);
        int pilihan = input.nextInt();
        
        System.out.println("=".repeat(50));
        return pilihan;
    }

    public static int penjumlahan(int[] angkaArray){
        int total = 0;
        for (int angka : angkaArray) {
            total += angka; 
        }
        return total;
    }

    public static int pengurangan(int[] angkaArray){
        int total = angkaArray[0];
        for (int angka : angkaArray) {
            total -= angka; 
        }
        return total;
    }

    public static int perkalian(int angka1, int angka2){
        return angka1 * angka2;
    }

    public static int pembagian(int angka1, int angka2){
        return angka1 / angka2;
    }

    public static int perpangkatan(int angka1, int angka2){
        return (int) Math.pow(angka1, angka2);
    }

    public static int akar(int angka1){
        return (int) Math.sqrt(angka1);
    }

}
