package feb22.Demo;

public class UserDemo {
//    String name ;
//    int rollNo;

    UserDemo(String name,int rollNo){
        name="Manmeet";
        rollNo=121;
    }

    public static void main(String[] args) {
        UserDemo user= new UserDemo();
        System.out.println(user.name);
        System.out.println(user.rollNo);
    }

//public int sum(int a, int b){
//    return 12+34;
//
//}
//public int sum(int a, int b, int c){
//return a+b+c;
//}
}
