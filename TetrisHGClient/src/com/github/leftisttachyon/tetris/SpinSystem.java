package com.github.leftisttachyon.tetris;

import com.github.leftisttachyon.tetris.tetrominos.Tetromino;

/**
 * An abstract class that does all of the rotation work for pieces.
 *
 * @author Jed Wang
 * @param <T> the rotation system of the tetrominos to rotate
 * @since 0.9.0
 */
public abstract class SpinSystem<T extends Tetromino> {

    /**
     * Rotates the given tetromino in the clockwise direction (aka to the right)
     * once, taking into account kicks.
     *
     * @param t the tetromino to rotate
     * @param m the TetrisMatrix the tetromino is being rotated in
     */
    public abstract void rotateRight(T t, TetrisMatrix m);

    /**
     * Rotates the given tetromino in the counterclockwise direction (aka to the
     * left) once, taking into account kicks.
     *
     * @param t the tetromino to rotate
     * @param m the TetrisMatrix the tetromino is being rotated in
     */
    public abstract void rotateLeft(T t, TetrisMatrix m);

    /**
     * Checks whether a kick will place the given tetromino out of bounds or if
     * it will collide with another thing.
     *
     * @param t the tetromino to kick, if applicable
     * @param m the matrix to check with
     * @param x_offset the offset of the kick in the x direction
     * @param y_offset the offset of the kick in the y direction
     * @return whether the kick is valid or not
     */
    protected boolean checkKick(T t, TetrisMatrix m, int x_offset, int y_offset) {
        if (!t.intersects(m, x_offset, -y_offset)) {
            t.transform(x_offset, -y_offset);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the type of rotation this spin system represents.
     *
     * @return the type of rotation this spin system represents.
     */
    public abstract String getType();
}
