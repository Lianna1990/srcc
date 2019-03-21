import java.util.Arrays;;

public class HWTask2 {
    public int[] getPartOfArray(int[] arr) throws RuntimeException {
        if (arr.length == 0) {
            throw new NullPointerException ();
        }

        int lastIndexOf4 = -1;
        for (int i = 0; i < arr.length; i++) if (arr[i] == 4) lastIndexOf4 = i + 1;

        if (lastIndexOf4 == -1) throw new RuntimeException ();
        else return Arrays.copyOfRange (arr, lastIndexOf4, arr.length);
    }


}



