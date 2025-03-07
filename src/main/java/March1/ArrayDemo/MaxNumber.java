package March1.ArrayDemo;

public class MaxNumber {
    public static void main(String[] args) {
        int [] number= {12,2,65,323,4334,43,23,32};

        int max=number[0];

        for (int i=1;i<number.length;i++){
            if (number[i]>max){
                max=number[i];
            }
        }
        System.out.println(max);
    }
}
