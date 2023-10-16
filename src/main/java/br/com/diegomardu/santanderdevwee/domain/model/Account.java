package br.com.diegomardu.santanderdevwee.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tb_account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String number;
	private String agency;
	
	@Column(precision = 13, scale = 2)
	private BigDecimal balance;
	
	@Column(name = "addtional_limit", precision = 13, scale = 2)
	private BigDecimal limit;

}
