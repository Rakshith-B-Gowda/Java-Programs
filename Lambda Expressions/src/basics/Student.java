package basics;

class Student {
	
	private String name;
	private Integer id;
	private Double per;
	
	Student(String name, Integer id, Double per) {
		this.name = name;
		this.id = id;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Id: " + id + ", Percentage: " + per;
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public Double getPer() {
		return per;
	}
}
