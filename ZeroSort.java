// to write a program to sort all the zero in the end without using external array

public class ZeroSort {
    public static void main(String args[]) {

        int [] arr = {1,2,3,4,5,6,0,8,0,8,0,4};
        zeroSort(arr);
    }

    public static void zeroSort(int [] array){
        for(int i = 0 ; i < array.length ; i ++){
            if(array[i]==0){
                int j = findnZ(i , array);

            if(j < array.length){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp ;
        

                     }
                 }
            }

            for (int x = 0 ; x < array.length ; x++){
                System.out.println(array[x] + " ");

            }
        }

        public static int findnZ(int i , int [] array){
             while (i < array.length && array[i] ==0 ){

                            i++ ;
                 }
                 return i ;
        }
    }
