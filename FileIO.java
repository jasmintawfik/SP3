import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileIO {

    // Metode til at læse filmdata fra en fil
    public static ArrayList<Movie> readMovieData(String path) {
        ArrayList<Movie> data = new ArrayList<>();
        File file = new File(path);


        try (Scanner scan = new Scanner(file)) {
            //scan.nextLine(); // Skip header line

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] split = line.split(";");


                // Opretter en Movie baseret på den læste data
                String title = split[0].trim();
                int year = Integer.parseInt(split[1].trim());
                List<String> genres = Arrays.asList(split[2].split(","));  // Del genrerne ved komma
                double rating = Double.parseDouble(split[3].trim());
                System.out.println("Title: " + title);

                Movie movie = new Movie(title, year, genres.toString(), rating);
                data.add(movie);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
        } catch (NumberFormatException e) {
            System.out.println("Error in data format: " + e.getMessage());
        }

        return data;
    }
}

