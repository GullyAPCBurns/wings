package edu.isi.wings.workflow.plan.classes;

import edu.isi.wings.common.URIEntity;

public class ExecutionFile extends URIEntity {
	private static final long serialVersionUID = 1L;

	String location;
	String bindingId;
	
	public ExecutionFile(String id) {
		super(id);
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBinding() {
		return bindingId;
	}
	public void setBinding(String bindingId) {
		this.bindingId = bindingId;
	}
}
