package piggybank;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<AbstractMoney> piggyBank = new ArrayList<>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));
        for(AbstractMoney money : piggyBank){
            System.out.println(money.getCointCount() + " " + money.getValueType());
        }

        // Print value of piggy bank
        double total = 0.0;
        for(AbstractMoney money : piggyBank){
            total += money.getTotal();
        }
        System.out.println("The piggy bank holds $" + total);
    }
}