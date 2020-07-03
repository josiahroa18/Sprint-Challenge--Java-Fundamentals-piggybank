package piggybank;

public class Dime extends AbstractMoney{
    private final double value = 0.10;

    public Dime(){
        super();
    }

    public Dime(int coinCount){
        super(coinCount);
    }

    @Override
    public double getTotal(){
        return this.coinCount * this.value;
    }

    @Override
    public String getValueType(){
        if(coinCount > 1){
            return "Dimes";
        }else{
            return "Dime";
        }
    }
}