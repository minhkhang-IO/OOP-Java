/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import slot12.IValidation;

/**
 *
 * @author Minh_Khang
 */
public class DeleteValidation implements IValidation {
      @Override
    public void check(String input) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);   // không cho tự "sửa" ngày sai, ví dụ 31/02 -> 03/03
        try {
            sdf.parse(input);
        } catch (ParseException e) {
            throw new Exception("Ngày sinh không hợp lệ hoặc sai định dạng dd/MM/yyyy!");
        }
    }
}
