package studentEqualsHashcode;

public class StudentExample {
	public static void main(String[] args) {
		Student stu1 = new Student("�达");
		Student stu2 = new Student("�达");
		
		if(stu1.equals(stu2)) {
			System.out.println("������ �л��Դϴ�.");
		}	else {
			System.out.println("�ٸ� �л��Դϴ�.");
		}
		
	System.out.println(stu1.hashCode());
		
	}
	
}
