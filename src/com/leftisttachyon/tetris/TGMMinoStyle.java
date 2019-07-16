package com.leftisttachyon.tetris;

import static com.leftisttachyon.tetris.MinoStyle.BLUE;
import static com.leftisttachyon.tetris.MinoStyle.CYAN;
import static com.leftisttachyon.tetris.MinoStyle.GREEN;
import static com.leftisttachyon.tetris.MinoStyle.ORANGE;
import static com.leftisttachyon.tetris.MinoStyle.PURPLE;
import static com.leftisttachyon.tetris.MinoStyle.RED;
import static com.leftisttachyon.tetris.MinoStyle.YELLOW;
import com.leftisttachyon.tetris.tetrominos.Tetromino;
import com.leftisttachyon.util.TetrisUtils;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * The TGM style of minos
 *
 * @author Jed Wang
 * @since 1.0.0
 */
public class TGMMinoStyle extends MinoStyle {

    /**
     * No instantiation for you!
     */
    private TGMMinoStyle() {
    }

    /**
     * Returns an instance of a TGMMinoStyle
     *
     * @return an instance of a TGMMinoStyle
     */
    public static TGMMinoStyle getMinoStyle() {
        return SINGLETON;
    }

    /**
     * The one and only.
     */
    private static final TGMMinoStyle SINGLETON = new TGMMinoStyle();

    /**
     * An image of a blue mino
     */
    private static final Image BLUE_MINO;

    /**
     * An image of a cyan mino
     */
    private static final Image CYAN_MINO;

    /**
     * An image of a flashing mino
     */
    private static final Image FLASH_MINO;

    /**
     * An image of a green mino
     */
    private static final Image GREEN_MINO;

    /**
     * An image of an orange mino
     */
    private static final Image ORANGE_MINO;

    /**
     * An image of a purple mino
     */
    private static final Image PURPLE_MINO;

    /**
     * An image of a red mino
     */
    private static final Image RED_MINO;

    /**
     * An image of a yellow mino
     */
    private static final Image YELLOW_MINO;

    static {
        BufferedImage temp;

        temp = null;
        try {
            temp = TetrisUtils.getResource("/com/leftisttachyon/tetris/resources/tgm/blue.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        BLUE_MINO = temp.getScaledInstance(MINO_SIZE, MINO_SIZE, Image.SCALE_SMOOTH);

        temp = null;
        try {
            temp = TetrisUtils.getResource("/com/leftisttachyon/tetris/resources/tgm/cyan.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        CYAN_MINO = temp.getScaledInstance(MINO_SIZE, MINO_SIZE, Image.SCALE_SMOOTH);

        temp = null;
        try {
            temp = TetrisUtils.getResource("/com/leftisttachyon/tetris/resources/tgm/lock.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        FLASH_MINO = temp.getScaledInstance(MINO_SIZE, MINO_SIZE, Image.SCALE_SMOOTH);

        temp = null;
        try {
            temp = TetrisUtils.getResource("/com/leftisttachyon/tetris/resources/tgm/green.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        GREEN_MINO = temp.getScaledInstance(MINO_SIZE, MINO_SIZE, Image.SCALE_SMOOTH);

        temp = null;
        try {
            temp = TetrisUtils.getResource("/com/leftisttachyon/tetris/resources/tgm/orange.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ORANGE_MINO = temp.getScaledInstance(MINO_SIZE, MINO_SIZE, Image.SCALE_SMOOTH);

        temp = null;
        try {
            temp = TetrisUtils.getResource("/com/leftisttachyon/tetris/resources/tgm/purple.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        PURPLE_MINO = temp.getScaledInstance(MINO_SIZE, MINO_SIZE, Image.SCALE_SMOOTH);

        temp = null;
        try {
            temp = TetrisUtils.getResource("/com/leftisttachyon/tetris/resources/tgm/red.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        RED_MINO = temp.getScaledInstance(MINO_SIZE, MINO_SIZE, Image.SCALE_SMOOTH);

        temp = null;
        try {
            temp = TetrisUtils.getResource("/com/leftisttachyon/tetris/resources/tgm/yellow.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        YELLOW_MINO = temp.getScaledInstance(MINO_SIZE, MINO_SIZE, Image.SCALE_SMOOTH);
    }

    @Override
    public void drawMino(Graphics2D g2D, int x, int y, int color) {
        switch (color) {
            case BLUE:
                g2D.drawImage(BLUE_MINO, x, y, null);
                break;
            case CYAN:
                g2D.drawImage(CYAN_MINO, x, y, null);
                break;
            case FLASH:
                g2D.drawImage(FLASH_MINO, x, y, null);
                break;
            case GREEN:
                g2D.drawImage(GREEN_MINO, x, y, null);
                break;
            case ORANGE:
                g2D.drawImage(ORANGE_MINO, x, y, null);
                break;
            case PURPLE:
                g2D.drawImage(PURPLE_MINO, x, y, null);
                break;
            case RED:
                g2D.drawImage(RED_MINO, x, y, null);
                break;
            case YELLOW:
                g2D.drawImage(YELLOW_MINO, x, y, null);
                break;
        }
    }

    /*@Override
    public void drawTetromino(Graphics2D g2D, int x_, int y_, int width,
            Tetromino t) {
        int[][] upState = t.getUpState();
        int tempWidth = width / 4;
        for (int i = 0, x = x_; i < 4; i++, x += tempWidth) {
            for (int j = 0, y = y_; j < 4; j++, y += tempWidth) {
                int color = upState[j][i];

                switch (color) {
                    case BLUE:
                        g2D.drawImage(BLUE_MINO, x, y, tempWidth, tempWidth, null);
                        break;
                    case CYAN:
                        g2D.drawImage(CYAN_MINO, x, y, tempWidth, tempWidth, null);
                        break;
                    case GREEN:
                        g2D.drawImage(GREEN_MINO, x, y, tempWidth, tempWidth, null);
                        break;
                    case ORANGE:
                        g2D.drawImage(ORANGE_MINO, x, y, tempWidth, tempWidth, null);
                        break;
                    case PURPLE:
                        g2D.drawImage(PURPLE_MINO, x, y, tempWidth, tempWidth, null);
                        break;
                    case RED:
                        g2D.drawImage(RED_MINO, x, y, tempWidth, tempWidth, null);
                        break;
                    case YELLOW:
                        g2D.drawImage(YELLOW_MINO, x, y, tempWidth, tempWidth, null);
                        break;
                }
            }
        }
    }*/

    @Override
    public void drawMino(Graphics2D g2D, int x, int y, int size, int color) {
        if (size == MINO_SIZE) {
            drawMino(g2D, x, y, color);
            return;
        }

        switch (color) {
            case BLUE:
                g2D.drawImage(BLUE_MINO, x, y, size, size, null);
                break;
            case CYAN:
                g2D.drawImage(CYAN_MINO, x, y, size, size, null);
                break;
            case FLASH:
                g2D.drawImage(FLASH_MINO, x, y, size, size, null);
                break;
            case GREEN:
                g2D.drawImage(GREEN_MINO, x, y, size, size, null);
                break;
            case ORANGE:
                g2D.drawImage(ORANGE_MINO, x, y, size, size, null);
                break;
            case PURPLE:
                g2D.drawImage(PURPLE_MINO, x, y, size, size, null);
                break;
            case RED:
                g2D.drawImage(RED_MINO, x, y, size, size, null);
                break;
            case YELLOW:
                g2D.drawImage(YELLOW_MINO, x, y, size, size, null);
                break;
        }
    }
}