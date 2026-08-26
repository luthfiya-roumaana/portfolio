public class InheritanceDemo { 
 
    // ---------- Multiple Inheritance (via interfaces) ---------- 
    interface Father { 
        void showFather(); 
    } 
    interface Mother { 
        void showMother(); 
    } 
    static class Child implements Father, Mother { 
        public void showFather() { System.out.println("Father's profession: Engineer"); } 
        public void showMother() { System.out.println("Mother's profession: Doctor"); } 
        void showChild() { System.out.println("Child studies Computer Science"); } 
    } 
 
    // ---------- Multilevel Inheritance ---------- 
    static class A { 
        void showA() { System.out.println("Class A (Grandparent)"); } 
    } 
    static class B extends A {
        void showB() { System.out.println("Class B (Parent)"); } 
    } 
    static class C extends B { 
        void showC() { System.out.println("Class C (Child)"); } 
    } 
 
    // ---------- Hybrid Inheritance (Multilevel class + Interface) ---------- 
    interface Greetable { 
        void greet(); 
    } 
    static class Base { 
        void showBase() { System.out.println("Base class"); } 
    } 
    static class Derived1 extends Base { 
        void showDerived1() { System.out.println("Derived1 class (from Base)"); } 
    } 
    static class Hybrid extends Derived1 implements Greetable { 
        public void greet() { System.out.println("Hybrid class implements Greetable interface"); 
} 
        void showHybrid() { System.out.println("Hybrid class extends Derived1 (multilevel) + 
implements interface"); } 
    } 
 
    public static void main(String[] args) { 
        System.out.println("===== Multiple Inheritance (Interfaces) ====="); 
        Child c1 = new Child(); 
        c1.showFather(); 
        c1.showMother(); 
        c1.showChild(); 
 
        System.out.println("\n===== Multilevel Inheritance ====="); 
        C c2 = new C(); 
        c2.showA(); 
        c2.showB(); 
        c2.showC(); 
 
        System.out.println("\n===== Hybrid Inheritance ====="); 
        Hybrid h1 = new Hybrid(); 
        h1.showBase(); 
        h1.showDerived1(); 
        h1.greet(); 
        h1.showHybrid(); 
    } 
}