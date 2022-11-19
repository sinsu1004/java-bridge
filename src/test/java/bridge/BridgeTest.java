package bridge;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class BridgeTest {

    @Test
    void Bridge_테스트() {
        assertThat(new Bridge("U", " "));
    }

    @Test
    void Bridge_예외_테스트() {
        assertThatThrownBy(() -> new Bridge("d", "U")).isInstanceOf(IllegalArgumentException.class);
    }
}