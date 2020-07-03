package piggybank;

abstract class AbstractMoney {
    protected int coinCount;

    abstract String getValueType();
    abstract double getTotal();

    public AbstractMoney(){
        this.coinCount = 1;
    }

    public AbstractMoney(int coinCount){
        this.coinCount = coinCount;
    }

    int getCointCount(){
        return this.coinCount;
    }
}