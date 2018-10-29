/**
 * 주어진 number의 배열 숫자를 통해 +,- 를 활용하여 타겟과 일치하게 한다.
 * 타겟 넘버 문제
 * DATE : 18.10.28
 * AUTHOR : KTW
 *
 *
 * 1. 배열 사이즈 만큼 배치 시킨다.(+, - 연산, 재귀함수 사용)
 * 2. 배치된 배열을 바탕으로 합을 구한다.
 * 3. 구한 합이 타겟과 일치할 경우 카운트+1 을 하여 최종 갯수를 구한다.
 */
public class Main {
    static int resInt = 0;      //갯수
    static int insTarget = 3;   //타겟

    public static int solution(int[] numbers, int target) {
        int answer = 0;

        //시작
        int start = 0;
        int insData = 1;

        recursivePlus(start, numbers.length, insData, numbers);
        return resInt;
    }

    /**
     * 재귀 함수
     * @param start
     * @param end
     * @param insData
     * @param numbers
     */
    public static void recursivePlus(int start, int end, int insData, int[] numbers){
        if(start < end){//배열 마지막 번째 까지 1, -1를 배치시킨다.
            numbers[start] = numbers[start] * insData;
            recursivePlus(start+1, end, insData, numbers);

            numbers[start] = numbers[start] * insData * -1;
            recursivePlus(start+1, end, insData, numbers);
        }

        else{//배치된 숫자들을 더하여 최종 결과값이 타겟값과 일치할 경우 카운트를 센다.
            int result = 0;
            for(int i = 0 ; i < numbers.length; i++){
                result += numbers[i];
                //System.out.println(result);

            }
            if(result == insTarget){
                resInt++;
            }
        }

    }

    public static void main(String[] args){
        int[] data ={1,1,1,1,1};

        if(data.length < 2 || data.length > 20) return;

        if(insTarget < 1 || insTarget > 1000) return;

        int returns = solution(data, insTarget);

        System.out.println(returns);
    }
}