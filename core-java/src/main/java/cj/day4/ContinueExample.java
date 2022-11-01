package cj.day4;

public class ContinueExample {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= n; j++) {
                if(j % 3 == 0){
                    continue;
                }
                System.out.println(i + " " + j);
            }

        }
    }
}

