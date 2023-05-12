package com.webservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Vehicle {

	public String marca;

	private Integer tires;

	public void Avanzar() {
		System.out.print("avanzooooooooooooo");
	}
}
