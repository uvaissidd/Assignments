package Introduction;

enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
public class EnumDayName {
	Day day;
	public EnumDayName(Day day) {
		this.day=day;
	}
	public void dayIs() {
		switch(day) {
		case SUNDAY:
			System.out.println("Hi today is Sunday");
			break;
		case MONDAY:
			System.out.println("Hi today is Monday");
			break;
		case TUESDAY:
			System.out.println("Hi today is Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Hi today is Wednesday");
			break;
		case THURSDAY:
			System.out.println("Hi today is Thursday");
			break;
		case FRIDAY:
			System.out.println("Hi today is Friday");
			break;
		case SATURDAY:
			System.out.println("Hi today is Saturday");
			break;
		default:
			System.out.println("Please Enter valid week name with capital word");	
		}
	}
	public static void main(String[] args) {
		String str= "MONDAY";
		EnumDayName name = new EnumDayName(Day.valueOf(str));
		name.dayIs();
	}
	
}
