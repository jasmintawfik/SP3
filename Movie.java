public class Movie {
        //variabler
        private String title;
        private int year;
        private String genres;
        private double rating;


        private boolean isPlaying;
        private boolean isPaused;


        public Movie(String title, int year, String genres, double rating) {
            this.title = title;
            this.year = year;
            this.genres = genres.toString();
            this.rating = rating;

        }
        //getter og setter metode

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }

        public String getGenres() {
            return genres;
        }

        public double getRating() {
            return rating;
        }

    //play bruger vi i vores menu klasse linje 41
    //pause og stop bliver ikke brugt

    //
    public void play() {
        if (isPlaying) {
            if (isPaused) {
                isPaused = false;
                System.out.println("Resuming the movie: " + title);
            } else {
                System.out.println("The movie is already playing: " + title);
            }
        } else {
            isPlaying = true;
            System.out.println("Playing the movie: " + title);
        }
    }


    public void pause() {
        if (isPlaying) {
            if (isPaused) {
                System.out.println("The movie is already paused: " + title);
            } else {
                isPaused = true;
                System.out.println("Pausing the movie: " + title);
            }
        } else {
            System.out.println("The movie is not currently playing, so it cannot be paused.");
        }
    }


    public void stop() {
        if (isPlaying) {
            isPlaying = false;
            isPaused = false;
            System.out.println("Stopping the movie: " + title);
        } else {
            System.out.println("The movie is not currently playing, so it cannot be stopped.");
        }
    }


        @Override
        public String toString() {
            return title + " (" + year + ") - Genres: " + String.join(", ", genres) + " - Rating: " + rating;
        }

    }


//vi har snakker overordnet om vores getter og setter variablen vi gerne ville ha brugt pause og stop


