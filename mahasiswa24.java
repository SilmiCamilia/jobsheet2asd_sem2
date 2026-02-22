public class mahasiswa24 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public mahasiswa24() {
    }

    public mahasiswa24(String nama, String nim, double ipk, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    void tampilkanInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("---------------------------");
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
        System.out.println("Kelas berhasil diubah menjadi " + kelas);
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
            System.out.println("IPK berhasil diperbarui.");
        } else {
            System.out.println("IPK tidak valid, harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.5) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
