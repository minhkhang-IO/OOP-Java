/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slot12;

/**
 *
 * @author Minh_Khang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== HỆ THỐNG NHẬP LIỆU THÔNG MINH ===\n");

        String ten = InputHelper.getString("Nhập Họ và Tên sinh viên: ", new NotEmptyValidation());
        String email = InputHelper.getString("Nhập địa chỉ Email: ", new EmailValidation());
        String diemStr = InputHelper.getString("Nhập điểm GPA (0-10): ", new GpaValidation()
        );
        double gpa = Double.parseDouble(diemStr);

        System.out.println("\n=== THÔNG TIN ĐÃ ĐƯỢC LƯU ===");
        System.out.println("Tên: " + ten);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + gpa);
    }
}