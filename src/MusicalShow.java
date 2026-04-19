class MusicalShow extends Show {
    private final String musicAuthor;
    private final String librettoText;

    public MusicalShow(String title,
                       int duration,
                       Director director,
                       String musicAuthor,
                       String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто: " + librettoText);
    }

}