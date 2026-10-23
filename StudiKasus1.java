import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket, totalTiketTerjual = 0;
        double totalPendapatan = 0;
        int hargaPerTiket = 50000;
        boolean lanjut;

        do {
            do{
                System.out.println("Masukkan jumlah tiket yang dibeli (jika negatif akan diulang): ");
                jumlahTiket = sc.nextInt();

                if (jumlahTiket < 0) {
                    System.out.println("Input tidak valid. jumlah tiket tidak boleh negatif. masukkan ulang.");
                }
            } while (jumlahTiket < 0);

            if (jumlahTiket > 0) {
                double subtotal = jumlahTiket*hargaPerTiket;
                double diskon = 0;

                if (jumlahTiket > 10) {
                    diskon = 0.15;
                } else if (jumlahTiket > 4) {
                    diskon = 0.10;
                }
                double totalHarga = subtotal - (subtotal*diskon);

                totalTiketTerjual += jumlahTiket;
                totalPendapatan += totalHarga;

                System.out.println("Subtotal setelah diskon (" + (int)(diskon*100) + "%): Rp" + totalHarga);
            }
            System.out.println("Apakah ingin memasukkan data transaksi lain? (true/false): ");
            lanjut = sc.nextBoolean();
        } while (lanjut == true && false);

        System.out.println("Total tiket yang terjual : " + totalTiketTerjual + "tiket");
        System.out.println("Total pendapatan hari ini : Rp" + totalPendapatan);
    }
    
}
