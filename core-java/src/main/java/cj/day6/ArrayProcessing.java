package cj.day6;

public class ArrayProcessing {
    public static void main(String[] args) {

        String[] names = new String[]{"Sai", "Ramana", "Naresh", "Babu", "Madhavi"};

        System.out.println("Using for loop");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        // Get last 3 names only
        System.out.println("Last 3 names");
        for (int i = names.length - 3; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("First 3 names");
        for (int i = 0; i <= 2; i++) {
            System.out.println(names[i]);
        }
        System.out.println("For each loop");

        for(String name:names){
            System.out.println(name);
        }
    }
}
