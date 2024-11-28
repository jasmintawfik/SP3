import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public static void logIn(Scanner scanner) {

        String correctEmail = "hej@gmail.com";
        String correctPassword = "123";

        System.out.print("Indtast din email: ");
        String email = scanner.nextLine();

        System.out.print("Indtast din adgangskode: ");
        String password = scanner.nextLine();

        if (email.equals(correctEmail) && password.equals(correctPassword)) {
            System.out.println("Velkommen, du er logget ind!");
        } else {
            System.out.println("Forkert email eller adgangskode. Prøv igen.");
        }
    }

    public static void createUser(Scanner scanner) {
        System.out.print("Indtast din ønskede email: ");
        String email = scanner.nextLine();

        System.out.print("Indtast din ønskede adgangskode: ");
        String password = scanner.nextLine();

        System.out.println("Bruger oprettet med følgende oplysninger:");
        System.out.println("Email: " + email);
        System.out.println("Adgangskode: " + password);

        System.out.println("Bruger er oprettet. Du kan nu logge ind.");


    }

    public static void selectMovie(Scanner scanner, List<Movie> moviesList) {
        System.out.print("Indtast din film: ");
        String userFilmRequest = scanner.nextLine();
        boolean isPlaying = false;

        for(int i = 0; i < moviesList.size(); i ++ ){
            Movie movie = moviesList.get(i);
            if(userFilmRequest.equalsIgnoreCase(movie.getTitle())){
                movie.play();
                isPlaying = true;
            }
        }

        if(isPlaying == false){
            System.out.println("Vi kunne ikke finde filmen! prøv igen!");
            selectMovie(scanner, moviesList);
        }

        System.out.println("film er valgt:");

        System.out.println("film afspilles");
        String filmName = scanner.nextLine();



    }

    public void listMovies(List<Movie> moviesList){
        for(int i = 0; i < moviesList.size(); i ++ ){
            Movie movie = moviesList.get(i);
            System.out.println("Title" + movie.getTitle());
            System.out.println("Year" + movie.getYear());
            System.out.println("Rating" + movie.getRating());
            System.out.println("Genres" + movie.getGenres());

        }
        String line = scanner.nextLine();
        String[] split = line.split(":");

        String title = split[1].trim();
        int year = Integer.parseInt(split[1].trim());
        String[] genres = split[2].trim().split(",");
        double rating = Double.parseDouble(split[3].trim());

        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Genres: " + genres);
        System.out.println("Rating: " + rating);


    }
}