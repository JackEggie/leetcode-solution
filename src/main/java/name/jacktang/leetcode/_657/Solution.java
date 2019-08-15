package name.jacktang.leetcode._657;

public class Solution {
	public boolean judgeCircle(String moves) {
		int x = 0;
		int y = 0;

		char[] move = moves.toCharArray();

		for (char m : move) {
			switch (m) {
				case 'L':
					x--;
					break;
				case 'R':
					x++;
					break;
				case 'U':
					y++;
					break;
				case 'D':
					y--;
					break;
				default:
					break;
			}
		}

		if (x == 0 && y == 0) return true;
		return false;
	}
}
