/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

/**
 *
 * @author asus
 */
abstract class PaketCuci {
    protected String namaPaket;
    protected double hargaDasar;

    public PaketCuci(double hargaDasar) throws DataPaketTidakValidException {
        if (hargaDasar <= 0) {
            throw new DataPaketTidakValidException("Harga dasar tidak boleh 0 atau negatif!");
        }
        this.hargaDasar = hargaDasar;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public abstract double hitungTotalBiaya();
}
