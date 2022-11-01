package cj.day8;

public class StringExampleThree {
    public static void main(String[] args) {

            String names = "Krish, Manoj,Charan , Kiran,Jayesh";
            String[] arr = names.split(",");
            for(String name:arr){
                System.out.println(name.trim().substring(0,3).toUpperCase());
            }
    }

    private static void printSubstrings(String str, int k){

    }
    /*
        str = "krishna"
        int k = 3;
        output:
           kri
           ris
           ish
           shn
           hna
        int k = 4;
        output:
           kris
           rish
           ishn
           shna
     */

}
