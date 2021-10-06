/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niquel;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class telaNiquel extends javax.swing.JFrame {

    /**
     * Creates new form telaNiquell
     */
    public telaNiquel() {
        initComponents();
    }
    Integer ganhar = 0;
    Integer num,num2, num3, j=0, c=0, i = 0, aposta = 1, ganhos = 0, creditos = 1000, ganhostotal = 0;
    ImageIcon valid;
    Random random = new Random();
    Integer[] resp = new Integer[3];
    boolean label1 = false, label2 = false, label3 = false, ganhador = true;


            public class trocar1 extends Thread {
                
        public void run(){
        if (aposta <= creditos && aposta >= 0){
        for (c = 0; c < 30; c++) {
            try{sleep(200);}catch(Exception e){}
            if (ganhostotal > 3000){
            int range = 1 - 0 + 1;
            num =  random.nextInt(range) + 0;
            } else {
            num = random.nextInt(4);
            }
            if (num == 0) {
                valid = new ImageIcon(getClass().getResource("/image/html.png"));
                jLabel1.setIcon(valid);

            }
            if (num == 1) {
                valid = new ImageIcon(getClass().getResource("/image/java cópia.png"));
                jLabel1.setIcon(valid);
                
            }
            if (num == 2) {
                valid = new ImageIcon(getClass().getResource("/image/python.png"));
                jLabel1.setIcon(valid);
                
            }
            if (num == 3) {
                valid = new ImageIcon(getClass().getResource("/image/csharp.png"));
                jLabel1.setIcon(valid);
                
            }
             
        }
             if (ganhar == 1){
             valid = new ImageIcon(getClass().getResource("/image/csharp.png"));
             jLabel1.setIcon(valid);
             num = 3;
        }
        resp[0] = num;
        c= 0;
        label1 = true;
        ganhador();
        } else {
        JOptionPane.showMessageDialog(null, "Você não possui creditos suficientes!", "ERROR", 2);
        jButton1.setEnabled(true);}
        }
    }
    
        public class trocar3 extends Thread {
        public void run(){
        if (aposta <= creditos && aposta >= 0){
        for (j = 0; j < 30; j++) {
            try{sleep(200);}catch(Exception e){}
            if (ganhostotal > 3000){
            int range = 3 - 2 + 1;
            num2=  random.nextInt(range) + 2;
            } else {
            num2 = random.nextInt(4);
            }
            if (num2 == 0) {
                valid = new ImageIcon(getClass().getResource("/image/html.png"));
                jLabel2.setIcon(valid);

            }
            if (num2 == 1) {
                valid = new ImageIcon(getClass().getResource("/image/java cópia.png"));
                jLabel2.setIcon(valid);
                
            }
            if (num2 == 2) {
                valid = new ImageIcon(getClass().getResource("/image/python.png"));
                jLabel2.setIcon(valid);
                
            }
            if (num2 == 3) {
                valid = new ImageIcon(getClass().getResource("/image/csharp.png"));
                jLabel2.setIcon(valid);
                
            }
             
        }
        if (ganhar == 1){
             valid = new ImageIcon(getClass().getResource("/image/csharp.png"));
             jLabel2.setIcon(valid);
             num2 = 3;
        }
        resp[1] = num2;
        j= 0;
        label2 = true;
        ganhador();
        }
        }
        
    }
    
        public class trocar2 extends Thread {
        public void run(){
        if (aposta <= creditos && aposta >= 0){
        
        for (i = 0; i < 30; i++) {
            try{sleep(200);}catch(Exception e){}
            
            if (ganhostotal > 3000){
            int range = 1 - 0 + 1;
            num3 =  random.nextInt(range) + 0;
            } else {
            num3 = random.nextInt(4);
            }
            if (num3== 0) {
                valid = new ImageIcon(getClass().getResource("/image/html.png"));
                jLabel3.setIcon(valid);

            }
            if (num3 == 1) {
                valid = new ImageIcon(getClass().getResource("/image/java cópia.png"));
                jLabel3.setIcon(valid);
                
            }
            if (num3 == 2) {
                valid = new ImageIcon(getClass().getResource("/image/python.png"));
                jLabel3.setIcon(valid);
                
            }
            if (num3 == 3) {
                valid = new ImageIcon(getClass().getResource("/image/csharp.png"));
                jLabel3.setIcon(valid);
                
            }
        }
             if (ganhar == 1){
             valid = new ImageIcon(getClass().getResource("/image/csharp.png"));
             jLabel3.setIcon(valid);
             num3 = 3;
        }
        resp[2] = num3;
        i= 0;
        label3 = true;
        ganhador();
        }
        }

        
    }
    
    public void ganhador(){
    // triplo
    if (label1 = true && label2 == true && label3 == true){
       System.out.println(label1+" "+label2+" "+label3+" "+num+" "+num2+" "+num3+" "+resp[0]+" "+resp[1]+" "+resp[2]);
    if (resp[0] == 0 && resp[1] == 0 && resp[2] == 0 ||
        resp[0] == 1 && resp[1] == 1 && resp[2] == 1 ||
        resp[0] == 2 && resp[1] == 2 && resp[2] == 2 ||
        resp[0] == 3 && resp[1] == 3 && resp[2] == 3
) {
        ganhos = aposta*10;
        creditos+= ganhos;
        jLabel7.setText(creditos.toString());
    }
    //double
    else if (resp[0] == 0 && resp[1] == 0 ||
        resp[0] == 1 && resp[1] == 1 ||
        resp[0] == 2 && resp[1] == 2 ||
        resp[0] == 3 && resp[1] == 3
            ){
        ganhos = aposta*2;
        creditos += ganhos;
        jLabel7.setText(creditos.toString());
    } else {ganhos = 0; creditos-= aposta;ganhostotal-=aposta;    jLabel7.setText(creditos.toString());}
    jLabel4.setText(ganhos.toString());
    ganhostotal += ganhos;
    if (ganhostotal<0){
       ganhostotal=0;
    }
    if (creditos < 0){
     creditos = 1000;
     jLabel7.setText(creditos.toString());
    }
    label1 = false; label2 = false; label3 = false;
    jButton1.setEnabled(true);
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/image/FundoNiquel.png"));
        final Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/java cópia.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/html.png"))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/python.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("APOSTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jTextField1.setText("0");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel5.setText("Valor aposta:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Creditos:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("1000");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("2.0");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)))
                .addContainerGap(287, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(131, 131, 131))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addGap(9, 9, 9)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(106, 106, 106))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                jButton1.setEnabled(false);
                try{
            aposta = Integer.parseInt(jTextField1.getText());
                if (aposta instanceof Integer){
                        new trocar1().start();
                        new trocar2().start();
                        new trocar3().start();
                }
                }
            catch(Exception e){JOptionPane.showMessageDialog(null, "Aposta invalida", "ERROR", 2);
            jButton1.setEnabled(true);
            }

         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == 20){
            ganhar = 1;
        }
        if (evt.getKeyCode() == 16){
            ganhar = 0;
        }
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(telaNiquel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaNiquel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaNiquel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaNiquel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaNiquel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
