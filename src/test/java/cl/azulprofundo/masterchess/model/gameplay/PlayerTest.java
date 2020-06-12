package cl.azulprofundo.masterchess.model.gameplay;

import org.junit.Test;

import static cl.azulprofundo.masterchess.model.gameplay.ChessColor.BLACK;
import static cl.azulprofundo.masterchess.model.gameplay.ChessColor.WHITE;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testConstructorWhite() {
        Player player = new Player(WHITE);

        ChessColor playerColor = player.getColor();
        assertNotNull(playerColor);
        assertEquals(WHITE, playerColor);
    }

    @Test
    public void testConstructorBlack() {
        Player player = new Player(BLACK);

        ChessColor playerColor = player.getColor();
        assertNotNull(playerColor);
        assertEquals(BLACK, playerColor);
    }
}