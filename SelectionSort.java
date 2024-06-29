import java.util.*;

public class SelectionSort {
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size");
        int m=scanner.nextInt();
        int array[]=new int[m];
        int sort[]=new int[m];

        for (int i=0;i<m;i++){
            array[i]=scanner.nextInt();

        }
        int i=0;
        int[] arr;
        int[] minMax;
        while(i<m){
            arr = getSubarray(array, i, m+1);
            System.out.println("The subarray for "+i+" loop is "+arr.toString());
            minMax = getMinimum(arr);
            System.out.println("The minimun is "+minMax[0]+" and the index is "+minMax[1]);

            

        }


        
    }

    static int[] getMinimum(int[] arr){
        int min=1000000000;
        int returnArr[]=new int[2];
        int index=0;

        for(int i=0;i < arr.length; i++){
            if(min< arr[i]){
                min=arr[i];
                index=i;
            }else
                continue;
            
        }
         returnArr[0]=min;
         returnArr[1]=index;
        return returnArr;
    }

    static void swap(int arr[],int m, int n){
        int temp;
        temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }

    static int[] getSubarray(int arr[], int start, int end){
        return Arrays.copyOfRange(arr, start, end+1);
    }
    
}
