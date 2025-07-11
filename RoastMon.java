import java.util.*;

public class RoastMon {
    static Scanner scanner = new Scanner(System.in);
    static String userName = "wannabe";
    static Random rand = new Random();

    static String[] pewQuotes = {
        "Bruh... even my IKEA shelf has more character than that response.",
        "You remind me of a laggy server — pointless and frustrating.",
        "This ain't Minecraft. Stop digging yourself deeper.",
        "You're the reason rage-quit was invented."
    };

    static String[] tarrantinoQuotes = {
        "You ever shut up or just breathe between insults?",
        "Kid, if sarcasm were a crime, you’d be doing 25 to life.",
        "You talk like you skipped every Tarantino scene with dialogue.",
        "I’d say you have potential, but I’m not in the mood to lie."
    };

    public static void main(String[] args) {
        System.out.println("🎬 SassyBot 9000: Who dares summon me?");
        userName = scanner.nextLine();

        System.out.println("SassyBot: Ugh, fine. Let’s chat, " + userName + ". Try not to bore me. Type 'ragequit' to escape.");

        while (true) {
            System.out.print(userName + ": ");
            String input = scanner.nextLine().toLowerCase();

            if (input.contains("ragequit")) {
                System.out.println("SassyBot: Coward. I expected nothing. And you delivered.");
                break;
            } else if (input.contains("game") || input.contains("bro")) {
                System.out.println("PewMode: " + getRandom(pewQuotes));
            } else if (input.contains("movie") || input.contains("tarantino") || input.contains("kill")) {
                System.out.println("QT Mode: " + getRandom(tarrantinoQuotes));
            } else if (input.contains("love") || input.contains("sad")) {
                System.out.println("SassyBot: Save the drama for your therapist, " + userName + ".");
            } else {
                System.out.println("SassyBot: " + getRandomComboInsult());
            }
        }
    }

    public static String getRandom(String[] arr) {
        return arr[rand.nextInt(arr.length)];
    }

    public static String getRandomComboInsult() {
        String[] intros = {"Bruh.", "Lemme tell you something.", "Okay listen here,", "Dead serious—"};
        String[] burns = {
            "Your logic is like a Quentin Tarantino plot — messy and violent.",
            "That was so cringe PewDiePie unsubscribed from reality.",
            "You're like an unskippable ad — loud, pointless, and no one asked for you.",
            "I've seen 404 pages with more personality."
        };
        return getRandom(intros) + " " + getRandom(burns);
    }
}
