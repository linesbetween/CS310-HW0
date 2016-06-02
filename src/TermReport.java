
public class TermReport {
	

	public static void main(String[] args) {
		
		LineUsageData [] lineUsages = new LineUsageData[500];
		for (int i = 0; i < 500; ++i)
			lineUsages[i] = new LineUsageData(i+1);
		
		//process log into array of linkedlists.
		//for (int i = 0; i<10; ++i)
			//lineUsages[dataEntries[i].getlineNum()].addEntry(dataEntries[i].getName());
		lineUsages[1-1].addEntry("Alice");
		lineUsages[2-1].addEntry("Bob");
		lineUsages[3-1].addEntry("Alice");
		lineUsages[1-1].addEntry("Alice");
		lineUsages[3-1].addEntry("Alice");
		lineUsages[1-1].addEntry("Bob");
		lineUsages[2-1].addEntry("Bob");
		lineUsages[3-1].addEntry("Alice");
		lineUsages[3-1].addEntry("Cathy");
		
		//print report
		System.out.println("line#, User Name, Logon Times");
		for (int i = 0; i < 500; ++i){
			System.out.println(i+1 +"     " + lineUsages[i].findFrequentUser().getName()
					+ ",    " + lineUsages[i].findFrequentUser().getLogOnTimes() );
		}
			
	}
}
