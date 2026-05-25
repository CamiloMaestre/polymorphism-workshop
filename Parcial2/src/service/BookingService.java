package service;

import entities.Booking;
import entities.Flies;
import repository.BookingRepository;
import repository.FliesRepository;

public class BookingService {
    private BookingRepository repo= new BookingRepository();

    public void saveData(Booking b){


        repo.BookingSave(b);
    }

}
