
package quizapp.pojo;

import java.util.ArrayList;


public class QuestionStore {
    
    ArrayList<Questions> questionList;
    
    public QuestionStore()
    {
        questionList  = new ArrayList<>();
        
    }
    public void addQuestion (Questions q)
    {
        questionList.add(q);
                           
        
    }
    public Questions getQuestion(int pos)
    {
        return questionList.get(pos);
    }
    public void removeQuestion( int pos)
    {
        questionList.remove(pos);
    }
    public Questions setQuestionAdd(int pos, Questions q)
    {
       return  questionList.set(pos,q);
    }
    public ArrayList<Questions> getAllquestion()
    {
        return questionList;
    }
    public int getCount(){
        return questionList.size(); 
    }
    
}
