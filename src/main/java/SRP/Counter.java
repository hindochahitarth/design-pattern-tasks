package SRP;
class Counter{
    private int val=0;

    public int increment(){
        return ++val;
    }
    public int decrement(){
        return --val;
    }
    public int reset(){
        val=0;
        return val;
    }
    public int value(){
        return val;
    }


}

