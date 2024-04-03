package nextstep.ladder;

import nextstep.ladder.domain.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PersonTest {

    @DisplayName("참가자는 이름을 갖는다")
    @Test
    void name() {
        assertThat(new Person("현구막")).isEqualTo(new Person("현구막"));
    }

    @DisplayName("참가자의 이름을 공백이나 null을 입력했을 때, IllegalArgumentException을 반환한다")
    @Test
    void blankOrNull() {
        String blank = " ";

        assertThatThrownBy(() -> new Person(" "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(String.format("참가자의 이름은 (%s)와 같이 공백이거나 null일 수 없습니다.", blank));
    }

}
