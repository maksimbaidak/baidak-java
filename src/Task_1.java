import calc.Calculator;

import java.util.Scanner;

public class Task_1 {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Main function that parses command line arguments if available, otherwise interact with the user.
     * @param args
     */
    public static void main(String[] args) {
        if(args.length == 0) args = interact("Enter two valid args: ").split(" ");
        try{
            if(args.length != 2) throw new Exception("Invalid size of args");
            System.out.println(Calculator.calculate(
                                            Integer.parseInt(args[0]),
                                            Integer.parseInt(args[1]),
                                            interact("Enter an operation(+,-,*,/) or compare(=) nums: ")));
        }catch (NumberFormatException e){
            System.out.println("Invalid args");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * A method that interacts with the user by printing a message and
     * returning the user's input.
     *
     * @param  msg  the message to be printed
     * @return      the user's input
     */
    private static String interact(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }
}



