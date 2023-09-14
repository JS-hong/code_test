//같은 숫자 제거 clear
import java.util.ArrayList;
import java.util.List;

public class test10 {
    public static void main(String[] args) {
    int []arr =  {1,1,3,3,0,1,1};
    List<Integer> str = new ArrayList<Integer>();
        
			for(int rows : arr) {
				if(str.size()>0) {
					if(str.get(str.size()-1).equals(rows)) {
					}
					else {
						str.add(rows);
					}
				}
				else {
					str.add(rows);//삽입
				}
			}
		
			int[] answer = new int[str.size()];
			for (int i = 0; i < str.size(); i++) {
			    answer[i] = str.get(i);
			}
        }
}
