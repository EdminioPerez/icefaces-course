package com.desaprendiendo.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean(name = "formularioControl")
@ViewScoped
public class TextEntryBean implements Serializable {
	public static final String BEAN_NAME = "textEntryBean";

	private static final Logger logger = LoggerFactory.getLogger(TextEntryBean.class);

	public String getBeanName() {
		return BEAN_NAME;
	}

	private String firstName;
	private String lastName;
	private String address1;
	private String address2;
	private String city;
	private String province;
	private String country;
	private String ciudadSeleccionada;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCiudadSeleccionada() {
		return ciudadSeleccionada;
	}

	public void setCiudadSeleccionada(String ciudadSeleccionada) {
		this.ciudadSeleccionada = ciudadSeleccionada;
	}

	public void provinceChange(ValueChangeEvent event) {
		Object value = event.getNewValue();
		if (value != null) {
			logger.debug("Valor del combo:{}", value.toString());
		}
	}

	public void submitButton(ActionEvent event) {
		logger.debug("Click en boton de Submit");

		logger.trace("Valor del bean:{}", this.toString());

	}

	public List<SelectItem> getComboValuesFromBD() {
		List<SelectItem> valoresBD = new ArrayList<>();

		for (int y = 0; y < 2000; y++) {
			valoresBD.add(new SelectItem("Zaragoza" + y, "Zaragoza" + y));
			valoresBD.add(new SelectItem("Barcelona" + y, "Barcelona" + y));
		}

		return valoresBD;
	}

	@Override
	public String toString() {
		return "TextEntryBean [" + (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "")
				+ (address1 != null ? "address1=" + address1 + ", " : "")
				+ (address2 != null ? "address2=" + address2 + ", " : "") + (city != null ? "city=" + city + ", " : "")
				+ (province != null ? "province=" + province + ", " : "")
				+ (country != null ? "country=" + country : "") + "]";
	}

}
