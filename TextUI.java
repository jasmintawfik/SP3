import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.*;

    public class TextUI {
        private Scanner scanner;

        public TextUI() {
            this.scanner = new Scanner(System.in);
        }

        public String getInput(String prompt) {
            System.out.print(prompt);
            return scanner.nextLine();
        }

        public void display(String message) {
            System.out.println(message);
        }

        public void displayMovies(List<Movie> movies) {
            for (Movie movie : movies) {
                display(movie.toString());
            }
        }

        public Movie addMovie() {
            String title = getInput("Enter movie title: ");
            int year = Integer.parseInt(getInput("Enter movie year: "));
            String[] genres = getInput("Enter genres (comma-separated): ").split(",");
            double rating = Double.parseDouble(getInput("Enter movie rating: "));
            return new Movie(title, year, Arrays.asList(genres).toString(), rating);
        }
    }


