package studentEqualsHashcode;

public class Student {
	
	String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	
	@Override //Object Ŭ������ equals() �޼ҵ�� ����� ������ �ּ����� Ȯ���ϴ� ���̹Ƿ�, ���ڿ��� ���� ��� equals()�� ����� true�� �������� ������
	public boolean equals(Object obj) {
		if ( obj instanceof Student) {
			Student newobj = (Student) obj ;				
			if(this.getStudentNum() == newobj.getStudentNum()) {
				return true;
			}
		}
		return false;		
	}
	
	@Override // studentNum�� ���� ���� ��� ���� hashCode�� �������� ������
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	
	
}
