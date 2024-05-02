package in_java;

import after.DefaultGameService;
import after.GameService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GameServiceProxyInJava {
    public static void main(String[] args) {
        GameServiceProxyInJava proxyInJava = new GameServiceProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameService = getGameServiceProxy(new DefaultGameService());
    }

    // 이 코드가 실행될 때 Proxy Instance를 생성하게 된다.
    private GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass()
                        .getClassLoader(), new Class[]{GameService.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // target을 args를 넣어서 실행하겠다.
                        method.invoke(target, args);
                        return null;
                    }
                }
        );
    }
}
