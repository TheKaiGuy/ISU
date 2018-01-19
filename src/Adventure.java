
import java.util.Random;
import javax.swing.JOptionPane;


public class Adventure extends javax.swing.JFrame {

    String name="";
    String gender="";
    boolean far=true;
    int count=0;
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
        jLabel2 = new javax.swing.JLabel();
        txthp = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        txtenemyhp = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnattack.setText("Attack");
        btnattack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnattackActionPerformed(evt);
            }
        });

        btnmove.setText("Move Closer");
        btnmove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoveActionPerformed(evt);
            }
        });

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

        jLabel2.setText("HP:");

        txthp.setText("4");

        jLabel3.setText("Enemy HP:");

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
                        .addGap(134, 134, 134))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txthp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtenemyhp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnattack)
                        .addGap(26, 26, 26)
                        .addComponent(btnmove))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnstart)))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(22, 22, 22)
                .addComponent(btnstart)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnattack)
                    .addComponent(btnmove))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtenemyhp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txthp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void btnattackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnattackActionPerformed
        boolean z=roll();
        int dmg;
        Enemy next = (Enemy)enemies.peekFront();
        if(far){
            boolean y=p.isRanged();
            if(y=false){
                txtinfo.append(p.getName()+" needs to get closer to attack.");
                return;
            }
            else
            {
              farattack();
              return;
            }
        }
        if(z){
            dmg=p.getDamage();
            txtinfo.append(p.getName()+"'s attack hit for "+dmg+" damage!");
            next.takeDamage(dmg);
            if(next.getHP()<=0)
            {
                txtinfo.append(next.getName()+" has been slain!");
                enemies.dequeue();
                battle();
            }
            else
            {
               enemyattack();
            }
        }
        else
        {
            txtinfo.append(p.getName()+"'s attack missed");
            enemyattack();
            return;
        }
    }//GEN-LAST:event_btnattackActionPerformed

    private void farattack(){
        boolean z=roll();
        Enemy next=(Enemy)enemies.peekFront();
        int dmg=p.getDamage();
        if(z)
        {
            txtinfo.append(p.getName()+"'s attack hit for "+dmg+" damage");
            next.takeDamage(dmg);
            if(next.getHP()<=0)
                enemyDeath();
            else
            {
               far=false;
               txtinfo.append(next.getName()+" takes a turn to close the distance. "+p.getName()+" may attack again.");
            }
            
        }
        else{
            txtinfo.append(p.getName()+"'s attack missed");
            enemyattack();
            return;
        }
    }
    private void enemyattack(){
        boolean z=roll();
        if(z)
        {
            txtinfo.append("The enemy's attack hit "+p.getName()+"!");
            p.takeDamage(1);
            if(p.getHP()<=0)
                playerDeath();
        }
    }
    private void playerDeath(){
        txtinfo.append(p.getName()+" has been slain..");
        txtinfo.append(p.getName()+" took down "+count+" baddies before dying");
    }
    private void enemyDeath(){
        Enemy next=(Enemy)enemies.peekFront();
        txtinfo.append(p.getName()+" has slain "+next.getName()+"!");
        enemies.dequeue();
        count+=1;
        //check size; if zero, game is won
        if(enemies.size()==0)
        {
            
        }
        boolean x=roll();
        if(x)
            txtinfo.append(p.upgrade());
        battle();
    }
    private void btnmoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoveActionPerformed
        far=false;
        Enemy next=(Enemy)enemies.peekFront();
        txtinfo.append(p.getName()+" and "+next+" close the distance");
    }//GEN-LAST:event_btnmoveActionPerformed

    public void makeEnemies(){
        Enemy A=new Enemy("Grog the Zombie",3);
        Enemy B=new Enemy("Dr. Feelbad",4);
        Enemy C=new Enemy("Moe the Clown",4);
        Enemy D=new Enemy("Isaac the Warlock",5);
        Enemy E=new Enemy("Satan",7);
        enemies.enqueue(A);
        enemies.enqueue(B);
        enemies.enqueue(C);
        enemies.enqueue(D);
        enemies.enqueue(E);
    }
    public void battle(){
        far=true;
        Enemy next = (Enemy)enemies.peekFront();
        txtinfo.append(p.getName()+" spots "+next.getName()+" from far away!"); 
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField txtenemyhp;
    private java.awt.TextField txthp;
    private javax.swing.JTextArea txtinfo;
    private java.awt.TextField txtname;
    // End of variables declaration//GEN-END:variables
}
