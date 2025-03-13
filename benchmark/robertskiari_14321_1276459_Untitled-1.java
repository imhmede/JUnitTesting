
    StringRecursiveReversal.java

public class StringRecursiveReversal {

static String reverse1 = "";

public static String reverse(String str){

if(str.length() == 1){
return str;
} else {
reverse1 += str.charAt(str.length()-1)
+reverse(str.substring(0,str.length()-1));
return reverse1;
}
}

public static void main(String a[]){
StringRecursiveReversal srr = new StringRecursiveReversal();
System.out.println("Result: "+srr.reverse("flow"));
}
}


}
