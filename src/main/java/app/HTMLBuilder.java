package app;

import j2html.tags.Tag;
import static j2html.TagCreator.*;

public class HTMLBuilder {

    public static Tag textBoxInput(String identifier, String placeholder){
        return input()
                .withType("text")
                .withId(identifier)
                .withName(identifier)
                .withPlaceholder(placeholder)
                .isRequired();
    }

    public static Tag submitButton(String text) {
        return button().withType("submit").withText(text);
    }
}
