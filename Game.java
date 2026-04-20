import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Maze maze = new Maze();
        Pacman pacman = new Pacman(4, 7);
        Ghost ghost = new Ghost(8, 1);

        int score = 0;
        int lives = 3;

        Scanner sc = new Scanner(System.in);

        while (lives > 0) {
            Display.draw(maze, pacman, ghost, score, lives);

            System.out.print("Move (W/A/S/D): ");
            String move = sc.nextLine().toUpperCase();

            pacman.move(move, maze);

            if (pacman.eatsDot(maze)) {
                score += 10;
            }

            ghost.move(maze);

            if (pacman.collides(ghost)) {
                lives--;
                System.out.println("Caught!");

                pacman.reset(4, 7);
                ghost.reset(8, 1);
            }
        }

        System.out.println("GAME OVER! Score: " + score);
    }
}