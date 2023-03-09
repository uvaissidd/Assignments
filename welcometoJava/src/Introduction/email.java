package Introduction;

public class email extends document {
	String sender , recipient , title;
	public email(String textDoc, String senderMsg, String recipientMsg, String titleMsg) 
	{

		super(textDoc);
		sender = senderMsg;
		recipient = recipientMsg;
		title = titleMsg;
	}
	public String getsender() {
		return sender;
	}
	public String getreciepint() {
		return recipient;
	}
	public String gettitle() {
		return title;
	}
	public String gettext() {
		return super.toString();
	}
	public void setsender(String tosender) {
		sender = tosender;
	}
	public void setrecipient(String torecipient) {
		recipient = torecipient;
	}
	public void settitle(String totitle) {
		title = totitle;
	}
	public String toString() {
		return "From : "+sender+"\nTo : "+recipient+"\nTitle : "+title+ "\n\n"+super.toString();
	}

	public static void main(String[] args) {
		String sample1 = "Childrens are playing in a ground";
		document email1 = new email(sample1, "Peter", "Martin", "Childrens");
		System.out.println(email1.toString());
	}

}
