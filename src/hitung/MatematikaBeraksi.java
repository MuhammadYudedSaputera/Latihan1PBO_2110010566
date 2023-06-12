
package hitung;

public class MatematikaBeraksi {
    public static void main (String[] args) {
        
        Matematika yuded = new Matematika (2, 3);
        
        System.out.println ("Hasil penjumlahan: "+ yuded.setPenjumlahan ());
        System.out.println ("Hasil pengurangan: "+ yuded.setPengurangan ());
        System.out.println ("Hasil perkalian: "+ yuded.setPerkalian ());
        System.out.println ("Hasil pembagian: "+ yuded.setPembagian ());
    }
}
