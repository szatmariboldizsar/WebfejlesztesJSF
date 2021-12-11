package com.jsf.spring.dto;

import java.io.Serializable;
import java.util.Objects;

public class ShoeDTO implements Serializable {

	private Long shoeId;
	private String shoeBrand;
	private String shoeModel;
	private String shoeColorway;
	private String shoeSize;

	public Long getShoeId() {
		return shoeId;
	}

	public void setShoeId(Long shoeId) {
		this.shoeId = shoeId;
	}

	public String getShoeBrand() {
		return shoeBrand;
	}

	public void setShoeBrand(String shoeBrand) {
		this.shoeBrand = shoeBrand;
	}

	public String getShoeModel() {
		return shoeModel;
	}

	public void setShoeModel(String shoeModel) {
		this.shoeModel = shoeModel;
	}

	public String getShoeColorway() {
		return shoeColorway;
	}

	public void setShoeColorway(String shoeColorway) {
		this.shoeColorway = shoeColorway;
	}

	public String getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(String shoeSize) {
		this.shoeSize = shoeSize;
	}

	@Override
	public int hashCode() {
		return Objects.hash(shoeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoeDTO other = (ShoeDTO) obj;
		if (shoeId == null) {
			if (other.shoeId != null)
				return false;
		} else if (!shoeId.equals(other.shoeId))
			return false;
		return true;
	}

}
