import java.util.Scanner;

/**
 * Write a description of class AdditionalQuestion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdditionalQuestion
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your income");
        long income=scan.nextInt();
        long tax,amount;
        if(income<500000){
            tax=1/100*income;
        }
        else if(income<700000 && income>500000){
            amount=income-500000;
            tax=5000+(10/100*amount);
        }
        else if(income<1000000 && income>700000){
            amount=income-700000;
            tax=15000+(20/100*amount);
        }
        else if(income<2000000 && income>1000000){
            amount=income-1000000;
            tax=35000+(30/100*amount);
        }
        else if(income<5000000 && income>2000000){
            amount=income-2000000;
            tax=335000+(36/100*amount);
        }
        else{
            amount=income-5000000;
            tax=1135000+(39/100*amount);
        }
        System.out.println(tax);
    }
}