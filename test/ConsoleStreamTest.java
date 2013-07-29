import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class ConsoleStreamTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    public ByteArrayOutputStream getOutContent() {
        return outContent;
    }

    @Before
    public void setUpOutStream() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpOutStream() {
        System.setOut(null);
    }


}
