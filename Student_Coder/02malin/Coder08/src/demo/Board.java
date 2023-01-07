package demo;

/**
 * 游戏面板
 */
public class Board {
    /**
     * 地雷雷坐标
     */
    private Location[][] grid;
    private Mine[] mines; //所有的雷

    // 行数和列数
    int dimension;

    public Board(int num_of_mine, int dimension) {
        this.dimension = dimension;
        grid = new Location[dimension][dimension];

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                Location tempLoc = new Location();
                grid[row][col] = tempLoc;
            }
        }
        initMine(num_of_mine);
    }

    /**
     * 初始化地雷
     *
     * @param num_of_mine 地雷的数量
     */
    private void initMine(int num_of_mine) {
        mines = new Mine[num_of_mine];
        for (int i = 0; i < num_of_mine; i++) {

            int mineStartPosCol = (int) (Math.random() * dimension);
            int mineStartPosRow = (int) (Math.random() * dimension);
            while (grid[mineStartPosRow][mineStartPosCol].hasMine()) {
                mineStartPosCol = (int) (Math.random() * dimension);
                mineStartPosRow = (int) (Math.random() * dimension);
            }

            Mine mine = new Mine(mineStartPosRow, mineStartPosCol);
            mines[i] = mine;
            addMineToPanel(mine, i);

        }
    }


    public void markHit(int row, int col) {
        grid[row][col].markHit();
    }

    /**
     * 判断整个战舰是否都被击中
     *
     * @param row 雷横坐标
     * @param col 雷纵坐标
     * @return
     */
    public boolean isFindMine(int row, int col) {
        return getStatus(row, col) == Location.HIT;
    }


    public void addMineToPanel(Mine mine, int shipIndex) {
        int row = mine.getRow();
        int col = mine.getCol();
        grid[row][col].setMine(true);
    }

    /**
     * 绘制地雷面板
     *
     * @param type 0 绘制状态  1 绘制所有答案
     */
    public void printBoard(int type) {
        for (int col = 0; col < dimension; col++) {
            if (col == 0) {
                System.out.print("   " + col + " ");//每行第一个字母
            } else {

                System.out.print(" " + col + " ");
            }
        }
        System.out.println();
        for (int row = 0; row < dimension; row++) {
            for (int col = 0; col < dimension; col++) {
                if (col == 0) {
                    System.out.print(row + " ");//每行第一个字母
                }
                if (type == 0) {//猜测
                    if (grid[row][col].getStatus() == Location.HIT) {
                        //显示地雷
                        System.out.print(" X ");
                    } else if (grid[row][col].getStatus() == Location.NEARBY) {
                        System.out.print(" Z ");
                    } else if (grid[row][col].getNearyByMineCount() > -1) {
                        //显示周边地雷
                        int mineCount = grid[row][col].getNearyByMineCount();
//                        checkSquare(row, col);
                        System.out.print(" " + mineCount + " ");
                    } else {
                        System.out.print(" * ");
                    }
                } else if (type == 1) {
                    //显示所有地雷
                    if (grid[row][col].hasMine()) {
                        //显示地雷
                        System.out.print(" X ");
                    } else {
                        System.out.print(" * ");
                    }
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * 确定计算地雷的 3*3 目标格的起始坐标
     * 3*3 方块的左上角坐标是中心点横纵坐标 -1
     * 右下角坐标坐标就是中心点横纵坐标+1
     * 通过这个逻辑定位到了整个方块的位置
     * <p>
     * 循环这个方块里面的每个点，在统计这个点周围的的地雷数量
     *
     * @param row
     * @param col
     */
    public void checkSquare(int row, int col) {

        int startRow = -1;
        int endRow = -1;
        int startCol = -1;
        int endCol = -1;
        //判断是否在棋盘顶部
        if (row - 1 >= 0) {
            startRow = row - 1;
        } else {
            //超过游戏面板的范围，说明是在边缘上了
            startRow = row;
        }
        //判断是否在棋盘的底部
        if (row + 1 <= dimension - 1) {
            endRow = row + 1;
        } else {
            //在棋盘的底部
            endRow = row;
        }
        //判断是否在棋盘的最左边
        if (col - 1 >= 0) {
            startCol = col - 1;
        } else {
            startCol = col;
        }
        //判断是否在棋盘的最右边
        if (col + 1 <= dimension - 1) {
            endCol = col + 1;
        } else {
            //超过游戏面板的范围，说明是在边缘上了
            endCol = col;
        }
//        System.out.println("需求计算的点的范围");
//        System.out.println("startRow startCol " + startRow + " " + startCol);
//        System.out.println("endRow endCol " + endRow + " " + endCol);
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                if (j == col && row == i) {
                    continue;
                } else {
                    int count = countMine(i, j);
                    grid[i][j].setNearyByMineCount(count);
                }


            }
        }
    }

    /**
     * 统计目标点周围的地雷
     * 逻辑和上面生成 3*3 方块的一样，只是这里换成了统计周围地雷的数量
     *
     * @param row
     * @param col
     * @return 地雷数量
     */
    private int countMine(int row, int col) {

        int startRow = -1;
        int endRow = -1;
        int startCol = -1;
        int endCol = -1;

        if (row - 1 >= 0) {
            startRow = row - 1;
        } else {
            startRow = row;
        }
        if (row + 1 <= dimension - 1) {
            endRow = row + 1;
        } else {
            endRow = row;
        }
        if (col - 1 > 0) {
            startCol = col - 1;
        } else {
            startCol = col;
        }
        if (col + 1 <= dimension - 1) {
            endCol = col + 1;
        } else {
            endCol = col;
        }

        int count = 0;
//        System.out.println("计算雷" + row + " " + col);
//        System.out.println("startRow startCol " + startRow + " " + startCol);
//        System.out.println("endRow endCol " + endRow + " " + endCol);
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                if (grid[i][j].hasMine())
                    count++;
            }
        }
        return count;

    }


    public void setStatus(int row, int col, int status) {
        grid[row][col].setStatus(status);
    }

    public int getStatus(int row, int col) {
        return grid[row][col].getStatus();
    }


    public boolean hasMine(int row, int col) {
        return grid[row][col].hasMine();
    }


    public int getPanelRow() {
        return dimension;
    }

    public int getPanelCol() {
        return dimension;
    }

    /**
     * 标记为需要显示附近有多少雷
     *
     * @param row
     * @param col
     */
    public void markShowNearby(int row, int col) {
        grid[row][col].setStatus(Location.NEARBY);
    }
}