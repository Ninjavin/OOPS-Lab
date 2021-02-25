public class UseHotelRoom {
    public static void main(String args[]){
        HotelRoom hotel = new HotelRoom(5);
        System.out.println(hotel.getRoomNumber());
        System.out.println(hotel.getRentalRate());

        HotelRoom hotel2 = new HotelRoom(400);
        System.out.println(hotel2.getRoomNumber());
        System.out.println(hotel2.getRentalRate());
        
        Suite suite = new Suite(5);

        System.out.println(suite.getRoomNumber());
        System.out.println(suite.getFinalRate());

        Suite suite2 = new Suite(300);

        System.out.println(suite2.getRoomNumber());
        System.out.println(suite2.getFinalRate());

    }
}
