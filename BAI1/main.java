/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class main {
    public static void main(String[] args) {
        NhanVien ft=new NhanVienFullTime();
        ft.loaiNhanVien();
        ft.tinhLuong();
        
        NhanVien pt=new NhanVienPartTime();
        pt.loaiNhanVien();
        pt.tinhLuong();
    }
}
