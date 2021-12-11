package com.jsf.spring.utills;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FacesValidator("customSizeValidator")
public class SizeValidator implements Validator {

	private static final String SIZE_PATTERN = "^[1-6][0-9]$";

	private Pattern pattern;
	private Matcher matcher;

	public SizeValidator() {
		pattern = Pattern.compile(SIZE_PATTERN);
	}

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

		matcher = pattern.matcher(value.toString());
		if (!matcher.matches()) {

			FacesMessage msg = new FacesMessage("Invalid size!", "Size should be a number between 10 and 69");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);

		}

	}
}
