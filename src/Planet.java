import java.util.Random;

public class Planet {
    String name;
    Matter matter = Matter.SOLID;
    long diameter;

    public Planet() {
        // Constructeur pour initialiser la planète avec des valeurs générées
        name = generateName();
        matter = generateMatter();
        diameter = generateDiameter();
    }

    private String generateName() {
        // Liste de syllabes pour générer des noms de planètes
        String[] syllables = {"Zor", "xan", "mar", "tor", "ze", "dil", "tar", "lon", "vak", "nim", "rax", "pol", "fir", "ul", "om", "qua", "ryn"};
        Random random = new Random();

        // Générer un nom avec 2 à 4 syllabes
        int numSyllables = 2 + random.nextInt(3);  // Entre 2 et 4 syllabes
        StringBuilder name = new StringBuilder();

        for (int i = 0; i < numSyllables; i++) {
            name.append(syllables[random.nextInt(syllables.length)]);
        }

        // Mettre la première lettre en majuscule
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }


    private Matter generateMatter() {
        // Retourner une matière aléatoire (exemple : SOLID, GAS, LIQUID)
        Matter[] matters = Matter.values();
        Random random = new Random();
        return matters[random.nextInt(matters.length)];
    }

    private long generateDiameter() {
        // Retourner un diamètre aléatoire (par exemple entre 1000 et 100000 km)
        Random random = new Random();
        return 1000 + random.nextInt(100000);
    }

    public void discover() {
        // Afficher les informations de la planète
        System.out.println("Découverte d'une nouvelle planète !");
        System.out.println("Nom : " + name);
        System.out.println("Matière : " + matter);
        System.out.println("Diamètre : " + diameter + " km");
    }
}