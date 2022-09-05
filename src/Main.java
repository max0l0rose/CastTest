public class Main {



    static class A {
        int val = 1;
        protected int f() throws Exception {
            return 1;
        }
    }

    static class B extends A {
        int val = 2;
        public int f() {
            return 2;
        }
    }

    static class C extends B {
        int val = 3;
        public int f() // throws Exception // error
        {
            return 3;
        }
    }



    public static void main(String[] args) throws Exception {
        C c = new C();
        int valc = c.val;
        int fc = c.f();

        A a = c;
        int vala = a.val;
        int fa = a.f();

        B b = (B)a;
        int valb = b.val;
        int fb = b.f();

        int q = 1;
    }
}
