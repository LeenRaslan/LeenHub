package reflection.week5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TvTableBuilderTest {

    TvTableBuilder tvTableBuilder = new TvTableBuilder();

    @Test
    void build() {
        String tvTable = tvTableBuilder.build();
        Assertions.assertEquals(tvTable,);

    }
}