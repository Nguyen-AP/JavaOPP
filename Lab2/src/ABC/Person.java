package ABC;

import java.util.Scanner;

public class Person{
    public String PersonID;
    public String FullName;


public void  NhapThongTin(){
    
    Scanner sc = new Scanner(System.in);
    System.out.printf("Nhap ID: ");
    PersonID = sc.nextLine();
    System.out.printf("Nhap FullName: ");
    FullName = sc.nextLine();
   
}

public void XuatThongTin(){
    
    System.out.println("ID: " + PersonID);
    System.out.println("FullName: " + FullName);
}


} 