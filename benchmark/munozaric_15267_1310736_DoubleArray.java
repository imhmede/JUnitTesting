import java.util.Scanner;

public class DoubleArray{
    // define function equals
    public static boolean equals(int[] list1, int[] list2){
        // declare local variable
        boolean found;

        // first check if the each element of list1 is in the list2
        // use for loop to iterate over each element of list1
        for(int i=0; i<list1.length; i++){
            // set the value of variable found to false
            found = false;
            // use inner for to iterate over elements of list2
            for(int j=0; j<list2.length; j++){
                // if the element at index i of list1 is equal to the element at index j of list2
                if(list1[i] == list2[j]){
                    // set variable found to true
                    found = true;
                    // break the for loop
                    break;
                }
            }
            // if the element is not found in list2 i.e. found is false
            if(!found){
                // then return false
                return false;
            }
        }

        // check if the each element of list2 is in the list1
        // use for loop to iterate over each element of list2
        for(int i=0; i<list2.length; i++){
            // set the value of variable found to false
            found = false;
            // use inner for to iterate over elements of list1
            for(int j=0; j<list1.length; j++){
                // if the element at index i of list2 is equal to the element at index j of list1
                if(list2[i] == list1[j]){
                    // set variable found to true
                    found = true;
                    // break the for loop
                    break;
                }
            }
            // if the element is not found in list1 i.e. found is false
            if(!found){
                // then return false
                return false;
            }
        }
      
        // otherwise, i.e. all element of both lists are same then return true
        return true;
    }

    public static void main(String[] args) {
        // create an object of Scanner class
        Scanner scan = new Scanner(System.in);
        // declare variables
        boolean result;
        int sizeList1, sizeList2;

        // prompt to enter the size and content of the list 1
        System.out.print("First Array: ");
        // read the input and assign to variable sizeList1
        sizeList1 = scan.nextInt();
        // create an integer array of given size
        int[] list1 = new int[sizeList1];
        // use for loop to read content of list 1
        for(int i=0; i<sizeList1; i++){
            // read the number and assign to list1 element at index i
            list1[i] = scan.nextInt();
        }

        // prompt to enter the size and content of the list 2
        System.out.print("Second Array: ");
        // read the input and assign to variable sizeList2
        sizeList2 = scan.nextInt();
        // create an integer array of given size
        int[] list2 = new int[sizeList2];
        // use for loop to read content of list 2
        for(int i=0; i<sizeList2; i++){
            // read the number and assign to list2 element at index i
            list2[i] = scan.nextInt();
        }

        // call the function equals and assign the result of variable result
        result = equals(list1, list2);
        // if the result is true
        if(result){
            // print the message
            System.out.println("The two arrays have the same elements in order");
        }
        // otherwise, i.e. result is false
        else{
            // print the message
            System.out.println("The two arrays do not have the same elements in order");
        }
        // close the scanner
        scan.close();
    }
}
