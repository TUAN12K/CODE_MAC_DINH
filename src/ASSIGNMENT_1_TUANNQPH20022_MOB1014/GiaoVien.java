package ASSIGNMENT_1_TUANNQPH20022_MOB1014;

public class GiaoVien {

    private String Ho;
    private String Ten;
    private String TenDem;
    private String maGv;
    private String Email;
    private String sdt;
    private int gioiTinh;
    private int NamSinh;
    private int soGioday;
    private String queQuan;

    public GiaoVien() {
    }

    public GiaoVien(String Ho, String Ten, String TenDem, String maGv, String Email, String sdt, int gioiTinh, int NamSinh, int soGioday, String queQuan) {
        this.Ho = Ho;
        this.Ten = Ten;
        this.TenDem = TenDem;
        this.maGv = maGv;
        this.Email = Email;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.NamSinh = NamSinh;
        this.soGioday = soGioday;
        this.queQuan = queQuan;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getTenDem() {
        return TenDem;
    }

    public void setTenDem(String TenDem) {
        this.TenDem = TenDem;
    }

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public int getSoGioday() {
        return soGioday;
    }

    public void setSoGioday(int soGioday) {
        this.soGioday = soGioday;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void inRamanHinh() {
        System.out.printf("\n %s | %s | %s | %s | %s | %s | %s | %d | %d | %s", Ho, TenDem, Ten, maGv, Email, sdt , gioiTinh == 0 ? "NAM" : "NỮ", NamSinh, soGioday, queQuan);
    }

}
