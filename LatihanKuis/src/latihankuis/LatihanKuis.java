/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihankuis;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class LatihanKuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pesanan> daftarPesanan = new ArrayList<>();

        while (true) {

            System.out.println("===== MENU =====");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Keluar");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            input.nextLine();

            if (pilih == 2) {
                break;
            }

            try {

                System.out.print("Nama Pelanggan: ");
                String nama = input.nextLine();

                System.out.print("Nomor Telepon: ");
                String telp = input.nextLine();

                if (!telp.matches("\\d+")) {
                    throw new Exception("Nomor telepon harus angka!");
                }

                pelanggan pelanggan = new pelanggan(nama, telp);

                System.out.print("Harga Dasar: ");
                double harga = input.nextDouble();

                System.out.print("Jenis Paket (1 Regular / 2 Express): ");
                int jenis = input.nextInt();
                input.nextLine();

                PaketCuci paket;

                if (jenis == 1) {
                    paket = new CuciReguler(harga);
                } else if (jenis == 2) {
                    paket = new CuciExpress(harga);
                } else {
                    throw new Exception("Jenis paket tidak valid!");
                }

                daftarPesanan.add(new Pesanan(pelanggan, paket));

                System.out.println("Pesanan berhasil ditambahkan!");

            } catch (DataPaketTidakValidException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Input tidak valid: " + e.getMessage());
            }

        }

        System.out.println("\n===== REKAP PESANAN =====");

        for (Pesanan p : daftarPesanan) {
            p.tampilkan();
        }

    }
    
}
