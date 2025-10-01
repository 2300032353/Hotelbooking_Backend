package com.example.hotelbooking;

import com.example.hotelbooking.hotel.Hotel;
import com.example.hotelbooking.hotel.HotelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSeederConfig {

    @Bean
    public CommandLineRunner seedHotels(HotelRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                Hotel h1 = new Hotel(null, "Sunrise Resort", "Goa", "Beach Road", 10, 1200.0);
                Hotel h2 = new Hotel(null, "Hilltop Inn", "Ooty", "Valley View", 5, 1800.0);
                Hotel h3 = new Hotel(null, "City Comfort", "Hyderabad", "Main Street", 20, 900.0);

                repository.save(h1);
                repository.save(h2);
                repository.save(h3);
            }
        };
    }
}
