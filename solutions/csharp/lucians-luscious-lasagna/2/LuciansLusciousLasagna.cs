class Lasagna
{
   
    public int ExpectedMinutesInOven(){
        return 40;
    }

    public int RemainingMinutesInOven(int TimeInOven){
        return ExpectedMinutesInOven()-TimeInOven;
    }

    public int PreparationTimeInMinutes(int Layers){
        return Layers*2;
    }

    public int ElapsedTimeInMinutes(int Layers,int TimeInOven){
        return PreparationTimeInMinutes(Layers)+TimeInOven;
    }
}
