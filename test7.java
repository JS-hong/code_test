//주차 요금 계산! not
import java.util.ArrayList;
import java.util.List;
public class test7 {
	public static void main(String[] args) {
		int[] fees = {180, 5000, 10, 600};
		String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", 
				"07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", 
				"19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		
		List<List<String>> str = new ArrayList<List<String>>();
		
		for(String park : records) {
			//총 분할해야 할 데이터 
			//1.시간 2.분 3.차번호 4.in out 유무
			String 
		}
		//일단 2가지 case 존재 기본시간이 남아 있을 경우 
		//기존 시간을 다 소모하고 추가시간을 적용 시켜야 하는 경우
		
		//일단 기본시간 case 작성
		//기본시간 IN OUT
		//추후에 계산할때 MAP 사용해서 key value 형태로 삽입 및 수정
	}    
}
