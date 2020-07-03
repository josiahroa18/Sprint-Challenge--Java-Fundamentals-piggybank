package piggybank;

public class Dollar extends AbstractMoney{
    private final double value = 1.0;

    public Dollar(){
        super();
    }

    public Dollar(int coinCount){
        super(coinCount);
    }

    @Override
    public double getTotal(){
        return this.coinCount * this.value;
    }

    @Override
    public String getValueType(){
        if(coinCount > 1){
            return "Dollars";
        }else{
            return "Dollar";
        }
    }
}