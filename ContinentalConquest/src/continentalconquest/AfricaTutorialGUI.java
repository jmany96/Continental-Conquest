/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package continentalconquest;


import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author x13360866
 */
public class AfricaTutorialGUI extends javax.swing.JFrame {
int score;

    /**
     * Creates new form AfricaTutorialGUI
     */
    public AfricaTutorialGUI() {
        initComponents();
        AlgeriaLbl.setVisible(false);
        AlgeriaTA.setVisible(false);
        EgyptTA.setVisible(false);
        SudanTA.setVisible(false);
        noticeTA.setVisible(false);
        NigeriaTA.setVisible(false);
        AlgeriaLbl.setVisible(false);
        EgyptLbl.setVisible(false);
        SudanLbl.setVisible(false);
        NigeriaLbl.setVisible(false);
        CongoLbl.setVisible(false);
        nextBtn.setVisible(false);
        backBtn.setVisible(false);
        CongoTA.setVisible(false);
        AlgeriaLbl.setVisible(false);
        
        score = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuestionBar = new javax.swing.JLabel();
        EgyptLbl = new javax.swing.JLabel();
        SudanLbl = new javax.swing.JLabel();
        NigeriaLbl = new javax.swing.JLabel();
        CongoLbl = new javax.swing.JLabel();
        AlgeriaTA = new javax.swing.JTextArea();
        EgyptTA = new javax.swing.JTextArea();
        SudanTA = new javax.swing.JTextArea();
        NigeriaTA = new javax.swing.JTextArea();
        CongoTA = new javax.swing.JTextArea();
        AlgeriaBtn = new javax.swing.JButton();
        AlgeriaLbl = new javax.swing.JLabel();
        Readybtn = new javax.swing.JButton();
        noticeTA = new javax.swing.JTextArea();
        EgyptBtn = new javax.swing.JButton();
        nigeriaBtn = new javax.swing.JButton();
        CongoBtn = new javax.swing.JButton();
        SudanBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        MapPic = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        CloseB = new javax.swing.JLabel();
        MinB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(620, 540));
        setMinimumSize(new java.awt.Dimension(620, 540));
        setUndecorated(true);
        getContentPane().setLayout(null);

        QuestionBar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        QuestionBar.setText("Try to remember where these countries are, when you are ready, click the ready button.");
        getContentPane().add(QuestionBar);
        QuestionBar.setBounds(0, 28, 620, 20);

        EgyptLbl.setBackground(new java.awt.Color(255, 51, 51));
        EgyptLbl.setFont(new java.awt.Font("Old English Text MT", 0, 28)); // NOI18N
        EgyptLbl.setForeground(new java.awt.Color(255, 255, 0));
        EgyptLbl.setText("Do you know Egypt?");
        EgyptLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        EgyptLbl.setOpaque(true);
        getContentPane().add(EgyptLbl);
        EgyptLbl.setBounds(0, 310, 270, 33);

        SudanLbl.setBackground(new java.awt.Color(255, 51, 51));
        SudanLbl.setFont(new java.awt.Font("Old English Text MT", 0, 28)); // NOI18N
        SudanLbl.setForeground(new java.awt.Color(255, 255, 255));
        SudanLbl.setText("Do you know Sudan?");
        SudanLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SudanLbl.setOpaque(true);
        getContentPane().add(SudanLbl);
        SudanLbl.setBounds(0, 310, 270, 33);

        NigeriaLbl.setBackground(new java.awt.Color(0, 153, 153));
        NigeriaLbl.setFont(new java.awt.Font("Old English Text MT", 0, 28)); // NOI18N
        NigeriaLbl.setForeground(new java.awt.Color(255, 255, 255));
        NigeriaLbl.setText("Do you know Nigeria?");
        NigeriaLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        NigeriaLbl.setOpaque(true);
        getContentPane().add(NigeriaLbl);
        NigeriaLbl.setBounds(0, 310, 270, 33);

