public class ArrayDuaDimensi {
    public static void main(String[]args){

        //Deklarasi dan inisialisasi Array dua dimensi String
        //dengan nama 'Angka', ukuran 3x3
        String[][] Angka = {
            {"2", "5", "13"},
            {"17", "22", "24"},
            {"28", "31", "42"}
        };

        //Menampilkan isi array
        System.out.println("isi array Angka:");
        for(int i = 0; i < 3;i++){ //ini merupakan iterasi baris
            for(int j = 0; j < 3; j++){ //sedangkan ini adalah iterasi kolom
                System.out.print(Angka[i][j] + "");
            }
            System.out.println(); //pindah baris setelah setiap baris selesai
        }
    }
}
