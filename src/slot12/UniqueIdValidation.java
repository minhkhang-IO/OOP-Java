package slot12;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Minh_Khang
 */
public class UniqueIdValidation implements IValidation{
    private ArrayList<Student> studentList;

    public UniqueIdValidation(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public void check(String input) throws Exception {
        if (studentList == null || studentList.isEmpty()) {
            return;
        }
        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(input)) {
                throw new Exception("Mã sinh viên '" + input + "' đã tồn tại trong hệ thống!");
            }
        }
    }
}
