package pengguna;
import java.util.Scanner;
import java.time.LocalDate;
import dvd.*;
import transaksi.*;

public class User {
    protected String nama;
    protected String noTelpon;
    protected String alamat;
    protected int umur;
    protected String filmYangDipilih;
    protected LocalDate waktu;
    private int pilihan;

    Scanner input = new Scanner(System.in);
    DVDBeli pilihDVDBeli = new DVDBeli();
    DVDSewa pilihDVDSewa = new DVDSewa();

    public void dataPengguna(){
        System.out.printf("Masukkan data dengan benar:\nNama\t\t: ");
        this.nama = input.nextLine();
        System.out.printf("NoTelpon\t: ");
        this.noTelpon = input.nextLine();
        System.out.printf("Alamat\t\t: ");
        this.alamat = input.nextLine();
        System.out.printf("Umur\t\t: ");
        this.umur = input.nextInt();

        System.out.printf("\n1.Beli/2.Sewa\npilih\t: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                beli();
                break;

            case 2:
                sewa();
                break;

            default:
                System.out.println("Pilihan Hanya bisa 1/2, silahkan ulangi");
                dataPengguna(this.nama, this.noTelpon, this.alamat, this.umur);
                break;
        }
    }

    public void dataPengguna(String nama, String noTelpon, String alamat, int umur){
        System.out.printf("Masukkan data dengan benar:\nNama\t\t: " +nama);
        System.out.printf("\nNoTelpon\t: " +noTelpon);
        System.out.printf("\nAlamat\t\t: " +alamat);
        System.out.printf("\nUmur\t\t: " +umur);

        System.out.printf("\n1.Beli/2.Sewa\npilih\t: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                beli();
                break;

            case 2:
                sewa();
                break;

            default:
                System.out.println("Pilihan Hanya bisa 1/2, silahkan ulangi");
                dataPengguna(this.nama, this.noTelpon, this.alamat, this.umur);
                break;
        }
    }


    Pembelian dataPenggunaPembelian = new Pembelian();
    Penyewaan dataPenggunaPenyewaan = new Penyewaan();


    protected void sewa(){
        pilihDVDSewa.pilihanFilm();
    }
    protected void beli(){
        pilihDVDBeli.pilihanFilm();
    }

    public void showData(){
        switch (pilihan) {
            case 1:
                this.filmYangDipilih = pilihDVDBeli.getFilm();
                this.waktu = pilihDVDBeli.getWaktu();
                dataPenggunaPembelian.showDataPengguna(nama, noTelpon, alamat, umur, filmYangDipilih, waktu);
                break;

            case 2:
                this.filmYangDipilih = pilihDVDSewa.getFilm();
                this.waktu = pilihDVDSewa.getWaktu();
                dataPenggunaPenyewaan.showDataPengguna(nama, noTelpon, alamat, umur, filmYangDipilih, waktu);
                break;

            default:
                System.out.println("Pilihan Hanya bisa 1/2, silahkan ulangi");
                dataPengguna();
                break;
        }
    }
}
