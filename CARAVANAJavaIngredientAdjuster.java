/***********************************
Caravana, Ana Maricris A.
BSCpE 1-1

II - Programming Exercise
    Java
    2. Ingredient Adjuster
**********************************/

import java.util.Scanner;

public class CARAVANAJavaIngredientAdjuster
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double sugar, butter, flour, cookies;
        
        System.out.print("Enter the number of cookies you want to make: ");
        cookies = keyboard.nextInt();

        sugar = 1.5*cookies;
        butter = 1*cookies;
        flour = 2.75*cookies;
        
        System.out.println("The number of cookies you want to make is: " + cookies + ".");
        System.out.println("You need " + sugar + " cups of sugar.");
        System.out.println("You need " + butter + " cups of butter.");
        System.out.println("And you need " + flour + " cups of flour.");
    }
}