
import java.util.Random;
import javax.swing.JOptionPane;


public class Adventure extends javax.swing.JFrame {

    String name="";
    String gender="";
    boolean far;
    int currenthp;
    Character p;
    LinkedQueue enemies=new LinkedQueue();
    public Adventure() {
        initComponents();
        btnattack.setEnabled(false);
        btnmove.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupgender = new javax.swing.ButtonGroup();
        groupclass = new javax.swing.ButtonGroup();
        btnattack = new javax.swing.JButton();
        btnmove = new javax.swing.JButton();
        btnpirate = new javax.swing.JRadioButton();
        btnwizard = new javax.swing.JRadioButton();
        btnfighter = new javax.swing.JRadioButton();
        txtname = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        btnmale = new javax.swing.JRadioButton();
        btnfemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();
        btnstart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnattack.setText("Attack");

        btnmove.setText("Move Closer");

        groupclass.add(btnpirate);
        btnpirate.setText("Pirate");

        groupclass.add(btnwizard);
        btnwizard.setText("Wizard");

        groupclass.add(btnfighter);
        btnfighter.setText("Fighter");

        jLabel1.setText("Name");

        groupgender.add(btnmale);
        btnmale.setText("Male");

        groupgender.add(btnfemale);
        btnfemale.setText("Female");

        txtinfo.setColumns(20);
        txtinfo.setRows(5);
        jScrollPane1.setViewportView(txtinfo);

        btnstart.setText("Start Game");
        btnstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnfemale)
                            .addComponent(btnmale)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnpirate)
                            .addComponent(btnfighter)
                            .addComponent(btnwizard))
                        .addGap(134, 134, 134))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnattack)
                        .addGap(18, 18, 18)
                        .addComponent(btnmove))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnstart)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnmale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnfemale))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnwizard)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnfighter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpirate)))
                .addGap(18, 18, 18)
                .addComponent(btnstart)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmove)
                    .addComponent(btnattack))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartActionPerformed
        name=txtname.getText();
        if(name.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter a valid name.");
            return;
        }
        
        if(btnmale.isSelected())
            gender.equals("M");
        else if(btnfemale.isSelected())
            gender.equals("F");
        else{
            JOptionPane.showMessageDialog(this,"Please enter a gender");
            return;
        }
        if(btnfighter.isSelected()){
            p=new Fighter(name,gender);
            txtinfo.append("The Champion known as "+name+" has found a worthy challenge and must save the world");
        }
        else if(btnwizard.isSelected()){
            p=new Wizard(name,gender);
            txtinfo.append("Great Mage "+name+" has paused"+p.getPronoun2()+"studies to save the world");
        }
        else if(btnpirate.isSelected()){
            p=new Pirate(name,gender);
            txtinfo.append("Captain "+name+" has stepped off"+p.getPronoun2()+"boat to save the landlubbers");
        }
        else{
            JOptionPane.showMessageDialog(this,"Please select a class");
            return;
        }
        makeEnemies();
        battle();
        btnstart.setEnabled(false);
        btnattack.setEnabled(true);
        btnmove.setEnabled(true);
            
    }//GEN-LAST:event_btnstartActionPerformed

    public void makeEnemies(){
        Enemy A=new Enemy("Alpha",3);
        Enemy B=new Enemy("Bravo",4);
        Enemy C=new Enemy("Charlie",4);
        Enemy D=new Enemy("Delta",5);
        Enemy E=new Enemy("Echo",7);
        enemies.enqueue(A);
        enemies.enqueue(B);
        enemies.enqueue(C);
        enemies.enqueue(D);
        enemies.enqueue(E);
    }
    public void battle(){
        Enemy next = (Enemy)enemies.peekFront();
        txtinfo.append(next.getName()); 
    }
    public boolean roll(){
        Random r=new Random();
        int go=r.nextInt(2)+1;
        if(go==1) return true; //if number chosen is 1, attack hits
        else
            return false; //if number chosen is 2, attack misses
    }
    
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
            java.util.logging.Logger.getLogger(Adventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adventure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnattack;
    private javax.swing.JRadioButton btnfemale;
    private javax.swing.JRadioButton btnfighter;
    private javax.swing.JRadioButton btnmale;
    private javax.swing.JButton btnmove;
    private javax.swing.JRadioButton btnpirate;
    private javax.swing.JButton btnstart;
    private javax.swing.JRadioButton btnwizard;
    private javax.swing.ButtonGroup groupclass;
    private javax.swing.ButtonGroup groupgender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtinfo;
    private java.awt.TextField txtname;
    // End of variables declaration//GEN-END:variables
}
