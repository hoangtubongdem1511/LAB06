/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */

public class HocSinhChuyenToan extends HocSinh {
    public HocSinhChuyenToan(){
        
    }
    
    @Override
    public double diemtrungbinh(){
        return (super.getHoa()+super.getLy()+super.getToan()*2)/4;
    }
}
