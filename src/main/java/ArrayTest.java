import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0;
        while(i<10){
            arr[i] = i+1;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
