package game_connect_four;

public class Grid {
    private int rows;
    private int columns;
    private int[][] grid;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        initGrid();
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int[][] getGrid() {
        return grid;
    }
    public void initGrid() {
        this.grid = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j = 0; j< columns; j++){
                this.grid[i][j] = GridFilling.EMPTY.ordinal();
            }
        }
    }

    public int placePiece(int column, GridFilling piece){
        if(column < 0 || column > this.columns){
            throw new Error("Invalid column");
        }
        if(piece == GridFilling.EMPTY){
            throw new Error("Invalid piece");
        }
        // Place piece in the lowest empty row
        for(int row = this.rows - 1; row>=0; row--){
            if(this.grid[row][column] == GridFilling.YELLOW.ordinal()){
                this.grid[row][column] = piece.ordinal();
                return row;
            }
        }
        return -1;
    }

    public boolean checkNConnectForWin(int connectN, int row, int col, GridFilling piece){
        // Horizontal check
        int count = 0;
        for(int c=0; c<this.columns; c++){
            if(this.grid[row][c] == piece.ordinal()){
                count++;
            }else{
                count = 0;
            }
            if(count == connectN){
                return true;
            }
        }

        // Vertical check
        count = 0;
        for(int r=0; r<this.rows; r++){
            if(this.grid[r][col] == piece.ordinal()){
                count++;
            }else{
                count = 0;
            }
            if(count == connectN){
                return true;
            }
        }
        // Check diagonal
        count = 0;
        for (int r = 0; r < this.rows; r++) {
            int c = row + col - r; // row + col = r + c, for a diagonal
            if (c >= 0 && c < this.columns && this.grid[r][c] == piece.ordinal()) {
                count++;
            } else {
                count = 0;
            }
            if (count == connectN) {
                return true;
            }
        }

        // Check anti-diagonal
        count = 0;
        for (int r = 0; r < this.rows; r++) {
            int c = col - row + r; // row - col = r - c, for an anti-diagonal
            if (c >= 0 && c < this.columns && this.grid[r][c] == piece.ordinal()) {
                count++;
            } else {
                count = 0;
            }
            if (count == connectN) {
                return true;
            }
        }
        return false;

    }
}
