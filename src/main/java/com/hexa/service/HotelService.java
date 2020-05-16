package com.hexa.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.hexa.model.Hotel;  
import com.hexa.repository.HotelRepository;  
//defining the business logic  
@Service  
public class HotelService   
{  
@Autowired  
HotelRepository hotelRepository;  
//getting all hotel record by using the method findaAll() of CrudRepository  
public List<Hotel> getAllHotel()   
{  
List<Hotel> hotel = new ArrayList<Hotel>();  
hotelRepository.findAll().forEach(hotel1 -> hotel.add(hotel1));  
return hotel;  
}  
//getting a specific record by using the method findById() of CrudRepository  
public Hotel getHotelById(int id)   
{  
return hotelRepository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Hotel hotel)   
{  
hotelRepository.save(hotel);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
hotelRepository.deleteById(id);  
}  
//updating a record  
public void update(Hotel hotel, int hotelid)   
{  
hotelRepository.save(hotel);  
}  
}  
