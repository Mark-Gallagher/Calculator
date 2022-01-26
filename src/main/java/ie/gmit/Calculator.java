package ie.gmit;

public class Calculator {

    int firstnum = 10;
    int secondnum = 34;
    int result;

    public Calculator() {
        //this Method will add two numbers

        System.out.println("Simple Calculator");
        result = firstnum + secondnum;
        System.out.println(result);

    }





    public static void main(String[] args) {
         new Calculator();
    }

}
