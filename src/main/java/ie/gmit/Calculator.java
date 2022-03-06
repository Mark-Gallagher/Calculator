package ie.gmit;

public class Calculator {


    public Calculator(){}

    public int add(int firstnum, int secondnum) {
        //This method will add two numbers and check the values are within a certain range
        if (firstnum >= 0 && firstnum < 1000){
            int result = firstnum + secondnum;
            System.out.println(result);
            return result;
        }

        else {
            String message = "Not a valid entry!";
            throw new IllegalArgumentException(message);
        }

    }
    public int subtract(int firstnum, int secondnum){
        //This method will subtract two numbers and check the values are within a certain range
        if (firstnum >= 0 && firstnum < 1000){
            int result = firstnum - secondnum;
            System.out.println(result);
            return result;
        }

        else {
            String message = "Not a valid entry!";
            throw new IllegalArgumentException(message);
        }
    }
    public int divide(int firstnum, int secondnum){
        //this Method will divide two numbers
        if (firstnum >= 0 && firstnum < 1000){
            int result = firstnum / secondnum;
            System.out.println(result);
            return result;
        }

        else {
            String message = "Not a valid entry!";
            throw new IllegalArgumentException(message);
        }
    }

    public int multiply(int firstnum, int secondnum){
        //this Method will multiply two numbers
        if (firstnum >= 0 && firstnum < 1000){
            int result = firstnum * secondnum;
            System.out.println(result);
            return result;
        }

        else {
            String message = "Not a valid entry!";
            throw new IllegalArgumentException(message);
        }
    }

}
