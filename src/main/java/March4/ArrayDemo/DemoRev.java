package March4.ArrayDemo;

public class DemoRev {

    public static void main(String[] args) {
        String name="Pragra";
        String reserved="";

        for (int i=name.length()-1;i>=0;i--){
           reserved+= name.charAt(i);
        }
        System.out.println("anything");
        System.out.println(reserved);
    }
}
