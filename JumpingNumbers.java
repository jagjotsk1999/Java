package Codes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class JumpingNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        JumpingNumbers jnumber=new JumpingNumbers();
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int a=sc.nextInt();
            jnumber.number(a);
        }
    }
    void number(int d){
        Queue<Integer> queue=new LinkedList<Integer>();
        int j=0;
        for (int i=0;i<=d;i++){
            j=i;
            int rem=j%10;
            System.out.print(rem+" ");
//            queue.add(i);
        }
        System.out.println();
//        while (!queue.isEmpty()) {
//            System.out.print(queue.remove() + " ");
//        }
//        System.out.println();
    }
}
