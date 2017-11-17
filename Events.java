import java.util.ArrayList;
import java.util.HashMap;

public class Events {
	HashMap<String, HashMap<String, String>> eventMap; //{"Feb. 23, 2017": {"3:00PM-4:30PM":Interview at The Portal, time: event}} 
	
	public Events() {
		this.eventMap = new HashMap<String, HashMap<String,String>>();
	}
	
	public void createData() { 
		HashMap<String, String> innerMap = new HashMap<String, String>();
		innerMap.put("3:00PM-4:30PM", "Interview at the Portal");
		eventMap.put("Feb 23, 2017", innerMap);
		HashMap<String, String> innerMap2 = new HashMap<String, String>();
		innerMap2.put("12:00PM-1:00PM", "Lunch with Cindy");
		eventMap.put("Feb 25, 2017", innerMap2);
		HashMap<String, String> innerMap3 = new HashMap<String, String>();
		innerMap3.put("5:00PM-5:30PM", "Dinner with John");
		eventMap.put("Feb 24, 2017", innerMap3);
		HashMap<String, String> innerMap4 = new HashMap<String, String>();
		innerMap4.put("11:00AM-5:30PM", "Conference");
		eventMap.put("Feb 24, 2017", innerMap4);
		HashMap<String, String> innerMap5 = new HashMap<String, String>(); //new event
		innerMap5.put("12:30PM-1:30PM", "Study");
		eventMap.put("Feb 25, 2017", innerMap5);
		HashMap<String, String> innerMap6 = new HashMap<String, String>(); //new event
		innerMap5.put("9:30PM-10:30PM", "Shower");
		eventMap.put("Feb 26, 2017", innerMap6);
		HashMap<String, String> innerMap7 = new HashMap<String, String>(); //new event
		innerMap5.put("6:30PM-7:30PM", "Dinner");
		eventMap.put("Feb 25, 2017", innerMap7);
		HashMap<String, String> innerMap8 = new HashMap<String, String>(); //new event
		innerMap5.put("3:30PM-4:0PM", "Snack");
		eventMap.put("Feb 23, 2017", innerMap8);
		
	}
	
	public ArrayList<String> checkOverlap() { //found this at the end (need Date format) -- https://techutils.in/blog/2014/11/13/how-to-check-if-2-date-ranges-overlap-in-java/
		ArrayList<String> result = new ArrayList<String>();
		for (String date: eventMap.keySet()) {
			if (eventMap.get(date).size() > 1) { 
				for (String time: eventMap.get(date).keySet()) {
					String[] timeSplitted = time.split("-");
					//convert time to int and check the times along with AM and PM 
					//if overlap add into result 
				}
			}
		}
		return result;
	}
}
