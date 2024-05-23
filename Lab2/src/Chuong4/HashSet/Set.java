package Chuong4.HashSet;
import java.util.HashSet;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        int number;
        int clm;

    
        HashSet<Integer> HashSetInt = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        //them cac phan tu vao HashSetInt
        HashSetInt.add(15);
        HashSetInt.add(4);
        HashSetInt.add(0);
        HashSetInt.add(3);
        HashSetInt.add(6);
        HashSetInt.add(5);
        // hien thi cac phan tu trong HashSetInt
        System.out.println("Cac phan tu trong HashSetInt :");
        System.out.println(HashSetInt);
        System.out.println("Nhap phan tu can them : ");
        for( int i = 0; i < 2; i++ ) {
            number = sc.nextInt();
            HashSetInt.add(number);// them 1 phan tu
            HashSetInt.contains(number);// hien thi them phan tu
        }
        System.out.println("Cac phan tu sau khi them : ");
        System.out.println(HashSetInt);

        System.out.println("Nhap phan tu can xoa:");
        clm = sc.nextInt();
        HashSetInt.contains(clm); // xoa phan tu
        HashSetInt.remove(clm);// xoa phan tu
        System.out.println(" Cac phan tu sau khi xoa: ");
        System.out.println(HashSetInt);
       

    }

}
