/**
 * 
 */
/**
 * @author s727953
 *
 */
package com.jsf.spring.service.impl;

import com.jsf.spring.dto.ShoeDTO;
import com.jsf.spring.entity.Shoe;
import com.jsf.spring.repository.ShoeRepository;
import com.jsf.spring.service.ShoeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ShoeServiceImpl implements ShoeService {
	@Autowired
	private ShoeRepository shoeRepository;

	@Override
	public List<ShoeDTO> getAllShoe() {
		List<ShoeDTO> shoeDTOList = new ArrayList<>();
		List<Shoe> shoeList = shoeRepository.findAll();

		shoeList.forEach(shoe -> {
			ShoeDTO tmpDTO = new ShoeDTO();

			BeanUtils.copyProperties(shoe, tmpDTO);
			shoeDTOList.add(tmpDTO);
		});

		return shoeDTOList;
	}

	@Override
	public ShoeDTO getShoe(ShoeDTO shoeDTO) {
		System.out.println(">>>>> "+shoeDTO.getShoeId());
		Shoe shoe = shoeRepository.findShoeByShoeId(shoeDTO.getShoeId());
		ShoeDTO DTO = new ShoeDTO();

		BeanUtils.copyProperties(shoe, DTO);
		return DTO;
	}

	@Override
	public ShoeDTO saveShoe(ShoeDTO shoeDTO) {
		Shoe shoe = DTOToEntity(shoeDTO);
		shoe = shoeRepository.save(shoe);
		BeanUtils.copyProperties(shoe, shoeDTO);

		return shoeDTO;
	}

	private Shoe DTOToEntity(ShoeDTO shoeDTO) {
		Shoe shoe = new Shoe();
		BeanUtils.copyProperties(shoeDTO, shoe);

		return shoe;
	}

	@Override
	@Transactional
	public void deleteShoe(ShoeDTO shoeDTO) {

		shoeRepository.deleteById(shoeDTO.getShoeId());
	}
}