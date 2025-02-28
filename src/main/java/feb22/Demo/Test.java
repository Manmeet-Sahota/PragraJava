package feb22.Demo;

public class Test {
    public String call(String name){
        return "hello"+name;
    }

    public static void main(String[] args) {
        Test test= new Test();
        System.out.println( test.call("Manmeet"));
    }
}
