package ASSIGNMENT_1_TUANNQPH20022_MOB1014;

import java.util.Scanner;

public class ASSIGMENT_1 {

    public static void MENU() {
        System.out.printf("\n ----------------------------------------- MENU ---------------------------------------\n");
        System.out.printf("|1.THÊM - SỬA - XÓA GIÁO VIÊN                                                          |\n");
        System.out.printf("|2.THÊM 15 GIÁO VIÊN TẠO SẴN TRONG DANH SÁCH                                           |\n");
        System.out.printf("|3.TÌM KIẾM GIÁO VIÊN THEO MÃ GIÁO VIÊN                                                |\n");
        System.out.printf("|4.LOAD TẤT CẢ CÁ GIÁO VIÊN THEO MÃ GIÁO VIÊN                                          |\n");
        System.out.printf("|5.TÌM KIẾM THEO TÊN GIÁO VIÊN GẦN ĐÚNG                                                |\n");
        System.out.printf("|6.LOAD TẤT CẢ CÁC GIÁO VIÊN CÓ SỐ GIỜ DẠY LỚN HƠN 500 GIỜ                             |\n");
        System.out.printf("|7.LOAD TẤT CẢ CÁC GIÁO VIÊN VÀ PHÂN CHIA DANH SÁCH KHI HIỂN THỊ THEO NHÓM VÙNG MIỀN   |\n");
        System.out.printf("|0.THOÁT                                                                               |\n");
        System.out.printf(" --------------------------------------------------------------------------------------\n");
        System.out.printf("BẠN CHỌN CHỨC NĂNG: ");
    }
    public static void themSuaxoa(){
        GiaoVien gv1 = new GiaoVien("HOÀNG", "TUẤN", "QUỐC", "OI23094", "TUANPHONG@GAMIL.COM", "0973647344", 0, 1990, 500, "HÀ NỘI");
        
        GiaoVien gv2;
        gv2 = new GiaoVien();
        gv2.setHo("NGUYỄN");
        gv2.setTenDem("QUỐC");
        gv2.setTen("TUẤN");
        gv2.setMaGv("PH209747");
        gv2.setEmail("DUNG@GMAIL.COM");
        gv2.setSdt("09724646233");
        gv2.setGioiTinh(1);
        gv2.setNamSinh(1980);
        gv2.setSoGioday(600);
        gv2.setQueQuan("THANH HÓA");    
        gv1.inRamanHinh();
        gv2.inRamanHinh();
    }
    public static void them15Gv(){
        
    }
    public static void timKiem(){
        
    }
    public static void loadTatca(){
        
    }
    public static void timKiemganDung(){
        
    }
    public static void gioDaylon500(){
        
    }
    public static void phanChiavungMien(){
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            MENU();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("BẠN CHỌN: 1.THÊM - SỬA - XÓA GIÁO VIÊN");
                    themSuaxoa();
                    break;
                case 2:
                    System.out.println("BẠN CHỌN: 2.THÊM 15 GIÁO VIÊN TẠO SẴN TRONG DANH SÁCH");
                    them15Gv();
                    break;
                case 3:
                    System.out.println("BẠN CHỌN: 3.TÌM KIẾM GIÁO VIÊN THEO MÃ GIÁO VIÊN");
                    timKiem();
                    break;
                case 4:
                    System.out.println("BẠN CHỌN: 4.LOAD TẤT CẢ CÁ GIÁO VIÊN THEO MÃ GIÁO VIÊN");                    
                    loadTatca();
                    break;
                case 5:
                    System.out.println("BẠN CHỌN: 5.TÌM KIẾM THEO TÊN GIÁO VIÊN GẦN ĐÚNG");
                    timKiemganDung();
                    break;
                case 6:
                    System.out.println("BẠN CHỌN: 6.LOAD TẤT CẢ CÁC GIÁO VIÊN CÓ SỐ GIỜ DẠY LỚN HƠN 500 GIỜ");
                    gioDaylon500();
                    break;
                case 7:
                    System.out.println("BẠN CHỌN: 7.LOAD TẤT CẢ CÁC GIÁO VIÊN VÀ PHÂN CHIA DANH SÁCH KHI HIỂN THỊ THEO NHÓM VÙNG MIỀN");
                    phanChiavungMien();
                    break;
                case 0:
                    System.out.println("BẠN CHỌN: 0.THOÁT");
                    break;
                default:
                    System.out.printf("KHÔNG CÓ MỤC %d NÀY : VUI LÒNG CHỌN LẠI TỪ (1-7)\n", chon);
            }
        } while (chon != 0);

    }
}
