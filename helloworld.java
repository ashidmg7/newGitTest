import java.util.Scanner;
import java.util.Scanner;
import java.lang.Math;
public class array_size_calc{
    private static double average(int[] array, int sum){
        if(array.length!=0){
            int num = array.length;
            double average = (double)(sum/num);
            return average;
        }
        else{
            double average =0;
            return average;
        }
    }
    private static int even(int [] array){
        int i=0;
        int even=0;
        
        for(i=0;i<array.length;i++){
            if(array [i]%2 ==0){
                even+=array[i];
            }
        }
        return even;
    }
    private static int min(int [] array){
        if(array.length!=0){
            int min=array[0];
            int i=0;
            for(i=0;i<array.length;i++){
                if(min>=array[i]){
                    min=array[i];
                }
            }
            return min;
        }
        else{
            int min=0;
            return min;
        }
    }
        private static int max(int [] array){
        if(array.length!=0){
            int max=Integer.MIN_VALUE;
            int i=0;
            for(i=0;i<array.length;i++){
                if(max<=array[i]){
                    max=array[i];
                }
            }
            return max;
        }
        else{
            int max=0;
            return max;
        }
    }
    private static int sum(int [] array){
        int sum=0;
        int i=0;
        for(i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
        private static void print(int [] array){
        if(array.length!=0){
            int i=0;
            for(i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
                if(i%10==9){
                    System.out.print("\n");
                }
            }
        }
        else{
            return;
        }
    }
    private static void random(int [] array){
        int i=0;
        for(i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100)+1;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int size=0;
        boolean loop=true, loop1=true;
        while(loop==true){
            System.out.print("Please enter an array sizs: ");
            size=scan.nextInt();
            if(size>0){
                int[] array = new int[size];
                random(array);
                print(array);
                int sum = sum(array);
                int min = min(array);
                int max = max(array);
                int even = even(array);
                double average = average(array,sum);
                System.out.print("\n Sum: "+sum);
                System.out.print("\n Min: "+min);
                System.out.print("\n Max: "+max);
                System.out.print("\n Even: "+even);
                System.out.print("\n Average: "+average);
            }
            else{
                System.out.print("\nInvalid");
            }
            loop1=true;
            while(loop1==true){
                String quit;
                System.out.print("\nWould you like to continue?(type y or n): ");
                quit=scan1.nextLine();
                if(quit.charAt(0)=='y'){
                    loop1=false;
                }
                else if(quit.charAt(0)=='n'){
                    loop=false;
                    loop1=false;
                }
                else {
                    System.out.print("\nInvalid");
                }
                }
            }
        System.out.print("\nGoodbye");
        }
}

    