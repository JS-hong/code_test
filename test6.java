
import java.util.*;
public class test6 {
	public static void main(String[] args) {
		//
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};//����
		String[][] photo = {{"may", "kein", "kain", "radi"},
				{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		int count =0;
		Map<String, Integer> map = new HashMap<>();
		List<Integer> answer_m = new ArrayList<Integer>();
		
		for(int s=0;s<name.length;s++) {
			map.put(name[s], yearning[s]);
		}

		for(int i=0;i<photo.length;i++) {
			for(int j=0;j<photo[i].length;j++) {
				if(map.get(photo[i][j]) != null) {
					count = count + map.get(photo[i][j]);
				}
			}
			answer_m.add(count);
			count = 0;
		}
		
		int[] answer = new int[answer_m.size()];
		for (int i = 0; i < answer_m.size(); i++) {
		    answer[i] = answer_m.get(i);
		}
	}
}
