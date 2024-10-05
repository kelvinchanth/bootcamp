public class DemoString { // class name = file name
    
public static void main(String[] args){
    // Integer decimal place

    // email address
    // "vincentlau@gmail.com" is a string value
    // emailAddress is a string variable
    String emailAddress = "vincentlau@gmail.com";
    System.out.println(emailAddress); // vincentlau@gmail.com

    // NOT OK
    // because 2 is an int value, we cannot assign int value to String variable.
    // String x = 2;

    // String Operation; +
    String x1 = "hello";
    String x2 = "world";
    String x3 = x1 + x2;
    System.out.println("x3=" + x3); //helloworld


    int k =0; 
    System.out.println("before : " + k);
    k = 1;
    System.out.println("after : " + k);
    System.out.println("k : " + k); // post-increment
    ++k;




    int i = 5;
    int a; //default = 0
    a = i++;
    // a = i


    // % -> 餘數
    // int , double , String
    // bootlean -> 分辨 true or false
    boolean b1 = true;   // The value of the local variable b2 is not used
    boolean b2 = false;  // The value of the local variable b2 is not used

    // > , < , >= , <=
    boolean r1 = 10 > 3 ;
    System.out.println("r1 : " + r1);
    boolean r2 = 10 > 11;
    System.out.println("r2 : " + r2);
    boolean r3 = 10 >= 10 ; 
    System.out.println("r3 : " + r3);
    boolean r4 = 10 <= 10;
    System.out.println("r4 : " + r4);



    }
}