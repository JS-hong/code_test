import java.util.*;

public class test14 {
    //거스름돈
    public static void main(String[] args) {
        int n = 5;//잔금
        int[] money = {1,2,5};//돈    
        Set<List<Integer>> mSet = new HashSet<>(); // 중복 제거용 HashSet
        calculateChange(money, n, new ArrayList<>(), mSet);//재귀함수?
        for (List<Integer> change : mSet) {
            System.out.println(change);
        }
    }
    private static void calculateChange(int[] money, int remainingAmount,
            List<Integer> currentChange, Set<List<Integer>> changeSet) {
            //결국 결과값을 mset에 넣고 반복문 돌리는게 핵심일듯
            if (remainingAmount == 0) {
                List<Integer> sortedChange = new ArrayList<>(currentChange);
                sortedChange.sort(null); // 리스트 정렬
                changeSet.add(sortedChange);
                return;
            }
    
            if (remainingAmount < 0) {
                return;
            }
            for (int i = 0; i < money.length; i++) {
                currentChange.add(money[i]);
                calculateChange(money, remainingAmount - money[i], currentChange, changeSet);
                currentChange.remove(currentChange.size() - 1);
            }
    }
}
