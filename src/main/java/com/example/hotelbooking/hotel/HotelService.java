package com.example.hotelbooking.hotel;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    public Hotel getById(Long id) {
        return hotelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hotel not found"));
    }

    public Hotel create(Hotel hotel) {
        hotel.setId(null);
        return hotelRepository.save(hotel);
    }

    public Hotel update(Long id, Hotel hotel) {
        Hotel existing = getById(id);
        existing.setName(hotel.getName());
        existing.setCity(hotel.getCity());
        existing.setAddress(hotel.getAddress());
        existing.setRoomsAvailable(hotel.getRoomsAvailable());
        existing.setPricePerNight(hotel.getPricePerNight());
        return hotelRepository.save(existing);
    }

    public void delete(Long id) {
        hotelRepository.deleteById(id);
    }
}
