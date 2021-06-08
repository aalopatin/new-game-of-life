package sample.logic;

import java.util.HashSet;

public class Cell {
    private boolean condition;

    public Cell(boolean condition) {
        this.condition = condition;
    }

    public boolean isLive() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public boolean nextCondition(HashSet<Cell> neighbors) {
        int countLive = countLive(neighbors);
        if (condition) {
            return 1 < countLive && countLive < 4;
        } else {
            return countLive == 3;
        }
    }

    private int countLive(HashSet<Cell> neighbors) {
        int count = 0;
        for (Cell neighbor : neighbors) {
            count += neighbor.isLive() ? 1 : 0;
        }
        return count;
    }
    
}
