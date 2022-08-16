package HW3;

public class QuestionsForHW3 {

    private String textQuestion;
    AnswerOptionsForHW3 lines;

    public void setTextQuestion(String textQuestion) {
        if (textQuestion == null)
            throw new IllegalArgumentException();
        this.textQuestion = textQuestion;
    }

    public String getTextQuestion() {
        return textQuestion;
    }
}
