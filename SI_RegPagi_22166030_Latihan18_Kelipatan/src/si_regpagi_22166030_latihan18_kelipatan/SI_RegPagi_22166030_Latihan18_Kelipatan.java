package si_regpagi_22166030_latihan18_kelipatan;

/**
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi
 * NIM      : 22166030
 * Deskripsi program : Menampilkan bilangan kelipatan 3.5 dari 3.5 sampai dengan 35
 */
public class SI_RegPagi_22166030_Latihan18_Kelipatan {
    public static void main(String[] args) {
        //Variable
        double start = 3.5;
        double end = 35;

        //Untuk melakukan perulangan (mencetak deret) dimulai dengan number yang setara dengan start dan diakhiri dengan end
        for (double number = start; number <= end; number += 3.5) {
            System.out.println(number);
        }
    }
    
}
