import pengguna.*;


public class Main {
    public static void main(String[] args) {
        int nim = 231110001;
        int modulo = nim % 5;
        nim = modulo + 1;
        System.out.println("Modulo NIM + 1 = " +nim);

        System.out.println("\n---------------------------------");
        System.out.println("Programm administrasi toko DVD");
        System.out.println("---------------------------------\n");

        User pelanggan = new Member();
        pelanggan.dataPengguna();
        pelanggan.showData();

        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------\n");

        pelanggan = new User();
        pelanggan.dataPengguna();
        pelanggan.showData();
    }
}
