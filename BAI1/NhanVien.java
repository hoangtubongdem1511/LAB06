/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class NhanVien {
    public String ten;
    public long luong;
    
    public NhanVien() {
        
    }
    
    public NhanVien(String ten) {
        this.ten = ten;
    }
    
    public String loaiNhanVien() {
        return "loai nhan vien :";
    }
    
    public void tinhLuong() {
        
    }
    
    public void xuatThongTin() {
        System.out.println("ten: " + this.ten + "luong: " + luong);
    }
}
