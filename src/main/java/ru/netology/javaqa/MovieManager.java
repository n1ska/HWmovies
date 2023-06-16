package ru.netology.javaqa;

public class MovieManager {
    private String[] movieNames = new String[0];
    private int findLastMoviesCount = 5;

    public MovieManager() {
    }

    public MovieManager(int findLastMoviesCount) {
        this.findLastMoviesCount = findLastMoviesCount;
    }

    private String[] CreateEmptyArray() {
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

    public String[] findLast() {
        if (findLastMoviesCount <= 0) {
            return CreateEmptyArray();
        }

        if (getMoviesCount() <= findLastMoviesCount) {
            return CreateEmptyArray();
        }

        String[] result = new String[findLastMoviesCount];

        int firstCopyIndex = getMoviesCount() - findLastMoviesCount;

        int j = 0;
        for (int i = firstCopyIndex; i < getMoviesCount(); i++) {
            result[j] = movieNames[i];
            j++;
        }

        return result;
    }

}
