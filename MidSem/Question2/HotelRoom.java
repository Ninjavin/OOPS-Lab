public class HotelRoom{
    private int roomNumber;
    private double rentalRate;
    int getRoomNumber(){
        return this.roomNumber;
    }
    double getRentalRate(){
        return this.rentalRate;
    }
    HotelRoom(int room){
        roomNumber = room;
        if(room <= 299){
            rentalRate = 69.95;
        }else{
            rentalRate = 89.95;
        }
    }
}