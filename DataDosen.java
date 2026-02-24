public class DataDosen {

    public void dataSemuaDosen(Dosen24[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        for (Dosen24 d : arrayOfDosen) {
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("---------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen24 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        System.out.println("Jumlah Pria   : " + pria);
        System.out.println("Jumlah Wanita : " + wanita);
    }

    public void rataUsiaDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen24 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                countPria++;
            } else {
                totalWanita += d.usia;
                countWanita++;
            }
        }

        System.out.println("\n=== RATA-RATA USIA DOSEN ===");
        if (countPria > 0)
            System.out.println("Rata-rata Usia Pria   : " + (totalPria / countPria));
        if (countWanita > 0)
            System.out.println("Rata-rata Usia Wanita : " + (totalWanita / countWanita));
    }

    public void infoDosenPalingTua(Dosen24[] arrayOfDosen) {
        Dosen24 tertua = arrayOfDosen[0];

        for (Dosen24 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\n=== DOSEN PALING TUA ===");
        System.out.println("Nama : " + tertua.nama);
        System.out.println("Usia : " + tertua.usia);
    }

    public void infoDosenPalingMuda(Dosen24[] arrayOfDosen) {
        Dosen24 termuda = arrayOfDosen[0];

        for (Dosen24 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\n=== DOSEN PALING MUDA ===");
        System.out.println("Nama : " + termuda.nama);
        System.out.println("Usia : " + termuda.usia);
    }
}