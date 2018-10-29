/**
 * recursive test
 */
public class Test {

    public static int recursive(int target){
        int data = 0;

        for(int i = 0 ; i < target ; i++){
             data += i;
            if(i == 4){
               break;
            }
        }

        return data;
    }
    public static void main(String[] args){
        //System.out.println("hello world");

        int i = 5;

        //int result = recursive(i);

        Stream<String> listStream = strList.stream();
        Stream<String> arrayStream = Arrays.stream(strArr);

        listStream.sorted().forEach(System.out::println);
        arrayStream.sorted().forEach(System.out::println);

        //System.out.println("result : " + i);
    }
}
