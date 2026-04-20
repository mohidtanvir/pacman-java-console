import java.util.Random;

public class Ghost {
    int r, c;
    Random rand = new Random();

    Ghost(int r, int c) {
        this.r = r;
        this.c = c;
    }

    void move(Maze maze) {
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};

        int[] d = dirs[rand.nextInt(4)];
        int nr = r + d[0];
        int nc = c + d[1];

        if (!maze.isWall(nr, nc)) {
            r = nr;
            c = nc;
        }
    }

    void reset(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
