public class CoinFlip {
    int heads, tails, totalHeads;
    public String Flip(){
        if(Math.random() <= 0.5){
            return "heads";
        }
        else{
            return "tails";
        }
    }
    public double Simulate(int flips){
        for (int i = 0; i < flips; i++) {
            if(Flip().equals("heads")){
                totalHeads ++;
            }
        }
        return (double) totalHeads/flips;
    }
}
