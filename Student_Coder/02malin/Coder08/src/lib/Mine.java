package lib;

public class Mine {
    int numOfMine;
    String[] mineLocation; // 我把这个变为string array 储存position of mine


    // 这个对应的是Mary写的 randomMine
    public Mine(int numOfMine, int dimension) {
        this.numOfMine = numOfMine;
        this.mineLocation = new String[this.numOfMine];
        for (int i = 0; i < numOfMine; i++) {
            boolean hasDuplicate = true;
            String singleLocation = " ";
            while (hasDuplicate) {

                int mineRow = (int) (Math.random() * dimension);
                int mineColumn = (int) (Math.random() * dimension);
                singleLocation = String.format("%02d", mineRow) + String.format("%02d", mineColumn);
                hasDuplicate = checkDuplicate(singleLocation);
            }
            this.mineLocation[i] = singleLocation;
            // System.out.println(mineLocationString[i]);
        }

    }


    public boolean checkDuplicate(String singleLocation) {
        for (int i = 0; i < this.mineLocation.length; i++) {
            if (singleLocation.equals(this.mineLocation[i])) {
                return true;
            }
        }
        return false;
    }


}
