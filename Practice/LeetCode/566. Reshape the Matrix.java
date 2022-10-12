class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
		if (mat.length * mat[0].length != r * c) {
			return mat;
		}

		int[][] reshape = new int[r][c];

		for (int i = 0; i < r * c; i++) {
			reshape[i / c][i % c] = mat[i / mat[0].length][i % mat[0].length];
		}

		return reshape;
	}
}