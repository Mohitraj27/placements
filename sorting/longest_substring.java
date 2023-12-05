/*
 Longest Substring without repeating characters 
  
 I/p s="abcabcbb"
 O/p 3

 
 */

import java.util.HashMap;
import java.util.Map;
import java.util.*;
class longest_substring
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter String");
            String s=sc.nextLine();
            substring(s);
    }
    public static void  substring(String s){
        Map<Character, Integer> map=new HashMap<>();
                 
        int start=0,len=0;
        for(int end=0;end<s.length();end++){
           char c=s.charAt(end);
           if(map.containsKey(c)){
            if(start<=map.get(c)){
                start=map.get(c)+1;
            }
           }
           len=Math.max(len,end-start+1);
           map.put(c,end);
        }
        System.out.println(len);
    }
}