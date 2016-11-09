/**
 * Created by ScorpionOrange on 2016/11/09.
 */
public class SQRTByNewton {
    public static void main(String[] args){
        System.out.println(new Solution().SQRTByNewton(2, 0.0000001));
        System.out.println(Math.sqrt(2));
    }
}

class Solution{
    public double SQRTByNewton(int root, double precision){
        double result = 0.5 * (1.0 + root / 1.0);
        double difference = Math.abs(root - result * result);
        while (difference > precision){
            // Testing print
            // System.out.println("difference = " + difference + ", result = " + result);
            result = 0.5 * (result + root / result);
            difference = Math.abs(root - result * result);
        }
        return result;
    }
}
