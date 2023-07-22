package creditCard;

public class CreditCard {

    public static String checkCardType(String cardType) {

        if (cardType.startsWith("4")) {
            return "The card Type is Visa Card";
        } else if (cardType.startsWith("5")) {
            return "The card Type is Master Card";
        } else if (cardType.startsWith("37")) {
            return "The card Type is America express card";
        } else if (cardType.startsWith("6")) {
            return "The card Type is Discover cards";
        } else System.out.println("invalid");

        return cardType;
    }
    public static String checkCardLength(String cardLength) {
        if(cardLength.length() < 13 || cardLength.length() > 16 )
            return "invalid";
        else return cardLength;
    }

    public static String validateCardNumber(String number) {
        return null;
    }
}