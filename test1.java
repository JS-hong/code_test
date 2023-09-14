//삼각형의 완성조건 clear
public class test1 {
	public static void main(String[] args) {
		int[] side = {11, 7};
        int answer = 0;
        int max = 0;
        int min = 0;
        int rs = side[0]+side[1];
        if(side[0]>side[1]) {
        	max = side[0];
        	min = side[1];
        }
        else {
        	max = side[1];
        	min = side[0];
        }
        

        for(int i=rs-1;i>max;i--) {
        	System.out.println(i);
        	answer++;
        }
        
        for(int x=1;x<=max;x++) {
        	if(x+min>max) {
        		System.out.println(x);
        		answer++;
        	}
        }  
        
        System.out.println(answer);
	}
}
