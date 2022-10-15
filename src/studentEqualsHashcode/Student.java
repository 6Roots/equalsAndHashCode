package studentEqualsHashcode;

public class Student {
	
	String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	
	@Override //Object 클래스의 equals() 메소드는 대상이 동일한 주소인지 확인하는 것이므로, 문자열이 같을 경우 equals()의 결과가 true가 나오도록 재정의
	public boolean equals(Object obj) {
		if ( obj instanceof Student) {
			Student newobj = (Student) obj ;				
			if(this.getStudentNum() == newobj.getStudentNum()) {
				return true;
			}
		}
		return false;		
	}
	
	@Override // studentNum의 값이 같을 경우 같은 hashCode가 나오도록 재정의
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	
	
}
