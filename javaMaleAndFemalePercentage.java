/***********************************
Caravana, Ana Maricris A.
BSCpE 1-1

II - Programming Exercise
    Java
    1. Male and Female Percentages
**********************************/

import java.util.Scanner;

public class CARAVANAJavaMaleandFemalePercentage
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int female, male, classTotal, percentage;
        double malePercentage, femalePercentage;
        
        System.out.print("Enter the number of male registered in a class: ");
        male = keyboard.nextInt();
        
        System.out.print("Enter the number of female registered in a class: ");
        female = keyboard.nextInt();
        
        classTotal = male + female;
        System.out.print("There are a total of " + classTotal + " students registered in a class. " );
        
        percentage = 100;
        malePercentage = (male*percentage)/classTotal;
        femalePercentage = (female*percentage)/classTotal;
        
        System.out.print("The percentage of male students:" + malePercentage + "%. ");
        System.out.print("The percentage of female students:" + femalePercentage+ "%. ");
    }
}
