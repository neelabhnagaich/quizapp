/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.pojo;

import java.util.Objects;

/**
 *
 * @author neelabh
 */
public class Answer {

    public Answer(String examid, String subject, int qno, String chosenAnswer, String correctAnser) {
        this.examid = examid;
        this.subject = subject;
        this.qno = qno;
        this.chosenAnswer = chosenAnswer;
        this.correctAnser = correctAnser;
    }

    @Override
    public String toString() {
        return "Answer{" + "examid=" + examid + ", subject=" + subject + ", qno=" + qno + ", chosenAnswer=" + chosenAnswer + ", correctAnser=" + correctAnser + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Answer other = (Answer) obj;
        if (this.qno != other.qno) {
            return false;
        }
        if (!Objects.equals(this.examid, other.examid)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.chosenAnswer, other.chosenAnswer)) {
            return false;
        }
        if (!Objects.equals(this.correctAnser, other.correctAnser)) {
            return false;
        }
        return true;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public void setChosenAnswer(String chosenAnswer) {
        this.chosenAnswer = chosenAnswer;
    }

    public void setCorrectAnser(String correctAnser) {
        this.correctAnser = correctAnser;
    }

    public String getExamid() {
        return examid;
    }

    public String getSubject() {
        return subject;
    }

    public int getQno() {
        return qno;
    }

    public String getChosenAnswer() {
        return chosenAnswer;
    }

    public String getCorrectAnser() {
        return correctAnser;
    }
    private String examid;
    private String subject;
    private int qno;
    private String chosenAnswer;
    private String correctAnser;
    
}
