

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        System.out.println(fileProcessor.process(new Plus()));
//        System.out.println(fileProcessor.process(Integer::sum));
    }
}
