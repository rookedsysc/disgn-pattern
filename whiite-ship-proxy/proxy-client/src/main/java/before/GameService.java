package before;

public class GameService {
    public void startGame()  {
        System.out.println("이 자리에 오신 여러분 환영 합니다.");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
