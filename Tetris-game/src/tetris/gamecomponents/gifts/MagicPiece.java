package tetris.gamecomponents.gifts;

import tetris.gamecomponents.Board;
import tetris.gamecomponents.Point;
import tetris.utilities.Properties;

import java.util.Random;

public class MagicPiece extends Gift {

    public MagicPiece(Board board) {
        //TODO COLOR
        super(board, Properties.getColorScheme().getDarkBlue());
    }

    @Override
    public void giveReward() {
        Random random = new Random();
        int randomX;
        Point point = new Point(0, Properties.getHeight()-1, Properties.getColorScheme().getDarkBlue());

        do {
            randomX = random.nextInt(Properties.getWidth());
            point.setX(randomX);
        } while (board.containsPoint(point));

        board.fillPoint(point);
    }
}
