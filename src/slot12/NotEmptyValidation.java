/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot12;

/**
 *
 * @author Minh_Khang
 */
public class NotEmptyValidation implements IValidation {
    @Override
    public void check(String input) throws Exception {
        if (input == null || input.trim().isEmpty()) {
            throw new Exception("Dữ liệu không được để trống!");
        }
    }
}

