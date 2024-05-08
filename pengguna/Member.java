package pengguna;


public class Member extends User{
    protected String kartuMember = "Hak spesial kartu member";
    private int pilihan;


    @Override
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


    @Override
    public void dataPengguna(String nama, String noTelpon, String alamat, int umur){
        System.out.printf("Masukkan data dengan benar:\nNama\t\t: " +nama);
        System.out.printf("NoTelpon\t: " +noTelpon);
        System.out.printf("Alamat\t\t: " +alamat);
        System.out.printf("Umur\t\t: " +umur);

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


    @Override
    protected void sewa(){
        pilihDVDSewa.pilihanFilm();
    }
    @Override
    protected void beli(){
        pilihDVDBeli.pilihanFilm();
    }


    @Override
    public void showData(){
        switch (pilihan) {
            case 1:
                this.filmYangDipilih = pilihDVDBeli.getFilm();
                this.waktu = pilihDVDBeli.getWaktu();
                dataPenggunaPembelian.showDataPengguna(nama, noTelpon, alamat, umur, kartuMember, filmYangDipilih, waktu);
                break;

            case 2:
                this.filmYangDipilih = pilihDVDSewa.getFilm();
                this.waktu = pilihDVDSewa.getWaktu();
                dataPenggunaPenyewaan.showDataPengguna(nama, noTelpon, alamat, umur, kartuMember, filmYangDipilih, waktu);
                break;

            default:
                System.out.println("Pilihan Hanya bisa 1/2, silahkan ulangi");
                dataPengguna();
                break;
        }
    }
}
