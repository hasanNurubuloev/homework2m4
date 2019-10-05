import static java.lang.Thread.sleep;

class RunnerThread extends Thread {


    private String name;
    Thread runner1 = new Thread();
    Thread runner2 = new Thread();
    Thread runner3 = new Thread();
    Thread runner4 = new Thread();
    Thread runner5 = new Thread();

    public void run() throws NullPointerException {
        try {
            runner1.setName("Runner 1");
            runner2.setName("Runner 2");
            runner3.setName("Runner 3");
            runner4.setName("Runner 4");
            runner5.setName("Runner 5");

            System.out.println(runner1.getName() + " берет палочку");
            System.out.println(runner1.getName() + " бежит к " + runner2.getName());
            sleep(5000);
            runner2.start();


            System.out.println(runner2.getName() + " берет палочку");
            System.out.println(runner2.getName() + " бежит к " + runner3.getName());


            sleep(5000);
            runner3.start();


            System.out.println(runner3.getName() + " берет палочку");
            System.out.println(runner3.getName() + " бежит к " + runner4.getName());


            sleep(5000);

            runner4.start();


            System.out.println(runner4.getName() + " берет палочку");
            System.out.println(runner4.getName() + " бежит к " + runner5.getName());

            sleep(5000);
            runner5.start();

            System.out.println(runner5.getName() + " берет палочку");
            System.out.println(runner5.getName() + " бежит к " + runner4.getName());


            sleep(5000);




            System.out.println(runner4.getName() + " берет палочку");
            System.out.println(runner4.getName() + " бежит к " + runner3.getName());


            sleep(5000);

            System.out.println(runner3.getName() + " берет палочку");
            System.out.println(runner3.getName() + " бежит к " + runner2.getName());


            sleep(5000);
            System.out.println(runner2.getName() + " берет палочку");
            System.out.println(runner2.getName() + " бежит к " + runner1.getName());


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}