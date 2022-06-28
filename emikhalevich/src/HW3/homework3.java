package HW3;

import java.util.Scanner;

public class homework3 {

    public static QuestionsForHW3[] questionsGeneration() {
        QuestionsForHW3 Questions1 = new QuestionsForHW3();
        Questions1.setTextQuestion("Вопрос 1. Назовите столицу Сербии? Указать номер варианта ответа");
        QuestionsForHW3 Questions2 = new QuestionsForHW3();
        Questions2.setTextQuestion("Вопрос 2. Что из перечисленного не является буквой греческого алфавита? Указать номер варианта ответа");
        QuestionsForHW3 Questions3 = new QuestionsForHW3();
        Questions3.setTextQuestion("Вопрос 3. Значение физической постоянной ускорения свободного падения (нормальное) в м/с^2? Указать номер варианта ответа");
        QuestionsForHW3 Questions4 = new QuestionsForHW3();
        Questions4.setTextQuestion("Вопрос 4. Что из перечисленного является единицей измерения силы света (СИ)? Указать номер варианта ответа");
        Questions1.lines = new AnswerOptionsForHW3(new String[]{"1. Тиват", "2. Белгород ", "3. Вране", "4. Белград"}, 4);
        Questions2.lines = new AnswerOptionsForHW3(new String[]{"1. Φ", "2. Δ", "3. Й", "4. \u03A1"}, 3);
        Questions3.lines = new AnswerOptionsForHW3(new String[]{"1. 0,67", "2. 273,15", "3. 9,81", "4. 1,618"}, 3);
        Questions4.lines = new AnswerOptionsForHW3(new String[]{"1. Кандела", "2. Кельвин", "3. Моль", "4. Люкс"}, 1);
        return new QuestionsForHW3[]{Questions1, Questions2, Questions3, Questions4};
    }

    public static void main(String[] arg) {
        int correctCount = 0;
        int wrongCount = 0;

        Scanner scan = new Scanner(System.in);
        QuestionsForHW3[] questions = questionsGeneration();
        int sizeQuestions = questions.length;
        int[] allAnswers = {1, 1, 1, 1};
        String[] CorrectAnswers = {"ok", "ok", "ok", "ok"};
        for (int i = 0; i < sizeQuestions; i++) {
            QuestionsForHW3 currentQuestions = questions[i];
            System.out.println(currentQuestions.getTextQuestion());
            int sizeAnswer = currentQuestions.lines.textAnswer.length;
            for (int j = 0; j < sizeAnswer; j++) {
                System.out.println(currentQuestions.lines.textAnswer[j]);
            }
            System.out.println("Ваш вариант ответа");
            int number;
            while (!scan.hasNextInt()) {
                System.out.println("Необходимо ввести цифру");
                scan.next();
            }
            number = scan.nextInt();
            allAnswers[i] = number;
            System.out.println("Правильный ответ: " + currentQuestions.lines.result + "\n");
            if (currentQuestions.lines.result == number) {
                ++correctCount;
                CorrectAnswers[i] = "правильно";
            } else {
                ++wrongCount;
                CorrectAnswers[i] = "неправильно";
            }
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount + "\n" + "Вопрос 1 - " + CorrectAnswers[0] + "\n" + "Вопрос 2 - " + CorrectAnswers[1] + "\n" + "Вопрос 3 - " + CorrectAnswers[2] + "\n" + "Вопрос 4 - " + CorrectAnswers[3]);
    }
}
