public class DataDosen04 {
    
    void dataSemuaDosen(Dosen04[] arrayDosen) {
        System.out.println("-----------------------------------");            
        System.out.println("Data Semua Dosen");
        System.out.println("-----------------------------------");             

        for (Dosen04 allData : arrayDosen) {
            System.out.println("Kode Dosen: " + allData.kode );
            System.out.println("Nama Dosen: " + allData.nama );
            System.out.println("Usia Dosen: " + allData.usia );
            if(allData.jenisKelamin == true){
                System.out.println("Jenis Kelamin Dosen: Pria"  );
            } else{
                System.out.println("Jenis Kelamin Dosen: Wanita"  );
            }
            System.out.println("-----------------------------------");        }
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen04[] arrayDosen) {
        System.out.println("-----------------------------------");        
        System.out.println("Rerata Usia Dosen per Jenis Kelamin");
        System.out.println("-----------------------------------");             

        int totPria = 0;
        int totWanita = 0;
        double avrPria = 0;
        double avrWanita = 0;
        
        for (Dosen04 allData : arrayDosen) {
            if (allData.jenisKelamin == true) {
                totPria += 1;
                avrPria += allData.usia;
            } else {
                totWanita += 1;
                avrWanita += allData.usia;
            }
        }
        avrPria /= totPria;
        avrWanita /= totWanita;
        System.out.println("Rerata usia dosen pria: " + avrPria);
        System.out.println("Rerata usia dosen wanita: " + avrWanita);
        System.out.println("-----------------------------------");            //percobaan


    }
    void jumlahDosenPerJenisKelamin(Dosen04[] arrayDosen) {
        System.out.println("-----------------------------------");
        System.out.println("Jumlah Dosen per Jenis Kelamin");
        System.out.println("-----------------------------------");             

        int totPria = 0;
        int totWanita = 0;
        
        for (Dosen04 allData : arrayDosen) {
            if (allData.jenisKelamin == true) {
                totPria += 1;
            } else {
                totWanita += 1;
            }
        }

        System.out.println("Total dosen Pria: " + totPria);
        System.out.println("Total dosen Wanita: " + totWanita);
        System.out.println("-----------------------------------");
    }

    void infoDosenPalingTua(Dosen04[] arrayDosen) {
        System.out.println("-----------------------------------");
        System.out.println("Info Dosen Tertua");
        System.out.println("-----------------------------------");             

        int usiaTertua = arrayDosen[0].usia;
        int posisiIndex = 0;
        for (int i = 0; i < arrayDosen.length; i++) {
            if (arrayDosen[i].usia > usiaTertua) {
                usiaTertua = arrayDosen[i].usia;
                posisiIndex = i;
            }
        }
        System.out.println("Dosen tertua: ");
        System.out.println("Kode\t: " + arrayDosen[posisiIndex].kode);
        System.out.println("Nama\t: " + arrayDosen[posisiIndex].nama);
        if (arrayDosen[posisiIndex].jenisKelamin == true) {
            System.out.println("Jenis Kelamin Dosen: Pria"  );
        } else{
            System.out.println("Jenis Kelamin Dosen: Wanita"  );
        }

        System.out.println("Usia\t: " + arrayDosen[posisiIndex].usia);
        System.out.println("-----------------------------------");  
    }

    void infoDosenPalingMuda(Dosen04[] arrayDosen) {
        System.out.println("-----------------------------------");
        System.out.println("Info Dosen Termuda");
        System.out.println("-----------------------------------");             

        int usiaTermuda = arrayDosen[0].usia;
        int posisiIndex = 0;
        for (int i = 0; i < arrayDosen.length; i++) {
            if (arrayDosen[i].usia < usiaTermuda) {
                usiaTermuda = arrayDosen[i].usia;
                posisiIndex = i;
            }
        }
        System.out.println("Dosen termuda: ");
        System.out.println("Kode\t: " + arrayDosen[posisiIndex].kode);
        System.out.println("Nama\t: " + arrayDosen[posisiIndex].nama);
        if (arrayDosen[posisiIndex].jenisKelamin == true) {
            System.out.println("Jenis Kelamin Dosen: Pria"  );
        } else{
            System.out.println("Jenis Kelamin Dosen: Wanita"  );
        }

        System.out.println("Usia\t: " + arrayDosen[posisiIndex].usia);
        System.out.println("-----------------------------------");     
    }    
}

