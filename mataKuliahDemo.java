import java.util.Scanner;

public class mataKuliahDemo {
    public static void main(String[] args) {
        Scanner coolyea = new Scanner(System.in);
        System.out.print("Jumlah MK: ");
        int n = coolyea.nextInt();
        MataKuliah[] mk = new MataKuliah[n];        
        String kode, nama;
        int sks, jumlahJam;

        for(int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));

            System.out.print("Kode        : ");
            kode = coolyea.nextLine();

            System.out.print("Nama        : ");
            nama = coolyea.nextLine();

            System.out.print("SKS         : ");
            sks = Integer.parseInt(coolyea.nextLine());

            System.out.print("Jumlah Jam  : ");
            jumlahJam = Integer.parseInt(coolyea.nextLine());

            System.out.println("-----------------------------------");

            mk[i] = new MataKuliah(); 
            mk[i].tambahData(kode, nama, sks, jumlahJam); 
        }
        for (MataKuliah m : mk) {
            m.cetakInfo();
        }
    }
}
