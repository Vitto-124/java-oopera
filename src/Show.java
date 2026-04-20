import java.util.ArrayList;

class Show {
    private final String title;
    private final int duration; // длительность в минутах
    private final Director director;
    private final ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) listOfActors.add(actor);
        else System.out.println("Такой актёр уже есть в списке");
    }

    // Заменяем актера по имени и фамилии
    public void replaceActor(Actor newActor, String oldName, String oldSurname) {
        boolean found = false;

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getName().equals(oldName) &&
                    currentActor.getSurname().equals(oldSurname)) {

                listOfActors.set(i, newActor);
                found = true;
                System.out.println("Актёр " + currentActor + " заменён на " + newActor + ".");
                break;
            }
        }

        if (!found) {
            System.out.println("В спектакле '" + title + "' не найден актёр '" + oldName + " " + oldSurname + "'.");
        }
    }

    public void printActorsList() {
        System.out.println("Список актёров спектакля '" + title + "':");
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor);
        }
        System.out.println();
    }

    public Director getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}
