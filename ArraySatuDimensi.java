public class ArraySatuDimensi {
    public static void main(String[] args) {
        
        //Deklarasi dan inisialisasi array satu dimensi integer dengan
        //nama 'empatAngka' yang berisi angka 2, 5, 13, 28
        int[] empatAngka = {2, 5, 13, 28};

        //Menampilkan isi array
        System.out.println("Isi array dengan empatAngka:");
        for(int i = 0; i < empatAngka.length;i++){
            System.out.println("Elemen ke-"+i+":" + empatAngka[i]);
        }
    }
}
