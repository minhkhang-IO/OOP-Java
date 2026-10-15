/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot12;

import java.util.Scanner;

/**
 *
 * @author Minh_Khang
 */
public class InputHelper {
     private static final Scanner sc = new Scanner(System.in);

    public static String getString(String prompt, IValidation validator) {
        String data;
        while (true) {
            System.out.print(prompt);
            data = sc.nextLine();
            try {
                validator.check(data);   
                break;             
            } catch (Exception e) {
                System.out.println("-> [Lỗi]: " + e.getMessage());
                System.out.println("-> Vui lòng thử lại.\n");
            }
        }
        return data;
    }
}
