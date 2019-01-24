package week10.exc4;

public class CharacterApplication {
    public static void main(String[] args) {
        CharacterSummarizer summarizer = new CharacterSummarizer();
        System.out.println("Total namber of characters appear in the books: ");
        System.out.println(summarizer.getCharacters());

        System.out.println("Total number of dead characters: ");
        System.out.println(summarizer.getDeadCharacters());

        System.out.println("Percentage of men and women that died in all books: ");
        System.out.println(summarizer.getPercentageOfDeadChar());
        System.out.println("\n");


        System.out.println(summarizer.getBiggestDeathCount());

        System.out.println("Names of characters who died in that book: ");
        System.out.println(summarizer.getDeadPeopleNames());
        System.out.println("\n");

        System.out.println("Names of the two allegiances that have the biggest dead count: ");
        summarizer.getTwoBiggestAllegiance().forEach(System.out::println);

        System.out.println(summarizer.getNobilityDeathPercentage());

        System.out.println(summarizer.getMostStarkAlligiance());

        System.out.println(summarizer.getMostLannisterAlligiance());

        System.out.println(summarizer.countDiedStarks());

        System.out.println(summarizer.countDiedLannister());

        System.out.println(summarizer.getAliveCharacters());

        System.out.println(summarizer.getSameKilledTiming());
    }
}
