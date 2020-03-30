package main;

public class TenMinWalk {
	public static boolean isValid(char[] directions) {
		int ns = 0, we = 0;
		if (directions.length == 10) {
			for (int i = 0; i < directions.length; i++) {
				switch (directions[i]) {
				case 'n':
					ns++;
					break;
				case 's':
					ns--;
					break;
				case 'w':
					we++;
					break;
				case 'e':
					we--;
					break;
				default:
					break;
				}
			}

			return ns == 0 && we == 0 ? true : false;
		}
		return false;
	}
}
