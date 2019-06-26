package dev.nord.springdemo.domain.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Object will be used as a session attribute

public class VisitorData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5440289448806755436L;
	
	private String currentVisitorName;
	private String currentVisitorEmail;
	private List<Visitor> visitors = new ArrayList<Visitor>();
	
	public VisitorData() {
		
	}
	
	public VisitorData(String currentVisitorName, String currentVistorEmail, List<Visitor> visitors) {
		super();
		this.currentVisitorName = currentVisitorName;
		this.currentVisitorEmail = currentVistorEmail;
		this.visitors = visitors;
	}
	
	public String getCurrentVisitorName() {
		return currentVisitorName;
	}

	public void setCurrentVisitorName(String currentVisitorName) {
		this.currentVisitorName = currentVisitorName;
	}

	public String getCurrentVisitorEmail() {
		return currentVisitorEmail;
	}

	public void setCurrentVisitorEmail(String currentVistorEmail) {
		this.currentVisitorEmail = currentVistorEmail;
	}
	
	public List<Visitor> getVisitors() {
		return visitors;
	}

	public void setVisitors(List<Visitor> visitors) {
		this.visitors = visitors;
	}
	
	@Override
	public String toString() {
		return "VisitorData [currentVisitorName=" + currentVisitorName + ", currentVistorEmail="
				+ currentVisitorEmail + ", visitors=" + visitors + "]";
	}
	

}
