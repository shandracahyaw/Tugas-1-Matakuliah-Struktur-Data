import java.util.LinkedList;
import java.util.List; //Mengimpor interface List

public class DeklarasiLinkedList {
    public static void main(String[] args) {
        
        //Dklarasi Linked List dengan nama 'listAngka'
        //dan tipe data Integer
        List<Integer> listAngka = new LinkedList <>();

        //Menambahkan elemen ke linked list
        listAngka.add(2);
        listAngka.add(5);
        listAngka.add(13);
        listAngka.add(28);

        //Menampilkan isi linked list
        System.out.println("isi linked list listAngka:" + listAngka);

        //Mencoba mengekseskusi contoh operasi lain dengan menambahkan elemen 
        // di posisi tertentu
        listAngka.add(4, 17); //Menambahkan 17  di index ke-4
        System.out.println("isi linked list setelah penambahan:" + listAngka);

        //Kemudian mencoba mengeksekusi contoh operasi lain yang kedua
        //dengan menghapus elemen
        listAngka.remove(Integer.valueOf(5)); //Menghapus elemen 5
        System.out.println("isi linked list setelah penghapusan:" + listAngka);
    }
}
