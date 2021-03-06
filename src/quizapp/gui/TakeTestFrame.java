
package quizapp.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import quizapp.dao.PerformanceDAO;
import quizapp.dao.QuestionsDAO;
import quizapp.pojo.Answer;
import quizapp.pojo.AnswerStore;
import quizapp.pojo.Exam;
import quizapp.pojo.Performance;
import quizapp.pojo.QuestionStore;
import quizapp.pojo.Questions;
import quizapp.pojo.UsersProfile;


public class TakeTestFrame extends javax.swing.JFrame {

    private Exam exam;
    private QuestionStore qstore;
    private AnswerStore astore;
    
    private int qno ,pos=0;
    
    public TakeTestFrame() {
        initComponents();
           setLocationRelativeTo(null);
           lblName.setText("Hello "+UsersProfile.getUsername());
           qstore = new QuestionStore();
           astore = new AnswerStore();
           qno = 1;
    }
    public TakeTestFrame(Exam exam)
    {
        this();
        this.exam = exam;
        lblTitle.setText(exam.getLanguage().toUpperCase()+" PAPER");
        loadQuestion();
       lblQno.setText("QuestionNo:"+qno);

        showQuestion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        lblQno = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jrbOption3 = new javax.swing.JRadioButton();
        jrbOption2 = new javax.swing.JRadioButton();
        jrbOption4 = new javax.swing.JRadioButton();
        jrbOption1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 153, 0));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 153, 0));
        lblTitle.setText(" JAVA PAPER");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/gui/good luck2.jpg"))); // NOI18N

        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        lblQno.setBackground(new java.awt.Color(0, 0, 0));
        lblQno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 153, 0));
        lblQno.setText("Question No.");

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 153, 0));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 153, 0));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 153, 0));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        btnPrevious.setBackground(new java.awt.Color(0, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 153, 0));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Log Out");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        lblName.setBackground(new java.awt.Color(0, 0, 0));
        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 153, 0));

        jrbOption3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbOption3);
        jrbOption3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbOption3.setForeground(new java.awt.Color(255, 153, 0));
        jrbOption3.setText("3");

        jrbOption2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbOption2);
        jrbOption2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbOption2.setForeground(new java.awt.Color(255, 153, 0));
        jrbOption2.setText("2");
        jrbOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOption2ActionPerformed(evt);
            }
        });

        jrbOption4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbOption4);
        jrbOption4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbOption4.setForeground(new java.awt.Color(255, 153, 0));
        jrbOption4.setText("4");

        jrbOption1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbOption1);
        jrbOption1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbOption1.setForeground(new java.awt.Color(255, 153, 0));
        jrbOption1.setText("1");
        jrbOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOption1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jrbOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jrbOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQno)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQno))
                        .addGap(77, 77, 77))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbOption1)
                            .addComponent(jrbOption3))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbOption2)
                    .addComponent(jrbOption4))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel)
                    .addComponent(btnDone))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
     
        String chosenAnswer= getAnswer();
        if(chosenAnswer!=null)
        {
        Questions question = qstore.getQuestion(pos);
        String correctAnswer = question.getCorrectAnswer();

        Answer newanswer = new Answer(exam.getExamId(), exam.getLanguage(), qno, chosenAnswer,correctAnswer);
       
       Answer answer =  astore.getAnswerByQno(qno);
       if(answer==null)
       {
           astore.addAnswer(newanswer);
       }
       else{
           if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false)
           {
               int apos = astore.removeAnswer(answer);
               astore.setAnswerAt(apos,newanswer);
           }
       }
        }
        pos++;
        
        if(pos>=qstore.getCount())
        {
            pos = 0;
        }
         qno++;
         if(qno>qstore.getCount())
        {
            qno= 1;
            
        }
        lblQno.setText("QuestionNo:"+qno);
        showQuestion();
       

        
     
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void jrbOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOption2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbOption2ActionPerformed

    private void jrbOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbOption1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new StudentOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
      
         String chosenAnswer= getAnswer();
        if(chosenAnswer!=null)
        {
        Questions question = qstore.getQuestion(pos);
        String correctAnswer = question.getCorrectAnswer();

        Answer newanswer = new Answer(exam.getExamId(), exam.getLanguage(), qno, chosenAnswer,correctAnswer);
       
       Answer answer =  astore.getAnswerByQno(qno);
       if(answer==null)
       {
           astore.addAnswer(newanswer);
       }
       else{
           if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false)
           {
               int apos = astore.removeAnswer(answer);
               astore.setAnswerAt(apos,newanswer);
           }
       }
        }
        pos--;
        
        if(pos<0)
        {
            pos =0;
            return;
        }
         qno--;
         if(qno<1)
        {
           qno= 1 ;
           return;
            
        }
        lblQno.setText("QuestionNo:"+qno);
        showQuestion();
       

        
     
        
        
      
       
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
         
   String chosenAnswer= getAnswer();
        if(chosenAnswer!=null)
        {
        Questions question = qstore.getQuestion(pos);
        String correctAnswer = question.getCorrectAnswer();

        Answer newanswer = new Answer(exam.getExamId(), exam.getLanguage(), qno, chosenAnswer,correctAnswer);
       
       Answer answer =  astore.getAnswerByQno(qno);
       if(answer==null)
       {
           astore.addAnswer(newanswer);
       }
       else{
           if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())== false)
           {
               int apos = astore.removeAnswer(answer);
               astore.setAnswerAt(apos,newanswer);
           }
       }
        }
      int right = 0,wrong = 0 ;
      for(Questions question: qstore.getAllquestion())
      {
          int qno = question.getQno();
          Answer answer = astore.getAnswerByQno(qno);
          if(answer==null)
              continue;
          else{
              String chosenanswer = answer.getChosenAnswer();
              String correctanswer = answer.getCorrectAnser();
              if(chosenanswer.equals(correctanswer))
                  ++right;
              else
                  ++wrong;
              
          }
       }
      String reportcard = "Total Question:"+ qstore.getCount();
      reportcard += "\nRight Answer: "+ right;
      reportcard += "\nWrong Answer: "+ wrong;
      reportcard += "\nUnattempted: "+ (qstore.getCount()-(right+wrong));
      


      
      JOptionPane.showMessageDialog(null, reportcard, "Your Result ",JOptionPane.INFORMATION_MESSAGE);
      Performance performance = new Performance(UsersProfile.getUsername(),exam.getExamId(),right,wrong,qstore.getCount()-(right+wrong),(double)right/qstore.getCount()*100,exam.getLanguage());
     try{
         PerformanceDAO.addPerformance(performance);
         new PaperSelectionFrame().setVisible(true);
         this.dispose();
     }
     catch(SQLException es)
     {
         es.printStackTrace();
     }
       //String userid, String examid, int right, int wrong, int unattempted, double per, String language
        
    }//GEN-LAST:event_btnDoneActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbOption1;
    private javax.swing.JRadioButton jrbOption2;
    private javax.swing.JRadioButton jrbOption3;
    private javax.swing.JRadioButton jrbOption4;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables

    public void loadQuestion()
    {
        try{
           ArrayList<Questions> questionList =  QuestionsDAO.getQuestionsByExamId(exam.getExamId());
           for(Questions question: questionList)
           {
               qstore.addQuestion(question);
           }
        }
        catch(SQLException s)
        {
            s.printStackTrace();
        }
    }
    public void showQuestion()
    {
        Questions question = qstore.getQuestion(pos);
        
        txtQuestion.setText(question.getQuestion());
        jrbOption1.setText(question.getAnswer1());
        jrbOption2.setText(question.getAnswer2());
        jrbOption3.setText(question.getAnswer3());
        jrbOption4.setText(question.getAnswer4());
        buttonGroup1.clearSelection();
        Answer answer = astore.getAnswerByQno(qno);
       

        if(answer==null)
        {
            return;
        }
        
        String chosenAnswer = answer.getChosenAnswer();
       // System.out.println(chosenAnswer);
        
        if(chosenAnswer == null)
        {
            return;
        }
        switch (chosenAnswer) {
            case "Answer1":
                jrbOption1.setSelected(true);
                break;
            case "Answer2":
                jrbOption2.setSelected(true);
                break;
            case "Answer3":
                jrbOption3.setSelected(true);
                break;
            case "Answer4":
                jrbOption4.setSelected(true);
                break;
            default:
                

        }
                

    }
    public String getAnswer()
    {
         if(jrbOption1.isSelected())
            return "Answer1";
        else if(jrbOption2.isSelected())
            return "Answer2";
        else if(jrbOption3.isSelected())
          return "Answer3";
        else if(jrbOption4.isSelected())
            return "Answer4";
         else
            return null;
        
    }
}
