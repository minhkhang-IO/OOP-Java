/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slot12;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Minh_Khang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    addStudent(studentList);
                    break;
                case "2":
                    showStudents(studentList);
                    break;
                case "3":
                    System.out.println("Tạm biệt!");
                    return;
                default:
                    System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn 1-3.\n");
            }
        }
    }

    private static void addStudent(ArrayList<Student> studentList) {
        System.out.println("\n--- THÊM SINH VIÊN MỚI ---");

        String id = InputHelper.getString("Nhập Mã SV (Ex: SE203117): ", input -> {
            new StudentIdValidation().check(input);
            new UniqueIdValidation(studentList).check(input);
        });
        String name  = InputHelper.getString("Nhập Họ tên: ", new NotEmptyValidation());
        String dob   = InputHelper.getString("Nhập Ngày sinh (dd/MM/yyyy): ", new DateValidation());
        String phone = InputHelper.getString("Nhập Số ĐT: ", new PhoneValidation());
        String email = InputHelper.getString("Nhập Email: ", new EmailValidation());
        String gpaStr = InputHelper.getString("Nhập điểm GPA (0-10): ", new GpaValidation());
        double gpa = Double.parseDouble(gpaStr.trim());

        studentList.add(new Student(id, name, dob, phone, email, gpa));
        System.out.println("=> Thêm sinh viên thành công!\n");
    }

    private static void showStudents(ArrayList<Student> studentList) {
        if (studentList.isEmpty()) {
            System.out.println("-> Danh sách đang trống.\n");
            return;
        }
        String line = "+----------+------------------------+------------+------------+----------------------------+-------+";
        System.out.println(line);
        System.out.println(String.format("| %-8s | %-22s | %-10s | %-10s | %-26s | %-5s |",
                "Mã SV", "Họ tên", "Ngày sinh", "SĐT", "Email", "GPA"));
        System.out.println(line);
        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println(line + "\n");
    }
}