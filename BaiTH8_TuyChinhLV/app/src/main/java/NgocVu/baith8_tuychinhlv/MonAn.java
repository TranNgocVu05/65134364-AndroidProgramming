package NgocVu.baith8_tuychinhlv;

public class MonAn {
    private String tenMonAn;
    private double donGia;
    private String moTaMonAn;
    private int idAnhMH;
    // hàm tạo

    public MonAn(String tenMonAn, double donGia, String moTaMonAn, int idAnhMH) {
        this.tenMonAn = tenMonAn;
        this.donGia = donGia;
        this.moTaMonAn = moTaMonAn;
        this.idAnhMH = idAnhMH;
    }
    // các getter,

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMoTaMonAn() {
        return moTaMonAn;
    }

    public void setMoTaMonAn(String moTaMonAn) {
        this.moTaMonAn = moTaMonAn;
    }

    public int getIdAnhMH() {
        return idAnhMH;
    }

    public void setIdAnhMH(int idAnhMH) {
        this.idAnhMH = idAnhMH;
    }
}
