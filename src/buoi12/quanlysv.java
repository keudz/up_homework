package buoi12;

import java.util.ArrayList;
import java.util.Scanner;

public class quanlysv {
    private ArrayList<String> students = new ArrayList<>();


    public void addStudent(String studentName) {
        students.add(studentName);
        System.out.println("them hs " + studentName);
    }

    public void removeStudent(int index) throws danhsachchong, IndexOutOfBoundsException {
        if (students.isEmpty()) {
            throw new danhsachchong("danh sach sv chong");
        }
        if (index < 0 || index >= students.size()) {
            throw new IndexOutOfBoundsException("invalid index");
        }
        System.out.println("removed student: " + students.remove(index));
    }

    public void hienthisv() throws danhsachchong {
        if (students.isEmpty()) {
            throw new danhsachchong("The student list is empty.");
        }
        System.out.println("Student List:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }
    public static void main(String[] args){
               quanlysv ql = new quanlysv();
               Scanner scanner = new Scanner(System.in);
                while (true) {
                    try {
                        System.out.println("\nOptions:");
                        System.out.println("1. Add student");
                        System.out.println("2. Remove student");
                        System.out.println("3. Display students");
                        System.out.println("4. Exit");
                        System.out.print("Choose an option: ");
                        int choice = scanner.nextInt();
                        scanner.nextLine(); // Xóa bộ đệm

                        switch (choice) {
                            case 1 : {
                                System.out.print("enter student name: ");
                                String name = scanner.nextLine();
                                ql.addStudent(name);
                                break;
                            }
                            case 2 :
                                System.out.print("Enter student index to remove: ");
                                int index = scanner.nextInt();
                                ql.removeStudent(index - 1);
                                break;

                            case 3 :
                                ql.hienthisv();
                                break;
                            case 4 :
                                System.out.println("Exiting program.");
                                scanner.close();
                                return;

                            default : System.out.println("Invalid choice. Please choose again.");
                        }
                    } catch (danhsachchong e) {
                        System.out.println( e.getMessage());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println(" Invalid input.");
                        scanner.nextLine();
                    }
                }
            }
        }

