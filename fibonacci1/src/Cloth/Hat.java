package Cloth;

public class Hat {
    public static void main(String[] args){
        int n=10;
        int first=0;
        int second=1;

        System.out.println("First Fibonacci Sequence Number upto:"+n);

        for(int i=0;i<n;i++){
            System.out.println(first+" ");
            first=first+second;
            int next=first+second;
            second=second+next;

        }
    }
}
