/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continentalconquest;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author x13360866
 */
public class SudanQuizGUI extends javax.swing.JFrame {
        String question;
        int count;
        int count2;
        private static final String VOICENAME = "kevin16";
    /**
     * Creates new form SudanQuizGUI
     */
    public SudanQuizGUI() {
        initComponents();
         question ="";
            count = 0;
            count2 = 0;
             yBtn.setVisible(false);
        nBtn.setVisible(false);
             try {

            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost:3307/jdbcTest?user=root&password=password";
            Connection conn = DriverManager.getConnection(connectionUrl);
            Statement st = (Statement) conn.createStatement();
            String find = "select quest,answer,wrongAns,wrongAns2,wrongAns3,q_sel from Question where country = 'sudan' and q_sel = 'N' order by rand() limit 1;";
            ResultSet rs = st.executeQuery(find);

            /* https://www.youtube.com/watch?v=MY4FavUyFNQ */

            while(rs.next()){
                question = Questionlbl.getText();
                Questionlbl.setText("\n"+rs.getString("quest"));
                Statement st2 = conn.createStatement();
                st2.executeUpdate("update Question set q_sel = 'Y' where quest = '"+rs.getString("quest")+"'");

                String[] solutionArray = {rs.getString("answer"),rs.getString("wrongAns"),rs.getString("wrongAns2"),rs.getString("wrongAns3")};

                String [] arr = solutionArray;
                Random rgen = new Random();
                int N = arr.length;
                /*
                * fisher yates shuffle
                *
                * 9/3/2015
                *
                * @reference http://algs4.cs.princeton.edu/11model/Knuth.java.html
                * @author sean trant 13332576
                */

                for (int i = 0; i < N; i++) {
                    // choose index uniformly in [i, N-1]
                    int r = i + (int) (Math.random() * (N - i));
                    Object swap = arr[r];
                    arr[r] = arr[i];
                    arr[i] = (String)swap;

                    Ans1.setText(arr[0]);
                    Ans2.setText(arr[1]);
                    Ans3.setText(arr[2]);
                    Ans4.setText(arr[3]);
                }

            }

        } catch (Exception ex) {
            System.out.println("AGGHHHH!!!!!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voiceBtn = new javax.swing.JButton();
        yBtn = new javax.swing.JButton();
        nBtn = new javax.swing.JButton();
        Scorelbl = new javax.swing.JLabel();
        Algerialbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Questionlbl = new javax.swing.JLabel();
        Ans1 = new javax.swing.JButton();
        Ans2 = new javax.swing.JButton();
        Ans3 = new javax.swing.JButton();
        Ans4 = new javax.swing.JButton();
        SudanExitQuiz = new javax.swing.JButton();
        SudanFlaglbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 540));
        getContentPane().setLayout(null);

        voiceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continentalconquest/voice button.png"))); // NOI18N
        voiceBtn.setContentAreaFilled(false);
        voiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voiceBtnActionPerformed(evt);
            }
        });
        getContentPane().add(voiceBtn);
        voiceBtn.setBounds(520, 10, 80, 70);

        yBtn.setBackground(new java.awt.Color(255, 255, 255));
        yBtn.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        yBtn.setText("Yes");
        yBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        yBtn.setContentAreaFilled(false);
        yBtn.setOpaque(true);
        yBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yBtnActionPerformed(evt);
            }
        });
        getContentPane().add(yBtn);
        yBtn.setBounds(110, 300, 210, 70);

        nBtn.setBackground(new java.awt.Color(255, 255, 255));
        nBtn.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        nBtn.setText("No");
        nBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        nBtn.setContentAreaFilled(false);
        nBtn.setOpaque(true);
        nBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nBtn);
        nBtn.setBounds(340, 300, 210, 70);

        Scorelbl.setFont(new java.awt.Font("Old English Text MT", 3, 24)); // NOI18N
        Scorelbl.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(Scorelbl);
        Scorelbl.setBounds(170, 490, 440, 40);

        Algerialbl.setFont(new java.awt.Font("Old English Text MT", 3, 48)); // NOI18N
        Algerialbl.setText("Sudan");
        getContentPane().add(Algerialbl);
        Algerialbl.setBounds(10, 10, 190, 80);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 100, 620, 2);

        Questionlbl.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        getContentPane().add(Questionlbl);
        Questionlbl.setBounds(20, 200, 580, 30);

        Ans1.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        Ans1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Ans1.setContentAreaFilled(false);
        Ans1.setOpaque(true);
        Ans1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ans1ActionPerformed(evt);
            }
        });
        getContentPane().add(Ans1);
        Ans1.setBounds(110, 270, 150, 50);

        Ans2.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        Ans2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Ans2.setContentAreaFilled(false);
        Ans2.setOpaque(true);
        Ans2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ans2ActionPerformed(evt);
            }
        });
        getContentPane().add(Ans2);
        Ans2.setBounds(400, 270, 150, 50);

        Ans3.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        Ans3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Ans3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ans3ActionPerformed(evt);
            }
        });
        getContentPane().add(Ans3);
        Ans3.setBounds(110, 360, 150, 50);

        Ans4.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        Ans4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Ans4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ans4ActionPerformed(evt);
            }
        });
        getContentPane().add(Ans4);
        Ans4.setBounds(400, 360, 150, 50);

        SudanExitQuiz.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        SudanExitQuiz.setForeground(new java.awt.Color(0, 0, 255));
        SudanExitQuiz.setText("Retire Quest");
        SudanExitQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SudanExitQuizActionPerformed(evt);
            }
        });
        getContentPane().add(SudanExitQuiz);
        SudanExitQuiz.setBounds(10, 500, 140, 30);

        SudanFlaglbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continentalconquest/SudanFlag.png"))); // NOI18N
        getContentPane().add(SudanFlaglbl);
        SudanFlaglbl.setBounds(0, 0, 620, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Ans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ans1ActionPerformed
        // TODO add your handling code here:
                          if(count2==4){
                    Scorelbl.setVisible(true);
                    Ans1.setVisible(false);
                    Ans2.setVisible(false);
                    Ans3.setVisible(false);
                    Ans4.setVisible(false);
                    if(count<4){
                        Algerialbl.setText("Retreat!");
                        Questionlbl.setText("");
                        Scorelbl.setText("You got "+count+" questions correct. Don't worry, try again?");
                        yBtn.setVisible(true);
                        nBtn.setVisible(true);
                    }
                    else if(count==4){
                        Algerialbl.setText("Sudan conquered");
                        Questionlbl.setText("");
                        Scorelbl.setText("You got all"+count+" questions correct.Well done!");
                    }
        }
         try {

Class.forName("com.mysql.jdbc.Driver");
String connectionUrl = "jdbc:mysql://localhost:3307/jdbcTest?user=root&password=password";
Connection conn = DriverManager.getConnection(connectionUrl);
Statement st = (Statement) conn.createStatement();
String find = "select quest,answer,wrongAns,wrongAns2,wrongAns3,q_sel from Question where country = 'sudan' and q_sel = 'N' order by rand() limit 1;"; 
ResultSet rs = st.executeQuery(find);

/* https://www.youtube.com/watch?v=MY4FavUyFNQ */ 

while(rs.next()){
question = Questionlbl.getText();
Questionlbl.setText("\n"+rs.getString("quest")); 
Statement st2 = conn.createStatement();
st2.executeUpdate("update Question set q_sel = 'Y' where quest = '"+rs.getString("quest")+"'");

String[] solutionArray = {rs.getString("answer"),rs.getString("wrongAns"),rs.getString("wrongAns2"),rs.getString("wrongAns3")};

String [] arr = solutionArray;
Random rgen = new Random();
int N = arr.length;
/*
* fisher yates shuffle
*
* 9/3/2015
*
* @reference http://algs4.cs.princeton.edu/11model/Knuth.java.html
* @author sean trant 13332576
*/ 
for (int i = 0; i < N; i++) {
// choose index uniformly in [i, N-1]
int r = i + (int) (Math.random() * (N - i));
Object swap = arr[r];
arr[r] = arr[i];
arr[i] = (String)swap;

Ans1.setText(arr[0]);
Ans2.setText(arr[1]);
Ans3.setText(arr[2]);
Ans4.setText(arr[3]); 
}

if(arr[0].equals(rs.getString("answer"))){
Statement st3 = (Statement) conn.createStatement();
                    st3.executeUpdate("update Player set score = score+1 where p_sel='Y'");
                    count++;
                    Scorelbl.setText("Your last answer was correct!");
                    } 
                 else{
                     Scorelbl.setText("AHH, your last answer was incorrect.");
                 }
}

} catch (Exception ex) {
System.out.println("AGGHHHH!!!!!"); 
}

    }//GEN-LAST:event_Ans1ActionPerformed

    private void Ans2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ans2ActionPerformed
        // TODO add your handling code here:
                               if(count2==4){
                    Scorelbl.setVisible(true);
                    Ans1.setVisible(false);
                    Ans2.setVisible(false);
                    Ans3.setVisible(false);
                    Ans4.setVisible(false);
                    if(count<4){
                        Algerialbl.setText("Retreat!");
                        Questionlbl.setText("");
                        Scorelbl.setText("You got "+count+" questions correct. Don't worry, try again?");
                        yBtn.setVisible(true);
                        nBtn.setVisible(true);
                    }
                    else if(count==4){
                        Algerialbl.setText("Sudan conquered");
                        Questionlbl.setText("");
                        Scorelbl.setText("You got all"+count+" questions correct.Well done!");
                    }
        }
        try {

Class.forName("com.mysql.jdbc.Driver");
String connectionUrl = "jdbc:mysql://localhost:3307/jdbcTest?user=root&password=password";
Connection conn = DriverManager.getConnection(connectionUrl);
Statement st = (Statement) conn.createStatement();
String find = "select quest,answer,wrongAns,wrongAns2,wrongAns3,q_sel from Question where country = 'sudan' and q_sel = 'N' order by rand() limit 1;"; 
ResultSet rs = st.executeQuery(find);

/* https://www.youtube.com/watch?v=MY4FavUyFNQ */ 

while(rs.next()){
question = Questionlbl.getText();
Questionlbl.setText("\n"+rs.getString("quest")); 
Statement st2 = conn.createStatement();
st2.executeUpdate("update Question set q_sel = 'Y' where quest = '"+rs.getString("quest")+"'");

String[] solutionArray = {rs.getString("answer"),rs.getString("wrongAns"),rs.getString("wrongAns2"),rs.getString("wrongAns3")};

String [] arr = solutionArray;
Random rgen = new Random();
int N = arr.length;
/*
* fisher yates shuffle
*
* 9/3/2015
*
* @reference http://algs4.cs.princeton.edu/11model/Knuth.java.html
* @author sean trant 13332576
*/ 
for (int i = 0; i < N; i++) {
// choose index uniformly in [i, N-1]
int r = i + (int) (Math.random() * (N - i));
Object swap = arr[r];
arr[r] = arr[i];
arr[i] = (String)swap;

Ans1.setText(arr[0]);
Ans2.setText(arr[1]);
Ans3.setText(arr[2]);
Ans4.setText(arr[3]); 
}

if(arr[1].equals(rs.getString("answer"))){
Statement st3 = (Statement) conn.createStatement();
                    st3.executeUpdate("update Player set score = score+1 where p_sel='Y'");
                    count++;
                    Scorelbl.setText("Your last answer was correct!");
                    } 
                 else{
                     Scorelbl.setText("AHH, your last answer was incorrect.");
                 }
}

} catch (Exception ex) {
System.out.println("AGGHHHH!!!!!"); 
}
    }//GEN-LAST:event_Ans2ActionPerformed

    private void Ans3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ans3ActionPerformed
        // TODO add your handling code here:
                               if(count2==4){
                    Scorelbl.setVisible(true);
                    Ans1.setVisible(false);
                    Ans2.setVisible(false);
                    Ans3.setVisible(false);
                    Ans4.setVisible(false);
                    if(count<4){
                        Algerialbl.setText("Retreat!");
                        Questionlbl.setText("");
                        Scorelbl.setText("You got "+count+" questions correct. Don't worry, try again?");
                        yBtn.setVisible(true);
                        nBtn.setVisible(true);
                    }
                    else if(count==4){
                        Algerialbl.setText("Sudan conquered");
                        Questionlbl.setText("");
                        Scorelbl.setText("You got all"+count+" questions correct.Well done!");
                    }
        }
        try {

Class.forName("com.mysql.jdbc.Driver");
String connectionUrl = "jdbc:mysql://localhost:3307/jdbcTest?user=root&password=password";
Connection conn = DriverManager.getConnection(connectionUrl);
Statement st = (Statement) conn.createStatement();
String find = "select quest,answer,wrongAns,wrongAns2,wrongAns3,q_sel from Question where country = 'sudan' and q_sel = 'N' order by rand() limit 1;"; 
ResultSet rs = st.executeQuery(find);

/* https://www.youtube.com/watch?v=MY4FavUyFNQ */ 

while(rs.next()){
question = Questionlbl.getText();
Questionlbl.setText("\n"+rs.getString("quest")); 
Statement st2 = conn.createStatement();
st2.executeUpdate("update Question set q_sel = 'Y' where quest = '"+rs.getString("quest")+"'");

String[] solutionArray = {rs.getString("answer"),rs.getString("wrongAns"),rs.getString("wrongAns2"),rs.getString("wrongAns3")};

String [] arr = solutionArray;
Random rgen = new Random();
int N = arr.length;
/*
* fisher yates shuffle
*
* 9/3/2015
*
* @reference http://algs4.cs.princeton.edu/11model/Knuth.java.html
* @author sean trant 13332576
*/ 
for (int i = 0; i < N; i++) {
// choose index uniformly in [i, N-1]
int r = i + (int) (Math.random() * (N - i));
Object swap = arr[r];
arr[r] = arr[i];
arr[i] = (String)swap;

Ans1.setText(arr[0]);
Ans2.setText(arr[1]);
Ans3.setText(arr[2]);
Ans4.setText(arr[3]); 
}

if(arr[2].equals(rs.getString("answer"))){
Statement st3 = (Statement) conn.createStatement();
                    st3.executeUpdate("update Player set score = score+1 where p_sel='Y'");
                    count++;
                    Scorelbl.setText("Your last answer was correct!");
                    } 
                 else{
                     Scorelbl.setText("AHH, your last answer was incorrect.");
                 }
}

} catch (Exception ex) {
System.out.println("AGGHHHH!!!!!"); 
}
  
    }//GEN-LAST:event_Ans3ActionPerformed

    private void Ans4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ans4ActionPerformed
        // TODO add your handling code here:
                               if(count2==4){
                    Scorelbl.setVisible(true);
                    Ans1.setVisible(false);
                    Ans2.setVisible(false);
                    Ans3.setVisible(false);
                    Ans4.setVisible(false);
                    if(count<4){
                        Algerialbl.setText("Retreat!");
                        Questionlbl.setText("");
                        Scorelbl.setText("You got "+count+" questions correct. Don't worry, try again?");
                        yBtn.setVisible(true);
                        nBtn.setVisible(true);
                    }
                    else if(count==4){
                        Algerialbl.setText("Sudan conquered");
                        Questionlbl.setText("");
                        Scorelbl.setText("You got all"+count+" questions correct.Well done!");
                    }
        }
         try {

Class.forName("com.mysql.jdbc.Driver");
String connectionUrl = "jdbc:mysql://localhost:3307/jdbcTest?user=root&password=password";
Connection conn = DriverManager.getConnection(connectionUrl);
Statement st = (Statement) conn.createStatement();
String find = "select quest,answer,wrongAns,wrongAns2,wrongAns3,q_sel from Question where country = 'sudan' and q_sel = 'N' order by rand() limit 1;"; 
ResultSet rs = st.executeQuery(find);

/* https://www.youtube.com/watch?v=MY4FavUyFNQ */ 

while(rs.next()){
question = Questionlbl.getText();
Questionlbl.setText("\n"+rs.getString("quest")); 
Statement st2 = conn.createStatement();
st2.executeUpdate("update Question set q_sel = 'Y' where quest = '"+rs.getString("quest")+"'");

String[] solutionArray = {rs.getString("answer"),rs.getString("wrongAns"),rs.getString("wrongAns2"),rs.getString("wrongAns3")};

String [] arr = solutionArray;
Random rgen = new Random();
int N = arr.length;
/*
* fisher yates shuffle
*
* 9/3/2015
*
* @reference http://algs4.cs.princeton.edu/11model/Knuth.java.html
* @author sean trant 13332576
*/ 
for (int i = 0; i < N; i++) {
// choose index uniformly in [i, N-1]
int r = i + (int) (Math.random() * (N - i));
Object swap = arr[r];
arr[r] = arr[i];
arr[i] = (String)swap;

Ans1.setText(arr[0]);
Ans2.setText(arr[1]);
Ans3.setText(arr[2]);
Ans4.setText(arr[3]); 
}

if(arr[3].equals(rs.getString("answer"))){
Statement st3 = (Statement) conn.createStatement();
                    st3.executeUpdate("update Player set score = score+1 where p_sel='Y'");
                    count++;
                    Scorelbl.setText("Your last answer was correct!");
                    } 
                 else{
                     Scorelbl.setText("AHH, your last answer was incorrect.");
                 }
}

} catch (Exception ex) {
System.out.println("AGGHHHH!!!!!"); 
}
    }//GEN-LAST:event_Ans4ActionPerformed

    private void SudanExitQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SudanExitQuizActionPerformed
        // TODO add your handling code here:
           AfricaQuizGUI newGUI = new AfricaQuizGUI();
        newGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SudanExitQuizActionPerformed

    private void yBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yBtnActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost:3307/jdbcTest?user=root&password=password";
            Connection conn = DriverManager.getConnection(connectionUrl);

            Statement st = (Statement) conn.createStatement();

            /* https://www.youtube.com/watch?v=ZJuhRSgY0LY */
            String update = "update Question set q_sel = 'N';";
            st.executeUpdate(update);
            /* */
            try {
                Algerialbl.setText("Sudan Quiz");
                Ans1.setVisible(true);
                Ans2.setVisible(true);
                Ans3.setVisible(true);
                Ans4.setVisible(true);
                count2=0;
                count=0;
                Questionlbl.setVisible(true);
                Scorelbl.setVisible(false);
                yBtn.setVisible(false);
                nBtn.setVisible(false);
                String find = "select quest,answer,wrongAns,wrongAns2,wrongAns3,q_sel from Question where country = 'sudan' and q_sel = 'N' order by rand() limit 1;";
                ResultSet rs = st.executeQuery(find);

                /* https://www.youtube.com/watch?v=MY4FavUyFNQ */

                while(rs.next()){
                    question = Questionlbl.getText();
                    Questionlbl.setText("\n"+rs.getString("quest"));
                    Statement st2 = conn.createStatement();
                    st2.executeUpdate("update Question set q_sel = 'Y' where quest = '"+rs.getString("quest")+"'");

                    String[] solutionArray = {rs.getString("answer"),rs.getString("wrongAns"),rs.getString("wrongAns2"),rs.getString("wrongAns3")};

                    String [] arr = solutionArray;
                    Random rgen = new Random();
                    int N = arr.length;
                    /*
                    * fisher yates shuffle
                    *
                    * 9/3/2015
                    *
                    * @reference http://algs4.cs.princeton.edu/11model/Knuth.java.html
                    * @author sean trant 13332576
                    */

                    for (int i = 0; i < N; i++) {
                        // choose index uniformly in [i, N-1]
                        int r = i + (int) (Math.random() * (N - i));
                        Object swap = arr[r];
                        arr[r] = arr[i];
                        arr[i] = (String)swap;

                        Ans1.setText(arr[0]);
                        Ans2.setText(arr[1]);
                        Ans3.setText(arr[2]);
                        Ans4.setText(arr[3]);
                    }

                }

            } catch (Exception ex) {
                System.out.println("AGGHHHH!!!!!");
            }

        } catch (Exception ex) {
            System.out.println("AGGHHHH!!!!!");
        }
    }//GEN-LAST:event_yBtnActionPerformed

    private void nBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nBtnActionPerformed
        // TODO add your handling code here:
        EuropeGUI europe =null;
        try {
            europe = new EuropeGUI();
        } catch (MalformedURLException ex) {
            Logger.getLogger(IrelandGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        europe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nBtnActionPerformed

    private void voiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voiceBtnActionPerformed
        // TODO add your handling code here:
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(VOICENAME);
        voice.allocate();
        try{
            voice.speak(Questionlbl.getText());
            voice.speak("Answer, one");
            voice.speak(Ans1.getText());
            voice.speak("Answer, two");
            voice.speak(Ans2.getText());
            voice.speak("Answer, three");
            voice.speak(Ans3.getText());
            voice.speak("Answer, four");
            voice.speak(Ans4.getText());
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_voiceBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SudanQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudanQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudanQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudanQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudanQuizGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Algerialbl;
    private javax.swing.JButton Ans1;
    private javax.swing.JButton Ans2;
    private javax.swing.JButton Ans3;
    private javax.swing.JButton Ans4;
    private javax.swing.JLabel Questionlbl;
    private javax.swing.JLabel Scorelbl;
    private javax.swing.JButton SudanExitQuiz;
    private javax.swing.JLabel SudanFlaglbl;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nBtn;
    private javax.swing.JButton voiceBtn;
    private javax.swing.JButton yBtn;
    // End of variables declaration//GEN-END:variables
}
