public class Lasagna {
    private static final int ExpectedTimeInOven = 40;
    private static final int TimeToPrepareOneLayer = 2;
    public int expectedMinutesInOven(){
        return ExpectedTimeInOven;
    }
    public int remainingMinutesInOven(int time){
        return expectedMinutesInOven()-time; 
    }

    public int preparationTimeInMinutes(int layers){
        return layers*TimeToPrepareOneLayer;
    }

    public int totalTimeInMinutes(int layers,int time){
        return preparationTimeInMinutes(layers)+time;
    }
}
