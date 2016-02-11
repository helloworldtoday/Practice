public class Basic {
	public double calculate(char ch, double v1, double v2) {
		double answer = 0;
		if (ch == '+') {
			answer = v1 + v2;
		} else if (ch == '-') {
			answer = v1 - v2;
		} else if (ch == 'x') {
			answer = v1 * v2;
		} else if (ch == '/') {
			answer = v1 / v2;
		} else if (ch == '%') {
			answer = v1 % v2;
		}
		return answer;
	}
}
