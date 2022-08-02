import java.text.SimpleDateFormat;
import java.util.Date;

public class AlfredQuotes {

  public String basicGreeting() {
    // You do not need to code here, this is an example method
    return "Hello, lovely to see you. How are you?";
  }

  public String guestGreeting(String name, String dayPeriod) {
    // YOUR CODE HERE

    // return "Hello, " + name + ". Lovely to see you.";
    return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
  }

  public String guessGreeting(String name) {
    Date date = new Date();
    String pattern = "dd-mm-yyyy";
    SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
    return "hi " + name + " " + dateFormat.format(date);
  }

  public String dateAnnouncement() {
    // YOUR CODE HERE
    Date date = new Date();
    return "It is currently " + date;
  }

  public String respondBeforeAlexis(String conversation) {
    // YOUR CODE HERE
    String phrase = conversation.indexOf("Alexis") > -1
      ? "She's really of no help. What can I get for you?"
      : conversation.indexOf("Alfred") > -1
        ? "At your service, naturally. How may I be of assistance?"
        : "Right. And with that I shall retire";
    return phrase;
  }

  public String yell(String conversation) {
    return conversation.trim();
  }
  // NINJA BONUS
  // See the specs to overload the guessGreeting method
  // SENSEI BONUS
  // Write your own AlfredQuote method using any of the String methods you have learned!
}
