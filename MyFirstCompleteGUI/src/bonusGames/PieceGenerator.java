/*
 * TCSS 305 - Project Tetris
 */

package bonusGames;

import bonusGames.ImmutablePiece;

/**
 * A generator for Tetris pieces.
 * 
 * @author Alan Fowler
 * @version Winter 2014
 */
public interface PieceGenerator {

    /**
     * @return the next piece.
     */
    ImmutablePiece next();
}
