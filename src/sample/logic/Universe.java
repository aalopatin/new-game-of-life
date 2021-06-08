package sample.logic;

import java.util.HashSet;
import java.util.Random;
import java.util.function.Supplier;

public class Universe {

    private final byte[][] TEST = new byte[][]{
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
    };

    private final byte[][] GROWTH = new byte[][]{
            {0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 1, 0},
            {0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 0},
            {0, 0, 1, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0},
    };



    private final byte[][] BLINKER = new byte[][]{
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
    };

    private final byte[][] TOAD = new byte[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
    };

    private final byte[][] BEACON = new byte[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1, 0},
            {0, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 0}
    };

    private final byte[][] PULSAR = new byte[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    private final byte[][] GLIDER = new byte[][]{
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
    };

    private final byte[][] SPACESHIP = new byte[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 1, 0, 0},
            {0, 1, 1, 1, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 0, 0},
            {0, 0, 1, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    private int rows;
    private int columns;
    private Cell[][] currentGeneration;

    private final int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    public Universe(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        currentGeneration = new Cell[rows][columns];
        generateRandomGeneration();
    }

    public Universe(int rows, int columns, String patternName) {
        this.rows = rows;
        this.columns = columns;
        currentGeneration = new Cell[rows][columns];
        setPattern(patternName);
    }

    public Cell getCell(int i, int j) {
        return currentGeneration[i][j];
    }

    public void nextGeneration() {
        boolean[][] nextGeneration = new boolean[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                HashSet<Cell> neighbors = getNeighbors(i, j);
                nextGeneration[i][j] = currentGeneration[i][j].nextCondition(neighbors);
            }
        }
        for (int i = 0; i < nextGeneration.length; i++) {
            for (int j = 0; j < nextGeneration[i].length; j++) {
                currentGeneration[i][j].setCondition(nextGeneration[i][j]);
            }
        }
    }

    private void generateRandomGeneration() {
        Random rand = new Random();
        initializeGeneration(() -> new Cell(rand.nextBoolean()));
    }

    private void setPattern(String patternName) {
        byte[][] pattern = getPattern(patternName);
        if (pattern.length == 0) {
            generateRandomGeneration();
        } else {
            initializeGeneration(() -> new Cell(false));
            for (int i = 0; i < pattern.length; i++) {
                for (int j = 0; j < pattern[i].length; j++) {
                    currentGeneration[i][j].setCondition(pattern[i][j] == 1);
                }
            }
        }
    }

    private void initializeGeneration(Supplier<Cell> supplier) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                currentGeneration[i][j] = supplier.get();
            }
        }
    }

    private HashSet<Cell> getNeighbors(int i, int j) {
        HashSet<Cell> neighbors = new HashSet<>();
        for (int[] direction : directions) {
            int neighbor_i = i + direction[0];
            int neighbor_j = j + direction[1];

            if (neighbor_i == -1) {
                neighbor_i = rows - 1;
            } else if (neighbor_i == rows) {
                neighbor_i = 0;
            }

            if (neighbor_j == -1) {
                neighbor_j = columns - 1;
            } else if (neighbor_j == columns) {
                neighbor_j = 0;
            }
            neighbors.add(currentGeneration[neighbor_i][neighbor_j]);
        }
        return neighbors;
    }

    private byte[][] getPattern(String pattern) {
        byte[][] patternArr = new byte[0][0];
        switch (pattern) {
            case "test":
                patternArr = TEST;
                break;
            case "growth":
                patternArr = GROWTH;
                break;
            case "blinker":
                patternArr = BLINKER;
                break;
            case "toad":
                patternArr = TOAD;
                break;
            case "beacon":
                patternArr = BEACON;
                break;
            case "pulsar":
                patternArr = PULSAR;
                break;
            case "glider":
                patternArr = GLIDER;
                break;
            case "spaceship":
                patternArr = SPACESHIP;
        }
        return patternArr;
    }
}
