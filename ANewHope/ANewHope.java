import java.util.Arrays;

public class ANewHope {
    public static int count(int[] fs, int[] ls, int d) {
        if (Arrays.equals(fs, ls)) return 1;
        int n = fs.length;
        int[] as = new int[n], bs = new int[n];
        for(int i = 0; i<n; i++) {
            as[fs[i]-1] = i;
            bs[ls[i]-1] = i;
        }
        int min = 0;
        for(int i = 0; i<n; i++) {
          min = Math.min(min, bs[i] - as[i]);
        }
        return (-min+(n-d-1))/(n-d)+1;
    }
}
