package reflection.week5;

public class TvTableBuilderApplication {

    public static void main(String[] args) {
        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        TvTable tvTable  =tvTableBuilder.build();
        System.out.println(tvTable);
    }
}
