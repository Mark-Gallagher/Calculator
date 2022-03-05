package ie.gmit;

public class Calculator {

    public Calculator(){
        System.out.println("Simple Calculator");
    }


    public int add(int firstnum, int secondnum) {
        //This method will add two numbers and check the values are within a certain range
        if (firstnum > 0 && firstnum < 1000 && secondnum > 0 && secondnum < 1000){
            int result = firstnum + secondnum;
            System.out.println(result);
            return result;
        }

        else {
            throw new IllegalArgumentException("Not a valid entry!");
        }

    }
    public int subtract(int firstnum, int secondnum){
        //This method will subtract two numbers and check the values are within a certain range
        if (firstnum > 0 && firstnum < 1000 && secondnum > 0 && secondnum < 1000 ){
            int result = firstnum - secondnum;
            System.out.println(result);
            return result;
        }

        else {
            throw new IllegalArgumentException("Not a valid entry!");
        }
    }
    public int divide(int firstnum, int secondnum){
        //this Method will subtract two numbers
        int result = firstnum / secondnum;
        System.out.println(result);
        return result;
    }

    public int multiply(int firstnum, int secondnum){
        //this Method will subtract two numbers
        int result = firstnum * secondnum;
        System.out.println(result);
        return result;

    }

}
