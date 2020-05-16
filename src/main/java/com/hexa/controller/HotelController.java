package com.hexa.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.hexa.model.Hotel;  
import com.hexa.service.HotelService;  

@CrossOrigin
@RestController  
public class HotelController   
{  
//autowire the HotelService class  
@Autowired  
HotelService hotelService;  
//creating a get mapping that retrieves all the hotel detail from the database   
@GetMapping("/hotel")  
private List<Hotel> getAllHotel()   
{  
return hotelService.getAllHotel();  
}  
//creating a get mapping that retrieves the detail of a specific hotel  
@GetMapping("/hotel/{hotelid}")  
private Hotel getHotel(@PathVariable("hotelid") int hotelid)   
{  
return hotelService.getHotelById(hotelid);  
}  
//creating a delete mapping that deletes a specified hotel  
@DeleteMapping("/hotel/{hotelid}")  
private void deleteHotel(@PathVariable("hotelid") int hotelid)   
{  
hotelService.delete(hotelid);  
}  
//creating post mapping that post the hotel detail in the database  
@PostMapping("/hotel")  
private int saveHotel(@RequestBody Hotel hotel)   
{  
hotelService.saveOrUpdate(hotel);  
return hotel.getHotelid();  
}  
//creating put mapping that updates the hotel detail   
@PutMapping("/hotel")  
private Hotel update(@RequestBody Hotel hotel)   
{  
hotelService.saveOrUpdate(hotel);  
return hotel;  
}  
}  
