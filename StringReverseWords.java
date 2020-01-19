package Codes;

import java.util.Scanner;

public class StringReverseWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String output="", temp="";
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c=='.' || i==s.length()-1){
                if (i!=s.length()-1){
                    temp=c+temp;
                }
                else temp=temp+c;
                output=temp+output;
                temp="";
            }
            else temp=temp+c;
        }
        System.out.println(output);
    }
}
