public class Main {

    static class A {
        int val = 1;
        int f(){
            return 1;
        }
    }

    static class B extends A {
        int val = 2;
        int f(){
            return 2;
        }
    }

    static class C extends B {
        int val = 3;
        int f(){
            return 3;
        }
    }


    public static void main(String[] args) {
        C c = new C();
        A a = c;

        int vala = a.val;
        int fa = a.f();

        B b = (B)a;

        int valb = b.val;
        int fb = b.f();

        int q = 1;
    }
}
