/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot12;

import java.text.SimpleDateFormat;
import slot12.IValidation;
import slot12.IValidation;

/**
 *
 * @author Minh_Khang
 */
public class DateValidation implements IValidation {
    public void check(String input) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);   // không cho tự sua ngày sai, ví dụ 31/02 -> 03/03
        sdf.parse(input);
    }
}
