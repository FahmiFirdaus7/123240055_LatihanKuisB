/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

/**
 *
 * @author asus
 */
public class CuciExpress extends PaketCuci implements LayananAntar {

    public CuciExpress(double hargaDasar) throws DataPaketTidakValidException {
        super(hargaDasar);
        this.namaPaket = "Cuci Express";
    }

    @Override
    public double hitungTotalBiaya() {
        return hargaDasar + 20000;
    }

    @Override
    public void cetakInfoAntar() {
        System.out.println("Layanan Antar-Jemput Gratis LaundryKita");
    }
}
