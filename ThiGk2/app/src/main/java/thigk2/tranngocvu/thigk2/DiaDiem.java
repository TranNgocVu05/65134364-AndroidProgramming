package thigk2.tranngocvu.thigk2;

public class DiaDiem {
    private String ten;
    private String diaChi;
    private int anhResId;

    public DiaDiem(String ten, String diaChi, int anhResId) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.anhResId = anhResId;
    }

    public String getTen() { return ten; }
    public String getDiaChi() { return diaChi; }
    public int getAnhResId() { return anhResId; }
}
