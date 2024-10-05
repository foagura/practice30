class Super {
    Super() { System.out.println("Super"); }
    Super(int i) { System.out.println("Super(int i)"); }
}

class Sub extends Super {
    Sub() { System.out.println("Sub"); }
    Sub(int i) {
        super(i);    // super(i)を明示することで、インスタンス化の際にsuper()が呼び出されるのを防いでいる
        System.out.println("Sub(int i)");
    }
}

public class Practice30 {
    public static void main(String[] args) {
        Sub subA = new Sub();
        Sub subB = new Sub(100);
    }
}
