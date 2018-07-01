package hashing;
import AppPackage.AnimationClass;
import java.util.*;
import java.awt.*;
public class form extends javax.swing.JFrame implements Runnable {
    int i=0;
    static int n,sum,link[],r[];
    int a[]=new int[100];
    ArrayList<Integer>[] hashtab1=new ArrayList[10];
    ArrayList<Integer>[] hashtab2=new ArrayList[10];
    Thread t;
    AnimationClass ac=new AnimationClass();
    int w=0;
    public form() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(400, 350);
        t=new Thread(this);
        t.start();
        btnOK.setEnabled(false);
        anim();
    }
    public void run()
    {
        String msg="2 - Sum Problem",k="";
        try{
        for(int i=0;i<msg.length();i++)
        {
            k+=String.valueOf(msg.charAt(i));
            jLabel3.setText(k);
            Thread.sleep(100);
        }
        }
        catch(InterruptedException e){}
    }
    public void anim()
    {
     
        AnimationClass ac=new AnimationClass();
        ac.jLabelYDown(0, 20, 20, 1, jLabel3);
        ac.jLabelXRight(0, 60, 3, 1, jLabel7);
        ac.jTextFieldXLeft(400, 190, 1, 1, txtn);        
        ac.jLabelXRight(0, 60, 3, 1, jLabel1);
        ac.jTextAreaXLeft(400, 190, 1, 1, jScrollPane1);        
        ac.jLabelXRight(0, 60, 3, 1, jLabel2);
        ac.jTextFieldXLeft(400, 190, 1, 1, txtsum);
        ac.jButtonYUp(300, 250, 10, 1, btnOK);
        ac.jLabelXLeft(400, 190, 1, 1, jLabel4);
        ac.jLabelXLeft(400, 190, 1, 1, jLabel6);
        ac.jLabelXLeft(400, 190, 1, 1, jLabel5);
       
    }
    public int rms(int left,int right)
    {
        if(left>=right)
        {
            return left;
        }
        else
        {
            int mid=(left+right)/2;
            return lim(rms(left,mid),rms(mid+1,right));
        }
    }
    int lim(int strt1,int strt2)
    {
        int iresult=0,i1,i2;
        for(i1=strt1,i2=strt2;i1!=0&&i2!=0;)
        {
            if(r[i1]<=r[i2])
            {
                link[iresult]=i1;
                iresult=i1;
                i1=link[i1];
            }
            else
            {
                link[iresult]=i2;
                iresult=i2;
                i2=link[i2];
            }
        }
        if(i1==0)
        {
            link[iresult]=i2;
            
        }
        else
        {
            link[iresult]=i1;
        }
        return link[0];
    }
    public void rupdate()
    {
        int g[]=new int[n];
        int pos=link[0];
        for(i=0;i<n;i++)
        {
            g[i]=r[pos];
            pos=link[pos];
        }
        for(i=0;i<n;i++)
        {
            r[i]=g[i];
        }
    }
    public void hashimp()
    {
        for(i=0;i<10;i++)
        {
           hashtab1[i]=new ArrayList();
           hashtab2[i]=new ArrayList();
        }
        for(i=0;i<n;i++)
        {
            int k=a[i]%10;
            hashtab1[k].add(a[i]);
        }
       //display();
        hashsoln();
    } 
    public void display()
    {
        for(i=0;i<10;i++)
        {
                for(int j:hashtab1[i])
                {
                    System.out.println(i+" "+j);
                }
        }
    }
    public Boolean lookup1(int m)
    {
        int k=m%10;
        for( int j:hashtab1[k])
        {
            if(m==j)
            {
                return true;
            }
        }
        return false;
    }
    public Boolean lookup2(int m)
    {
        int k=m%10;
        for( int j:hashtab2[k])
        {
            if(m==j)
            {
                return true;
            }
        }
        return false;
    }
    public Boolean binsearch(int m)
    {
         int low=0,mid;
         int high=n;
         while(low<=high)
         {
             mid=(low+high)/2;
             if(m>r[mid])
             {
                 low=mid+1;
             }
             else if(m==r[mid])
             {
                 return true;
             }
             else
             {
                 high=mid-1;
             }
             
         }
         return false;
         
     }
    public void hashsoln()
    {
        int j;
        for(i=0;i<n;i++)
        {
            if((sum-a[i])>0&&lookup1(sum-a[i]))
            {
                j=(sum-a[i])%10;
                hashtab2[j].add(sum-a[i]);
                if(!lookup2(a[i]))
                {
                    System.out.println("("+a[i]+","+(sum-a[i])+")");
                }
            }
        }
    }
    public void sortsoln()
    {
        int j;
        for(i=0;i<10;i++)
        {
           hashtab2[i]=new ArrayList();
        }
        for(i=0;i<n;i++)
        {
            if((sum-r[i])>0&&binsearch(sum-r[i]))
            {
                j=(sum-r[i])%10;
                hashtab2[j].add(sum-r[i]);
                if(!lookup2(r[i]))
                {
                    System.out.println("("+r[i]+","+(sum-r[i])+")");
                }
            }
        }
        w=1;
    }
    public void naivesoln()
    {
        int j=0,l=0;
        for(i=0;i<10;i++)
        {
           hashtab2[i]=new ArrayList();
        }
        for(i=0;i<n;i++)
        {
            for(l=0;l<n;l++)
            {
                if(i!=l)
                {
                    if(a[i]+a[l]==sum)
                    {
                        j=a[l]%10;
                        hashtab2[j].add(a[l]);
                        if(!lookup2(a[i]))
                        {
                            System.out.println("("+a[i]+","+(a[l])+")");
                        }
                    }
                }
            }
        }
    }
    @Override
    public void paint(Graphics g)
    {
       if(w==1)
       {
       try
       {
           Graphics2D g2 = (Graphics2D) g;
           g2.setStroke(new BasicStroke(3));
           g2.drawLine(50, 50, 50, 300);
           Thread.sleep(200);
           g2.drawLine(50, 50, 100, 50);
           Thread.sleep(200);
           g2.drawLine(100, 50, 100, 300);
           Thread.sleep(200);
           g2.drawLine(50, 300, 100, 300);
           Thread.sleep(200);
           g2.drawLine(50, 75, 100, 75);
           Thread.sleep(200);
           g2.drawLine(50, 100, 100, 100);
           Thread.sleep(200);
           g2.drawLine(50, 125, 100, 125); 
       }
       catch(InterruptedException e)
       {
           
       }
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpan = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtsum = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        txtn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtnum = new javax.swing.JTextArea();
        Panel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Panel0 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        mainpan.setMaximumSize(new java.awt.Dimension(400, 300));
        mainpan.setLayout(new java.awt.CardLayout());

        Panel1.setMaximumSize(new java.awt.Dimension(400, 300));
        Panel1.setMinimumSize(new java.awt.Dimension(400, 300));
        Panel1.setLayout(null);

        jLabel1.setText("Enter n Numbers:");
        Panel1.add(jLabel1);
        jLabel1.setBounds(0, 140, 90, 14);

        jLabel2.setText("Enter Sum:");
        Panel1.add(jLabel2);
        jLabel2.setBounds(0, 200, 80, 14);

        jLabel3.setFont(new java.awt.Font("Silent Reaction", 0, 24)); // NOI18N
        Panel1.add(jLabel3);
        jLabel3.setBounds(100, 12, 220, 40);

        jLabel4.setText("eg:5 or 20 or 99");
        Panel1.add(jLabel4);
        jLabel4.setBounds(400, 100, 90, 14);

        jLabel5.setText("eg:4 or 345 or 12964");
        Panel1.add(jLabel5);
        jLabel5.setBounds(400, 220, 110, 14);

        jLabel6.setText("eg:1,2,3,4.....");
        Panel1.add(jLabel6);
        jLabel6.setBounds(400, 170, 80, 14);

        jLabel7.setText("Enter n:");
        Panel1.add(jLabel7);
        jLabel7.setBounds(0, 80, 50, 14);

        txtsum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsumKeyReleased(evt);
            }
        });
        Panel1.add(txtsum);
        txtsum.setBounds(400, 190, 59, 30);

        btnOK.setText("OK");
        btnOK.setName("btnok"); // NOI18N
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        Panel1.add(btnOK);
        btnOK.setBounds(150, 300, 70, 23);

        txtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnActionPerformed(evt);
            }
        });
        txtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnKeyTyped(evt);
            }
        });
        Panel1.add(txtn);
        txtn.setBounds(400, 70, 59, 30);

        txtnum.setColumns(10);
        txtnum.setLineWrap(true);
        txtnum.setRows(1);
        txtnum.setTabSize(5);
        txtnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtnum);

        Panel1.add(jScrollPane1);
        jScrollPane1.setBounds(400, 130, 170, 40);

        mainpan.add(Panel1, "card2");

        Panel2.setLayout(null);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel2.add(jButton1);
        jButton1.setBounds(163, 5, 73, 23);

        mainpan.add(Panel2, "card3");

        Panel0.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("2-SUM PROBLEM");
        Panel0.add(jLabel8);
        jLabel8.setBounds(100, 10, 190, 60);

        mainpan.add(Panel0, "card4");

        getContentPane().add(mainpan);
        mainpan.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsumKeyReleased
        btnOK.setEnabled(false);
        n=Integer.parseInt(txtn.getText());
        sum=Integer.parseInt(txtsum.getText());
        StringTokenizer st=new StringTokenizer(txtnum.getText(),",");
        if(i==0)
        {
            while(st.hasMoreTokens())
            {
                a[i]=Integer.parseInt(st.nextToken());
                i++;
            }  
        }
        if(n<=100&&sum<100000&&n==i&&n>0&&sum>0)
        {
            btnOK.setEnabled(true);
        }
        else
        {
            i=0;
            btnOK.setEnabled(false);
        }
    }//GEN-LAST:event_txtsumKeyReleased

    private void txtnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumKeyTyped
        btnOK.setEnabled(false);    
        txtsum.setText("");
    }//GEN-LAST:event_txtnumKeyTyped

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed

       CardLayout card=new CardLayout();
       this.add(mainpan);
       mainpan.setLayout(card);
       mainpan.add(Panel1);
       card.next(mainpan);
//       link=new int[n+1];
//       r=new int[n+1];
//       r[0]=0;Arrays.fill(link, 0);
//       for(i=1;i<n+1;i++)
//        {
//          r[i]=a[i-1];
//        }
//       rms(1,n);
//       rupdate();
//       sortsoln();
       //hashimp();
       naivesoln();
    }//GEN-LAST:event_btnOKActionPerformed

    private void txtnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnKeyTyped
        btnOK.setEnabled(false);
        txtsum.setText("");
    }//GEN-LAST:event_txtnKeyTyped

    private void txtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        w=1;repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
                }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel0;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainpan;
    private javax.swing.JTextField txtn;
    private javax.swing.JTextArea txtnum;
    private javax.swing.JTextField txtsum;
    // End of variables declaration//GEN-END:variables
}
