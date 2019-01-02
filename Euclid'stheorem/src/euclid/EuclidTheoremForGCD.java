package euclid;

public class EuclidTheoremForGCD {
	public static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			int C=1;
			int A=a;
			int B=b;
			while(B!=0) {
				C=A%B;
				A=B;
				B=C;
			}
			return A;
		}
	}
}
