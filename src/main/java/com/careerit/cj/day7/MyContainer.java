package com.careerit.cj.day7;

import java.util.Scanner;

public class MyContainer {

    private String[] arr = new String[3];
    int count = 0;

    public void add(String ele) {
        if(count >= arr.length) {
            String[] temp = new String[arr.length + 3];
            System.arraycopy(arr,0,temp,0,arr.length);
            arr = temp;
        }
        arr[count++] = ele;

    }

    public void remove(int index) {

    }

    public void showElements() {
        if (count == 0) {
            System.out.println("Array is empty! you don't have any elements to show");
        }else{
            for(int i=0;i<count;i++){
                System.out.println(arr[i]);
            }
        }
    }

    public int search(String name) {
        return -1;
    }

    public String getElement(int index) {
        return null;
    }

    public void set(int index,String value){

    }

    public static void main(String[] args) {
        MyContainer obj = new MyContainer();
        while (true){
            System.out.println("-".repeat(100));
            System.out.println("1.Add 2.Remove 3.Show 4. Search 5.Get 6.Replace 7.Exit");
            System.out.println("-".repeat(100));
            System.out.println("Enter your choice :");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch){
                case 1:
                    System.out.println("Enter the name to add: ");
                    String userInputName = sc.nextLine();
                    obj.add(userInputName);
                    break;
                case 3:
                    obj.showElements();
                    break;
                case 7:
                    System.out.println("Thank you see you");
                    System.exit(0);
            }
        }
    }
}
