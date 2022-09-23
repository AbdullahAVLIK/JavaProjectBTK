package overridding;

public class Test03 extends Derived03 {
    protected final void getDetails(){
        System.out.printf("Test class");

    }

    public static void main(String[] args) {
        Derived03 obj = new Test03();
        obj.getDetails();
    }

}
