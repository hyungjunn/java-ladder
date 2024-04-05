package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class LadderGame {

    private List<Line> lines = new ArrayList<>();

    public LadderGame(int height, int countOfPerson) {
        this(new Height(height), countOfPerson);
    }

    public LadderGame(Height height, int countOfPerson) {
        height.add(lines, countOfPerson);
    }

    public List<Line> getLines() {
        return lines;
    }

}
