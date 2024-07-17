import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputStream {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        try (
            BufferedInputStream bufferedInput = new BufferedInputStream(inputStream);
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(outputStream)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead = bufferedInput.read(buffer);
            while (bytesRead != -1) {
                bufferedOutput.write(buffer, 0, bytesRead);
                bufferedOutput.flush();
                bytesRead = bufferedInput.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
