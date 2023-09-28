import org.junit.Assert;
import org.junit.Test;

import ca.yorku.themortageapp.MortgageModel;

import static org.junit.Assert.*;

public class MortgageModelTest {

    @Test
    public void computMonthlyPayment_1() {
        String p, a, i;
        p = "700000";
        i = "2.75";
        a = "25";

        MortgageModel m = new MortgageModel(p, a, i);

        Assert.assertEquals("$3,229.18", m.computePayment());


    }

    
}