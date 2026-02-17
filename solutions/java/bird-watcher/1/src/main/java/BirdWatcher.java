
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] { 0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6]+=1;
    }

    public boolean hasDayWithoutBirds() {
        for(int birds: birdsPerDay){
            if(birds==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int countForFirstDays = 0;
        for(int i=0;i<numberOfDays && i<7;i++){
            countForFirstDays += birdsPerDay[i];
        }
        return countForFirstDays;
    }

    public int getBusyDays() {
        int busyDays=0;
        for(int birds:birdsPerDay){
            if(birds>=5){
                busyDays++;
            }
        }
        return busyDays;
    }
}
