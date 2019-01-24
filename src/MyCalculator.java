

import java.util.Map;

public class MyCalculator {
	
	private Map<String, Calc> operMap;
	
	public MyCalculator(Map<String, Calc> calcMap ) {
		this.operMap = calcMap;
	}
	
	public Double doJob(String oper, Double v1, Double v2) {
		return operMap.get(oper).calc(v1, v2);
		
	}

}
