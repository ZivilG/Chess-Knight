package com.company;

/**
 * Created by Zivile on 2017-01-04.
 */
public class Knight extends ChessFigure {

    Point koordOnBoard = new Point(0,0);
    int moveNumber = 0;
    final int lastMove = 7;
    final Point [] availableMoves={new Point(-2,-1),
                                     new Point(-2,1),
                                     new Point(-1,2),
                                     new Point(1,2),
                                     new Point(2,1),
                                     new Point(2,-1),
                                     new Point(1,-2),
                                     new Point(-1,-2)};

    Knight (int x1, int y1){
        SetFigurePosition(x1, y1);
    };

    Knight (){

    };

    public void SetFigurePosition(int x1, int y1){
        koordOnBoard=new Point (x1,y1);
        moveNumber = 0;
    }

    public Point GetNextMove(){
        if (moveNumber > lastMove) new Point(-1,-1);
        int tMove = GetNextMoveIndex();
        moveNumber = tMove + 1;
        return new Point(koordOnBoard.x + availableMoves[tMove].x,koordOnBoard.y + availableMoves[tMove].y);
    }

    public boolean IsNextMoveAvailable(){
        if (moveNumber > lastMove) return false;
        if (GetNextMoveIndex() > -1) return true;
        return false;
    }

    int GetNextMoveIndex(){
        int availableIndex = -1;
        for (int i = moveNumber; i<=lastMove; i++){
            if(koordOnBoard.x + availableMoves[i].x >= 0 && koordOnBoard.y + availableMoves[i].y >= 0
                    && koordOnBoard.x + availableMoves[i].x < 8 && koordOnBoard.y + availableMoves[i].y < 8){
                availableIndex = i;
                break;
            }
        }
        return availableIndex;
    }
}

