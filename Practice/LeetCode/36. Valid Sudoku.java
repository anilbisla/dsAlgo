class Solution {
    public boolean isValidSudoku(char[][] board) {
		Set<String> present = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char curr = board[i][j];
				if (curr != '.') {
					if (!present.add(curr + " in row " + i) || 
						!present.add(curr + " in column " + j) || 
						!present.add(curr + " in box " + i / 3 + "," + j / 3)) {
						return false;
					}
				}
			}
		}
		return true;
	}
}