package org.example;

public class GameManager {
    static Code secretCode;
    static byte tryCount;

    static void startGame() {
        secretCode = Code.generateCode(4);
        tryCount = 0;

        GameplayScreen.getGameplayScreen().getLastResultTextArea().setText("Welcome to the game!\nTry to guess the " + secretCode.codeLength + " digit code.\n");
        GameplayScreen.getGameplayScreen().getAttemptsTextArea().setText("");
        GameplayScreen.getGameplayScreen().getGuessTextField().setText("");
    }

    static void receiveGuess(String input) {

        GameplayScreen.getGameplayScreen().getGuessTextField().setText("");

        if (!secretCode.isAttemptValid(input))
        {
            GameplayScreen.getGameplayScreen().getLastResultTextArea().setText("Input is invalid,\nit can't be the code.\n");
            return;
        }

        tryCount++;

        byte[] result = secretCode.compareTo(input);

        GameplayScreen.getGameplayScreen().getAttemptsTextArea().append(input + "       " + result[0] + "             " + result[1] + "\n");

        if (result[0] == secretCode.codeLength)
        {
            GameplayScreen.getGameplayScreen().getLastResultTextArea().setText("Congratulations!\nYou got the code right!\nIt took " + tryCount + " attempts.\n");
            return;
        }

        GameplayScreen.getGameplayScreen().getLastResultTextArea().setText(input + " is a wrong guess.\n" + result[0] + " correct digits,\n" + result[1] + " misplaced digits.\n");
    }
}
