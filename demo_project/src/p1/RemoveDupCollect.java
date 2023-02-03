package p1;

import java.util.LinkedHashSet;

class RemoveDupCollect   
{   
    static void removeDuplicates(String str)   
    {     
        LinkedHashSet<Character> set = new LinkedHashSet<>();   
        for(int i=0;i<str.length();i++)   
            set.add(str.charAt(i));   
            
        for(Character ch : set)   
            System.out.print(ch);   
    }   
        
    public static void main(String args[])   
    {   
        String str = "Hello Good Morning";   
        removeDuplicates(str);   
    }   
}  
