public class Runner  {

}
class RunnerThread extends Thread{
    private Runner runner;
    public RunnerThread(Runner runner ,String s) {
        this.setName(s);
        this.runner = runner;

    }
}
