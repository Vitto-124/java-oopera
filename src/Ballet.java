class Ballet extends MusicalShow {
    private final String choreographer;

    public Ballet(String title, int duration, Director director, String musicAuthor,
                  String librettoText, String choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return "Балет '" + getTitle() + "' (длительность: " + getDuration() + " мин), " +
                "режиссёр: " + getDirector() + ", хореограф: " + choreographer;
    }
}
