
package com.jsf.spring.service;

import com.jsf.spring.dto.ShoeDTO;

import java.util.List;

public interface ShoeService {

	List<ShoeDTO> getAllShoe();

	ShoeDTO getShoe(ShoeDTO shoeDTO);

	ShoeDTO saveShoe(ShoeDTO shoeDTO);

	void deleteShoe(ShoeDTO shoeDTO);
}