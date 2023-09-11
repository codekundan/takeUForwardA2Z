public class ReverseTheBits {
    public static long reverseBits(long n) {
        long result = 0;
        for(int i=0; i<32; i++) {
            result <<= 1;
            result |= (n & 1); // (n & 1) gives the lsb bit of n
            n >>= 1; // n >> 1 right shifts n and again we use (n & 1) for new lsb.

        }
        return result;
    }
}
