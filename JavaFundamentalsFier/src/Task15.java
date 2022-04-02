import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int[] arr = new int[10];

        //mbushim tabelen me 10 numra te vendosur nga perdoruesi
        for (int i=0; i < arr.length; i++){
            arr[i]=sk.nextInt();
        }

        //kemi dy for loops ne menyre qe cdo numer ta kontrollojme me cdo numer tjeter pasardhes ne array
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
}
