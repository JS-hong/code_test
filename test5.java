//공원 산책 clear
import java.util.*;
public class test5 {
	public static void main(String[] args) {
		String[] park = {"SOO","OOO","OOO"}; 
		String[] routes = {"E 2","S 2","W 1"};
		List<List<Character>> mapList = new ArrayList<>();
        List<List<Character>> routeList = new ArrayList<>();
		//int result=0;
		
		for(String map : park) {//줄마다 넣기
			List<Character> row = new ArrayList<>();
            for (char c : map.toCharArray()) {
                row.add(c);
            }
            mapList.add(row);
		}
		
		for(String route : routes) {//줄마다 넣기
			List<Character> row = new ArrayList<>();
            for (char c : route.toCharArray()) {
                row.add(c);
            }
            routeList.add(row);
		}	
		
		//0.시작지점 찾기
		 char target1 = 'S'; // 찾고자 하는 문자
		 int SrowIndex = -1; // 행 인덱스 초기화
		 int ScolumnIndex = -1; // 열 인덱스 초기화

		 for (int i = 0; i < mapList.size(); i++) {
		     List<Character> row = mapList.get(i);
		     for (int j = 0; j < row.size(); j++) {
		         if (row.get(j) == target1) {
		             SrowIndex = i;
		             ScolumnIndex = j;
		             break;
		         }
		     }
		 }
		 if (SrowIndex != -1 && ScolumnIndex != -1) {
		     System.out.println("Character '" + target1 + "' found at index (" + SrowIndex + ", " + ScolumnIndex + ")");
		 } else {
		     System.out.println("Character '" + target1 + "' not found");
		 }
		 
		//산책 시작~~
		//SrowIndex 남(+)  북(-)   시작지점
		//ScolumnIndex 동(+) 서(-)  시작지점
		int xSize = mapList.get(0).size(); //xSize가 음수가 되거나 최대치를 넘어가면 스탑
		int ySize = mapList.size();	//ySize가 음수가 되거나 최대치를 넘어가면 스탑

		for(int i=0;i<routeList.size();i++) {//총 3번 반복
			int str = Integer.parseInt(routeList.get(i).get(2).toString());
		switch (routeList.get(i).get(0)) {//routeList.get(0).get(0) == 동남서북중 어디인지 체크
		case 'E'://동
			 int resultx = ScolumnIndex;
			 if (ScolumnIndex + str < xSize) { 
				 for(int s=0;s<str;s++) {
					 ScolumnIndex++;
				 	if(mapList.get(SrowIndex).get(ScolumnIndex).equals('X') == true) {
						System.out.println("장애물 있어요!!!");
						ScolumnIndex = resultx; 
						break;
					}
				 }
			 }
		     else {
		    	 System.out.println("case : E  이동불가");
			}
			break;		
			
		case 'W'://서
			resultx = ScolumnIndex;
			 if (ScolumnIndex - str >= 0) { 
				 for(int s=0;s<str;s++) {
					 ScolumnIndex--;
				 	if(mapList.get(SrowIndex).get(ScolumnIndex).equals('X') == true) {
						System.out.println("장애물 있어요!!!");
						ScolumnIndex = resultx; 
						break;
					}
				 }
			 }
		     else {
		    	 System.out.println("case : W  이동불가");
			}
			break;		
			
		case 'S'://남
			 int resulty =  SrowIndex;
		        if (SrowIndex + str < ySize) { // 영역을 벗어나지 않을 때만 이동
		        	for(int s=0;s<str;s++) {//routeList에 적혀있는 만큼 반복
		        		SrowIndex++;
		        		if(mapList.get(SrowIndex).get(ScolumnIndex).equals('X') == true) {//동쪽으로 한칸 이동했을때 장애물이 있거나 영역의 끝이거나를 판별
		        			System.out.println("장애물 있어요!!!");
		        			SrowIndex =  resulty;
		        			break;
		        		}
		        	}
		        }
		        else {
					System.out.println("마지막 영역 이동불가");
		        }
		     break;
		     
		case 'N': // 북
			resulty =  SrowIndex;
		    if (SrowIndex - str >= 0) { // 영역을 벗어나지 않을 때만 이동
		        for(int s=0; s<str; s++) { // routeList에 적혀있는 만큼 반복
		            SrowIndex--;
		            if(mapList.get(SrowIndex).get(ScolumnIndex).equals('X')) { // 서쪽으로 한칸 이동했을 때 장애물이 있거나 영역의 끝인지 판별합니다.
		                System.out.println("장애물 있어요!!!");
		                SrowIndex = resulty;
		                break;
		            }
		        }
		    } 
		    else {
		        System.out.println("마지막 영역 이동불가");
		    }
		    break;
		default:
			
			break;
		}	
		
		}      
        int[] answer = {SrowIndex,ScolumnIndex};
		System.out.println(Arrays.toString(answer));	
	}
}
