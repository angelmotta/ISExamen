public class HolidayBookingFacade {
    public void bookHolidayPackage(int option){
        if(option == 1){
            FlightBooking fliBooking = new FlightBooking();
            fliBooking.bookFlight();
        }
        if(option == 2){
            HotelBooking hotelBooking = new HotelBooking();
            hotelBooking.bookHotel();
        }
        if(option == 3){
            CabBooking cabBooking = new CabBooking();
            cabBooking.bookCab();
        }
    }
}
