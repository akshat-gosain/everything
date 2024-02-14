import java.util.ArrayList;
import java.util.List;

public class compre {
    
class Question {
    private String questionText;
    private List<String> options;
    private int correctOptionIndex;

    public Question(String questionText, List<String> options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }
}

class Answer {
    private String studentName;
    private List<Integer> selectedOptions;

    public Answer(String studentName, List<Integer> selectedOptions) {
        this.studentName = studentName;
        this.selectedOptions = selectedOptions;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<Integer> getSelectedOptions() {
        return selectedOptions;
    }
}

class AutomatedExam {
    private List<Question> questions;
    private List<Answer> answers;

    public AutomatedExam() {
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void submitAnswer(Answer answer) {
        answers.add(answer);
    }

    public void modifyAnswerKey(int questionIndex, int newCorrectOptionIndex) {
        if (questionIndex >= 0 && questionIndex < questions.size()) {
            Question question = questions.get(questionIndex);
            question.setCorrectOptionIndex(newCorrectOptionIndex);
        }
    }

    public void regradeAnswers() {
        for (Answer answer : answers) {
            int score = 0;
            List<Integer> selectedOptions = answer.getSelectedOptions();
            for (int i = 0; i < selectedOptions.size(); i++) {
                if (selectedOptions.get(i) == questions.get(i).getCorrectOptionIndex()) {
                    score++;
                }
            }
            System.out.println("Student: " + answer.getStudentName() + ", Score: " + score);
        }
    }
}


}
