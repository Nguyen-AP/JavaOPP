package BaiThucHanh;
import java.util.Scanner;

public class Test{
    public String FullName;
    public String StudentID;
    public String Age;
    void EnterDate(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap Ten:");
        FullName = sc.nextLine();
        System.out.print("nhap ID:");
        StudentID = sc.nextLine();
        System.out.print("Nhap Age:");
        Age = sc.nextLine();
    }
    void Display(){
        System.out.printf(FullName + " - " + StudentID + " - " + Age);

    }
 }