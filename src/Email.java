
public class Email extends Message 
    {
	
	private String fromAddress;
	private String toAddress;

	private static String defaultsAddress ="";
	private static String defaultsToAddress = "";
	
	final static double MAX_EMAIL_ADDRESS_LENGTH = 1000000;
	final static double DEFAULTS_EMAIL_LENGTH = 40;
	public static int messageSize = 1000000;
	public static String emailFromWhom;
    public static String emailToWhom;
    
//defaut constructor.
public Email()
{
	super();
	this.fromAddress = defaultsAddress;
	this.toAddress = defaultsToAddress;
}
public Email(String m, String a, String fa, String ta )
{
	super(m,a);
	fromAddress = fa;
	toAddress = ta;
	
}

// Accessor method to Address
public String getFromAddress()
{
	return fromAddress;
}
// Accessor method to toAddress
public String getToAddress(){
	return toAddress;
}
}
