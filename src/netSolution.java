import java.util.Scanner;

public class netSolution {

    static int result = 0;

    public static int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[][] visited = new boolean[3][3];

        for(int i = 0 ;i <computers.length ; i++){
            for(int j = 0 ; j < computers[i].length ; j++){
                //visited = new boolean[i][j];
                visited[i][j] = false;
            }
        }

        for(int i = 0 ;i <computers.length ; i++){
            for(int j = 0 ; j < computers[i].length ; j++){
                if(i == j) continue;

                if(visited[i][j] == false && computers[i][j] == 1){
                    result++;
                    visited[i][j] = true;
                }else if(visited[i][j] == true) continue;

            }
        }
        return result;
    }

    public static void main(String[] args){
        int[][] data ={{1,1,0},
                       {1,1,0},
                       {0,0,1}
                       };
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int total = solution(n, data);

        System.out.println(total);
    }

}
