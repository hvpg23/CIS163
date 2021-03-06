package Chess;

/* *********************************************************************
 * The IChessPiece is an abstract class that tells classes that implements
 * it what to do, and not how to do it. Therefore, each class must define
 * how to accomplish what the interface is telling it to do.
 *
 * Provided code by our instructor, Mr. Beach.
 *
 * @author Julia Garcia Navarro, Jack Lukomski, Hector Garcia
 * @version February 24, 2022
 *
 ********************************************************************* */

public interface IChessPiece {
    /**
     * Return the player that owns this piece.
     *
     * @return the player that owns this piece.
     */
    Player player();

    /**
     * Return the type of this piece ("King", "Queen", "Rook", etc.).  Note:  In this case "type" refers to the game
     * of chess, not the type of the Java class.
     *
     * Does this work? testing with Hector
     * Testing once again with Jack
     * @return the type of this piece
     */
    String type();

    /**
     * Returns whether the piece at location {@code [move.fromRow, move.fromColumn]} is allowed to move to location
     * {@code [move.fromRow, move.fromColumn]}.
     *
     * Note:  Pieces don't store their own location (because doing so would be redundant).  Therefore,
     * the {@code [move.fromRow, move.fromColumn]} component of {@code move} is necessary.
     * {@code this} object must be the piece at location {@code [move.fromRow, move.fromColumn]}.
     * (This method makes no sense otherwise.)
     *
     * @param move  a object describing the move to be made.
     * @param board the in which this piece resides.
     * @return {@code true} if the proposed move is valid, {@code false} otherwise.
     * @throws //IndexOutOfBoundsException if either {@code [move.fromRow, move.fromColumn]} or {@code [move.toRow,
     *                                   move.toColumn]} don't represent valid locations on the board.
     * @throws //IllegalArgumentException  if {@code this} object isn't the piece at location {@code [move.fromRow, move.fromColumn]}.
     */
    boolean isValidMove(Move move, IChessPiece[][] board);
}

