/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import slot12.IValidation;
import slot12.IValidation;
import slot12.IValidation;

/**
 *
 * @author Minh_Khang
 */
public class PhoneValidation implements IValidation {
     @Override
    public void check(String input) throws Exception {
        if (!input.matches("^0\\d{9}$")) {
            throw new Exception("Số điện thoại phải gồm 10 chữ số và bắt đầu bằng số 0!");
        }
    }
}
