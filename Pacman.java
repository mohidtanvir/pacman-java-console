public class Pacman {
    int r, c;

    Pacman(int r, int c) {
        this.r = r;
        this.c = c;
    }

    void move(String dir, Maze maze) {
        int nr = r, nc = c;

        if (dir.equals("W")) nr--;
        else if (dir.equals("S")) nr++;
        else if (dir.equals("A")) nc--;
        else if (dir.equals("D")) nc++;

        if (!maze.isWall(nr, nc)) {
            r = nr;
            c = nc;
        }
    }

    boolean eatsDot(Maze maze) {
        if (maze.isDot(r, c)) {
            maze.eat(r, c);
            return true;
        }
        return false;
    }

    boolean collides(Ghost g) {
        return r == g.r && c == g.c;
    }

    void reset(int r, int c) {
        this.r = r;
        this.c = c;
    }
}