package Java.dsa;
public class Sudoku_solver {
    public static void main(String[] args) {
        int[][]sudoku={{5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0,},{0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};
        solver(sudoku,0,0);
    }
    static void solver(int[][]sudoku,int r,int c){
        if (r>= sudoku.length){
            printSudoku(sudoku);
            System.exit(0);
        }
        if (c>= sudoku.length){
            solver(sudoku, r+1,0);
            return;
        }
        for (int i = 1; i <= 9; i++){
            if (sudoku[r][c]==0) {
                if (isSafe(sudoku, r, c, i)) {
                    sudoku[r][c] = i;
                    solver(sudoku, r, c + 1);
                    sudoku[r][c] = 0;
                }
            }
            else {
                solver(sudoku, r, c + 1);
                return;
            }
        }
    }
    private static boolean isSafe(int[][] sudoku,int r,int c,int val) {
        for (int i = 0; i < sudoku.length ; i++) {
            if (sudoku[r][i]==val){
                return false;
            }
            if (sudoku[i][c]==val){
                return false;
            }
        }
        int row=r-(r%3);
        int col=c-(c%3);
        for (int i = row; i <row+3; i++) {
            for (int j = col; j <col+3 ; j++) {
                if (sudoku[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
    static void printSudoku(int[][] sudoku) {
        for (int[] row : sudoku) {
            for (int cell : row) {
                System.out.print(cell + "| ");
            }
            System.out.println();
        }
    }
}
