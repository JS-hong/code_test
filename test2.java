
import java.util.*;

public class test2 {

	public static void main(String[] args) {
		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}; 
		List<List<Integer>> mine = new ArrayList<List<Integer>>();//2���� �迭 ����
		int answer = 0;
		int cnt=0;
		Set<List<Integer>> mineSet = new HashSet<>();//�ߺ� ��� ����
		//rowIndex = �� ColumnIndex = ��
		for (int[] row : board) {
		    List<Integer> rowList = new ArrayList<>();
		    for (int num : row) {
		        rowList.add(num);
		        cnt++;
		    }
		    mine.add(rowList);
		}
		
		int rowIndex = 0;
		for (List<Integer> row : mine) {//�� �ݺ�
		    int columnIndex = 0;
		    for (int num : row) {//�� �ݺ�			        
		        if(num == 1) { // �߰� ���� �� ���� List���ٰ� �����ϴ� ��ǥ ��ġ �� ���� �� set�� ����		
		            for(int i=rowIndex-1; i<=rowIndex+1; i++) {
		                if(i >= 0 && i < mine.size()) { // ���� ��ȿ�� ���� ������ Ȯ��
		                    for(int j=columnIndex-1; j<=columnIndex+1; j++) {
		                        if(j >= 0 && j < row.size()) { // ���� ��ȿ�� ���� ������ Ȯ��
		                            List<Integer> result = new ArrayList<>();
		                            result.add(i);
		                            result.add(j);
		                            mineSet.add(result); 
		                        }
		                    }
		                }
		            }
		            System.out.println(mineSet); // ���� mineSet ��� 
		        }

		        columnIndex++;
		    }

		    rowIndex++;
		}
		answer = cnt-mineSet.size();
		System.out.println(answer);
	}
}
