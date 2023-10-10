package Project;

public class Total_marks {

	public static void main(String[] args) {
		int MarksPerSubject = 100;
		float Percentage;
	int maths = 85;
	int IOT = 80;
	int NoSql = 85;
	int English = 90;
	int Hindi = 97;
	int Management = 70;
	float Total=(maths+IOT+NoSql+English+Hindi+Management);
	System.out.println(Total);

Percentage = (Total/(6*MarksPerSubject))*100;
System.out.println(Percentage);
	}

}
