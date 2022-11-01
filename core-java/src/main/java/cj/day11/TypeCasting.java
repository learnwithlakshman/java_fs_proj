package cj.day11;

public class TypeCasting {
    public static void main(String[] args) {

        int a = 5;
        float b = a;

        float c = 4.5f;
        int d = (int) c;


        float price = 97.06f;
        int amount = (int) price;

        String priceStr = "97.89f";
        float p = Float.parseFloat(priceStr);
        System.out.println(p);

        String data = "EMP1002-Krish-23-45000.50";
        //empno,ename,age,salary
        String[] arr = data.split("-");
        String empno = arr[0];
        String name = arr[1];
        int age = Integer.parseInt(arr[2]);
        float salary = Float.parseFloat(arr[3]);
        String message = String.format("Empno :%s\nName :%s\nAge :%s\nSalary :%s",empno,name,age,salary);
        System.out.println(message);

    }
}
