package org.jboss.as.quickstarts.kitchensinkrf.controller;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIInput;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

@Named
@ViewScoped
@ManagedBean(value = "sendBean")
public class SendBean {

	private String inputInm;
	private String inpuntNoInm;

	public String getInputInm() {
		return inputInm;
	}

	public void setInputInm(String inputInm) {
		this.inputInm = inputInm;
	}

	public String getInpuntNoInm() {
		return inpuntNoInm;
	}

	public void setInpuntNoInm(String inpuntNoInm) {
		this.inpuntNoInm = inpuntNoInm;
	}

	public String accion() {
		System.out.println("Se invoca a la acción con los valores: inputInm [" + this.inputInm + "], inputNoInm ["
				+ this.inpuntNoInm + "]");
		return null;
	}
	
	public void setInputInm (ValueChangeEvent evt) {
		// Se actualiza el modelo
		this.inputInm = (String) evt.getNewValue();
		
		// Se invalida el componente para que no vuela a actualizar el modelo
		((UIInput) evt.getComponent()).setLocalValueSet(true);
	}

}
 