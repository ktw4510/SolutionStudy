import java.util.Stack;

/**
 * 재귀 없이 반복문을 통한 타겟 넘버 문제 해결
 * AUTHOR : ktw
 * DATE : 18.10.28 SUN. 19. 56
 */
public class noRecursiveTest {

    static int resInt = 0;      //갯수
    static int insTarget = 3;   //타겟

    public static int solution(int[] numbers, int target) {
        int answer = 0;

        int start = 0;
        int end = numbers.length;
        int insData = 1;

        recursive(start, numbers);
        return  resInt;
    }

    public static void recursive(int start, int[] numbers){
        if(start < numbers.length){
            numbers[start]*=1;
            recursive(start+1, numbers);

            numbers[start]*=-1;
            recursive(start+1, numbers);
        }else{
            int sum = 0;
            for(int i = 0 ; i < numbers.length; i++){
                sum += numbers[i];

            }
            if(sum==insTarget){
                resInt++;
            }
        }
    }
    public static void main(String[] args){
        int[] data ={1,1,1,1,1};

        int returns = solution(data, insTarget);

        System.out.println(returns);
    }
}

