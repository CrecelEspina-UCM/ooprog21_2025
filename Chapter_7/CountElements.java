public class CountElements{
public static int CountElements(int[] arr) {
        int count = 0;
        int runningSum = arr[0]; 
        int n = 1;                

        for (int i = 1; i < arr.length; i++) {
            double avg = (double) runningSum / n;

            if (arr[i] > avg) {
                count++;
            }

            runningSum += arr[i];
            n++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(CountElements(responseTimes)); 
    }
}
