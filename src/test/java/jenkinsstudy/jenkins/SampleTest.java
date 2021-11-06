package jenkinsstudy.jenkins;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    public void calculateAdd(){
        int a = 1;
        int b = 2;
        Assertions.assertThat(a + b).isEqualTo(3);
    }
}
