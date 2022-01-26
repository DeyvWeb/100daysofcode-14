

// import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;

// public class HarryEx7 {
//     public static void main(String[] args)
//     {
// // Question 1. Create an array of 5 floats and calculate their sum.

//     //     Scanner sc = new Scanner(System.in);
//     //     System.out.print("Enter the number of array you want to print : ");
//     //     int n;
//     //     n = sc.nextInt();
//     //     int[] arr = new int[n];
//     //     System.out.print("Enter array elements: ");
//     //    int sum = 0;
//     //     for(int i =0; i<arr.length; i++)
//     //     {
      
//     //         arr[i] = sc.nextInt();
//     //         System.out.print(arr[i] + " ");
            
//     //         sum = sum + arr[i];
//     //     }
//     //     System.out.println("Sum of the array elements is : " + sum);
        
// // Question 2. Write a program to find out whether a given integer is present in an array or not.

// // Scanner sc = new Scanner(System.in);
// // System.out.print("Enter the number of elements you want to be present to print: ");
// // int n;
// // n = sc.nextInt();
// // int[] arr = new int[n];


// // for(int i=0; i<arr.length; i++)
// // {
// //     System.out.print("Enter the elements: ");
// //     arr[i] = sc.nextInt();
// //     System.out.print(arr[i] + " ");
    
// // }
// // int element;
// // element = sc.nextInt();
// // System.out.print("Enter the element which you want to cross check ");

// // boolean isPresent = false;
// // if(arr[n]==element){
// //     isPresent = true;
// // }
// // if(isPresent){
// //     System.out.println("The value is present in the array");
// // }
// // else{
// //     System.out.println("The value is not present in the array");
// // }


// // Question 3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.


// // Scanner sc = new Scanner(System.in);
// // System.out.print("Enter the number of elements you want to be present to print: ");
// // int n;
// // n = sc.nextInt();
// // int[] marks = new int[n];
// // System.out.print("Enter the elements : ");

// // for(int element: marks)
// // {

// //     element = sc.nextInt();
// //     int sum = 0;
// //     System.out.print(element);
// //     sum = sum + element;
// //     System.out.print(sum);
// //     int avg = (sum / n);
// //     System.out.print(avg);
    
// // }

// // Question 4. Create a Java program to add two matrices of size 2x3.
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows : ");
//         int r;
//         r = sc.nextInt();
//         System.out.print("Enter number of columns : ");
//         int c;
//         c = sc.nextInt();

//         int[][] arr = new int[r][c];
            
//         for(int i = 0; i< arr.length; i++)
//         {
//             for(int j=0; j < arr[i].length; j++)
//             {
//                 System.out.print("Enter the elements in array : ");
//                 arr[i][j] = sc.nextInt();
//                 System.out.print(arr[i][j]);
//                 System.out.print(" ");
//             }
//             System.out.print(" ");

//         }



// // Question 5. Write a Java program to reverse an array.

//     // Scanner sc = new Scanner(System.in);
//     //     System.out.print("Enter the number of array you want to print : ");
//     //     int n;
//     //     n = sc.nextInt();

//     //     int[] arr = new int[n];
//     //     System.out.print("Enter array elements: ");        
//     //     for(int i = 0; i<=arr.length; i++)
//     //     {
//     //         arr[i] = sc.nextInt();   
//     //     }
//     //     System.out.print("Reverse of an array element: ");
//     //     for(int i =arr.length-1; i>=0; i-- )
//     //         {
             
//     //     System.out.print(arr[i]);
            
//     //     }
//     //     sc.close();
        

// // Question 6. Write a Java program to find the maximum element in an array.

//   //Initialize array  
//   int [] arr = new int [] {25, 11, 7, 75, 56};  
//   //Initialize max with first element of array.  
//   int max = arr[0];  
//   //Loop through the array  
//   for (int i = 0; i < arr.length; i++) {  
//       //Compare elements of array with max  
//      if(arr[i] > max)  
//          max = arr[i];  
//   }  
//   System.out.println("Largest element present in given array: " + max);  

// // Question 7. Write a Java program to find the minimum element in a Java array.
//   //Initialize array  
//   int [] arr = new int [] {25, 11, 7, 75, 56};  
//   //Initialize min with first element of array.  
//   int min = arr[0];  
//   //Loop through the array  
//   for (int i = 0; i < arr.length; i++) {  
//       //Compare elements of array with min  
//      if(arr[i] <min)  
//          min = arr[i];  
//   }  
//   System.out.println("Smallest element present in given array: " + min);  

// // Question 8. Write a Java program to find whether an array is sorted or not.

// public static boolean isSorted(int[] a)
// {
//     // base case
//     if (a == null || a.length <= 1) {
//         return true;
//     }

//     for (int i = 0; i < a.length - 1; i++)
//     {
//         if (a[i] > a[i + 1]) {
//             return false;
//         }
//     }

//     return true;
// }

// public static void main(String[] args)
// {
//     int[] a = { 1, 2, 3, 4, 5 };
//     System.out.println(isSorted(a));        // true
// }

//     }
    
// }
