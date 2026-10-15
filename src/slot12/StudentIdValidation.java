package slot12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Minh_Khang
 */
public class StudentIdValidation implements IValidation{
      @Override
    public void check(String input) throws Exception {
        if (!input.matches("^SV\\d{5}$")) {
            throw new Exception("Mã sinh viên phải có định dạng SE**** (x là số)!");
        }
    }
}
