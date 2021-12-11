/**
 * 
 */
/**
 * @author s727953
 *
 */
package com.jsf.spring.controller;

import com.jsf.spring.dto.ShoeDTO;
import com.jsf.spring.service.ShoeService;
import org.primefaces.context.RequestContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import java.util.ArrayList;
import java.util.List;

@Controller("shoeController")
@SessionScope
public class ShoeController {

	@Autowired
	private ShoeService shoeService;

	private String actionLabel;
	private ShoeDTO shoeDTO;
	private List<ShoeDTO> shoeDTOList;

	public void saveShoe() {
		System.out.println(this.getShoeDTO());
		shoeService.saveShoe(this.getShoeDTO());
		getAllShoe();
		this.setShoeDTO(new ShoeDTO());
		RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Shoe Details", "Shoe Details added/Updated Successfully."));

	}

	@PostConstruct
	public void getAllShoe() {
		if (!this.getShoeDTOList().isEmpty()) {
			this.getShoeDTOList().clear();
		}
		System.out.println(" >>>>>>>>>>>>> " + shoeService);
		this.getShoeDTOList().addAll(shoeService.getAllShoe());
		this.setActionLabel("Add");
	}

	public void deleteShoe(ShoeDTO shoeDTO) {
		shoeService.deleteShoe(shoeDTO);
		getAllShoe();
	}

	public void editShoe(ShoeDTO shoeDTO) {
		this.setActionLabel("Update");
		BeanUtils.copyProperties(shoeDTO, this.getShoeDTO());
		System.out.println(this.getShoeDTO());
	}

	public ShoeDTO getShoeDTO() {
		if (shoeDTO == null) {
			shoeDTO = new ShoeDTO();
		}
		return shoeDTO;
	}

	public void setShoeDTO(ShoeDTO shoeDTO) {
		this.shoeDTO = shoeDTO;
	}

	public List<ShoeDTO> getShoeDTOList() {
		if (null == shoeDTOList) {
			shoeDTOList = new ArrayList<>();
		}
		return shoeDTOList;
	}

	public String getActionLabel() {
		return actionLabel;
	}

	public void setActionLabel(String actionLabel) {
		this.actionLabel = actionLabel;
	}

}