//주차 요금 계산! not
import java.util.*;

public class test7 {
	public static void main(String[] args) {
		int[] fees = {180, 5000, 10, 600};
		String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", 
				"07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", 
				"19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		
		List<List<String>> str = new ArrayList<List<String>>();
		
		for(String park : records) {
			List<String> row = new ArrayList<>();

			String[] elements = park.split(" ");
			String[] timeElements = elements[0].split(":");//시/분 나누기

			for (String element : timeElements) {
				row.add(element);
			}

			for(int i=1;i<elements.length;i++){
				row.add(elements[i]);
			}

			str.add(row);
			//총 분할해야 할 데이터 
			//1.시간 2.분 3.차번호 4.in out 유무
		}//clear

		//요금 게산용 Map
		Map<String,Integer> parkMap = new HashMap<>();//차번호 요금 저장


		for(int j=0;j<str.size();j++){//데이터 수 만큼 반복
			if (parkMap.get(str.get(j).get(2)) != null) {
				if(str.get(j).get(3) == "OUT"){

				}
				else{
					
				}
			} else {
				parkMap.put(str.get(j).get(2),fees[1]);
			}
		}
		System.out.println(parkMap);
	}    
}
