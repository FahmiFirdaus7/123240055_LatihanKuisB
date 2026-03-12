/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

/**
 *
 * @author asus
 */
public class Pesanan {

    private pelanggan pelanggan;
    private PaketCuci paket;

    public Pesanan(pelanggan pelanggan, PaketCuci paket) {
        this.pelanggan = pelanggan;
        this.paket = paket;
    }

    public void tampilkan() {
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("Paket : " + paket.getNamaPaket());
        System.out.println("Total Biaya : " + paket.hitungTotalBiaya());

        if (paket instanceof LayananAntar) {
            ((LayananAntar) paket).cetakInfoAntar();
        }

        System.out.println("---------------------");
    }
}
