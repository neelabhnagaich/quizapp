
package quizapp.pojo;


public class Exam {

   public Exam(String examId, String language, int totalQuestions) {
        this.examId = examId;
        this.language = language;
        this.totalQuestions = totalQuestions;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public String getExamId() {
        return examId;
    }

    public String getLanguage() {
        return language;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }
    
    
    public String examId;
    public  String language;
    public  int totalQuestions;
    
    
}
