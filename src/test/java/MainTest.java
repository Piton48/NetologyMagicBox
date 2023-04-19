import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    MagicBox<String> str = new MagicBox<>(1);

    @Test
    void addTesting() {
        boolean result = str.add(" ");
        Assertions.assertTrue(result);
        result = str.add(" ");
        Assertions.assertFalse(result);
    }

    @Test
    void pickTesting() {
        String line = " ";
        str.add(line);
        Object result = str.pick();
        Assertions.assertEquals(line, result);
    }

    @Test
    void pickThrowTesting() {
        Assertions.assertThrows(RuntimeException.class, () -> str.pick());
    }

}
