/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author DT
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hd = new HoaDon.HoaDonBuilder().addMaHD("QH001")
                .addNgayBan("19/05/2020")
                .addTenKH("Lê Quang Hưởng")
                .build();
        CTHD cthd1 = new CTHD.CTHDBuilder().addTenSP("Áo Sơ Mi")
                .addSoLuong(1)
                .addDonGia(200000)
                .addChietKhau("10%")
                .build();
        CTHD cthd2 = new CTHD.CTHDBuilder().addTenSP("Quần Tây")
                .addSoLuong(1)
                .addDonGia(150000)
                .addChietKhau("10%")
                .build();
        hd.addCTHD(cthd2);
        hd.addCTHD(cthd1);
        hd.xuatHoaDon();
    }
    
}
