public class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }




    public static void powerOfMagicTransgressionDistance(Hogwarts student1, Hogwarts student2){
        int comparison1 = student1.getPowerOfMagic() + student1.getTransgressionDistance();
        int comparison2 = student2.getPowerOfMagic() + student2.getTransgressionDistance();
        if (comparison1 > comparison2){
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else if (comparison1 < comparison2) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " " + student2.getName() + " Обладают большой мощностью магии");
        }
    }
}