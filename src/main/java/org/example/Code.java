package org.example;

import java.util.*;

public class Code {

    final int codeLength;
    final String codeString;

    static Code generateCode(int codeLength)
    {
        if (codeLength <= 2)
        {
            codeLength = 2;
        }
        if (codeLength >= 9)
        {
            codeLength = 9;
        }

        List<Character> digits = new ArrayList<>();
        for (char c = '0'; c <= '9'; c++) {
            digits.add(c);
        }

        Collections.shuffle(digits); // перемешиваем список

        StringBuilder code = new StringBuilder();
        for (int i = 0; i < codeLength; i++) {
            code.append(digits.get(i));
        }

        return new Code(codeLength, code.toString());
    }

    Code(int codeLength, String codeString)
    {
        this.codeLength = codeLength;
        this.codeString = codeString;
    }

    boolean isAttemptValid(String inputString)
    {
        if (inputString.length() != codeLength)
        {
            return false;
        }

        for (int i = 0; i < inputString.length(); i++) {
            if ((inputString.charAt(i) > '9') || (inputString.charAt(i) < '0'))
            {
                return false;
            }
        }

        return true;
    }

    byte[] compareTo(String attemptString)
    {
        byte correctDigitQuantity = 0;
        byte misplacedDigitQuantity = 0;

        for (int i = 0; i < this.codeLength; i++)
        {
            if (this.getCodeString().charAt(i) == attemptString.charAt(i))
            {
                correctDigitQuantity++;
                continue;
            }

            for (int j = 0; j < this.codeLength; j++)
            {
                if (this.getCodeString().charAt(i) == attemptString.charAt(j))
                {
                    misplacedDigitQuantity++;
                    break;
                }
            }
        }
        return new byte[]{correctDigitQuantity, misplacedDigitQuantity};
    }

    String getCodeString()
    {
        return this.codeString;
    }
}
