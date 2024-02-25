package InterStudent.SupplierDemo;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        int[] arr ={19,52,45,65,78,97,12,36,45};
        int maxValue=getMax(()->{
            int max = arr[0];
            for(int i=1;i< arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }

    private static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
