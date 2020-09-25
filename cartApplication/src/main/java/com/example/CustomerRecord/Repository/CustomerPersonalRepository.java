package com.example.CustomerRecord.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.CustomerRecord.DTO.CustomerPersonalDTO;

@Repository
public interface CustomerPersonalRepository extends CrudRepository<CustomerPersonalDTO, Integer>{

}
