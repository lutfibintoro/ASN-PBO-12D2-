package dvd;
import film.DaftarFilm;
import java.util.Scanner;
import java.time.LocalDate;


public class DVDSewa extends DVD {
    String filmYangDisewa;
    DaftarFilm pilih = new DaftarFilm();
    Scanner input = new Scanner(System.in);

    LocalDate waktuSewa;

    
    @Override
    public void pilihanFilm(){
        System.out.println("\nPilihan Sewa Film:");
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
        waktuSewa = LocalDate.now();
        
    }

    @Override
    public void pilihFilm() {
        System.out.printf("Silahkan pilih: ");
        filmKe = input.nextInt();
        
        switch (filmKe) {
            case 1:
                filmYangDisewa = pilih.getSusanaa();
                break;

            case 2:
                filmYangDisewa = pilih.getAlamKubur();
                break;

            case 3:
                filmYangDisewa = pilih.getHariKebangkitan();
                break;

            case 4:
                filmYangDisewa = pilih.getHariTerakhirDidunia();
                break;

            case 5:
                filmYangDisewa = pilih.getKeajaiban();
                break;

            case 6:
                filmYangDisewa = pilih.getKhilaf();
                break;

            case 7:
                filmYangDisewa = pilih.getMukzizat();
                break;

            case 8:
                filmYangDisewa = pilih.getSeribuSatuMaksiat();
                break;

            case 9:
                filmYangDisewa = pilih.getSiksaNeraka();
                break;
        
            default:
                filmYangDisewa = pilih.getTobat();
                break;
        }

    }

    public String getFilm(){
        return filmYangDisewa;
    }

    public LocalDate getWaktu(){
        return waktuSewa;
    }

}
