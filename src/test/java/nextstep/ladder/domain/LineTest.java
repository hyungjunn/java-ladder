package nextstep.ladder.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    @Test
    void line() {
        Rung first = Rung.first(true);
        Rung second = first.next(false);
        Rung last = second.last();

        List<Rung> rungs = List.of(first, second, last);
        Line line = new Line(3, rungs);

        assertThat(line.move(0)).isEqualTo(1);
        assertThat(line.move(1)).isEqualTo(0);
        assertThat(line.move(2)).isEqualTo(2);
    }

    @Test
    void create() {
        List<Rung> rungs = new Line(3).create();
        assertThat(rungs.size()).isEqualTo(3);
    }
}
