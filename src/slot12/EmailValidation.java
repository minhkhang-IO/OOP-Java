package slot12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Minh_Khang
 */
public class EmailValidation implements IValidation {
    @Override
    public void check(String input) throws Exception {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (!input.matches(emailRegex)) {
            throw new Exception("Email không đúng định dạng (VD: name@domain.com)!");
        }
    }
}

