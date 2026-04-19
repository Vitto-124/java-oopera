class Opera extends MusicalShow {
    private final int choirSize;

    public Opera(String title, int duration, Director director, String musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return "Опера '" + getTitle() + "' (длительность: " + getDuration() + " мин), " +
                "режиссёр: " + getDirector() + ", хор: " + choirSize + " человек";
    }
}