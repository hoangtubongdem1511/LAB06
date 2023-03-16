/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class NhanVienPartTime extends NhanVien {
    private int giolamviec;
    
    public NhanVienPartTime(){
        
    }
    
    public NhanVienPartTime (String ten, int ngaylamthem, int loaichucvu){
        super(ten);
    }

    public int getGiolamviec() {
        return giolamviec;
    }

    public void setGiolamviec(int giolamviec) {
        this.giolamviec = giolamviec;
    }
     
    @Override
    public String loaiNhanVien(){
        return super.loaiNhanVien() + "NhanVienPartTime";
    }
    
    @Override
    public void tinhLuong(){
        System.out.println("Luong nhan vien part time 35ngan/gio.");
    }
}
