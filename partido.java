public class partido {
    private int numGan;
    private int numPer;
    private int numgol = 0;

    public partido(int numGan, int numPer, int numgol){
        this.numGan = numGan;
        this.numPer = numPer;
        this.numgol = numgol;
    }

    public void setNumgol(int numgol) {
        this.numgol = numgol;
    }

    public void addgol(int i){
        numgol = numgol + i;
    }

}
