public class WeightMain{
    public static void main(String[] args) {
        Weight m1 = new Weight(28);
        Weight m2 = new Weight(78,12);

        m1.print();
        m2.print();

        System.out.println(m1.isHeavier(m2));args

        Weight m3 = m1.multiple(2);

        m3.print();


    }
}