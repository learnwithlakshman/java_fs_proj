package cj.day11;

public class CommandlineArguments {

    public static void main(String[] args) {
        String empno = args[0];
        String name = args[1];
        int age = Integer.parseInt(args[2]);
        float salary = Float.parseFloat(args[3]);
        String message = String.format("Empno :%s\nName :%s\nAge :%s\nSalary :%s",empno,name,age,salary);
        System.out.println(message);
    }
}
