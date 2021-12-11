package com.jsf.spring.utills;

import com.jsf.spring.dto.ShoeDTO;
import com.jsf.spring.service.ShoeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@Service
public class ShoeConverter implements Converter {

	@Autowired
	private ShoeService shoeService;

	private static final Logger LOG = LoggerFactory.getLogger(ShoeConverter.class.getName());

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
		LOG.info("getAsObject: " + shoeService);

		ShoeDTO shoeDTO = new ShoeDTO();
		shoeDTO.setShoeBrand(string);
		shoeDTO = shoeService.getShoe(shoeDTO);
		System.out.println(shoeDTO.toString());
		return shoeDTO;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic, Object obj) {
		LOG.info("getAsString obj class: " + obj.getClass().getName());
		if (obj instanceof ShoeDTO) {
			ShoeDTO shoeDTO = (ShoeDTO) obj;
			LOG.info("getAsString def name: " + shoeDTO.getShoeBrand());
			return shoeDTO.getShoeBrand();
		} else {
			StringBuilder sbError = new StringBuilder("The object of class ");
			sbError.append(obj.getClass().getName()).append(" is not of ShoeDTO");
			throw new ClassCastException(sbError.toString());
		}
	}
}