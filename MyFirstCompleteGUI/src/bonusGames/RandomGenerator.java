/*
 * TCSS 305 - Project Tetris
 */

package bonusGames;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import bonusGames.AbstractPiece;
import bonusGames.IPiece;
import bonusGames.ImmutablePiece;
import bonusGames.JPiece;
import bonusGames.LPiece;
import bonusGames.OPiece;
import bonusGames.Point;
import bonusGames.SPiece;
import bonusGames.TPiece;
import bonusGames.ZPiece;

/**
 * A piece generator that uses random numbers to generate pieces.
 * 
 * @author Alan Fowler
 * @version Winter 2014
 */
public class RandomGenerator implements PieceGenerator {

    // Static Fields
    /** The list of available piece types. */
    private static final List<AbstractPiece> PIECE_LIST = Arrays.asList(
        new IPiece(), new JPiece(), new LPiece(), new OPiece(),
        new SPiece(), new TPiece(), new ZPiece());

    // Instance Fields
    /** The random number generator used by this piece generator. */
    private final Random myRandom;
    
    /** The origin to use for random pieces. */
    private final Point myOrigin;

    // Constructors

    /**
     * Constructs a new RandomGenerator with the specified piece origin.
     * 
     * @param theOrigin The origin.
     */
    public RandomGenerator(final Point theOrigin) {
        myRandom = new Random();
        myOrigin = theOrigin;
    }

    // Instance Methods

    /**
     * {@inheritDoc}
     */
    public ImmutablePiece next() {
        final int choice = myRandom.nextInt(PIECE_LIST.size()); 
        return ((AbstractPiece) PIECE_LIST.get(choice)).setOrigin(myOrigin);
    }
}
