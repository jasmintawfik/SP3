import java.util.List;
import java.util.List;

    public class FilmProgram {
        private String titel;
        private int year;
        private List<String> genre;
        private double rating;

        public FilmProgram(String titel, int year, String genre, double rating) {
            this.titel = titel;
            this.year = year;


            this.genre = List.of(genre.split(","));

            this.rating = rating;
        }

        // Getter methods
        public String getTitel() {
            return titel;
        }

        public int getYear() {
            return year;
        }

        public List<String> getGenre() {
            return genre;
        }

        public double getRating() {
            return rating;
        }

        // Overridden toString method for displaying the film information
        @Override
        public String toString() {
            return titel + " (" + year + ") - Genre: " + String.join(", ", genre) + " - Rating: " + rating;
            //String join skal slettes vi har ik haft om det før
        }
    }


