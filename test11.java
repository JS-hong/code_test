//명예의전당 clear

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test11 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};	
    	List<Integer> str = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		
		
		for(int s=0;s<score.length;s++) {//총 9번 반복
			if(str.size()<k) {
				str.add(score[s]);//없을때는 0번 1개 있을때는 1번 저장
				int min = Collections.min(str);	
				result.add(min);//최솟값 저장
			}
			else{
				int min = Collections.min(str);	
				if(min >= score[s]) {//score에 있는 숫자가 최솟값보다 같거나 작을경우
					result.add(min);
				}
				else {//클경우(명예의 전당 입성)
					str.remove(str.indexOf(min));
					str.add(score[s]);
					min = Collections.min(str);	
					result.add(min);
				}
			}
		}

		int[] answer = result.stream().mapToInt(i -> i).toArray();
		System.out.println(Arrays.toString(answer));
    } 
}
