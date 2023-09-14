import java.util.ArrayDeque;
import java.util.Deque;

public class MazeSolver {
    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Up, Down, Left, Right
    private final int[][] maze;
    private final int rows;
    private final int cols;

    public MazeSolver(int[][] maze) {
        this.maze = maze;
        this.rows = maze.length;
        this.cols = maze[0].length;
    }

    public boolean solveMaze() {
        int[][] visited = new int[rows][cols]; // Keeps track of visited cells
        Deque<int[]> stack = new ArrayDeque<>(); // Stack for DFS

        // Start from the top-left corner
        int startRow = 0;
        int startCol = 0;

        stack.push(new int[]{startRow, startCol});

        while (!stack.isEmpty()) {
            int[] currentCell = stack.pop();
            int row = currentCell[0];
            int col = currentCell[1];

            if (row == rows - 1 && col == cols - 1) {
                // Reached the goal
                return true;
            }

            visited[row][col] = 1; // Mark the cell as visited

            for (int[] direction : DIRECTIONS) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if (isValid(newRow, newCol) && maze[newRow][newCol] == 0 && visited[newRow][newCol] == 0) {
                    stack.push(new int[]{newRow, newCol});
                }
            }
        }

        // No path found
        return false;
    }

    private boolean isValid(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}
        };

        MazeSolver solver = new MazeSolver(maze);
        if (solver.solveMaze()) {
            System.out.println("Path found!");
        } else {
            System.out.println("No path found.");
        }
    }
}
