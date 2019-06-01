


public class Bins {
    int[] myBins;

    public Bins(int highRoll){
        this.myBins = new int[highRoll+1];
        for (int i = 0; i <= highRoll; i++){
            myBins[i]=0;
        }
    }


    public int getResults(int requestedResult){
                return myBins[requestedResult];
    }

    public void addResult(int roll){
        myBins[roll]++;


    }

    }







