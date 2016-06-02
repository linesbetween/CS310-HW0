
/*hold username and num of times this user logs on to one line.
 * 
 */
public class Usage {
	private int logOnTimes;
	private String userName;
	
	public Usage ( String name){
		logOnTimes = 1;
		userName = name;
	}
	
	public Usage (){
		logOnTimes = 0;
		userName  = "None";
	}
	
	public int getLogOnTimes(){return logOnTimes;}
	
	public String getName(){return userName;}
	
	public void increaseLogOnTime(){
		logOnTimes++;
	}
}
