import java.util.Scanner;

public class mahasiswaDemo {
    public static void main(String[] args) {
        Scanner arphy = new Scanner(System.in);        
        mahasiswa24[] arrayOfMahasiswa = new mahasiswa24[3];
        for(int i=0; i<3; i++){
            arrayOfMahasiswa[i] = new mahasiswa24();
            System.out.println("Masukkan Data MAhasiswa ke-"+(i+1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim = arphy.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = arphy.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = arphy.nextLine();
            System.out.print("IPK     : ");
            arrayOfMahasiswa[i].ipk = Float.parseFloat(arphy.nextLine());
            System.out.println("---------------------------------------");
        }

        for (mahasiswa24 m : arrayOfMahasiswa) {
            m.cetakInfo();
        }


    }
}
