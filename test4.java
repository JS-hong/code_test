//개인정보 신고목록 not
import java.util.*;
public class test4 {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi","muzi neo"};
		int k=0;
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
		System.out.println(map);	

		//신고 처리 작업하기
	}
}
