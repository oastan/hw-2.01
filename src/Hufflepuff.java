
public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honest;

    public Hufflepuff(String name, int hardworking, int honest, int loyalty, int powerOfMagic, int transgressionDistance) {
        super(name, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.honest = honest;
        this.loyalty = loyalty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getHonest() {
        return honest;
    }

    public int getLoyalty() {
        return loyalty;
    }

    @Override
    public String toString() {
        return getName() + hardworking + loyalty + honest;
    }

    public void studentInformationHufflepuff(){
        System.out.println(getName() + " " + hardworking + " " + loyalty + " " + honest);
    }


    public static void studentComparisonHufflepuff(Hufflepuff comparison1, Hufflepuff comparison2){
        int student1 = comparison1.getHardworking() + comparison1.getLoyalty() + comparison1.getHonest();
        int student2 = comparison2.getHardworking() + comparison2.getLoyalty() + comparison2.getHonest();
        if (student1 > student2){
            System.out.println(comparison1.getName() + " лучший ученик Пуффендуя, чем " + comparison2.getName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getName() + " лучший ученик Пуффендуя, чем " + comparison1.getName());
        } else {
            System.out.println(comparison1.getName() + " " + comparison2.getName() + " Лучшие ученики Пуффендуя.");
        }
    }
}