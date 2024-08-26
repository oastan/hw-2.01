public class Main {
public static void main(String[] args){
    Slytherin dracoMalcfoy = new Slytherin("Draco Malfoy", 85, 77, 89, 90, 99);
    Slytherin grahamMontague = new Slytherin("Graham Montague", 88, 79, 67, 67, 80);
    Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 90, 82, 59,16,34);

    Ravenclaw choChang = new Ravenclaw("Cho Chang", 48, 59, 60,89,55);
    Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 70, 39,80,47,39);
    Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 25, 45, 90,28,90);

    Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 10, 95, 51,70,58);
    Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 20, 48, 33,67,28);
    Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley" , 70, 35, 40,10,56);

    Gryffindor harryPotter = new Gryffindor("Harry Potter", 95, 90, 68,60,79);
    Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 80, 90, 100,90,95);
    Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 50,30,0,67,35);

    //Gryffindor
    harryPotter.studentInformationGryffindor();
    hermioneGranger.studentInformationGryffindor();
    ronWeasley.studentInformationGryffindor();

    System.out.println();
    //Hufflepuff
    zachariasSmith.studentInformationHufflepuff();
    cedricDiggory.studentInformationHufflepuff();
    justinFinchFletchley.studentInformationHufflepuff();

    System.out.println();
    //Ravenclaw
    choChang.studentInformationRavenclaw();
    padmaPatil.studentInformationRavenclaw();
    marcusBelby.studentInformationRavenclaw();

    System.out.println();
    //Slytherin
    dracoMalcfoy.studentInformationSlytherin();
    grahamMontague.studentInformationSlytherin();
    gregoryGoyle.studentInformationSlytherin();

    System.out.println();


    Gryffindor.studentComparisonGryffindor(harryPotter, hermioneGranger);
    Hufflepuff.studentComparisonHufflepuff(zachariasSmith, justinFinchFletchley);
    Ravenclaw.studentComparisonRavenclaw(padmaPatil, marcusBelby);
    Slytherin.studentComparisonSlytherin(dracoMalcfoy, gregoryGoyle);

    System.out.println();

   Hogwarts.powerOfMagicTransgressionDistance(dracoMalcfoy, harryPotter);
}
}