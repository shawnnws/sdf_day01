package nus.iss.sdf;

import java.io.Console;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Console con = System.console();
        String name = con.readLine("What is your name?");
        
        if (name.length() > 0){
            System.out.printf("Nice to meet you, %s\n", name);
            System.out.println("Nice to meet you, " + name);
        } 
        else {
            System.out.println("You have not told me your name!");
        }

        Integer age = 80;
        System.out.printf("%s is %d years old.\n", name, age);

        String mother_name = "Esther";
        System.out.printf("My name is %s. Mother is %s.\n", name, mother_name);


        String input = con.readLine("What is your hobby?");
        input.trim();

        if (input.equals("swim")){
            System.out.println("Swimming is good!");
        } 
        else if (input.equals("run")){
            System.out.println("Running is good!");
        } 
        else if (input.equals("cycle")) {
            System.out.println("Cycling is good!");
        } 
        else {
            System.out.println("You are a boring person!");
        }

        switch(input) {
            case "swim":
                System.out.println("Swimming is good!");
                break;
            case "run":
                System.out.println("Running is good!");
                break;
            case "cycle":
                System.out.println("Cycling is good!");
                break;
            default:
                System.out.println("You are a boring person!");
                break;
        }

    }
}
