public class DosenMain {
    public static void main(String[] args) {
        Dosen d1 = new Dosen();
        d1.idDosen = "D001";
        d1.nama = "Zuhriah Isfandiari";
        d1.statusAktif = true;
        d1.tahunBergabung = 2019;
        d1.bidangKeahlian = "Pemrograman";

        Dosen d2 = new Dosen("D002", "Camilia Baryd",
                true, 2022, "Basis Data");
        d1.tampilInformasi();
        d2.tampilInformasi();
        d1.setStatusAktif(false);
        System.out.println("Masa kerja: " + d1.hitungMasaKerja(2025) + " tahun");
        d1.ubahKeahlian("Artificial Intelligence");
        d2.setStatusAktif(true);
        System.out.println("Masa kerja: " + d2.hitungMasaKerja(2025) + " tahun");
        d2.ubahKeahlian("Machine Learning");
    }
}