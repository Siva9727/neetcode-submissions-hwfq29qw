class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

		for (int r = 0; r < 9; r++) {
			for (int c = 0; c < 9; c++) {
				// first skip the . values or empty box

				if(board[r][c] == '.') continue;

				String rowKey = "col"+r+board[r][c];
				String colKey = "row"+c+board[r][c];
				String boxKey = "col"+(r/3)+(c/3)+board[r][c];

				if(!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey) ){
					return false;
				}

			}
		}
		
		return true;
    }
}
