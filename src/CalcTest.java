import java.util.HashMap;
import java.util.Map;

public class CalcTest {
	
	public static void main(String[] args) {
		
		Calc plus = (v1, v2) -> v1 + v2;
		
		Map<String,Calc> map = new HashMap<>();
		
		map.put("plus",(v1,v2) -> v1+v2);
		map.put("sub",(v1,v2) -> v1-v2);
		
		MyCalculator cal = new MyCalculator(map);
		
		System.out.println(cal.doJob("plus", 10.0, 15.0));
		
	}

}
