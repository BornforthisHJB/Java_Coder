package demo;

/**
 * 面板坐标属性
 */
public class Location {
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int NEARBY = 3;
    private int mineIndex = -1;//记录是第几个雷
    /**
     * 附近地雷数量
     */
    private int nearyByMineCount = -1;

    private boolean hasMine = false;
    private int status;


    public Location() {
        status = 0;
        hasMine = false;
    }

    public int getMineIndex() {
        return mineIndex;
    }

    public void setMineIndex(int mineIndex) {
        this.mineIndex = mineIndex;
    }

    public int getNearyByMineCount() {
        return nearyByMineCount;
    }

    public void setNearyByMineCount(int nearyByMineCount) {
        this.nearyByMineCount = nearyByMineCount;
    }

    public boolean isHasMine() {
        return hasMine;
    }

    public void setHasMine(boolean hasMine) {
        this.hasMine = hasMine;
    }


    public void markHit() {
        setStatus(HIT);
    }


    public boolean hasMine() {
        return hasMine;
    }

    public void setMine(boolean val) {
        this.hasMine = val;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

}