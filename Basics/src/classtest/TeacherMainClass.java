package classtest;

public class TeacherMainClass {
	static void display(Teacher obj) {
		if (obj instanceof Students) {
			System.out.println("Teacher -> Students");
			Students s = (Students) obj;
			System.out.println(s.name+" "+s.branch);
		}
		else if (obj instanceof Subjects) {
			System.out.println("Teacher -> Subjects");
			Subjects sub = (Subjects) obj;
			System.out.println(sub.name+" "+sub.sub);
		}
	}
	public static void main(String[] args) {
		display(new Students());
		System.out.println("---------");
		display(new Subjects());
	}
}
