public class Course {
	LinkedList<Student> students;

	public Course(LinkedList<Student> students) {
		super();
		this.students = students;
	}

	public LinkedList<Student> getStudents() {
		return students;
	}

	public void setStudents(LinkedList<Student> students) {
		this.students = students;
	}
	public void dodadistudent(Student s)
	{
		students.add(s);
	}

	@Override
	public String toString() {
		return "Course [students=" + students + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}
	
}