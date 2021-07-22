package jun26NG_encap;

public class Encapsulation {
	
	private String studentname;
	private int rollno;
	private String classname;
	private int batchno;
	private int rank;
	private String habbit;
	private String maam;
	
	public String getMaam() {
		return maam;
	}

	public void setMaam(String maam) {
		this.maam = maam;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public int getBatchno() {
		return batchno;
	}

	public void setBatchno(int batchno) {
		this.batchno = batchno;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getHabbit() {
		return habbit;
	}

	public void setHabbit(String habbit) {
		this.habbit = habbit;
	}

	public void setName(String str)
	{
		this.studentname = str;
	}
	
	public String getName()
	{
		return this.studentname;
	}
	

}
