package core;

public class Staff {

	private String id;
	private String name;
	private String born_date;
	private String specialization;
	private Boolean assigned;
	
	public Staff(String id, String name, String born_date, String specialization, Boolean assigned) {
		
		this.id = id;
		this.name = name;
		this.born_date = born_date;
		this.specialization = specialization;
		this.assigned= assigned;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBorn_date() {
		return born_date;
	}

	public void setBorn_date(String born_date) {
		this.born_date = born_date;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Boolean getAssigned() {
		return assigned;
	}

	public void setAssigned(Boolean assigned) {
		this.assigned = assigned;
	}
	
	
	

}
