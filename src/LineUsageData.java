

public class LineUsageData {
	private int lineNum; // can be replaced by index of array of lines.
	private SinglyLinkedList<Usage> usageList ;
	
	public LineUsageData(int num){
		lineNum = num;
		usageList = new SinglyLinkedList<Usage>();
	}
	
	private int findEntry (String name){
		
		for (int i =0; i< usageList.size(); ++i){
			if  (usageList.get(i).getName() == name)
				return i;
		}
		return -1;
	}
	
	public void addEntry (String name){
		int entryIndex = findEntry(name);
		if ( entryIndex == -1){
			Usage entry = new Usage (name);
			usageList.add(entry);
		}
		else{
			usageList.get(entryIndex).increaseLogOnTime();
		}
	}
	
	
	public Usage findFrequentUser(){
		if (usageList.size() == 0)
			return new Usage();
		else{
			int maxUsageIndex = 0;
			for (int i = 1; i < usageList.size(); ++i){
				if (usageList.get(maxUsageIndex).getLogOnTimes() < usageList.get(i).getLogOnTimes())
					maxUsageIndex = i;
			}			
			return usageList.get(maxUsageIndex);
		}
	}
	
}
