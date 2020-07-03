package piggybank;

public class Quarter extends AbstractMoney{
    private final double value = 0.25;

    public Quarter(){
        super();
    }

    public Quarter(int coinCount){
        super(coinCount);
    }

    @Override
    public double getTotal(){
        return this.coinCount * this.value;
    }

    @Override
    public String getValueType(){
        if(coinCount > 1){
            return "Quarters";
        }else{
            return "Quarter";
        }
    }
}