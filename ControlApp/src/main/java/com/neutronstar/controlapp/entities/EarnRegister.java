package com.neutronstar.controlapp.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_earn_register")
@EqualsAndHashCode(exclude = { "data", "km", "numberOfRides" })
@NoArgsConstructor
public class EarnRegister implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	private Long id;

	@Getter
	@Setter
	private Date data;

	@Getter
	@Setter
	private Double km;

	@Getter
	@Setter
	private Integer numberOfRides;

	public EarnRegister(Long id, Date data, Double km, Integer numberOfRides) {
		super();
		this.id = id;
		this.data = data;
		this.km = km;
		this.numberOfRides = numberOfRides;
	}
	
	

}
