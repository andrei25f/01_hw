package ait.manipulation.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Manipulation {
    public static List<String> sort(List<String> lines) {
        lines.sort((l1, l2) -> l1.compareTo(l2));
        return lines;
    }
    public static List<String> shuffle(List<String> lines) {
        Collections.shuffle(lines);
        return lines;
    }
    public static List<String> reverse(List<String> lines) {
        return lines.reversed();
    }
}
