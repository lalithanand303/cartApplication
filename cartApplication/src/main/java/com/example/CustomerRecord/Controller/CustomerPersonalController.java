package com.example.CustomerRecord.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerRecord.DTO.CustomerPersonalDTO;
import com.example.CustomerRecord.Service.CustomerPersonalService;

import lombok.extern.slf4j.Slf4j;



@RestController
@RequestMapping("/cust")
@Slf4j
public class CustomerPersonalController {
	
	
	
	@Autowired
	CustomerPersonalService customerPersonalService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/addDetails")
	public void insertCustPersonalDetails(@RequestBody CustomerPersonalDTO customerPersonalDTO) {
		log.info("Add details servive invoked");
		customerPersonalService.savedetails(customerPersonalDTO);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getDetails")
	public List<CustomerPersonalDTO> getCustPersonalDetails() {
		log.info("Get details info called - {}, I guess setails are added to the data base - {}", getClass().getName(), getClass().getName());
		return customerPersonalService.getAllDetails();
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteDetails/{id}")
	public void deleteCustDetailsById(@PathVariable String id) {
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getDetails/{id}")
	public CustomerPersonalDTO getCustById(@PathVariable String id) {
		return null;
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/updateDetails/{id}")
	public void updateCustDataById(@RequestBody CustomerPersonalDTO customerPersonalDTO) {
		
	}

}
