package feb22.Demo;

public class Demo {
    public int addition(int a , int b ){
        return a+b;
    }
    public int addition(int a , int b , int c ){
        return a+b+c;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.addition(12, 12));
        System.out.println(demo.addition(12, 12, 12));
    }
}
