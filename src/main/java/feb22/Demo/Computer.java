package feb22.Demo;

public class Computer {
    int memory;
    String brand;

    public void test(){
        System.out.println(memory);
    }
    public void test1(){
        System.out.println(brand);
    }

     Computer(){
      brand="Dell";
      memory=256;

     }
    public static void main(String args[]){
        Computer computer= new Computer();
        computer.test();
        computer.test1();
    }
}
