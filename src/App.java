import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String powers[][], 
               powerNames[],
               powerName,
               skillName;
        int numberOfPower,
            skillCount;
        Scanner numberOfPowerScanner = new Scanner(System.in),
                powerNameScanner = new Scanner(System.in),
                skillCountScanner = new Scanner(System.in),
                skillNameScanner = new Scanner(System.in);

        System.out.print("How many powers do you have? ");
        numberOfPower = numberOfPowerScanner.nextInt();
        powers = new String[numberOfPower][];
        powerNames = new String[numberOfPower];

        System.out.println();
        for(int p = 0; p < numberOfPower; p++) {
            System.out.print("Enter your power " + (p + 1) + ": ");
            powerName = powerNameScanner.nextLine();

            powerNames[p] = powerName;

            System.out.println();
            System.out.print("How many skills does your " + powerNames[p] + " have? ");
            skillCount = skillCountScanner.nextInt();
            powers[p] = new String[skillCount];

            for(int s = 0; s < skillCount; s++) {
                System.out.println();
                System.out.print("Skill name for your skill " + (s + 1) + ": ");
                skillName = skillNameScanner.nextLine();

                powers[p][s] = skillName;
                System.out.println();
            }
        }

        System.out.println("Your powers are: ");
        System.out.println();
        for(int p = 0; p < powerNames.length; p++) {
            System.out.println(powerNames[p]);
            for(int s = 0; s < powers[p].length; s++) {
                System.out.println("    -" + powers[p][s]);
            }
        }

        numberOfPowerScanner.close();
        powerNameScanner.close();
        skillCountScanner.close();
        skillNameScanner.close();
    }
}
