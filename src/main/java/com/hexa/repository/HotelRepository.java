package com.hexa.repository;

import org.springframework.data.repository.CrudRepository;  
import com.hexa.model.Hotel;  
//repository that extends CrudRepository  
public interface HotelRepository extends CrudRepository<Hotel, Integer>  
{  
}  
