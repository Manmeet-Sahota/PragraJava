package March4.ArrayDemo;

public class Demo {

    public static void main(String[] args) {
        int [][] arr= new int[2][2];
        arr[0][0]=12;
        arr[0][1]=23;
        arr[1][0]=21;
        arr[1][1]=32;


        for(int[] elements:arr){
            for (int list:elements){
                System.out.println(list);
            }
        }

    }
}
