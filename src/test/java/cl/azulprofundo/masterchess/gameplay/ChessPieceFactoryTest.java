package cl.azulprofundo.masterchess.gameplay;

import cl.azulprofundo.masterchess.model.chesspieces.ChessPiece;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ChessPieceFactoryTest {

    @Test
    public void testGameSetPieces() {
        List<ChessPiece> allPieces = ChessPieceFactory.getAllPieces();

        Assert.assertTrue(allPieces.size() == 16*2);
    }
}