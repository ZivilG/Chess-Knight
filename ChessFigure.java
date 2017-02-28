package com.company;

/**
 * Created by Zivile on 2017-01-04.
 */
abstract public class ChessFigure {
    abstract public void SetFigurePosition(int x1, int y1);
    abstract public Point GetNextMove();
    abstract public boolean IsNextMoveAvailable();
}
