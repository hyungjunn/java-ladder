package nextstep.ladder.domain;

import nextstep.ladder.domain.Line;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LineTest {

    @DisplayName("0명이거나 음수를 입력했을 때, IllegalArgumentException을 반환한다 ")
    @Test
    void zeroOrNegative() {
        assertThatThrownBy(() -> new Line(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("참가자는 1명 이상이어야 합니다.");
    }

    @DisplayName("참가자수(n)에 따라 Line의 사이즈는 (n - 1)이 된다")
    @Test
    void initLine() {
        assertThat(new Line(3).size()).isEqualTo(2);
    }

}
