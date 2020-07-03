package piggybank;

public class Nickel extends AbstractMoney{
    private final double value = 0.05;

    public Nickel(){
        super();
    }

    public Nickel(int coinCount){
        super(coinCount);
    }

    @Override
    public double getTotal(){
        return this.coinCount * this.value;
    }

    @Override
    public String getValueType(){
        if(coinCount > 1){
            return "Nickels";
        }else{
            return "Nickel";
        }
    }
}