package studentEqualsHashcode;

public class StudentExample {
	public static void main(String[] args) {
		Student stu1 = new Student("김씨");
		Student stu2 = new Student("김씨");
		
		if(stu1.equals(stu2)) {
			System.out.println("동일한 학생입니다.");
		}	else {
			System.out.println("다른 학생입니다.");
		}
		
	System.out.println(stu1.hashCode());
		
	}
	
}
