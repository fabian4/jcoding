public class Main {
    public static void main(String[] args) {
        A x = new B();
        B y = new B();
        A z = new B();

        x.f(1);
        ((A)y).f(1);
        z.f(1);
    }
}

class A {
    void f(int i) {
        System.out.println(i);
    }
}

class B extends A {
    void f(int i) {
        System.out.println(2 * i);
    }
}