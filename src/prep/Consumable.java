package prep;

import java.util.Collection;

public interface Consumable {

    void consume(String name);

    Collection<String> getFullDescription();
}
