import java.util.*;

public class ReverseSumLinkedList {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        

        int n=scanner.nextInt();

        LinkedList<Integer> ll=new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
                System.out.println("Enter value of the digit for first linked list : ");
                int value= scanner.nextInt();
                ll.add(value);
        }

        LinkedList<Integer> ll2=new LinkedList<Integer>();
        System.out.println("Enter the number of elements for second ll : ");
        int n2=scanner.nextInt();

        for (int i = 0; i < n2; i++) {
                System.out.println("Enter value of the digit for for second linked list : ");
                int value= scanner.nextInt();
                ll2.add(value);
        }

        int sum1=linkedListSum(ll);
        int sum2=linkedListSum(ll2);

        System.out.println("Total sum of LinkedLists is : "+(sum1+sum2));




    }

    static int linkedListSum(LinkedList<Integer> ll){
        int sum=0;
        int exp=1;
        for (int i = 0; i < ll.size(); i++) {
            int temp = ll.get(i);
            double power= ll.size() - exp;
            double base = Math.pow(10.0, power);
            int intBase= (int) base;
            int add= temp*intBase;
            sum=sum+add;
            exp++;

        }

        return sum;
    }
    
}
