
/**
 * InnerA6
 */
 interface printable {
        void print();
            
        }
    

public class A6 implements printable {
    public void print(){
        System.out.println("pham anh nguyen");
        
    }
    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
    }
}
