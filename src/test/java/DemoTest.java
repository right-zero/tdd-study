import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class DemoTest {
    @Test
    public void test_DemoTest() throws Exception {
        String data = "1,2";
        String[] result = data.split(",");
        assertThat(result).contains("1");
        assertThat(result).containsExactly("1", "2");
    }
}