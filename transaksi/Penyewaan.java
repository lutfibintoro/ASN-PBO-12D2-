package transaksi;
import java.time.LocalDate;

public class Penyewaan {

    public void showDataPengguna(String nama, String noTelpon, String alamat, int umur, String member, String filmYangDiPilih, LocalDate waktuTransaksi){
        System.out.println("\nUser berhasil melakukan transaksi penyewaan DVD dengan " +member);
        System.out.println("Nama\t\t\t: " +nama);
        System.out.println("NoTelpon\t\t: " +noTelpon);
        System.out.println("Alamat\t\t\t: " +alamat);
        System.out.println("Umur\t\t\t: " +umur);
        System.out.println("Film yang dipilih\t: " +filmYangDiPilih);
        System.out.println("Waktu transaksi\t\t: " +waktuTransaksi);
        System.out.println("Status\t\t\t: " +member+ "\n");
    }

    public void showDataPengguna(String nama, String noTelpon, String alamat, int umur, String filmYangDiPilih, LocalDate waktuTransaksi){
        System.out.println("\nUser berhasil melakukan transaksi penyewaan DVD");
        System.out.println("Nama\t\t\t: " +nama);
        System.out.println("NoTelpon\t\t: " +noTelpon);
        System.out.println("Alamat\t\t\t: " +alamat);
        System.out.println("Umur\t\t\t: " +umur);
        System.out.println("Film yang dipilih\t: " +filmYangDiPilih);
        System.out.println("Waktu transaksi\t\t: " +waktuTransaksi+ "\n");
    }
}
