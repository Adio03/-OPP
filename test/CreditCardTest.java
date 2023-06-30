import creditCard.CreditCard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardTest {
    CreditCard creditCard = new CreditCard();
    @Test
    public void cardTypeTest(){
         String cards = CreditCard.checkCardType("4666338883");
        assertEquals("The card Type is Visa Card",cards);
        cards = CreditCard.checkCardType("5666338883");
        assertEquals("The card Type is Master Card", cards);
        cards = CreditCard.checkCardType("37345678");
        assertEquals("The card Type is America express card",cards);
        cards = CreditCard.checkCardType("637345678");
        assertEquals("The card Type is Discover cards",cards);
    }
    @Test
    public  void checkTheLengthOfCard(){
        String cardLength = CreditCard.checkCardLength("5237895462356789");
        assertEquals("5237895462356789",cardLength);
    }
    @Test
    public void validateCardNumberTest(){
        String validateCardNumber =CreditCard.validateCardNumber("4388576018410707");
        assertEquals("4388576018410707",validateCardNumber);



    }




}
