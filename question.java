// Java program to merge two sorted arrays 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class MergeTwoSorted 
{ 
    // Description: 
    //     You are completing a part of a larger project. Specifically, 
    //     a function to be used by other parts of the project. 
    //     You are prvovided with function headers, parameters, and other requirements
    //     as shown below.
    //     After completiong, you need to submit your code as a pull request.
    //     You will then receive reviews from reviwer about potential changes you 
    //     need to make. You should keep communicating with your reviwer untill they approve
    //     your code.
    //
    // Communication with reviewer 1:
    //     You will create the pull request through GitHub, but you should communicate on 
    //     Slack with the Qreview App. You should use Qreview to document important parts of 
    //     your discussion and progress. E.g. comments, request changes, etc.
    //
    // Communication with reviewer 2:
    //     You will create the initial pull request through GitHub. The following discussion should be 
    //     mostly completed via GitHub pull request interface. In the mean time, you can use
    //     Slack to ask for code or parts you don't understand. But please still document major parts 
    //     of your discussion on GitHub pull request interface.
    //
    // Timing:
    // The purpose of this test is to compare the communication cost of the two approaches 
    // instead of your ability to code. Therefore, you will be provided with a timer with "lap"
    // function. When you start your communication with your reviewer, start the timer; when you are done
    // communicating, lap the timer and preess pause. You will then implement any changes requested by the reviewer.
    // Then, when you resume communication with the reviwer, start the timer as a different "lap". 
    //
    // TODO: 
    //     Merge two sorted arrays.
    //     arr1 and arr2 are two sorted arrays and are passed in as parameters.
    //     Merge arr1[0..n1-1] and arr2[0..n2-1] and return a sorted array [0..n1+n2-1] 
    public static int[] mergeArrays(int[] arr1, int[] arr2) 
    { 
        int len = arr1.length + arr2.length;
        int[] arr3 = new int[len];

        i1 = 0;
        i2 = 0;
        while (i1 + i2 < len) {
            if (i1 == arr1.length) {
                arr3[i1 + i2] = arr2[i2];
            } else if (i2 == arr2.length) {
                arr3[i1 + i2] = arr1[i1];
            } else if (arr1[i1] < arr2[i2]) {
                arr3[i1 + i2] = arr1[i1];
                i1++;
            } else {
                arr3[i1 + i2] = arr2[i2];
                i2++;
            }
        }

        return arr3;
    } 
      
    public static void main (String[] args)  
    { 
        int[] arr1 = {1, 3, 5, 7}; 
        int[] arr2 = {2, 4, 6, 8}; 
          
        int[] arr3 = mergeArrays(arr1, arr2); 
      
        System.out.println("Array after merging"); 
        for (int i=0; i < arr3.length; i++) 
            System.out.print(arr3[i] + " "); 
    } 
} 
  
/* This code is contributed by Mr. Somesh Awasthi */
