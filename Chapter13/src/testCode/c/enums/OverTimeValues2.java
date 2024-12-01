package testCode.c.enums;

public enum OverTimeValues2 {
    THREE_HOUR(18000), // enum 각 상수값 지정가능
    FIVE_HOUR(30000),
    WEEKEND_FOUR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000);

    private final int amount;
    OverTimeValues2(int amount){ // package private
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }
}
