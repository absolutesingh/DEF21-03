package bitwise;

public class SetKthBit {
	static int setKthBit(int N, int K) {
		return (1 << K) | N;
	}
}
