public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 1.85);
        Actor actor2 = new Actor("Мария", "Сидорова", Gender.FEMALE, 1.70);
        Actor actor3 = new Actor("Алексей", "Козлов", Gender.MALE, 1.78);

        Director director1 = new Director("Сергей", "Иванов", Gender.MALE, 5);
        Director director2 = new Director("Елена", "Николаева", Gender.FEMALE, 3);

        Person tchaikovsky = new Person("Пётр", "Чайковский", Gender.MALE);
        Person phokin = new Person("Михаил", "Фокин", Gender.MALE);

        Show regularShow = new Show("Гамлет", 180, director1);
        Opera opera = new Opera("Кармен", 150, director2, tchaikovsky,
                "История о любви и страсти в Испании...", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 160, director1, tchaikovsky,
                "Волшебная история о заколдованной принцессе...", phokin);

        regularShow.addActor(actor1); // Распределяем актёров по спектаклям
        regularShow.addActor(actor2);
        opera.addActor(actor2);
        opera.addActor(actor3);
        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("\n~~~~~~ Спектакль 'Кармен' ~~~~~~");
        opera.printLibretto();
        System.out.println(director2);
        opera.printActorsList();

        System.out.println("\n~~~~~~ Спектакль 'Лебединое озеро' ~~~~~~");
        ballet.printLibretto();
        System.out.println(director1);
        ballet.printActorsList();

        System.out.println("\n~~~~~~ Спектакль 'Гамлет' ~~~~~~");
        System.out.println(director1);
        regularShow.printActorsList();

        System.out.println("~~~~~~~~~ Замена актёра ~~~~~~~~~"); // Заменяем актёра в одном из спектаклей
        ballet.replaceActor(actor2, "Алексей","Козлов");
        ballet.printActorsList(); // Ещё раз выводим список актёров для балета после замены

        System.out.println("~~~ Попытка замены несуществующего актёра ~~~"); // Пытаемся заменить несуществующего актёра
        regularShow.replaceActor(actor3, "Иван","Смирнов");
    }
}
