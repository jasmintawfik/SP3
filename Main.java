import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Path to the movie file
        String moviePath = "data/Film.txt";
        //Opret scanner til brug i login
        Scanner scanner = new Scanner(System.in);

            // Opret en instans af FileUI
            FileIO fileIO = new FileIO();
            //List<Movie> movies = fileIO.readMovieData(moviePath);

            // Læs filmene fra filen
            List<Movie> movies = FileIO.readMovieData(moviePath);

                Menu.logIn(scanner);
                Menu.selectMovie(scanner,movies);
        }
    }