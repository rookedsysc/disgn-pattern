package after;

public class GameServiceProxy implements GameService{
    private GameService gameService;

    public void startGame() {
        long before= System.currentTimeMillis();

        // Lazy Initialization 해서 실제로 사용될 때까지 객체를 생성하지 않음
        if(gameService == null) {
            this.gameService = new DefaultGameService();
        }
        gameService.startGame();
        System.out.println("소요시간: " + (System.currentTimeMillis() - before) + "ms");
    }
}
