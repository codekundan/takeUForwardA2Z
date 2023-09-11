public class CountDigitsDivdingNumber {
    public static int countDigits(int n){
        int num = n;
        int result = 0;
        while(num > 0) {
            if((num%10 != 0) &&  n%(num%10)==0) result++;
            num/=10;
        }
        return result;
    }
}
