public class Fewest{
    private String tempStr;

    public String fewestComparisons(double temp){
        if (temp < 40) 
            tempStr = "cold";
        else if (temp <= 60) 
            tempStr = "cool";
        else if (temp <= 80)
            tempStr = "warm";
        else
            tempStr = "hot";
        return tempStr;
    }

}