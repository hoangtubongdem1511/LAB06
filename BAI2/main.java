/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class main {
    public static void main(String[] args) {
        System.out.println("1. Xet hoc sinh thuong.");
        System.out.println("2.Xet hoc sinh chuyen toan.");
        System.out.print("Chon chuc nang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                HocSinh hs = new HocSinh();
                hs.nhap();
                hs.xuatthongtin();
                break;
            case 2:
                HocSinhChuyenToan ct = new HocSinhChuyenToan();
                ct.nhap();
                ct.xuatthongtin();
            default:
                break;
        }
    }
}
