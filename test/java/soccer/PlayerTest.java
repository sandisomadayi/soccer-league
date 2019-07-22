package soccer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void shouldGetPlayerName() {
        Player player1 = new Player("sandiso", "madayi", 96);

        assertEquals("sandiso", player1.getFirstName());
    }
}
