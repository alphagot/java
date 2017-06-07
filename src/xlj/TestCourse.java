package xlj;

public class TestCourse {
	public static void main(String[] args)	{
		System.out.println("first mian");	
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database System");
		
		course1.addStudent("xiong a");
		course1.addStudent("xiong b");
		course1.addStudent("xiong e");
		course1.addStudent("xiong f");
		course1.dorpStudent("xiong b");
		course1.dorpStudent("xiong a");
		System.out.println(course1.getNumberofStudens());
		String[] students =  course1.getStudent();
		for(int i = 0;i < course1.getNumberofStudens();i++) {
			System.out.print(students[i] + ", ");
		}
		
		course2.addStudent("xiong c");
		course2.addStudent("xiong d");
		System.out.println("\n"+course2.getNumberofStudens());
		
	}
}

class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudent;
	
	public Course(String student) {
		this.courseName = courseName;
	}
	public String[] getStudent() {	
		return students;
	}
	public void addStudent(String student){
		students[numberOfStudent] = student;
		numberOfStudent++;
	}
	public int getNumberofStudens() {
		return numberOfStudent;
	}
	public String getCourseName() {
		return courseName;
	}

	public void dorpStudent(String student) {
	
		String name;
		for(int i = 0;i < numberOfStudent;i++) {
			if(students[i] == student) {	
				
				for(int j = i;j < numberOfStudent;j++) {	
					students[j] = students[j++];
				}
				numberOfStudent--;
			}
		}
	
	}
}