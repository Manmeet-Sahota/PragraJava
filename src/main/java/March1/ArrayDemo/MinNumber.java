package March1.ArrayDemo;

public class MinNumber {
    public static void main(String[] args) {
        int[] number={10,20,332,232,322,1};
        int min=number[0];
        for (int i=1; i<number.length;i++){
            if (number[i] <min){
                min=number[i];
            }
        }
        System.out.println(min);
    }
}
