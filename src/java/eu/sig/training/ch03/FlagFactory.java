package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FlagFactory {

    private HashMap<Nationality, List<Color>> flags = new HashMap<Nationality, List<Color>>(){{
        put(Nationality.DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        put(Nationality.GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        put(Nationality.FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        put(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        put(Nationality.ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
        put(Nationality.IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
        put(Nationality.HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        put(Nationality.BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
        put(Nationality.RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
    }};

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        if (flags.containsKey(nationality)) {
            return flags.get(nationality);
        } else {
            return Arrays.asList(Color.GRAY);
        }
    }
    // end::getFlag[]

}