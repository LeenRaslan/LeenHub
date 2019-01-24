package week10.exc4;

public class CharacterApplication {
    public static void main(String[] args) {

        CharacterSummarizer summarizer = new CharacterSummarizer();
        System.out.println("Total namber of characters appear in the books: " +summarizer.getCharacters());

        System.out.println("Total number of dead characters: "+summarizer.getDeadCharacters());

        System.out.println("Percentage of men and women that died in all books: ");
        System.out.println(summarizer.getPercentageOfDeadChar());
        System.out.println("\n");

        System.out.println(summarizer.getBiggestDeathCount());

        System.out.println("Names of characters who died in that book: ");
        System.out.println(summarizer.getDeadPeopleNames());
        System.out.println("\n");

        System.out.println("Names of the two allegiances that have the biggest dead count: ");
        summarizer.getTwoBiggestAllegiance().forEach(System.out::println);

        System.out.println("percentage of deaths belong to nobility characters: ");
        System.out.println(summarizer.getNobilityDeathPercentage());

        System.out.println("most amount of dead characters from the Stark allegiance: ");
        System.out.println(summarizer.getMostStarkAlligiance());

        System.out.println("most amount of dead characters from the Lannister allegiance");
        System.out.println(summarizer.getMostLannisterAlligiance());

        System.out.println("Number of characters in Starks have died");
        System.out.println(summarizer.countDiedStarks());

        System.out.println("Number of characters in Lannister have died");
        System.out.println(summarizer.countDiedLannister());

        System.out.println("Is there any character who didn’t die?");
        System.out.println(summarizer.getAliveCharacters());

        System.out.println("Has any character ever been killed in the same chapter that it got introduced?");
        System.out.println(summarizer.getSameKilledTiming());
    }
}
