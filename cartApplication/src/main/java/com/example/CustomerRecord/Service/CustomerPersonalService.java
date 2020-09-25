package com.example.CustomerRecord.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CustomerRecord.DTO.CustomerPersonalDTO;
import com.example.CustomerRecord.Logging.LoggerInstance;
import com.example.CustomerRecord.Repository.CustomerPersonalRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerPersonalService {
	
	@Autowired
	private CustomerPersonalRepository customerPersonalRepository;
	
	@Autowired
	LoggerInstance loggerInstance;
	
	
	public void savedetails(CustomerPersonalDTO customerPersonalDTO) {
		customerPersonalRepository.save(customerPersonalDTO);
		
	}
	
	public void deletedetailsById() {
		
		
	}
	
	public List<CustomerPersonalDTO> getAllDetails() {
		List<CustomerPersonalDTO> custList = new ArrayList<CustomerPersonalDTO>();
		customerPersonalRepository.findAll().forEach(CustomerPersonalDTO -> custList.add(CustomerPersonalDTO));
		return custList;
		
		
		
	}
	
	public void getDetailsById() {
		
	}
	
	public void updateDetailsById() {
		
	}
}
