class Student {
	String index;
	String firstName;
	String lastName;
	LinkedList<Integer> labPoints;

	//TODO constructor
	public Student(String index, String firstName, String lastName, LinkedList<Integer> labPoints) {
		super();
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}


	//TODO seters & getters
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedList<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(LinkedList<Integer> labPoints) {
		this.labPoints = labPoints;
	}


	public double getAverage() {
		//TODO
	Iterator<Integer> it=labPoints.iterator();
		int zbir=0;
		while(it.hasNext())
		{
			int x=it.next();
			zbir+=x;
		
	    }
		return (double)zbir/labPoints.size();
	}

	public boolean hasSignature() {
		//TODO
	return labPoints.size()>8;
	}
}
