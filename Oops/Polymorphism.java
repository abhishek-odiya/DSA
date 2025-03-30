package DSA.Oops;
//
// polymorphism -> Jab ek he kaam ko alag alag tareke se karte hai to use polymorphism kahte hai
//
//
//            Overriding -> Same method name and parameters in different classes
//                  Run Time polymorphism
//
//class Parent {
//    void show() { System.out.println("Parent's show()"); }
//}
//class Child extends Parent {
//    //@Override
//    void show() {
//        System.out.println("Child's show()");
//    }
//}
//                                                                 // Overriding
//class Polymorphism{
//    public static void main(String[] args) {
//
//        Parent obj1 = new Parent();
//        obj1.show();
//
//        Parent obj2 = new Child();
//        obj2.show();
//    }
//}
//*/


//                  Overloading -> In the same class have the same method name but different parameters
//                          Compile time polymorphism -> mostly we use this polymorphism coz this show the error on the compile time
//
//class overload{
//    int add(int a, int b) {
//        return (a+b);
//    }
////    int add(int a, int b, int c) {                //For Same Data Type
////        return (a+b+c);
////    }
//
//    double add(double a, double b, double c) {
//        return (a+b+c);
//    }
//
//}
//
//class over{
//    public static void main(String[] args) {
//
//        overload ov = new overload();
//        System.out.println("Same Data Type");
//        System.out.println("2 Parameters : " + ov.add(10, 20));
//        //System.out.println("3 Parameters : " + ov.add(10, 20, 30));               //Same Data Type
//
//        System.out.println("different data type");
//        System.out.println("2 Parameters : " + ov.add(10, 20));
//        System.out.println("3 Parameters : " + ov.add(1.550, 2.10, 3.14));
//    }
//}



                        //Constructor Overloading
/*
class cons{
    int a, b, c;
    cons(int x, int y, int z){
        a=x;
        b=y;
        c=z;
    }

    cons(){
        a = b = c = 0;
    }

    cons(int m) {
        a = b = c = m;
    }

    int display() {
        return a+b+c;
    }

}
class over{
    public static void main(String[] args){
        cons cs = new cons(10,20, 30);
        cons cs2 = new cons();
        cons cs3 = new cons(10);

        System.out.println("3 pera : " + cs.display());
        System.out.println("0 pera : " + cs2.display());
        System.out.println("1 pera : " + cs3.display());

    }
}
 */