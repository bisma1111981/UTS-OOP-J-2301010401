/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasi.catatan;

import java.util.Scanner;

/**
 *
 * @author bisma1111981
 * Selasa, 05 Mei 2025
 */
public class AplikasiCatatan {

    private static Catatan[] daftarCatatan = new Catatan[100];
    private static int jumlahCatatan = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n--- MENU APLIKASI CATATAN ---");
            System.out.println("1. Tambah Catatan");
            System.out.println("2. Tampilkan Catatan");
            System.out.println("3. Ubah Catatan");
            System.out.println("4. Hapus Catatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahCatatan(scanner);
                    break;
                case 2:
                    tampilkanCatatan();
                    break;
                case 3:
                    ubahCatatan(scanner);
                    break;
                case 4:
                    hapusCatatan(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }

    private static void tambahCatatan(Scanner scanner) {
        System.out.print("Masukkan isi catatan: ");
        String isi = scanner.nextLine();

        daftarCatatan[jumlahCatatan] = new Catatan(isi);
        jumlahCatatan++;
        System.out.println("Catatan berhasil ditambahkan.");
    }

    private static void tampilkanCatatan() {
        if (jumlahCatatan == 0) {
            System.out.println("Belum ada catatan.");
        } else {
            System.out.println("\n--- DAFTAR CATATAN ---");
            for (int i = 0; i < jumlahCatatan; i++) {
                System.out.println((i + 1) + ". " + daftarCatatan[i].tampilkanInfo());
            }
        }
    }

    private static void ubahCatatan(Scanner scanner) {
        tampilkanCatatan();
        if (jumlahCatatan == 0) return;

        System.out.print("Masukkan nomor catatan yang ingin diubah: ");
        int nomor = scanner.nextInt();
        scanner.nextLine();

        if (nomor < 1 || nomor > jumlahCatatan) {
            System.out.println("Nomor tidak valid.");
            return;
        }

        System.out.print("Masukkan isi baru: ");
        String isiBaru = scanner.nextLine();
        daftarCatatan[nomor - 1].setIsi(isiBaru);
        System.out.println("Catatan berhasil diubah.");
    }

    private static void hapusCatatan(Scanner scanner) {
        tampilkanCatatan();
        if (jumlahCatatan == 0) return;

        System.out.print("Masukkan nomor catatan yang ingin dihapus: ");
        int nomor = scanner.nextInt();

        if (nomor < 1 || nomor > jumlahCatatan) {
            System.out.println("Nomor tidak valid.");
            return;
        }

        for (int i = nomor - 1; i < jumlahCatatan - 1; i++) {
            daftarCatatan[i] = daftarCatatan[i + 1];
        }
        daftarCatatan[jumlahCatatan - 1] = null;
        jumlahCatatan--;

        System.out.println("Catatan berhasil dihapus.");
    }
    
}
