package slot12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Minh_Khang
 */
public class GpaValidation implements IValidation{

    @Override
    public void check(String input) throws Exception {
        if (input == null || input.trim().isEmpty()) {
            throw new Exception("Điểm không được để trống!");
        }
        double gpa;
        try {
            gpa = Double.parseDouble(input.trim());
        } catch (NumberFormatException e) {
            throw new Exception("Sai định dạng! Vui lòng nhập một số thực hợp lệ.");
        }
        if (gpa < 0.0 || gpa > 10.0) {
            throw new Exception("Điểm GPA phải nằm trong khoảng từ 0.0 đến 10.0!");
        }
    }
}
