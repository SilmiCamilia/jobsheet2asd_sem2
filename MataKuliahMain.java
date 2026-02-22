public class MataKuliahMain {
    public static void main(String[] args) {

        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "ASD01";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        MataKuliah mk2 = new MataKuliah("BD02", "Basis Data", 2, 4);
        mk1.tampilInformasi();
        mk2.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(10);
    }
}