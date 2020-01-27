package cert;

public class TestCastLong1 {
	
	public static long  square(int x) {
		long y = x * (long) x;
		x = -1;
		return y;
	}

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	int value = 9;
    	
    	long result = square(value);
    	
    	System.out.println(value);        

    }

}
