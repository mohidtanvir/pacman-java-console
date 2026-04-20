public class Display {

    static void draw(Maze maze, Pacman p, Ghost g, int score, int lives) {

        for (int i = 0; i < 20; i++) System.out.println();

        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 15; c++) {

                if (r == p.r && c == p.c) {
                    System.out.print("P ");
                }
                else if (r == g.r && c == g.c) {
                    System.out.print("G ");
                }
                else {
                    System.out.print(maze.grid[r][c] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("Score: " + score + " Lives: " + lives);
    }
}