package dvd;
import film.DaftarFilm;
import java.util.Scanner;
import java.time.LocalDate;


public class DVDBeli extends DVD {
    String filmYangDibeli;
    DaftarFilm pilih = new DaftarFilm();
    Scanner input = new Scanner(System.in);

    LocalDate waktuBeli;
    

    @Override
    public void pilihanFilm(){
        System.out.println("\nPilihan Beli Film:");
        System.out.println("1. Susanaa");
        System.out.println("2. Alam kubur");
        System.out.println("3. Hari kebangkitan");
        System.out.println("4. Hari terakhir di dunia");
        System.out.println("5. Keajaiban");
        System.out.println("6. Khilaf");
        System.out.println("7. Mukzizat");
        System.out.println("8. Seribu satu maksiat");
        System.out.println("9. Siksa neraka");
        System.out.println("10. Tobat");
        pilihFilm();
        waktuBeli = LocalDate.now();
    }

    @Override
    public void pilihFilm(){
        System.out.printf("Silahkan pilih: ");
        filmKe = input.nextInt();
        
        switch (filmKe) {
            case 1:
                filmYangDibeli = pilih.getSusanaa();
                break;

            case 2:
                filmYangDibeli = pilih.getAlamKubur();
                break;

            case 3:
                filmYangDibeli = pilih.getHariKebangkitan();
                break;

            case 4:
                filmYangDibeli = pilih.getHariTerakhirDidunia();
                break;

            case 5:
                filmYangDibeli = pilih.getKeajaiban();
                break;

            case 6:
                filmYangDibeli = pilih.getKhilaf();
                break;

            case 7:
                filmYangDibeli = pilih.getMukzizat();
                break;

            case 8:
                filmYangDibeli = pilih.getSeribuSatuMaksiat();
                break;

            case 9:
                filmYangDibeli = pilih.getSiksaNeraka();
                break;
        
            default:
                filmYangDibeli = pilih.getTobat();
                break;
        }
    }

    public String getFilm(){
        return filmYangDibeli;
    }

    public LocalDate getWaktu(){
        return waktuBeli;
    }
}
