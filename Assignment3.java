public class Message 
{ 
    private String message;
    
    private String author;

    public static String defaultsMessage = "";
    public static String defaultsAuthor = "";
    
	final static double MAX_MSG_LENGTH = 1000000;
	final static double MAX_AUTHOR_LENGTH = 40;
	
	
	
	public Message()
	      {
	    	 this.message = defaultsMessage;
	    	 this.author = defaultsAuthor;
          }
	public void setMessage(String message)
	{
		this.message = message;
		return;
	}
	
	public void getmessage(String message)
	{
		this.message = message;
		return;
				
	}
	
	public Message(String m, String a)
	{
		message = m;
		author = a;
	   return;
	 }
	
   public String toString()
   {
	    	  return message+ " " + author;
   }
   void testFunction(){
   
	        //System.out.println("Hi From inside the base class - test display");
	        //System.out.println("/* -----------------------------------------------------------");
	        System.out.println("Base class testing ************************** ");
	    } // end function
	        public static void main(String[] args) {
	          
	            Message objMsg = new Message();
	            objMsg.testFunction();


	// ........... rest of the code
   
   
   }
 
  
   

   
}

