import java.util.*;

public class ArrayMedian {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of first array : ");
        int m=scanner.nextInt();
        double a1[]=new double[m];

        for (int i = 0; i < m; i++) {
            System.out.println("Enter values for first array");
            a1[i]=scanner.nextDouble();
        }

        System.out.println("Enter the size of second array : ");
        int n=scanner.nextInt();
        double a2[]=new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter values for second array");
            a2[i]=scanner.nextDouble();
        }

        double median = findMedian(a1, a2);
        System.out.println("Median is : "+median);
    }

    static double findMedian(double arr[], double arr2[]){
        double median=0.0;
        int m=arr.length;
        int n=arr2.length;
        double sort[]=new double[m+n];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
            if(arr[i] > arr2[j]){
                sort[k]=arr2[j];
                k++;
                j++;
            }
            else if(arr[i] < arr2[j]){
                sort[k]=arr[i];
                k++;
                i++;
            }
        }

        while(i < m){
            sort[k]=arr[i];
            k++;
            i++;
        }

        while(j < n){
            sort[k]=arr2[j];
            k++;
            j++;
        }

        
        calculateMedian(sort);
        for(double d : sort){
            System.out.println(String.valueOf(d));
        }
        return median;

    }

    static double calculateMedian(double[] a){
        double median = 0.0;

        if((a.length) % 2 == 0){
            int mid = a.length / 2;
            median = (a[mid] + a[mid-1])/2;
        }else{
            median = a[(a.length/2)];
        }

        return median;
    }
    
}