        CongoLbl.setBackground(new java.awt.Color(0, 153, 153));
        CongoLbl.setFont(new java.awt.Font("Old English Text MT", 0, 28)); // NOI18N
        CongoLbl.setForeground(new java.awt.Color(255, 255, 255));
        CongoLbl.setText("Do you know Congo?");
        CongoLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CongoLbl.setOpaque(true);
        getContentPane().add(CongoLbl);
        CongoLbl.setBounds(0, 310, 270, 33);

        AlgeriaTA.setColumns(20);
        AlgeriaTA.setRows(5);
        AlgeriaTA.setText("Algiers is the capital and largest city \nin algeria.Nearly four times the size of \nTexas and the largest country on the continent,\n Algeria is bordered on the west by Morocco and \nWestern Sahara and on the east by Tunisia and Libya. \n");
        getContentPane().add(AlgeriaTA);
        AlgeriaTA.setBounds(0, 340, 320, 170);

        EgyptTA.setColumns(20);
        EgyptTA.setRows(5);
        EgyptTA.setText("The capital of Egypt is Cairo.\nIn 2012, the population of Egypt was \njust over 83 million.Mount Catherine is the\n highest mountain in Egypt, standing\n 2,629m high.\n");
        getContentPane().add(EgyptTA);
        EgyptTA.setBounds(0, 340, 310, 170);

        SudanTA.setColumns(20);
        SudanTA.setRows(5);
        SudanTA.setText("The capital of sudan is Khartoumwith a\n population of 4.6 million.\nSudan, in northeast Africa, measures\n about one-fourth the size of the United States. \n\n");
        getContentPane().add(SudanTA);
        SudanTA.setBounds(0, 340, 320, 170);

        NigeriaTA.setColumns(20);
        NigeriaTA.setRows(5);
        NigeriaTA.setText("The capital of Nigeria is Abuja and the also have\n their own currency which is  Nigerian naira.\nNigeria, officially the Federal Republic of Nigeria,\n is a federal constitutional republic comprising 36\n states and its Federal Capital Territory, Abuja.");
        getContentPane().add(NigeriaTA);
        NigeriaTA.setBounds(0, 340, 320, 170);

        CongoTA.setColumns(20);
        CongoTA.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        CongoTA.setRows(5);
        CongoTA.setText("The Congo is situated in west-central\n Africa astride the equator.\n It borders Gabon, Cameroon,\n the Central African Republic,\n the Democratic Republic of the Congo,\n and the Angola exclave of Cabinda, \nwith a short stretch of coast on the South Atlantic.\n Its area is nearly three times that of Pennsylvania.\n\n\n");
        getContentPane().add(CongoTA);
        CongoTA.setBounds(0, 340, 320, 170);

