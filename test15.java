import java.util.*;

public class test15 {//그래프 위상정렬
    public static void main(String[] args) {
        //n명의 권투 선수 권투대회
        int n = 5;
        int[][] results = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}}; 
        List<List<Integer>> graph = new ArrayList<>();
        
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] result : results) {
            int winner = result[0];
            int loser = result[1];
            graph.get(winner).add(loser);
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (isDeterminedRank(graph, n, i)) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    //순위 탐색
    private static boolean isDeterminedRank(List<List<Integer>> graph, int n, int player) {
        
        return true;
    }
}
