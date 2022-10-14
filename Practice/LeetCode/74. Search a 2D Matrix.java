class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

		int rows = matrix.length;
		int columns = matrix[0].length;

		for (int i = 0; i < rows; i++) {
			if (target <= matrix[i][columns - 1]) {
				for (int j = 0; j < columns; j++) {
					if (matrix[i][j] == target) {
						return true;
					}
				}
				return false;
			}
		}
		return false;
	}
}