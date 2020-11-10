
import java.util.*;

/**
 * @author KyMcBigmouth
 * @version 1.0Final
 * this program calculates change in specific coins. When run, it will ask you to enter the total and how much you actually paid for it. It will return how many dollars, quarters, dimes, nickels, and pennies you will get in change.
 */
class Main {

  public static double specificChange(double money, double check) {
    double change = money - check;
    return change;
  }

  public static void main(String[] args) {
    final double QUARTER = 0.25;
    final double NICKEL = 0.05;
    final double DIME = 0.1;
    final double PENNY = 0.01;
    final double DOLLAR = 1;
    double change = 0;
    Scanner userInput = new Scanner(System.in);

    System.out.println("How much was the check?");
    double check = userInput.nextDouble();
    System.out.println("How much money did you leave on the tray?");
    double money = userInput.nextDouble();
    System.out.println("Your change is:" + specificChange(money, check));
    double quarters;
    double dimes;
    double nickels;
    double pennies;
    double dollars;
    change = specificChange(money, check);
    dollars = Math.floor(change / DOLLAR);
    change = change - (dollars * DOLLAR);

    quarters = Math.floor(change / QUARTER);
    change = change - (quarters * QUARTER);

    dimes = Math.floor(change / DIME);
    change = change - (dimes * DIME);

    nickels = Math.floor(change / NICKEL);
    change = change - (nickels * NICKEL);

    pennies = Math.floor(change / PENNY);
    change = change - (pennies * PENNY);

    System.out.println("You will get:" + dollars + " Dollars," + quarters + " Quarters," + dimes + " Dimes," + nickels
        + " Nickels, and " + pennies + " Pennies.");

  }

}