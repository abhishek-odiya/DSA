package DSA.Oops;

import java.util.Scanner;
class add{                          //Single
    int a, b;
    void user(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number : ");
        a = sc.nextInt();
        b = sc.nextInt();
    }
}

class dis extends add {
        void display(){
            System.out.println("Sum is : " + (a+b));
        }
}

class sub extends dis {
    void subt() {
        System.out.println("Subtraction of "+ a + " and " + b + " is " + (a-b));
    }
}

public class Inheritance {
    public static void main(String[] args) {

        // Don't make any Changes ☠️☠️

                     //Single Inheritance (Sirf 2 class he banana hai)
                            //class1                    parent class
                            //class2 extends class1     child class

//        dis run = new dis();
//        run.user();
//        run.display();


                      //MultiLevel Inheritance  (2 se jada class banana hai)
                                    //class1                        parent class
                                    //class2 extends class1         child class
                                    //class3 extends class2         child class(Sub class)
//        sub run = new sub();
//        run.user();
//        run.display();
//        run.subt();



                        //Hierarchical Inheritance

                //class1                        parent class
                //class2 extends class1         child_1 class
                //class3 extends class1         child_2 class  (Class 2 orr Class3 Dono se alag alag call kiya)
                                                 // 1 parent class & 2 child class

                //Hierarchical Inheritance
/*
        class animal {

            private String name;
            public animal(String name){
                this.name = name;
            }
            public void showName(){
                System.out.println("Animal Name is: " + name);
            }
        }

        class cat extends animal {

            public cat(String name) {
                super(name);
            }
            void sound() {
                System.out.println("mmeyaao....");
            }
        }

        class dog extends animal {

            public dog(String name) {
                super(name);
            }
            void sound() {
                System.out.println("woow...");
            }
        }

        public class Inheritance {
            public static void main (String[] args) {

                cat ct = new cat("cat");
                ct.showName();
                ct.sound();

                dog dg = new dog("dog");
                dg.showName();
                dg.sound();
            }
        }

*/


        //Hybrid inheritance
            //(Mixture Of All Inheritance Type)


                //Multiple inheritance   -> see on Inheritance file
            // 2 parent class and 1 child class
        // It's not present in JAVA, we use interference to implement it


    }
}
