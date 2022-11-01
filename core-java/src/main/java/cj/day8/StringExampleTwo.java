package cj.day8;

public class StringExampleTwo {
    public static void main(String[] args) {

        String name = "LIRIL";
        System.out.println(name.length());
        System.out.println(name.charAt(0));

        for(int i = 0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
        for(int i=name.length()-1;i>=0;i--){
            System.out.println(name.charAt(i));
        }



    }
}
