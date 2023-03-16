/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class NhanVienFullTime extends NhanVien {
    private int loaichucvu;
    private int  ngaylamthem;
    
    public NhanVienFullTime(){
        
    }
    public NhanVienFullTime(String ten, int ngaylamthem, int loaichucvu){
        super(ten);
    }
    
    public int getLoaichucvu() {
        return loaichucvu;
    }

    public void setLoaichucvu(int loaichucvu) {
        this.loaichucvu = loaichucvu;
    }

    public int getNgaylamthem() {
        return ngaylamthem;
    }

    public void setNgaylamthem(int ngaylamthem) {
        this.ngaylamthem = ngaylamthem;
    }
    
    @Override
    public String loaiNhanVien(){
        return super.loaiNhanVien() + "NhanVienFullTime";
    }
    
    @Override
    public void tinhLuong(){
        System.out.println("Luong nhan vien full time 41tr/thang");
    }
}
