
package hashing;
import java.util.*;
import java.text.*;
public class from1 extends javax.swing.JFrame {

    
    DateFormat df = new SimpleDateFormat("mm:ss");
    String time;
    int smin=0,emin=0,esec=0,ssec=0,i=0;
    public from1() {
        initComponents();
        this.setSize(300, 210);
        this.setLocationRelativeTo(null);
    }
    public void display(int i)
    {
        int sec=(emin*60+esec)-(smin*60+ssec);
        if(i==3)
        {
            s1.setText("O(n^2)");
            this.setLocation(this.getX(), this.getY()+230);
        }
        if(i==4)
        {
            s1.setText("O(nlogn)");
            this.setLocation(this.getX(), this.getY()+230);
        }
        if(i==7)
        {
            s1.setText("O(n)");
            this.setLocation(this.getX(), this.getY());
        }
        s2.setText(Math.abs(sec)+" seconds");
        System.out.println(sec+" seconds");
        this.setVisible(true);
    }
    public void start()
    {
        time = df.format(Calendar.getInstance().getTime());
        for(String k : time.split(":"))
        {
            if(i==0)
            {
                smin=Integer.valueOf(k);
            }
            else if(i==1)
            {
                ssec=Integer.valueOf(k);
            }
            System.out.println(k);
            i++;
        }
        i=0;
    }
    public void stop()
    {
        time = df.format(Calendar.getInstance().getTime());
        for(String k : time.split(":"))
        {
            if(i==0)
            {
                emin=Integer.valueOf(k);
            }
            else if(i==1)
            {
                esec=Integer.valueOf(k);
            }
            System.out.println(k);
            i++;
        }
        i=0;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caltime = new javax.swing.JLabel();
        complexity1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        frame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        caltime.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        caltime.setText("Time taken:");
        getContentPane().add(caltime);
        caltime.setBounds(30, 110, 200, 30);

        complexity1.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        complexity1.setText("Time Complexity:");
        getContentPane().add(complexity1);
        complexity1.setBounds(20, 60, 230, 30);

        close.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        close.setText("close");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(130, 170, 40, 22);

        s2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(s2);
        s2.setBounds(155, 110, 130, 30);

        s1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(s1);
        s1.setBounds(205, 60, 100, 30);

        frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/form.png"))); // NOI18N
        getContentPane().add(frame);
        frame.setBounds(0, 0, 300, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_closeMouseClicked

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
            java.util.logging.Logger.getLogger(from1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(from1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(from1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(from1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new from1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caltime;
    private javax.swing.JLabel close;
    private javax.swing.JLabel complexity1;
    private javax.swing.JLabel frame;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    // End of variables declaration//GEN-END:variables
}
