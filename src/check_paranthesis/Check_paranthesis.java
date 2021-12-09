package check_paranthesis;

import java.io.*;
import java.util.*;

public class Check_paranthesis {

    public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);
         Stack<Character> stk = new Stack<>();
         String str = scn.nextLine();
         for(int i=0;i<str.length();i++){
             char ch = str.charAt(i);
             if(ch == '(' || ch == '[' || ch == '{'){
                 stk.push(ch);
             }else if(ch == ')'){
                 if(stk.size() == 0){
                     System.out.println("false");
                     return;
                 }
                 if(stk.peek() != '('){
                     System.out.println("false");
                     return;
                 }else{
                     stk.pop();
                 }
             }else if(ch == ']'){
                 if(stk.size() == 0){
                     System.out.println("false");
                     return;
                 }
                 if(stk.peek() != '['){
                     System.out.println("false");
                     return;
                 }else{
                     stk.pop();
                 }
             }else if(ch == '}'){
                 if(stk.size() == 0){
                     System.out.println("false");
                     return;
                 }
                 if(stk.peek() != '{'){
                     System.out.println("false");
                     return;
                 }else{
                     stk.pop();
                 }
             }
         }
         if(stk.size() != 0){
             System.out.println("false");
             return;
         }
         System.out.println("true");
    }
}