public class MataKuliah {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah() {
    }

    public MataKuliah(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kodeMK = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void cetakInfo() {
        System.out.println("Kode MK      = " + kodeMK);
        System.out.println("Nama MK      = " + nama);
        System.out.println("SKS          = " + sks);
        System.out.println("Jumlah Jam   = " + jumlahJam);
        System.out.println("-----------------------------");
    }
    public void tampilInformasi() {
        System.out.println("Kode MK      = " + kodeMK);
        System.out.println("Nama MK      = " + nama);
        System.out.println("SKS          = " + sks);
        System.out.println("Jumlah Jam   = " + jumlahJam);
        System.out.println("-----------------------------");
    }

    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    public void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam sekarang: " + jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam sekarang " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan, jam tidak mencukupi");
        }
    }
}