class Student {
	String index;
	String firstName;
	String lastName;
	int[] grades;
	//TODO constructor

	public Student(String index, String firstName, String lastName, int[] grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
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

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public double getAverage() {
		//TODO
		int l,i,br=0;
		l=grades.length;
		for(i=0;i<l;i++){
			br+=grades[i];
		}
		br=br/l;
		return br;
	}

	public int ECTSCredits() {
		//TODO
		int l,i,br=0;
		l=grades.length;
		for(i=0;i<l;i++){
			if(grades[i]>5) {
				br += 6;
			}
		}
		return br;
	}
}
class Faculty {
	ArrayList<String> studenti = new ArrayList<>();
	String fakultet;

	public Faculty(String fakultet) {
		this.fakultet = fakultet;
	}

	public void studentiadd(Student studenti){
		studenti.add(a);
	}
	public void studentiremove(Student studenti){
		studenti.remove(a);
	}
	public double getAverage() {
		int l,i,br=0;
		l=studenti.length;
		for(i=0;i<l;i++){
			br+=studenti.get(i);
		}
		br=br/l;
		return br;
	}
}

