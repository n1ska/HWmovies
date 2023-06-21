package ru.netology.javaqa;

public class MovieManager {
    private String[] movieNames = new String[0];
    private int findLastMoviesCount = 5;

    public MovieManager() {
    }

    public MovieManager(int findLastMoviesCount) {
        this.findLastMoviesCount = findLastMoviesCount;
    }

    private String[] сreateEmptyArray() {
        return new String[0];
    }

    public void appendMovie(String movieName) {
        int newSize = getMoviesCount() + 1;
        String[] newMovieNames = new String[newSize];

        for (int i = 0; i < movieNames.length; i++) {
            newMovieNames[i] = movieNames[i];
        }

        newMovieNames[newSize - 1] = movieName;
        movieNames = newMovieNames;
    }

    public int getMoviesCount() {
        return movieNames.length;
    }

    public String[] findAll() {
        return movieNames;
    }

    private int min(int a, int b){
        if (a > b){
            return b;
        }
        return a;
    }

    public String[] findLast() {
        int arraySize = min(findLastMoviesCount, getMoviesCount());

        if (arraySize < 0) {
            return сreateEmptyArray();
        }

        String[] result = new String[arraySize];

        int firstCopyIndex = getMoviesCount() - arraySize;

        int j = 0;
        for (int i = getMoviesCount() - 1; i >= firstCopyIndex; i--){
            result[j] = movieNames[i];
            j++;
        }

        return result;
    }

}