        AlgeriaBtn.setBackground(new java.awt.Color(255, 255, 255));
        AlgeriaBtn.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        AlgeriaBtn.setForeground(new java.awt.Color(51, 51, 255));
        AlgeriaBtn.setText("Algeria");
        AlgeriaBtn.setBorderPainted(false);
        AlgeriaBtn.setContentAreaFilled(false);
        AlgeriaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AlgeriaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AlgeriaBtnMouseExited(evt);
            }
        });
        AlgeriaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlgeriaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AlgeriaBtn);
        AlgeriaBtn.setBounds(180, 100, 110, 80);

        AlgeriaLbl.setBackground(new java.awt.Color(0, 204, 0));
        AlgeriaLbl.setFont(new java.awt.Font("Old English Text MT", 0, 28)); // NOI18N
        AlgeriaLbl.setForeground(new java.awt.Color(255, 255, 255));
        AlgeriaLbl.setText("Do you know Algeria?");
        AlgeriaLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AlgeriaLbl.setOpaque(true);
        getContentPane().add(AlgeriaLbl);
        AlgeriaLbl.setBounds(0, 310, 290, 33);

        Readybtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continentalconquest/ready3d.png"))); // NOI18N
        Readybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadybtnActionPerformed(evt);
            }
        });
        getContentPane().add(Readybtn);
        Readybtn.setBounds(400, 440, 190, 70);

        noticeTA.setColumns(20);
        noticeTA.setFont(new java.awt.Font("Old English Text MT", 0, 23)); // NOI18N
        noticeTA.setRows(5);
        noticeTA.setText("Take notice of these \ntips for your upcoming\n          Quest!");
        noticeTA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(noticeTA);
        noticeTA.setBounds(0, 220, 200, 80);

        EgyptBtn.setBackground(new java.awt.Color(255, 255, 255));
        EgyptBtn.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        EgyptBtn.setForeground(new java.awt.Color(51, 51, 255));
        EgyptBtn.setText("Egypt");
        EgyptBtn.setBorderPainted(false);
        EgyptBtn.setContentAreaFilled(false);
        EgyptBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EgyptBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EgyptBtnMouseExited(evt);
            }
        });
        EgyptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EgyptBtnActionPerformed(evt);
            }
        });
        getContentPane().add(EgyptBtn);
        EgyptBtn.setBounds(390, 120, 100, 50);

        nigeriaBtn.setBackground(new java.awt.Color(255, 255, 255));
        nigeriaBtn.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        nigeriaBtn.setForeground(new java.awt.Color(51, 51, 255));
        nigeriaBtn.setText("Nigeria");
        nigeriaBtn.setToolTipText("");
        nigeriaBtn.setBorderPainted(false);
        nigeriaBtn.setContentAreaFilled(false);
        nigeriaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nigeriaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nigeriaBtnMouseExited(evt);
            }
        });
        nigeriaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nigeriaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nigeriaBtn);
        nigeriaBtn.setBounds(200, 210, 130, 70);

        CongoBtn.setBackground(new java.awt.Color(255, 255, 255));
        CongoBtn.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        CongoBtn.setForeground(new java.awt.Color(51, 51, 255));
        CongoBtn.setText("Congo");
        CongoBtn.setBorderPainted(false);
        CongoBtn.setContentAreaFilled(false);
        CongoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CongoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CongoBtnMouseExited(evt);
            }
        });
        CongoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CongoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CongoBtn);
        CongoBtn.setBounds(340, 280, 110, 70);

        SudanBtn.setBackground(new java.awt.Color(255, 255, 255));
        SudanBtn.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        SudanBtn.setForeground(new java.awt.Color(51, 51, 255));
        SudanBtn.setText("Sudan");
        SudanBtn.setBorderPainted(false);
        SudanBtn.setContentAreaFilled(false);
        SudanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SudanBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SudanBtnMouseExited(evt);
            }
        });
        SudanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SudanBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SudanBtn);
        SudanBtn.setBounds(380, 190, 130, 60);

        backBtn.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        backBtn.setText("Back to Menu");
        backBtn.setContentAreaFilled(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(-10, 70, 150, 50);

        nextBtn.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        nextBtn.setText("Next Continent");
        nextBtn.setContentAreaFilled(false);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nextBtn);
        nextBtn.setBounds(430, 70, 170, 60);

        MapPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continentalconquest/AficaMapTutorial Pic.png"))); // NOI18N
        MapPic.setMaximumSize(new java.awt.Dimension(620, 540));
        MapPic.setMinimumSize(new java.awt.Dimension(620, 540));
        MapPic.setPreferredSize(new java.awt.Dimension(620, 540));
        getContentPane().add(MapPic);
        MapPic.setBounds(0, 50, 620, 470);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continentalconquest/testerino.png"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 620, 540);

        CloseB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBMouseClicked(evt);
            }
        });
        getContentPane().add(CloseB);
        CloseB.setBounds(600, 0, 20, 20);

        MinB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinBMouseClicked(evt);
            }
        });
        getContentPane().add(MinB);
        MinB.setBounds(570, 0, 20, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseBMouseClicked

    private void MinBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinBMouseClicked
        this.setState(StartGUI.ICONIFIED);
    }//GEN-LAST:event_MinBMouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        tempGUI temp = new tempGUI();
        temp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextBtnActionPerformed

    private void AlgeriaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlgeriaBtnMouseEntered
        // TODO add your handling code here:
        if(AlgeriaBtn.getText().contains("Algeria")&&Readybtn.isShowing()==false){
            AlgeriaTA.setVisible(true);
            AlgeriaLbl.setVisible(true);
            noticeTA.setVisible(true);
        }
        else{
            AlgeriaTA.setVisible(false);
            AlgeriaLbl.setVisible(false);
            noticeTA.setVisible(false);
        }
    }//GEN-LAST:event_AlgeriaBtnMouseEntered

    private void AlgeriaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlgeriaBtnMouseExited
        // TODO add your handling code here:
        AlgeriaTA.setVisible(false);
        AlgeriaLbl.setVisible(false);
        noticeTA.setVisible(false);
    }//GEN-LAST:event_AlgeriaBtnMouseExited

    private void AlgeriaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlgeriaBtnActionPerformed
        // TODO add your handling code here:
        if(QuestionBar.getText().contains("Algeria")){
            JOptionPane.showMessageDialog(null, "Correct! +5 points");
            score=score+5;
          
            QuestionBar.setText("Where is Nigeria?");
            AlgeriaBtn.setText("Algeria");
        }
        else{
            JOptionPane.showMessageDialog(null, "Oops, Try again!");
        }
        
    }//GEN-LAST:event_AlgeriaBtnActionPerformed

    private void EgyptBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EgyptBtnMouseEntered
        // TODO add your handling code here:
        if(EgyptBtn.getText().contains("Egypt")&&Readybtn.isShowing()==false){
            EgyptTA.setVisible(true);
            EgyptLbl.setVisible(true);
            noticeTA.setVisible(true);
        }
        else{
            EgyptTA.setVisible(false);
            EgyptLbl.setVisible(false);
            noticeTA.setVisible(false);
        }
    }//GEN-LAST:event_EgyptBtnMouseEntered

    private void EgyptBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EgyptBtnMouseExited
        // TODO add your handling code here:

        EgyptTA.setVisible(false);
        EgyptLbl.setVisible(false);
        noticeTA.setVisible(false);

    }//GEN-LAST:event_EgyptBtnMouseExited

    private void EgyptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EgyptBtnActionPerformed
        // TODO add your handling code here:
        if(QuestionBar.getText().contains("Egypt")){
            JOptionPane.showMessageDialog(null, "Correct! +5 points");
            score=score+5;
      
            QuestionBar.setText("Where is Algeria?");
            
            EgyptBtn.setText("Egypt");

        }
        else{
            JOptionPane.showMessageDialog(null, "Oops, Try again!");
        }
    }//GEN-LAST:event_EgyptBtnActionPerformed

    private void nigeriaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nigeriaBtnMouseEntered
        // TODO add your handling code here:
        if(nigeriaBtn.getText().contains("Nigeria")&&Readybtn.isShowing()==false){
            NigeriaTA.setVisible(true);
            NigeriaLbl.setVisible(true);
            noticeTA.setVisible(true);
        }
        else{
            NigeriaTA.setVisible(false);
            NigeriaLbl.setVisible(false);
            noticeTA.setVisible(false);
        }
    }//GEN-LAST:event_nigeriaBtnMouseEntered

    private void nigeriaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nigeriaBtnMouseExited
        // TODO add your handling code here:
        NigeriaTA.setVisible(false);
        NigeriaLbl.setVisible(false);
        noticeTA.setVisible(false);
    }//GEN-LAST:event_nigeriaBtnMouseExited

    private void nigeriaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nigeriaBtnActionPerformed
        // TODO add your handling code here:
        if(QuestionBar.getText().contains("Nigeria")){
            JOptionPane.showMessageDialog(null,"Correct! +5 points!");
            score=score+5;
          
            QuestionBar.setText("Where is the Congo?");
            nigeriaBtn.setText("Nigeria");
        }
        else{
            JOptionPane.showMessageDialog(null, "Oops, Try again!");
        }
    }//GEN-LAST:event_nigeriaBtnActionPerformed

    private void CongoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CongoBtnMouseEntered
        // TODO add your handling code here:
        if(CongoBtn.getText().contains("Congo")&&Readybtn.isShowing()==false){
            CongoTA.setVisible(true);
            CongoLbl.setVisible(true);
            noticeTA.setVisible(true);
        }
        else{
            CongoTA.setVisible(false);
            CongoLbl.setVisible(false);
            noticeTA.setVisible(false);
        }
    }//GEN-LAST:event_CongoBtnMouseEntered

    private void CongoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CongoBtnMouseExited
        // TODO add your handling code here:
        CongoTA.setVisible(false);
        CongoLbl.setVisible(false);
        noticeTA.setVisible(false);
    }//GEN-LAST:event_CongoBtnMouseExited

    private void CongoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CongoBtnActionPerformed
        // TODO add your handling code here:
        if(QuestionBar.getText().contains("Congo")){
            JOptionPane.showMessageDialog(null, "Correct! +5 points");
            score=score+5;
        
            
                QuestionBar.setText("Tutorial Complete");
                JOptionPane.showMessageDialog(null, "Congratulations you have completed the Africa map game!!!!");
                backBtn.setVisible(true);
                nextBtn.setVisible(true);
            

            CongoBtn.setText("Congo");

        }
        else{
            JOptionPane.showMessageDialog(null, "Oops, Try again!");
        }
    }//GEN-LAST:event_CongoBtnActionPerformed

    private void SudanBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SudanBtnMouseEntered
        // TODO add your handling code here:
        if(SudanBtn.getText().contains("Sudan")&&Readybtn.isShowing()==false){
            SudanTA.setVisible(true);
            SudanLbl.setVisible(true);
            noticeTA.setVisible(true);
        }
        else{
            SudanTA.setVisible(false);
            CongoLbl.setVisible(false);
            noticeTA.setVisible(false);
        }
    }//GEN-LAST:event_SudanBtnMouseEntered

    private void SudanBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SudanBtnMouseExited
        // TODO add your handling code here:
        SudanTA.setVisible(false);
        SudanLbl.setVisible(false);
        noticeTA.setVisible(false);
    }//GEN-LAST:event_SudanBtnMouseExited

    private void SudanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SudanBtnActionPerformed
        // TODO add your handling code here:
        if(QuestionBar.getText().contains("Sudan")){
            JOptionPane.showMessageDialog(null, "Correct! +5 points");
            score=score+5;
            
            QuestionBar.setText("Where is Egypt?");
            SudanBtn.setText("Sudan");
        }
        else{
            JOptionPane.showMessageDialog(null, "Oops, Try again!");
        }
    }//GEN-LAST:event_SudanBtnActionPerformed

    private void ReadybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadybtnActionPerformed
        // TODO add your handling code here:
        QuestionBar.setText("Where is Sudan?");
        CongoBtn.setText("");
        SudanBtn.setText("");
        nigeriaBtn.setText("");
        EgyptBtn.setText("");
        AlgeriaBtn.setText("");
        Readybtn.setVisible(false);
        
        
    }//GEN-LAST:event_ReadybtnActionPerformed

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
            java.util.logging.Logger.getLogger(AfricaTutorialGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfricaTutorialGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfricaTutorialGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfricaTutorialGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfricaTutorialGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlgeriaBtn;
    private javax.swing.JLabel AlgeriaLbl;
    private javax.swing.JTextArea AlgeriaTA;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CloseB;
    private javax.swing.JButton CongoBtn;
    private javax.swing.JLabel CongoLbl;
    private javax.swing.JTextArea CongoTA;
    private javax.swing.JButton EgyptBtn;
    private javax.swing.JLabel EgyptLbl;
    private javax.swing.JTextArea EgyptTA;
    private javax.swing.JLabel MapPic;
    private javax.swing.JLabel MinB;
    private javax.swing.JLabel NigeriaLbl;
    private javax.swing.JTextArea NigeriaTA;
    private javax.swing.JLabel QuestionBar;
    private javax.swing.JButton Readybtn;
    private javax.swing.JButton SudanBtn;
    private javax.swing.JLabel SudanLbl;
    private javax.swing.JTextArea SudanTA;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton nigeriaBtn;
    private javax.swing.JTextArea noticeTA;
    // End of variables declaration//GEN-END:variables
}
