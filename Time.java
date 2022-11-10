package LAb10;

public class Time {

	private int dMonth;
	private int dDay;
	private int dYear;
	
	public void setDate(int dDay, int dMonth, int dYear) {
		this.dMonth=dMonth;
		this.dDay=dDay;
		this.dYear=dYear;
	}
	public final int getDay() {
		return dDay;
	}
	public final int getMonth() {
		return dMonth;
	}
	public final int getYear() {
		return dYear;
	}
	public void printDate() {
		System.out.println(this.dDay+"/"+this.dMonth+"/"+this.dYear);
	}
	public Time(int dDay, int dMonth, int dYear) {
		this.dDay=11;
		this.dMonth=10;
		this.dYear=2022;
	}

}
