package after;

public class DefaultGameService implements GameService {
    @Override
    public void startGame() {
        System.out.println("게임을 시작합니다.");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
