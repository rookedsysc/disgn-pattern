import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    public int process() {
        // try문이 끝날 때 BufferedReader가 자동으로 close된다.
        // Python의 with open() as f: 와 같은 기능을 한다.
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            while ((line = reader.readLine()) != null) {
                /**
                 * parseInt는 int type을 반환한다.
                 * valueOf는 Integer type을 반환한다.
                 */
                result += Integer.parseInt(line);
                // result += Integer.valueOf(line);
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }
}
