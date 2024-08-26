

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int bravery, int honor, int nobility, int powerOfMagic, int transgressionDistance) {
        super(name, powerOfMagic, transgressionDistance);
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHonor() {
        return honor;
    }

    public int getNobility() {
        return nobility;
    }

    @Override
    public String toString() {
        return getName() + nobility + honor + bravery;
    }


    public void studentInformationGryffindor(){
        System.out.println(getName() + " " + nobility + " " + honor + " " + bravery);
    }

    public static void studentComparisonGryffindor(Gryffindor comparison1, Gryffindor comparison2){
        int student1 = comparison1.getNobility() + comparison1.getHonor() + comparison1.getBravery();
        int student2 = comparison2.getNobility() + comparison2.getHonor() + comparison2.getBravery();
        if (student1 > student2){
            System.out.println(comparison1.getName() + " лучший ученик Гриффиндора, чем " + comparison2.getName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getName() + " лучший ученик Гриффиндора, чем " + comparison1.getName());
        } else {
            System.out.println(comparison1.getName() + " " + comparison2.getName() + " Лучшие ученики Гриффиндора.");
        }
    }
}