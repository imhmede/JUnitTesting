import java.util.*;

//Saul Marmolejo
//4-21-2023
//Programming Assignment 11

public class Elements {

    public void getFirstAndLast(int[] data){
        System.out.println("[First Element, Last Element]");
        System.out.println("[" + data[0] + "," + data[data.length-1] + "]");
    }

    public void getEvenElementsIndex(int[] data){
        System.out.println("Elements at an even index");

        for (int i = 0; i < data.length; i++){
            //Check if i is even
            if (i%2 == 0){
                System.out.print(data[i] + " ");
            }
        }
    }

    public void getEvenElementsValues(int[] data){
        System.out.println("Even elements");

        for (int i = 0; i < data.length; i++){
            //Check if value in array is even
            if (data[i] % 2 == 0){
                System.out.print(data[i] + " ");
            }
        }
    }
    public void getReverseElements(int[] data){
        System.out.println("All elements in reverse order");

        for (int i = data.length-1; i >= 0; i--){
            System.out.print(data[i] + " ");
        }
        
        
    }
    public static void main(String[] args){

        Elements element = new Elements();
        Random rand = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
        }

        System.out.println("Array with random number");

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        element.getEvenElementsIndex(arr);
        System.out.println(" ");
        element.getEvenElementsValues(arr);
        System.out.println(" ");
        element.getReverseElements(arr);
        System.out.println(" ");
        element.getFirstAndLast(arr);

    }
}
