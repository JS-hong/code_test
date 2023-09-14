//개인정보 신고목록 not
import java.util.*;
public class test4 {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi","muzi neo"};
		int k=2;
		List<List<String>> str_id = new ArrayList<List<String>>();
		
		
		Set<List<String>> blacklist = new HashSet<>();

		for(String row : report) {//
		    List<String> rows = Arrays.asList(row.split(" "));
		    blacklist.add(rows);
		}

		List<List<String>> list = new ArrayList<>(blacklist);
		
		System.out.println(list.get(0).get(0));
		System.out.println(list.get(0).get(1));

		Map<String, List<String>> map = new HashMap<>();

		for (List<String> item : list) {
		    String reporter = item.get(0);
		    String reportedUser = item.get(1);

		    if (!map.containsKey(reportedUser)) {
		        map.put(reportedUser, new ArrayList<>());
		    }

		    map.get(reportedUser).add(reporter);
		}
		System.out.println(map);//신고자 신고한 목록 이렇게 저장함	

		//이제 처리메일이 도착 하도록 해야함 k=2
		//저 map 을 돌려서 카운트를 증가시키고 
		
		//for(;;){//카운트 증가

		//}
		//for(;;){//나의 신고 목록에 정지 당한 사람이 있다면 리스트에 저장

		//}

	}
}
