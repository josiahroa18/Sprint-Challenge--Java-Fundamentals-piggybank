package piggybank;

public class Penny extends AbstractMoney{
    private final double value = 0.01;

    public Penny(){
        super();
    }

    public Penny(int coinCount){
        super(coinCount);
    }

    @Override
    public double getTotal(){
        return this.coinCount * this.value;
    }

    @Override
    public String getValueType(){
        if(coinCount > 1){
            return "Pennies";
        }else{
            return "Penny";
        }
    }
}