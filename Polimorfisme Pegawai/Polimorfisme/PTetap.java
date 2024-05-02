package Polimorfisme;

public class PTetap extends Pegawai {
    private double upahTetap;

    public PTetap(String name, String noKTP, double upah) {
        super(name, noKTP);
        setUpahTetap(upah);
    }

    public void setUpahTetap(double upah) {
        upahTetap = upah;
    }

    public double getUpahTetap() {
        return upahTetap;
    }

    public double gaji() {
        return getUpahTetap();
    }

    public String toString(){
        return String.format(
            "\nPegawai Tetap      : " + super.toString() + 
            "\nUpah               : " + getUpahTetap() + 
            "\nPendapatan         : " + "Rp " + (int) gaji()
        );
    }
}
