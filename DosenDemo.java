import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {

        Scanner doesnt = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen : ");
        int jumlah = doesnt.nextInt();
        doesnt.nextLine(); 

        Dosen24[] arrayOfDosen = new Dosen24[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = doesnt.nextLine();

            System.out.print("Nama          : ");
            String nama = doesnt.nextLine();

            System.out.print("Jenis Kelamin (true=Pria, false=Wanita): ");
            Boolean jenisKelamin = doesnt.nextBoolean();

            System.out.print("Usia          : ");
            int usia = doesnt.nextInt();
            doesnt.nextLine();

            arrayOfDosen[i] = new Dosen24(kode, nama, jenisKelamin, usia);
        }

        DataDosen data = new DataDosen();
        data.dataSemuaDosen(arrayOfDosen);
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);
        data.rataUsiaDosenPerJenisKelamin(arrayOfDosen);
        data.infoDosenPalingTua(arrayOfDosen);
        data.infoDosenPalingMuda(arrayOfDosen);
    }
}