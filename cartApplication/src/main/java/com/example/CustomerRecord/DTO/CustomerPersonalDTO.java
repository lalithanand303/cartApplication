package com.example.CustomerRecord.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
public class CustomerPersonalDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int custId;
	private String custName;
	private String custAge;
	private String custBusinessName;
	private String custAddress;

}
