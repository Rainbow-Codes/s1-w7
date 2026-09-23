public class Weight {
    
    private int lbs;
    private int oz;

    public Weight(int ozIn, int lbsIn){
        if (oz>=0 && lbs>=0){
            lbs = lbsIn;
            oz = ozIn;
            fix();
        }
    }

    public Weight(int ozIn){
        this(ozIn, 0);
    }

    public void fix(){
        if(oz > 15){
            lbs+=(oz/16);
            oz %= 16;
        }
    }

    public boolean isHeavier(Weight compare){
        int thisTotal = this.oz + 16*this.lbs;
        int compareTotal = compare.oz + 16*compare.lbs;
        return thisTotal > compareTotal;
    }

    public Weight multiple(int mult){
        return new Weight(oz*mult, lbs*mult);
    }

    public void print(){
        System.out.println(lbs+" pounds "+oz+" ounces");
    }

}
