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

@Entity(name = "tb_card")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String number;
	
	@Column(name = "availabe_limit",precision = 13, scale = 2)
	private BigDecimal limit;

}
