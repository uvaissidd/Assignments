package Introduction;

public class document {
	String text ;
	public document(String textDoc)
	{
		setText(textDoc);
	}
	public void setText(String newTextDoc) 
	{
		text = newTextDoc;
	}
	public String toString()
	{
		return text;
	}
}