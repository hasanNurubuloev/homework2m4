public class Main {
  /*  Написать многопоточное приложение передачи эстафетной палочки бегунами друг другу. Всего должно быть 5 бегунов.
    Каждый бегун является самостоятельным потоком, созданным на основе вашего класса Runner. Всего должен быть только 1 класс поток не более.
    Потоки запускаются по цепной реакции. То есть с Main класса запустили поток под названием “Runner 1”, в раннер 1 запускается поток “Runner 2” и т.д.
    Вывод программы в консоле должен выглядеть именно так (примечание симулируете бег задержкой потока в 5 секунд):
    Runner 1 берет палочку
    Runner 1 бежит к Runner 2
    Runner 2 берет палочку
    Runner 2 бежит к Runner 3
    Runner 3 берет палочку
    Runner 3 бежит к Runner 4
    Runner 4 берет палочку
    Runner 4 бежит к Runner 5
    Runner 5 берет палочку
    Runner 5 бежит к финишу
    Runner 5 бежит к Runner 4
    Runner 4 берет палочку
    Runner 4 бежит к Runner 3
    Runner 3 берет палочку
    Runner 3 бежит к Runner 2
    Runner 2 берет палочку
    Runner 2 бежит к Runner 1
    Runner 1 берет палочку*/

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <=5 ; i++) {

            RunnerThread rt = new RunnerThread();
            rt.start();
            rt.join();
        break;
        }




    }
}
