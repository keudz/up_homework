package Data_structure_buoi13;

import java.io.*;
import java.util.*;

public class StudentManagement {
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        loadStudentsFromFile(); // Khoi tao danh sach sinh vien tu file
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Hien thi menu
            System.out.println("\n=== MENU ===");
            System.out.println("1 Them sinh vien");
            System.out.println("2 Sua thong tin sinh vien");
            System.out.println("3 Xoa sinh vien");
            System.out.println("4 Hien thi danh sach sinh vien");
            System.out.println("5 Sap xep danh sach sinh vien");
            System.out.println("6 Tim kiem sinh vien");
            System.out.println("7 Thoat va luu danh sach vao file");
            System.out.print("Chon chuc nang ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    editStudent(sc);
                    break;
                case 3:
                    deleteStudent(sc);
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    sortStudents(sc);
                    break;
                case 6:
                    searchStudent(sc);
                    break;
                case 7:
                    saveStudentsToFile();
                    System.out.println("Danh sach da duoc luu Tam biet");
                    return;
                default:
                    System.out.println("Lua chon khong hop le Vui long thu lai");
            }
        }
    }

    public static void addStudent(Scanner sc) {
        sc.nextLine(); // Xu ly bo dem
        System.out.print("Nhap ma sinh vien ");
        String id = sc.nextLine();
        System.out.print("Nhap ho va ten ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi ");
        int age = sc.nextInt();
        System.out.print("Nhap diem trung binh ");
        double avgScore = sc.nextDouble();

        students.add(new Student(id, name, age, avgScore));
        System.out.println("Da them sinh vien thanh cong");
    }

    public static void editStudent(Scanner sc) {
        sc.nextLine(); // Xu ly bo dem
        System.out.print("Nhap ma sinh vien can sua ");
        String id = sc.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.print("Nhap ho va ten moi ");
                student.setName(sc.nextLine());
                System.out.print("Nhap tuoi moi ");
                student.setAge(sc.nextInt());
                System.out.print("Nhap diem trung binh moi ");
                student.setAvgScore(sc.nextDouble());
                System.out.println("Sua thong tin sinh vien thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien voi ma da nhap");
    }

    public static void deleteStudent(Scanner sc) {
        sc.nextLine(); // Xu ly bo dem
        System.out.print("Nhap ma sinh vien can xoa ");
        String id = sc.nextLine();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId().equals(id)) {
                iterator.remove();
                System.out.println("Xoa sinh vien thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien voi ma da nhap");
    }

    public static void displayStudents() {
        System.out.println("\nDanh sach sinh vien");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void sortStudents(Scanner sc) {
        System.out.println("Chon tieu chi sap xep");
        System.out.println("1 Theo ten tang dan");
        System.out.println("2 Theo diem trung binh tang dan");
        System.out.println("3 Theo diem trung binh giam dan");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                students.sort(Comparator.comparing(Student::getName));
                System.out.println("Da sap xep theo ten");
                break;
            case 2:
                students.sort(Comparator.comparingDouble(Student::getAvgScore));
                System.out.println("Da sap xep theo diem trung binh tang dan");
                break;
            case 3:
                students.sort(Comparator.comparingDouble(Student::getAvgScore).reversed());
                System.out.println("Da sap xep theo diem trung binh giam dan");
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }
    }

    public static void searchStudent(Scanner sc) {
        sc.nextLine(); // Xu ly bo dem
        System.out.print("Nhap ma sinh vien can tim ");
        String id = sc.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Thong tin sinh vien");
                System.out.println(student);
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien voi ma da nhap");
    }

    public static void saveStudentsToFile() {
        try (PrintWriter writer = new PrintWriter(new File("students.txt"))) {
            for (Student student : students) {
                writer.println(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getAvgScore());
            }
            System.out.println("Da luu danh sach sinh vien vao file");
        } catch (IOException e) {
            System.out.println("Loi khi luu danh sach vao file " + e.getMessage());
        }
    }

    public static void loadStudentsFromFile() {
        File file = new File("students.txt");
        if (!file.exists()) return;

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String[] data = fileScanner.nextLine().split(",");
                students.add(new Student(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
            }
            System.out.println("Da nap danh sach sinh vien tu file");
        } catch (IOException e) {
            System.out.println("Loi khi doc file " + e.getMessage());
        }
    }
}

class Student {
    private String id;
    private String name;
    private int age;
    private double avgScore;

    public Student(String id, String name, int age, double avgScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.avgScore = avgScore;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "ID " + id + " Name " + name + " Age " + age + " Avg Score " + avgScore;
    }
}