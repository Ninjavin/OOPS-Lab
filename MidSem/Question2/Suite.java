public class Suite extends HotelRoom{
    private double finalRate;
    Suite(int room){
        super(room);
        finalRate = this.getRentalRate() + 40;
        if(room > 299){
            finalRate = finalRate + (0.15*finalRate);
        }
    }

    public double getFinalRate(){
        return this.finalRate;
    }
    
}