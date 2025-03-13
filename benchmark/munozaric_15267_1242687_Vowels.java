//Aric J. Munoz
//March 24 2023
//PA07

import java.io.*;
import java.util.*;
public class Vowels
{
public static void main(String[] args) {

Scanner s=new Scanner(System.in);

System.out.print("Enter a word:");

String word=s.next();

String low_word;

low_word=word.toLowerCase(); //word is converted to lower case

char vowels[]={'a','e','i','o','u','y'}; //vowels

int count,sum=0;

String nodup="";

char word_letters[]=word.toCharArray(); //string into character array

Set<Character> set = new HashSet<>();

for (char t : word_letters) {
set.add(t); //set will make sure there is no duplicate
}

for(char i:vowels) //now each vowel is compared with letters in word
{
count=0;
for(char j:set)
{
if(i==j)
{
count++; //if vowel is present then count is incremented
}
}
sum=sum+count;
}
System.out.println("The number of vowels in word "+word+" are "+sum);
}
}


