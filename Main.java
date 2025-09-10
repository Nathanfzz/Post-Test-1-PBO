/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author asus GK
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    
    static class Pembangunan {
        String jenis;
        String alamat;
        String tanggal;
        String lamaKontrak;
        String namaProyek;
        String status;

        public Pembangunan(String jenis, String alamat, String tanggal, String lamaKontrak, String namaProyek, String status) {
            this.jenis = jenis;
            this.alamat = alamat;
            this.tanggal = tanggal;
            this.lamaKontrak = lamaKontrak;
            this.namaProyek = namaProyek;
            this.status = status;
        }

        
        public String toString() {
            return "Nama Proyek: " + namaProyek +
                   "\nJenis: " + jenis +
                   "\nAlamat: " + alamat +
                   "\nTanggal: " + tanggal +
                   "\nLama Kontrak: " + lamaKontrak +
                   "\nStatus: " + status + "\n";
        }
    }

    public static void main(String[] args) {
        ArrayList<Pembangunan> daftarPembangunan = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n>>> SISTEM PENCATATAN PEMBANGUNAN/PERBAIKAN KOTA <<<");
            System.out.println("1. Tambahkan Catatan");
            System.out.println("2. Lihat Catatan");
            System.out.println("3. Ubah Catatan");
            System.out.println("4. Hapus Catatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    
                    System.out.println("\n>>> TAMBAH CATATAN <<<");
                    System.out.print("Masukkan jenis pembangunan (contoh: Transportasi Umum/Jalan): ");
                    String jenis = scanner.nextLine();

                    System.out.print("Masukkan alamat jalan: ");
                    String alamat = scanner.nextLine();

                    System.out.print("Masukkan tanggal proyek (contoh: 10-09-2025): ");
                    String tanggal = scanner.nextLine();

                    System.out.print("Masukkan lama kontrak proyek (contoh: 12 bulan): ");
                    String lamaKontrak = scanner.nextLine();

                    System.out.print("Masukkan nama proyek: ");
                    String namaProyek = scanner.nextLine();

                    System.out.print("Masukkan status (Pembangunan/Perbaikan/Selesai): ");
                    String status = scanner.nextLine();

                    daftarPembangunan.add(new Pembangunan(jenis, alamat, tanggal, lamaKontrak, namaProyek, status));
                    System.out.println("Catatan berhasil ditambahkan!");
                    break;

                case 2:
                    
                    System.out.println("\n>>> DAFTAR PEMBANGUNAN/PERBAIKAN <<<");
                    if (daftarPembangunan.isEmpty()) {
                        System.out.println("Belum ada Catatan!");
                    } else {
                        for (int i = 0; i < daftarPembangunan.size(); i++) {
                            System.out.println("Data ke-" + (i+1));
                            System.out.println(daftarPembangunan.get(i));
                        }
                    }
                    break;

                case 3:
                    
                    System.out.println("\n>>> UBAH CATATAN <<<");
                    if (daftarPembangunan.isEmpty()) {
                        System.out.println("Belum ada data!");
                    } else {
                        for (int i = 0; i < daftarPembangunan.size(); i++) {
                            System.out.println((i+1) + ". " + daftarPembangunan.get(i).namaProyek);
                        }
                        System.out.print("Pilih nomor data yang ingin diubah: ");
                        int indexUbah = scanner.nextInt();
                        scanner.nextLine();
                        if (indexUbah > 0 && indexUbah <= daftarPembangunan.size()) {
                            Pembangunan p = daftarPembangunan.get(indexUbah - 1);

                            System.out.print("Jenis baru (lama: " + p.jenis + "): ");
                            p.jenis = scanner.nextLine();

                            System.out.print("Alamat baru (lama: " + p.alamat + "): ");
                            p.alamat = scanner.nextLine();

                            System.out.print("Tanggal baru (lama: " + p.tanggal + "): ");
                            p.tanggal = scanner.nextLine();

                            System.out.print("Lama kontrak baru (lama: " + p.lamaKontrak + "): ");
                            p.lamaKontrak = scanner.nextLine();

                            System.out.print("Nama proyek baru (lama: " + p.namaProyek + "): ");
                            p.namaProyek = scanner.nextLine();

                            System.out.print("Status baru (lama: " + p.status + "): ");
                            p.status = scanner.nextLine();

                            System.out.println("Data berhasil diubah!");
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;

                case 4:
                    
                    System.out.println("\n>>> HAPUS CATATAN <<<");
                    if (daftarPembangunan.isEmpty()) {
                        System.out.println("Belum ada catatan!");
                    } else {
                        for (int i = 0; i < daftarPembangunan.size(); i++) {
                            System.out.println((i+1) + ". " + daftarPembangunan.get(i).namaProyek);
                        }
                        System.out.print("Pilih nomor catatan yang ingin dihapus: ");
                        int indexHapus = scanner.nextInt();
                        scanner.nextLine();
                        if (indexHapus > 0 && indexHapus <= daftarPembangunan.size()) {
                            daftarPembangunan.remove(indexHapus - 1);
                            System.out.println("Catatan berhasil dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
