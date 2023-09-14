public class test9 {
//동적 프로그래밍 top-down bottom-up
	public static void main(String[] args) {
		int[][] str = {{1}, {2,3}, {4,5,6}, {7,8,9,10}};
		int answer = 0;

//		for(int i = str.length - 2; i >= 0; i--) {
//			for(int j = 0; j < str[i].length; j++) {//�� Ʈ���� �ﰢ���� ������ �ڽĳ�� 2���� 
//				str[i][j] += Math.max(str[i+1][j],str[i+1][j+1]);//���� ��� ������ ��� ��� Ŭ���
//			}
//		}

		for(int i=1;i<str.length;i++) {
			if (str.length == 1) {
			    System.out.println(str[0][0]);
			    return;
			}
			else {
				for(int j=0;j<str[i].length;j++) {
					if(j==0) {
						str[i][j] += str[i-1][j];
					}
					else if(j==str[i].length-1) {
						str[i][j] += str[i-1][j-1];
					}
					else {
						str[i][j] +=  Math.max(str[i-1][j-1],str[i-1][j]);
					}
					if(str[i][j]>answer) {
						answer = str[i][j];	
					}
				}
			}
		}	

	}
}
