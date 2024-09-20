import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        task();
        task2();
        task3();
    }
    static void task(){
    String input = "Hello123World456!";

        int letterCount = 0;
        int digitCount = 0;
        int digit0to4Count = 0;
        int digit5to9Count = 0;
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letterCount++;
                if (Character.isUpperCase(ch)) {
                    uppercaseCount++;
                } else {
                    lowercaseCount++;
                }
            } else if (Character.isDigit(ch)) {
                digitCount++;
                int digit = Character.getNumericValue(ch);
                if (digit >= 0 && digit <= 4) {
                    digit0to4Count++;
                } else if (digit >= 5 && digit <= 9) {
                    digit5to9Count++;
                }
            }
        }

        System.out.println("Количество букв: " + letterCount);
        System.out.println("Количество цифр: " + digitCount);
        System.out.println("Количество цифр от 0 до 4: " + digit0to4Count);
        System.out.println("Количество цифр от 5 до 9: " + digit5to9Count);
        System.out.println("Количество больших букв: " + uppercaseCount);
        System.out.println("Количество маленьких букв: " + lowercaseCount);
    }
    static void task2 (){
                String str = "I like Java!!!";
                char lastChar = str.charAt(str.length() - 1);
                System.out.println("Последний символ строки: " + lastChar);

                boolean endsWithExclamation = str.endsWith("!!!");
                System.out.println("Строка заканчивается на '!!!': " + endsWithExclamation);

                boolean startsWithILike = str.startsWith("I like");
                System.out.println("Строка начинается с 'I like': " + startsWithILike);

                boolean containsJava = str.contains("Java");
                System.out.println("Строка содержит 'Java': " + containsJava);

                int javaPosition = str.indexOf("Java");
                System.out.println("Позиция подстроки 'Java': " + javaPosition);

                String replacedStr = str.replace('a', 'o');
                System.out.println("Строка после замены 'a' на 'o': " + replacedStr);

                String upperCaseStr = str.toUpperCase();
                System.out.println("Строка в верхнем регистре: " + upperCaseStr);

                String lowerCaseStr = str.toLowerCase();
                System.out.println("Строка в нижнем регистре: " + lowerCaseStr);
            }
        }
    }
    static void task3 (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку с четной длиной: ");
        String input = scanner.nextLine();

        if (input.length() % 2 != 0) {
            System.out.println("Ошибка: длина строки должна быть четной.");
        } else {
            String middleChars = getMiddleCharacters(input);
            System.out.println("Два средних символа: " + middleChars);
        }

        scanner.close();
    }

public static String getMiddleCharacters(String str) {
    int length = str.length();
    int middleIndex = length / 2;
    return str.substring(middleIndex - 1, middleIndex + 1);
}
}
