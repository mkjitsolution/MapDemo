package p1;

import java.util.HashMap;
import java.util.Map;

public class MapDemoBasic {
	
	public static void main(String[] args) {
		
		Map<String, Employee> employeeMap = new HashMap<>();
		
		employeeMap.put("abvc123", new Employee(101, "abc", 2000));
		employeeMap.put("abvc423", new Employee(102, "adcbc", 12000));
		employeeMap.put("gfhr123", new Employee(103, "asdbc", 234000));
		employeeMap.put("dfg54fd", new Employee(104, "vfgfabc", 26000));
		      //                                         //  abvc123,abvc423,gfhr123,dfg54fd
		for(Map.Entry<String, Employee> entry :employeeMap.entrySet())
		{
			String key = entry.getKey();
			Employee e = entry.getValue();
			if(key.equals("gfhr123"))System.out.println(e.getName());
		}
		
	}//end main
	
}//end class
