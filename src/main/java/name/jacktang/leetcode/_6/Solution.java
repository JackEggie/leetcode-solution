package name.jacktang.leetcode._6;

public class Solution {
	public String convert(String s, int numRows) {
		if (s.length() <= 2 || numRows <= 1) {
			return s;
		}

		int unit = numRows * 2 - 2;
		int numCols = s.length() / unit * (numRows - 1) + ((s.length() % unit) <= numRows ? 1 : (s.length() % unit - (numRows - 1)));
		char[][] mat = new char[numRows][numCols];
		int row = 0;
		int col = 0;
		for (int i = 0; i < s.length(); i++) {
			mat[row][col] = s.charAt(i);
			if ((i + 1) % unit < numRows && (i + 1) % unit != 0) {
				row++;
			} else {
				row--;
				col++;
			}
		}
		String ret = "";
		for (int r = 0; r < numRows; r++) {
			for (int c = 0; c < numCols; c++) {
				if (mat[r][c] != 0) {
					ret += mat[r][c];
				}
			}
		}
		return ret;
	}
}
