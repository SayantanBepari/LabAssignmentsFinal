package day2;
/*
1. primitive data type
a. byte        1 byte        0             
b. short    2 byte        0
c. int        4 byte        0
d. long        8 byte        0L
e. float    4 byte        0.0f
f. double    8 byte        0.0d
g. char        16 bit unicode    null
h. boolean    1 bit        false
*/

public class Variables_Java {
    //variable inside class is known as global variable
    int i;   //instance variable
    static int j; //class variable
    
    //notes : by default system will give default value to global variable not to local variable 

 

    public static void main(String[] args) {
        //variable inside a method/function is known as local variable
        int k=8;
        System.out.println(k);
        
        //since i want to access global variable i which is non static inside static void main 
        //so i have to create object of Variable class
        Variables_Java v=new Variables_Java(); //create object of class Variable
        System.out.println(v.i);
        
        System.out.println(j);

 

    }

 

}
 