

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        System.out.println(fileProcessor.process((a,b) -> {
            return a + b;
        }));
//        System.out.println(fileProcessor.process(Integer::sum));
    }
}
