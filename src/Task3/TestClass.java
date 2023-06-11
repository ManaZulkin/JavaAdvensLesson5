package Task3;

public class TestClass {
    private int sec = 12;
    String st = "NO!";

    public TestClass(){
    }
    public TestClass (String st){
        this.st = st;
    }
    private void tryMe() {
        int i = 0;
        do {
            System.out.println(st);
            i++;
        } while (i < sec);
    }

    public int getSec(){
        return sec;
    }
}
