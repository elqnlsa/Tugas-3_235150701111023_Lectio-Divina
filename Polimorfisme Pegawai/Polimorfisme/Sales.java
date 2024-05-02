package Polimorfisme;

public class Sales extends Pegawai {
    private int penjualanSales;
    private double komisiSales;

    public Sales(String name, String noKTP, int penjualan, double komisi){
        super(name, noKTP);
        setPenjualanSales(penjualan);
        setKomisiSales(komisi);
    }

    public void setPenjualanSales(int penjualan){
        penjualanSales = penjualan;
    }

    public int getPenjualanSales(){
        return penjualanSales;
    }

    public void setKomisiSales(double komisi){
        komisiSales = komisi;
    }

    public double getKomisiSales(){
        return komisiSales;
    }

    public double gaji(){
        return getKomisiSales() * getPenjualanSales();
    }

    public String toString(){
        return String.format(
            "\nSales              : " + super.toString() + 
            "\nTotal Penjualan    : " + getPenjualanSales() + 
            "\nBesaran Komisi     : " + getKomisiSales() + 
            "\nPendapatan         : " + "Rp " + (int) gaji());
    }
}
 