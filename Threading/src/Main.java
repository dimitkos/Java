public class Main {
    public static void main(String[] args) {

        //dhmioyrgw tria antikeimena
        //h kathe klassh tou antikeimenou kanei extend thn trhead
        ThreadA tA = new ThreadA();
        ThreadB tB = new ThreadB();
        ThreadC tC = new ThreadC();

        //kskeinane ta nhmata
        tA.start();
        tB.start();
        tC.start();
    }
}
