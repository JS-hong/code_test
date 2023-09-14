
import java.util.ArrayList;
import java.util.List;


public class test3 {

	public static void main(String[] args) {
		String[] cards1 = {"i", "water", "drink"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		List<String> str = new ArrayList<String>();//�ֱ�
		String answer = null;
		int cards1CNT = 0;
		int cards2CNT = 0;
		//ī�带 ����Ҷ����� ���� ī��δ� �Ѿ�� ���� (�߿�)
		//���� ���࿡ �Ѵ� ������� return �� 2�� �ǹ���
		for(int i=0;str.size()<goal.length;i++) {//str�� �� ä������ ��
				if(cards1CNT < cards1.length &&goal[i].equals(cards1[cards1CNT])) {//cards1�̶� cards2 ī��Ʈ�� ������ �ؾ��ҵ�?
					str.add(cards1[cards1CNT]);
					cards1CNT++;
				}
				else if(cards2CNT < cards2.length && goal[i].equals(cards2[cards2CNT]) ) {//cardscnt
					str.add(cards2[cards2CNT]);
					cards2CNT++;
				}
				else {
					answer="No";
					break;
				}	
		}
		if(goal.length == str.size()) {
			answer="Yes";
		}
		
		System.out.println(answer);
	}
}
