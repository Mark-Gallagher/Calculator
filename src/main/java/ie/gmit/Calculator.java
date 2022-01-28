package ie.gmit;

public class Calculator {

    public Calculator(){
        System.out.println("Simple Calculator");
    }


    public int add(int firstnum, int secondnum) {
        //this Method will add two numbers
        int result = firstnum + secondnum;
        System.out.println(result);
        return result;

    }

    public int subtract(int firstnum, int secondnum){
        //this Method will subtract two numbers
        int result = firstnum - secondnum;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
       //  subtract();
    }

}
