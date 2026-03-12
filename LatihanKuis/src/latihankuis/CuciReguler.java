/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

/**
 *
 * @author asus
 */
public class CuciReguler extends PaketCuci {

    public CuciReguler(double hargaDasar) throws DataPaketTidakValidException {
        super(hargaDasar);
        this.namaPaket = "Cuci Regular";
    }

    @Override
    public double hitungTotalBiaya() {
        return hargaDasar;
    }
}
