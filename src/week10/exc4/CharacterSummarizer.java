package week10.exc4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterSummarizer {

    List<Character> characterList = new CharacterReader().getCharacter();

    public long getCharacters() {
        return characterList.stream()
                .map(e -> e.getName())
                .count();
    }
    public long getDeadCharacters() {
        return characterList.stream()
                .filter(e-> !e.getDeathYear().isEmpty())
                .count();
    }
     public String getPercentageOfDeadChar(){
        return characterList.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(e -> e.getGender()
                        .replaceAll("0","Women").replaceAll("1","Men"), Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey() + " " + (e.getValue() * 100) / getDeadCharacters() + "%")
                .collect(Collectors.joining(" "));
    }
    public String getBiggestDeathCount(){
        return characterList.stream()
                .filter(e-> !e.getBookOfDeath().isEmpty())
                .collect(Collectors.groupingBy(Character::getBookOfDeath, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Book biggest death count: " +e.getKey()+ " and its: " + e.getValue())
                .limit(1)
                .collect(Collectors.joining(" "));
    }
    public List<String> getDeadPeopleNames(){
        return characterList.stream()
                .filter(e-> !e.getBookOfDeath().isEmpty())
                .filter(e-> e.getBookOfDeath().equals("3"))
                .collect(Collectors.groupingBy(Character::getName, Collectors.counting()))
                .entrySet().stream()
                .map(e->  e.getKey())
                .collect(Collectors.toList());
    }
    public List<String> getTwoBiggestAllegiance(){
        return characterList.stream()
                .filter(e-> !e.getBookOfDeath().isEmpty())
                //.filter(e-> e.getBookOfDeath().equals("3"))
                .collect(Collectors.groupingBy(Character::getAllegiances, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(Map.Entry::getKey)
                .limit(2)
                .collect(Collectors.toList());
    }
    public String getNobilityDeathPercentage() {
        return characterList.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e->e.getNobility().equals("1"))
                .collect(Collectors.groupingBy(Character::getNobility, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey().replaceAll("1","nobility") + ": " +
                        (e.getValue() * 100) / getDeadCharacters() + "%")
                .collect(Collectors.joining(" "));
    }
    public List<String> getMostStarkAlligiance(){
        return characterList.stream()
                .filter(e -> e.getAllegiances().equals("Stark"))
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(e -> e.getBookOfDeath(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "book : " + e.getKey()+" : in "+e.getValue()+" times")
                .limit(1)
                .collect(Collectors.toList());
    }
    public List<String> getMostLannisterAlligiance(){
        return characterList.stream()
                .filter(e -> e.getAllegiances().equals("Lannister"))
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(e -> e.getBookOfDeath(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "book : " + e.getKey()+" : in "+e.getValue()+" times")
                .limit(1)
                .collect(Collectors.toList());
    }
    public long countDiedStarks(){
        return characterList.stream()
                .filter(e->e.getAllegiances().equals("Stark"))
                .filter(e->!e.getDeathYear().isEmpty())
                .count();
    }
    public long countDiedLannister(){
        return characterList.stream()
                .filter(e->e.getAllegiances().equals("Lannister"))
                .filter(e->!e.getDeathYear().isEmpty())
                .count();
    }
    public boolean getAliveCharacters(){
        return characterList.stream()
                .anyMatch(e-> e.getBookOfDeath().isEmpty());
    }
    public boolean getSameKilledTiming(){
        return characterList.stream()
                .anyMatch(e-> e.getDeathChapter()== e.getBookIntroChapter());
    }

}