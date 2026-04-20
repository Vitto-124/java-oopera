class Actor extends Person {
    private final double height; // рост в метрах

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Double.compare(actor.height, height) == 0 &&
                name.equals(actor.name) &&
                surname.equals(actor.surname);
    }

    @Override
    public int hashCode() {
        int hash = name.hashCode();
        hash = 31 * hash + surname.hashCode();
        hash = 31 * hash + Double.hashCode(height);
        return hash;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + " м)";
    }

}
