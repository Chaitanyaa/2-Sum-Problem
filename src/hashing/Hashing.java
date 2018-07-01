package hashing;
import AppPackage.AnimationClass;
import javax.swing.*;
import com.sun.speech.freetts.*;
import java.awt.*;
import java.text.*;
import java.util.*; 
public class Hashing extends javax.swing.JFrame implements Runnable{
    int xMouse;
    int yMouse;
    int threadi;
    int i=0,w=0,start;
    int n,sum,link[],r[];
    int a[]=new int[10];
    ImageIcon ii;
    JFrame f=new from1();
    from1 time=new from1();
    ArrayList<Integer>[] hashtab1=new ArrayList[10];
    ArrayList<Integer>[] hashtab2=new ArrayList[10];
    String msg;
    Thread txt,voice,lines1,lines2,lines3,soln1,soln2,soln3;
    CardLayout card=new CardLayout();
    AnimationClass ac=new AnimationClass();
    public Hashing() {
        initComponents();
        this.setLocationRelativeTo(null);
        txt=new Thread(this);
        txt.start();
        loadvisibility();
        
    }
    public void loadvisibility()
    {
        help2pg.setVisible(false);
        help2pg1.setVisible(false);
        help2pg2.setVisible(false);
        help2pg3.setVisible(false);
        nxt.setVisible(false);
        nxttxt.setVisible(false);
        ta.setEditable(false);
        ta1.setEditable(false);
        ta2.setEditable(false);
        nxttxt1.setVisible(false);
        nxt1.setVisible(false);
        nxttxt2.setVisible(false);
        nxt2.setVisible(false);
        nxttxt3.setVisible(false);
        nxt3.setVisible(false);
        nxttxt4.setVisible(false);
        nxt4.setVisible(false);
        jComboBox1.setVisible(false);
        v1.setVisible(false);
        v2.setVisible(false);
        v3.setVisible(false);
        v4.setVisible(false);
        v5.setVisible(false);
        v6.setVisible(false);
        v8.setVisible(false);
        v9.setVisible(false);
        v10.setVisible(false);
        v11.setVisible(false);
        v7.setVisible(false);
        h1.setVisible(false);
        h2.setVisible(false);
        h3.setVisible(false);
        h4.setVisible(false);
        h5.setVisible(false);
        h6.setVisible(false);
        h7.setVisible(false);
        h8.setVisible(false);
        h9.setVisible(false);
        h10.setVisible(false);
        h13.setVisible(false);
        h14.setVisible(false);
        h15.setVisible(false);
        h16.setVisible(false);
        h17.setVisible(false);
        h18.setVisible(false);
        h19.setVisible(false);
        h20.setVisible(false);
        h11.setVisible(false);
        h12.setVisible(false);
        v12.setVisible(false);
        v13.setVisible(false);
        v14.setVisible(false);
        v15.setVisible(false);
        v16.setVisible(false);
        v17.setVisible(false);
        v19.setVisible(false);
        v20.setVisible(false);
        v21.setVisible(false);
        v22.setVisible(false);
        v18.setVisible(false);
        h21.setVisible(false);
        h22.setVisible(false);
        h23.setVisible(false);
        h24.setVisible(false);
        h25.setVisible(false);
        h26.setVisible(false);
        h27.setVisible(false);
        h28.setVisible(false);
        h29.setVisible(false);
        h30.setVisible(false);
        h33.setVisible(false);
        h34.setVisible(false);
        h35.setVisible(false);
        h36.setVisible(false);
        h37.setVisible(false);
        h38.setVisible(false);
        h39.setVisible(false);
        h40.setVisible(false);
        h31.setVisible(false);
        h32.setVisible(false);
        va1.setVisible(false);
        va2.setVisible(false);
        va3.setVisible(false);
        va4.setVisible(false);
        va5.setVisible(false);
        va6.setVisible(false);
        va7.setVisible(false);
        va8.setVisible(false);
        va9.setVisible(false);
        va10.setVisible(false);
        va11.setVisible(false);
        va12.setVisible(false);
        va13.setVisible(false);
        va14.setVisible(false);
        va15.setVisible(false);
        va16.setVisible(false);
        va17.setVisible(false);
        va18.setVisible(false);
        va19.setVisible(false);
        va20.setVisible(false);
        ha1.setVisible(false);
        ha2.setVisible(false);
        ha3.setVisible(false);
        ha4.setVisible(false);
        ha5.setVisible(false);
        ha6.setVisible(false);
        ha7.setVisible(false);
        ha8.setVisible(false);
        ha9.setVisible(false);
        ha10.setVisible(false);
        ha11.setVisible(false);
        ha12.setVisible(false);
        v23.setVisible(false);
        v24.setVisible(false);
        v25.setVisible(false);
        v26.setVisible(false);
        v27.setVisible(false);
        v28.setVisible(false);
        v29.setVisible(false);
        v30.setVisible(false);
        v31.setVisible(false);
        v32.setVisible(false);
        v33.setVisible(false);
        h41.setVisible(false);
        h42.setVisible(false);
        h43.setVisible(false);
        h44.setVisible(false);
        h45.setVisible(false);
        h46.setVisible(false);
        h47.setVisible(false);
        h48.setVisible(false);
        h49.setVisible(false);
        h50.setVisible(false);
        h51.setVisible(false);
        h52.setVisible(false);
        h53.setVisible(false);
        h54.setVisible(false);
        h55.setVisible(false);
        h56.setVisible(false);
        h57.setVisible(false);
        h58.setVisible(false);
        h59.setVisible(false);
        h60.setVisible(false);
        a1.setVisible(false);
        a2.setVisible(false);
        a3.setVisible(false);
        a4.setVisible(false);
        decide.setVisible(false);
        decide1.setVisible(false);
        decide2.setVisible(false);
        vbfalse();
        hbfalse();
        atfalse();
        matrixnfalse();
    }
    public void vbfalse()
    {
        
        vb1.setVisible(false);
        vb2.setVisible(false);
        vb3.setVisible(false);
        vb4.setVisible(false);
        vb5.setVisible(false);
        vb6.setVisible(false);
        vb7.setVisible(false);
        vb8.setVisible(false);
        vb9.setVisible(false);
        vb10.setVisible(false);
        vb11.setVisible(false);
        vb12.setVisible(false);
        vb13.setVisible(false);
        vb14.setVisible(false);
        vb15.setVisible(false);
        vb16.setVisible(false);
        vb17.setVisible(false);
        vb18.setVisible(false);
        vb19.setVisible(false);
        vb20.setVisible(false);
        vb21.setVisible(false);
        vb22.setVisible(false);
        vb23.setVisible(false);
        vb24.setVisible(false);
        vb25.setVisible(false);
        vb26.setVisible(false);
        vb27.setVisible(false);
        vb28.setVisible(false);
        vb29.setVisible(false);
        vb30.setVisible(false);
        vb31.setVisible(false);
        vb32.setVisible(false);
        vb33.setVisible(false);
        vb34.setVisible(false);
        vb35.setVisible(false);
        vb36.setVisible(false);
        vb37.setVisible(false);
        vb38.setVisible(false);
        vb39.setVisible(false);
        vb40.setVisible(false);
        vb41.setVisible(false);
        vb42.setVisible(false);
        vb43.setVisible(false);
        vb44.setVisible(false);
        vb45.setVisible(false);
        vb46.setVisible(false);
        vb47.setVisible(false);
        vb48.setVisible(false);
        vb49.setVisible(false);
        vb50.setVisible(false);
        vb51.setVisible(false);
        vb52.setVisible(false);
        vb53.setVisible(false);
        vb54.setVisible(false);
        vb55.setVisible(false);
        vb56.setVisible(false);
        vb57.setVisible(false);
        vb58.setVisible(false);
        vb59.setVisible(false);
        vb60.setVisible(false);
        vb61.setVisible(false);
        vb62.setVisible(false);
        vb63.setVisible(false);
        vb64.setVisible(false);
        vb65.setVisible(false);
        vb66.setVisible(false);
        vb67.setVisible(false);
        vb68.setVisible(false);
        vb69.setVisible(false);
        vb70.setVisible(false);
        vb71.setVisible(false);
        vb72.setVisible(false);
        vb73.setVisible(false);
        vb74.setVisible(false);
        vb75.setVisible(false);
        vb76.setVisible(false);
        vb77.setVisible(false);
        vb78.setVisible(false);
        vb79.setVisible(false);
        vb80.setVisible(false);
        vb81.setVisible(false);
        vb82.setVisible(false);
        vb83.setVisible(false);
        vb84.setVisible(false);
        vb85.setVisible(false);
        vb86.setVisible(false);
        vb87.setVisible(false);
        vb88.setVisible(false);
        vb89.setVisible(false);
        vb90.setVisible(false);
        vb91.setVisible(false);
        vb92.setVisible(false);
        vb93.setVisible(false);
        vb94.setVisible(false);
        vb95.setVisible(false);
        vb96.setVisible(false);
        vb97.setVisible(false);
        vb98.setVisible(false);
        vb99.setVisible(false);
        vb100.setVisible(false);
        vb101.setVisible(false);
        vb102.setVisible(false);
        vb103.setVisible(false);
        vb104.setVisible(false);
        vb105.setVisible(false);
        vb106.setVisible(false);
        vb107.setVisible(false);
        vb108.setVisible(false);
        vb109.setVisible(false);
        vb110.setVisible(false);
        vb111.setVisible(false);
        vb112.setVisible(false);
        vb113.setVisible(false);
        vb114.setVisible(false);
        vb115.setVisible(false);
        vb116.setVisible(false);
        vb117.setVisible(false);
        vb118.setVisible(false);
        vb119.setVisible(false);
        vb120.setVisible(false);
             
    }
    public void hbfalse()
    {
        
        hb1.setVisible(false);
        hb2.setVisible(false);
        hb3.setVisible(false);
        hb4.setVisible(false);
        hb5.setVisible(false);
        hb6.setVisible(false);
        hb7.setVisible(false);
        hb8.setVisible(false);
        hb9.setVisible(false);
        hb10.setVisible(false);
        hb11.setVisible(false);
        hb12.setVisible(false);
        hb13.setVisible(false);
        hb14.setVisible(false);
        hb15.setVisible(false);
        hb16.setVisible(false);
        hb17.setVisible(false);
        hb18.setVisible(false);
        hb19.setVisible(false);
        hb20.setVisible(false);
        hb21.setVisible(false);
        hb22.setVisible(false);
        hb23.setVisible(false);
        hb24.setVisible(false);
        hb25.setVisible(false);
        hb26.setVisible(false);
        hb27.setVisible(false);
        hb28.setVisible(false);
        hb29.setVisible(false);
        hb30.setVisible(false);
        hb31.setVisible(false);
        hb32.setVisible(false);
        hb33.setVisible(false);
        hb34.setVisible(false);
        hb35.setVisible(false);
        hb36.setVisible(false);
        hb37.setVisible(false);
        hb38.setVisible(false);
        hb39.setVisible(false);
        hb40.setVisible(false);
        hb41.setVisible(false);
        hb42.setVisible(false);
        hb43.setVisible(false);
        hb44.setVisible(false);
        hb45.setVisible(false);
        hb46.setVisible(false);
        hb47.setVisible(false);
        hb48.setVisible(false);
        hb49.setVisible(false);
        hb50.setVisible(false);
        hb51.setVisible(false);
        hb52.setVisible(false);
        hb53.setVisible(false);
        hb54.setVisible(false);
        hb55.setVisible(false);
        hb56.setVisible(false);
        hb57.setVisible(false);
        hb58.setVisible(false);
        hb59.setVisible(false);
        hb60.setVisible(false);
        hb61.setVisible(false);
        hb62.setVisible(false);
        hb63.setVisible(false);
        hb64.setVisible(false);
        hb65.setVisible(false);
        hb66.setVisible(false);
        hb67.setVisible(false);
        hb68.setVisible(false);
        hb69.setVisible(false);
        hb70.setVisible(false);
        hb71.setVisible(false);
        hb72.setVisible(false);
        hb73.setVisible(false);
        hb74.setVisible(false);
        hb75.setVisible(false);
        hb76.setVisible(false);
        hb77.setVisible(false);
        hb78.setVisible(false);
        hb79.setVisible(false);
        hb80.setVisible(false);
        hb81.setVisible(false);
        hb82.setVisible(false);
        hb83.setVisible(false);
        hb84.setVisible(false);
        hb85.setVisible(false);
        hb86.setVisible(false);
        hb87.setVisible(false);
        hb88.setVisible(false);
        hb89.setVisible(false);
        hb90.setVisible(false);
        hb91.setVisible(false);
        hb92.setVisible(false);
        hb93.setVisible(false);
        hb94.setVisible(false);
        hb95.setVisible(false);
        hb96.setVisible(false);
        hb97.setVisible(false);
        hb98.setVisible(false);
        hb99.setVisible(false);
        hb100.setVisible(false);
        hb101.setVisible(false);
        hb102.setVisible(false);
        hb103.setVisible(false);
        hb104.setVisible(false);
        hb105.setVisible(false);
        hb106.setVisible(false);
        hb107.setVisible(false);
        hb108.setVisible(false);
        hb109.setVisible(false);
        hb110.setVisible(false);
        hb111.setVisible(false);
        hb112.setVisible(false);
        hb113.setVisible(false);
        hb114.setVisible(false);
        hb115.setVisible(false);
        hb116.setVisible(false);
        hb117.setVisible(false);
        hb118.setVisible(false);
        hb119.setVisible(false);
        hb120.setVisible(false);
        
    }
    public void atfalse()
    {
        
        at1.setVisible(false);
        at2.setVisible(false);
        at3.setVisible(false);
        at4.setVisible(false);
        at5.setVisible(false);
        at6.setVisible(false);
        at7.setVisible(false);
        at8.setVisible(false);
        at9.setVisible(false);
        at10.setVisible(false);
        at11.setVisible(false);
        at12.setVisible(false);
        at13.setVisible(false);
        at14.setVisible(false);
        at15.setVisible(false);
        at16.setVisible(false);
        at17.setVisible(false);
        at18.setVisible(false);
        at19.setVisible(false);
        at20.setVisible(false);
        at21.setVisible(false);
        at22.setVisible(false);
        at23.setVisible(false);
        at24.setVisible(false);
        at25.setVisible(false);
        at26.setVisible(false);
        at27.setVisible(false);
        at28.setVisible(false);
        at29.setVisible(false);
        at30.setVisible(false);
        at31.setVisible(false);
        at32.setVisible(false);
        at33.setVisible(false);
        at34.setVisible(false);
        at35.setVisible(false);
        at36.setVisible(false);
        at37.setVisible(false);
        at38.setVisible(false);
        at39.setVisible(false);
        at40.setVisible(false);
        at41.setVisible(false);
        at42.setVisible(false);
        at43.setVisible(false);
        at44.setVisible(false);
        at45.setVisible(false);
        at46.setVisible(false);
        at47.setVisible(false);
        at48.setVisible(false);
        at49.setVisible(false);
        at50.setVisible(false);
        at51.setVisible(false);
        at52.setVisible(false);
        at53.setVisible(false);
        at54.setVisible(false);
        at55.setVisible(false);
        at56.setVisible(false);
        at57.setVisible(false);
        at58.setVisible(false);
        at59.setVisible(false);
        at60.setVisible(false);
        
    }
    public void matrixnfalse()
    {
        
        n31.setVisible(false);
        n32.setVisible(false);
        n33.setVisible(false);
        n34.setVisible(false);
        n35.setVisible(false);
        n36.setVisible(false);
        n37.setVisible(false);
        n38.setVisible(false);
        n39.setVisible(false);
        n40.setVisible(false);
        n41.setVisible(false);
        n42.setVisible(false);
        n43.setVisible(false);
        n44.setVisible(false);
        n45.setVisible(false);
        n46.setVisible(false);
        n47.setVisible(false);
        n48.setVisible(false);
        n49.setVisible(false);
        n50.setVisible(false);
        n51.setVisible(false);
        n52.setVisible(false);
        n53.setVisible(false);
        n54.setVisible(false);
        n55.setVisible(false);
        n56.setVisible(false);
        n57.setVisible(false);
        n58.setVisible(false);
        n59.setVisible(false);
        n60.setVisible(false);
        n61.setVisible(false);
        n62.setVisible(false);
        n63.setVisible(false);
        n64.setVisible(false);
        n65.setVisible(false);
        n66.setVisible(false);
        n67.setVisible(false);
        n68.setVisible(false);
        n69.setVisible(false);
        n70.setVisible(false);
        n71.setVisible(false);
        n72.setVisible(false);
        n73.setVisible(false);
        n74.setVisible(false);
        n75.setVisible(false);
        n76.setVisible(false);
        n77.setVisible(false);
        n78.setVisible(false);
        n79.setVisible(false);
        n80.setVisible(false);
        n81.setVisible(false);
        n82.setVisible(false);
        n83.setVisible(false);
        n84.setVisible(false);
        n85.setVisible(false);
        n86.setVisible(false);
        n87.setVisible(false);
        n88.setVisible(false);
        n89.setVisible(false);
        n90.setVisible(false);
        
    }
    public void boxvisible()
    {
        threadi=2;
        lines1=new Thread(this);
        lines1.start();      
    }
    public void boxvisible1()
    {
        threadi=5;
        lines2=new Thread(this);
        lines2.start(); 
    }
    public void boxvisible2()
    {
        threadi=6;
        lines3=new Thread(this);
        lines3.start();
    }
    public void numload()
    {
        
        for(i=0;i<n;i++)
        {
            a1.setVisible(true);
            switch(i)
            {
                case 0: n1.setText(String.valueOf(a[i]));
                    break;
                case 1: n2.setText(String.valueOf(a[i]));
                    break;
                case 2: n3.setText(String.valueOf(a[i]));
                    break;
                case 3: n4.setText(String.valueOf(a[i]));
                    break;
                case 4: n5.setText(String.valueOf(a[i]));
                    break;
                case 5: n6.setText(String.valueOf(a[i]));
                    break;
                case 6: n7.setText(String.valueOf(a[i]));
                    break;
                case 7: n8.setText(String.valueOf(a[i]));
                    break;
                case 8: n9.setText(String.valueOf(a[i]));
                    break;
                case 9: n10.setText(String.valueOf(a[i]));
                    break;
                    
            }
        }
    }
    public void numload1()
    {
        
        for(i=0;i<n;i++)
        {
            a3.setVisible(true);
            switch(i)
            {
                case 0: n11.setText(String.valueOf(r[i]));
                    break;
                case 1: n12.setText(String.valueOf(r[i]));
                    break;
                case 2: n13.setText(String.valueOf(r[i]));
                    break;
                case 3: n14.setText(String.valueOf(r[i]));
                    break;
                case 4: n15.setText(String.valueOf(r[i]));
                    break;
                case 5: n16.setText(String.valueOf(r[i]));
                    break;
                case 6: n17.setText(String.valueOf(r[i]));
                    break;
                case 7: n18.setText(String.valueOf(r[i]));
                    break;
                case 8: n19.setText(String.valueOf(r[i]));
                    break;
                case 9: n20.setText(String.valueOf(r[i]));
                    break;
                    
            }
        }
    }
    public void numload2()
    {
        for(i=0;i<n;i++)
        {
            a5.setVisible(true);
            switch(i)
            {
                case 0: n91.setText(String.valueOf(a[i]));
                    break;
                case 1: n92.setText(String.valueOf(a[i]));
                    break;
                case 2: n93.setText(String.valueOf(a[i]));
                    break;
                case 3: n94.setText(String.valueOf(a[i]));
                    break;
                case 4: n95.setText(String.valueOf(a[i]));
                    break;
                case 5: n96.setText(String.valueOf(a[i]));
                    break;
                case 6: n97.setText(String.valueOf(a[i]));
                    break;
                case 7: n98.setText(String.valueOf(a[i]));
                    break;
                case 8: n99.setText(String.valueOf(a[i]));
                    break;
                case 9: n100.setText(String.valueOf(a[i]));
                    break;
                    
            }
        }
    }
    public void speak()
    {
        voice=new Thread(this);
        threadi=1;
        voice.start();
    }
    public void Thread0()
    {
        try
        {
            Thread.sleep(4000);
            ac.jLabelYUp(260, 100, 5, 1, Heading);
            Thread.sleep(2000);
            speak();
            msg="Given an unsorted array ' A' of integers and a target sum ‘T ,";
            flowtxt(msg,Prblmstmt1);
            speak();
            msg="    we need to determine whether or not there are";
            flowtxt(msg,Prblmstmt2);
            speak();
            msg="  two numbers 'X ' and 'Y ' in  A  such that X+Y=T.";
            flowtxt(msg,Prblmstmt3);
            Thread.sleep(2000);
            nxt.setVisible(true);
            nxttxt.setVisible(true);
            ac.jLabelYUp(660, 640, 20, 2, nxt);
            ac.jLabelYUp(658, 638, 20, 2, nxttxt);
        }
        catch(InterruptedException e){}
    }
    public void Thread1()
    {
        //try
        {
            Voice v;
            VoiceManager vm=VoiceManager.getInstance();
            System.setProperty("mbrola.base", "C:\\Users\\SAI CHAITANYA\\Documents\\NetBeansProjects\\Hashing\\mbr301d");
            v=vm.getVoice("mbrola_us1");
            v.allocate();
            v.speak(msg);
        }
        //catch(InterruptedException e){}
    }
    public void Thread2()
    {
        try
        {
            switch(n)
                {
                    case 10:
                        Thread.sleep(100);
                        h1.setVisible(true);
                        h2.setVisible(true);
                        Thread.sleep(100);
                        h3.setVisible(true);
                        h4.setVisible(true);
                        Thread.sleep(100);
                        h5.setVisible(true);
                        h6.setVisible(true);
                        Thread.sleep(100);
                        h7.setVisible(true);
                        h8.setVisible(true);
                        Thread.sleep(100);
                        h9.setVisible(true);
                        h10.setVisible(true);
                        Thread.sleep(100);
                        h11.setVisible(true);
                        h12.setVisible(true);
                        Thread.sleep(100);
                        h13.setVisible(true);
                        h14.setVisible(true);
                        Thread.sleep(100);
                        h15.setVisible(true);
                        h16.setVisible(true);
                        Thread.sleep(100);
                        h17.setVisible(true);
                        h18.setVisible(true);
                        Thread.sleep(100);
                        h19.setVisible(true);
                        h20.setVisible(true);
                        Thread.sleep(100);
                        v1.setVisible(true);
                        v2.setVisible(true);
                        Thread.sleep(100);
                        v3.setVisible(true);
                        v4.setVisible(true);
                        Thread.sleep(100);
                        v5.setVisible(true);
                        v6.setVisible(true);
                        Thread.sleep(100);
                        v7.setVisible(true);
                        v8.setVisible(true);
                        Thread.sleep(100);
                        v9.setVisible(true);
                        v10.setVisible(true);
                        Thread.sleep(100);
                        v11.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n1);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 544, 1, 1, n6);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 424, 1, 1, n2);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 574, 1, 1, n7);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 454, 1, 1, n3);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 604, 1, 1, n8);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 484, 1, 1, n4);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 634, 1, 1, n9);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 514, 1, 1, n5);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 664, 1, 1, n10);
                        
                        break;
                    case 9:
                        Thread.sleep(100);
                        h1.setVisible(true);
                        h2.setVisible(true);
                        Thread.sleep(100);
                        h3.setVisible(true);
                        h4.setVisible(true);
                        Thread.sleep(100);
                        h5.setVisible(true);
                        h6.setVisible(true);
                        Thread.sleep(100);
                        h7.setVisible(true);
                        h8.setVisible(true);
                        Thread.sleep(100);
                        h9.setVisible(true);
                        h10.setVisible(true);
                        Thread.sleep(100);
                        h11.setVisible(true);
                        h12.setVisible(true);
                        Thread.sleep(100);
                        h13.setVisible(true);
                        h14.setVisible(true);
                        Thread.sleep(100);
                        h15.setVisible(true);
                        h16.setVisible(true);
                        Thread.sleep(100);
                        h17.setVisible(true);
                        h18.setVisible(true);
                        Thread.sleep(100);
                        v1.setVisible(true);
                        v2.setVisible(true);
                        Thread.sleep(100);
                        v3.setVisible(true);
                        v4.setVisible(true);
                        Thread.sleep(100);
                        v5.setVisible(true);
                        v6.setVisible(true);
                        Thread.sleep(100);
                        v7.setVisible(true);
                        v8.setVisible(true);
                        Thread.sleep(100);
                        v9.setVisible(true);
                        Thread.sleep(100);
                        v10.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n1);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 544, 1, 1, n6);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 424, 1, 1, n2);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 574, 1, 1, n7);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 454, 1, 1, n3);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 604, 1, 1, n8);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 484, 1, 1, n4);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 634, 1, 1, n9);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 514, 1, 1, n5);
                        Thread.sleep(100);
                        
                        break;
                    case 8:
                        Thread.sleep(100);
                        h1.setVisible(true);
                        h2.setVisible(true);
                        Thread.sleep(100);
                        h3.setVisible(true);
                        h4.setVisible(true);
                        Thread.sleep(100);
                        h5.setVisible(true);
                        h6.setVisible(true);
                        Thread.sleep(100);
                        h7.setVisible(true);
                        h8.setVisible(true);
                        Thread.sleep(100);
                        h9.setVisible(true);
                        h10.setVisible(true);
                        Thread.sleep(100);
                        h11.setVisible(true);
                        h12.setVisible(true);
                        Thread.sleep(100);
                        h13.setVisible(true);
                        h14.setVisible(true);
                        Thread.sleep(100);
                        h15.setVisible(true);
                        h16.setVisible(true);
                        Thread.sleep(100);
                        v1.setVisible(true);
                        v2.setVisible(true);
                        Thread.sleep(100);
                        v3.setVisible(true);
                        v4.setVisible(true);
                        Thread.sleep(100);
                        v5.setVisible(true);
                        v6.setVisible(true);
                        Thread.sleep(100);
                        v7.setVisible(true);
                        v8.setVisible(true);
                        Thread.sleep(100);
                        v9.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n1);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 544, 1, 1, n6);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 424, 1, 1, n2);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 574, 1, 1, n7);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 454, 1, 1, n3);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 604, 1, 1, n8);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 484, 1, 1, n4);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 514, 1, 1, n5);
                        
                        break;
                    case 7:
                        Thread.sleep(100);
                        h1.setVisible(true);
                        h2.setVisible(true);
                        Thread.sleep(100);
                        h3.setVisible(true);
                        h4.setVisible(true);
                        Thread.sleep(100);
                        h5.setVisible(true);
                        h6.setVisible(true);
                        Thread.sleep(100);
                        h7.setVisible(true);
                        h8.setVisible(true);
                        Thread.sleep(100);
                        h9.setVisible(true);
                        h10.setVisible(true);
                        Thread.sleep(100);
                        h11.setVisible(true);
                        h12.setVisible(true);
                        Thread.sleep(100);
                        h13.setVisible(true);
                        h14.setVisible(true);
                        Thread.sleep(100);
                        v1.setVisible(true);
                        v2.setVisible(true);
                        Thread.sleep(100);
                        v3.setVisible(true);
                        v4.setVisible(true);
                        Thread.sleep(100);
                        v5.setVisible(true);
                        v6.setVisible(true);
                        Thread.sleep(100);
                        v7.setVisible(true);
                        v8.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n1);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 544, 1, 1, n6);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 424, 1, 1, n2);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 574, 1, 1, n7);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 454, 1, 1, n3);
                        Thread.sleep(100);
                       
                        ac.jLabelXRight(-25, 484, 1, 1, n4);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 514, 1, 1, n5);
                       
                        break;
                    case 6:
                        Thread.sleep(100);
                        h1.setVisible(true);
                        h2.setVisible(true);
                        Thread.sleep(100);
                        h3.setVisible(true);
                        h4.setVisible(true);
                        Thread.sleep(100);
                        h5.setVisible(true);
                        h6.setVisible(true);
                        Thread.sleep(100);
                        h7.setVisible(true);
                        h8.setVisible(true);
                        Thread.sleep(100);
                        h9.setVisible(true);
                        h10.setVisible(true);
                        Thread.sleep(100);
                        h11.setVisible(true);
                        h12.setVisible(true);
                        Thread.sleep(100);
                        v1.setVisible(true);
                        v2.setVisible(true);
                        Thread.sleep(100);
                        v3.setVisible(true);
                        v4.setVisible(true);
                        Thread.sleep(100);
                        v5.setVisible(true);
                        v6.setVisible(true);
                        Thread.sleep(100);
                        v7.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n1);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 544, 1, 1, n6);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 424, 1, 1, n2);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 454, 1, 1, n3);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 484, 1, 1, n4);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 514, 1, 1, n5);
                        Thread.sleep(100);
                        
                        break;
                    case 5:
                        Thread.sleep(100);
                        h1.setVisible(true);
                        h2.setVisible(true);
                        Thread.sleep(100);
                        h3.setVisible(true);
                        h4.setVisible(true);
                        Thread.sleep(100);
                        h5.setVisible(true);
                        h6.setVisible(true);
                        Thread.sleep(100);
                        h7.setVisible(true);
                        h8.setVisible(true);
                        Thread.sleep(100);
                        h9.setVisible(true);
                        h10.setVisible(true);
                        Thread.sleep(100);
                        v1.setVisible(true);
                        v2.setVisible(true);
                        Thread.sleep(100);
                        v3.setVisible(true);
                        v4.setVisible(true);
                        Thread.sleep(100);
                        v5.setVisible(true);
                        v6.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n1);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 424, 1, 1, n2);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 454, 1, 1, n3);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 484, 1, 1, n4);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 514, 1, 1, n5);
                        
                        break;
                    case 4:
                        Thread.sleep(100);
                        h1.setVisible(true);
                        h2.setVisible(true);
                        Thread.sleep(100);
                        h3.setVisible(true);
                        h4.setVisible(true);
                        Thread.sleep(100);
                        h5.setVisible(true);
                        h6.setVisible(true);
                        Thread.sleep(100);
                        h7.setVisible(true);
                        h8.setVisible(true);
                        Thread.sleep(100);
                        v1.setVisible(true);
                        v2.setVisible(true);
                        Thread.sleep(100);
                        v3.setVisible(true);
                        v4.setVisible(true);
                        Thread.sleep(100);
                        v5.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n1);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 424, 1, 1, n2);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 454, 1, 1, n3);
                        
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 484, 1, 1, n4);
                       
                       
                        
                        break;
                    case 3:
                        Thread.sleep(100);
                        h1.setVisible(true);
                        h2.setVisible(true);
                        Thread.sleep(100);
                        h3.setVisible(true);
                        h4.setVisible(true);
                        Thread.sleep(100);
                        h5.setVisible(true);
                        h6.setVisible(true);
                        Thread.sleep(100);
                        v1.setVisible(true);
                        v2.setVisible(true);
                        Thread.sleep(100);
                        v3.setVisible(true);
                        v4.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n1);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 424, 1, 1, n2);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 454, 1, 1, n3);
                        
                        
                        break;       
                    case 2:
                        Thread.sleep(100);
                        h1.setVisible(true);
                        h2.setVisible(true);
                        Thread.sleep(100);
                        h3.setVisible(true);
                        h4.setVisible(true);
                        Thread.sleep(100);
                        v1.setVisible(true);
                        v2.setVisible(true);
                        Thread.sleep(100);
                        v3.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n1);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 424, 1, 1, n2);
                        
                        break;      
                }
        }
        catch(InterruptedException e){}
    }
    public void Thread3()
    {
        try
        {
            start=a1.getX();
            ta.setText(null);
            msg="Naive Solution:    In    this    solution."
                    + "    we    compare    the."
                    + "    sum    of    every    possible    pair."
                    + "    in    the    given    array    with."
                    + "    the    target    sum.";
            speak();
            voice.join();
           int j=0,l=0;
                Thread.sleep(5000);
                time.start();
                a1.setVisible(true);
                tno.setText(String.valueOf(sum));
                sn3.setText(String.valueOf(sum));
                for(i=0;i<10;i++)
                {
                   hashtab2[i]=new ArrayList();
                }
                for(i=0;i<n;i++)
                {   
                    a1.setVisible(true);
                    ac.jLabelXRight(a1.getX(),a1.getX()+30, 1, 1, a1);
                    a1.setBounds(a1.getX()+30, 310, 30, 30);
                    Thread.sleep(1000);
                    for(l=0;l<n;l++)
                    {
                        
                        if(i!=l)
                        {
                            switch(l)
                            {
                                case 0:
                                    a2.setVisible(true);
                                    a2.setBounds(n1.getX()+2, 310, 30, 30);
                                    xno.setText(String.valueOf(a[i]));
                                    yno.setText(String.valueOf(a[l]));
                                    sn1.setText(String.valueOf(a[i]));
                                    sn2.setText(String.valueOf(a[l]));
                                    
                                    break;
                                case 1:
                                    a2.setVisible(true);
                                    a2.setBounds(n2.getX()+2, 310, 30, 30);
                                    xno.setText(String.valueOf(a[i]));
                                    yno.setText(String.valueOf(a[l]));
                                    sn1.setText(String.valueOf(a[i]));
                                    sn2.setText(String.valueOf(a[l]));
                                    
                                    break;
                                case 2:
                                    a2.setVisible(true);
                                    a2.setBounds(n3.getX()+2, 310, 30, 30);
                                    xno.setText(String.valueOf(a[i]));
                                    yno.setText(String.valueOf(a[l]));
                                    sn1.setText(String.valueOf(a[i]));
                                    sn2.setText(String.valueOf(a[l]));
                                    
                                    break;
                                case 3:
                                    a2.setVisible(true);
                                    a2.setBounds(n4.getX()+2, 310, 30, 30);
                                    xno.setText(String.valueOf(a[i]));
                                    yno.setText(String.valueOf(a[l]));
                                    sn1.setText(String.valueOf(a[i]));
                                    sn2.setText(String.valueOf(a[l]));
                                    
                                    break;
                                case 4:
                                    a2.setVisible(true);
                                    a2.setBounds(n5.getX()+2, 310, 30, 30);
                                    xno.setText(String.valueOf(a[i]));
                                    yno.setText(String.valueOf(a[l]));
                                    sn1.setText(String.valueOf(a[i]));
                                    sn2.setText(String.valueOf(a[l]));
                                    
                                    break;
                                case 5:
                                    a2.setVisible(true);
                                    a2.setBounds(n6.getX()+2, 310, 30, 30);
                                    xno.setText(String.valueOf(a[i]));
                                    yno.setText(String.valueOf(a[l]));
                                    sn1.setText(String.valueOf(a[i]));
                                    sn2.setText(String.valueOf(a[l]));
                                    
                                    break;
                                case 6:
                                    a2.setVisible(true);
                                    a2.setBounds(n7.getX()+2, 310, 30, 30);
                                    xno.setText(String.valueOf(a[i]));
                                    yno.setText(String.valueOf(a[l]));
                                    sn1.setText(String.valueOf(a[i]));
                                    sn2.setText(String.valueOf(a[l]));
                                    
                                    break;
                                case 7:
                                    a2.setVisible(true);
                                    a2.setBounds(n8.getX()+2, 310, 30, 30);
                                    xno.setText(String.valueOf(a[i]));
                                    yno.setText(String.valueOf(a[l]));
                                    sn1.setText(String.valueOf(a[i]));
                                    sn2.setText(String.valueOf(a[l]));
                                    
                                    break;
                                case 8:
                                    a2.setVisible(true);
                                    a2.setBounds(n9.getX()+2, 310, 30, 30);
                                    xno.setText(String.valueOf(a[i]));
                                    yno.setText(String.valueOf(a[l]));
                                    sn1.setText(String.valueOf(a[i]));
                                    sn2.setText(String.valueOf(a[l]));
                                    
                                    break;
                                case 9:
                                    a2.setVisible(true);
                                    a2.setBounds(n10.getX()+2, 310, 30, 30);
                                    xno.setText(String.valueOf(a[i]));
                                    yno.setText(String.valueOf(a[l]));
                                    sn1.setText(String.valueOf(a[i]));
                                    sn2.setText(String.valueOf(a[l]));
                                    
                                    break;
                            }
                            if(a[i]+a[l]==sum)
                            {
                                ii=new ImageIcon(getClass().getResource("/customs/tick.png"));
                                decide.setIcon(ii);
                                decide.setVisible(true);
                                j=a[l]%10;
                                hashtab2[j].add(a[l]);
                                if(!lookup2(a[i]))
                                {
                                    System.out.println("("+a[i]+","+(a[l])+")");
                                    ta.append(" ("+String.valueOf(a[i])+","+String.valueOf(a[l]+")\n"));
                                    
                                }
                            }
                            else
                            {
                                ii=new ImageIcon(getClass().getResource("/customs/cross.png"));
                                decide.setIcon(ii);
                                decide.setVisible(true);
                            }
                        }Thread.sleep(500);
                    }
                }
            a1.setBounds(start, 310, 30, 30);
            nxt2.setVisible(true);
            nxttxt2.setVisible(true);
            ac.jLabelYUp(660, 640, 20, 2, nxt2);
            ac.jLabelYUp(658, 638, 20, 2, nxttxt2);
            
        }
        
        catch(InterruptedException e){}
        time.setLocationRelativeTo(null);
        time.stop();
        time.display(3);
    }
    public void Thread4()
    {
        try
        {
            start=a3.getX();
            ta1.setText(null);
            msg="Sort Solution:    In    this    solution."
                    + "    we    first    sort    the    given    array."
                    + "    using    merge    sort."
                    + "    and    then.    "
                    + "for    each    x    in    the    given    array."
                    + "    we    find    t   minus   x.    "
                    + "in    the    array    using    binary    search.";
            speak();
            voice.join();
            int j;
            Thread.sleep(5000);
                time.start();
                int low=0,mid,high=n;
                tno1.setText(String.valueOf(sum));
                sn4.setText(String.valueOf(sum));
                for(i=0;i<10;i++)
                {
                   hashtab2[i]=new ArrayList();
                }
                for(i=0;i<n;i++)
                {   
                    
                    a3.setVisible(true);
                    ac.jLabelXRight(a3.getX(),a3.getX()+30, 1, 1, a3);
                    a3.setBounds(a3.getX()+30, 310, 30, 30);  
                    sn5.setText(String.valueOf(r[i]));
                    xno1.setText(String.valueOf(r[i]));
                    Thread.sleep(500);
                    low=0;high=n;
                    while(low<=high)
                    {  
                        mid=(low+high)/2;
                        if(r[mid]!=r[i])
                        {
                            sortsolnswitch(mid);
                           
                        }
                        if(sum-r[i]>r[mid])
                        {
                            low=mid+1;
                            ii=new ImageIcon(getClass().getResource("/customs/cross.png"));
                            decide1.setIcon(ii);
                            decide1.setVisible(true);
                        }
                        else if(sum-r[i]==r[mid]&&sum-r[i]>0)
                        {
                            
                            j=(sum-r[i])%10;
                            hashtab2[j].add(sum-r[i]);
                            if(!lookup2(r[i]))
                            {
                                System.out.println("("+r[i]+","+(sum-r[i])+")");
                                ta1.append(" ("+String.valueOf(r[i])+","+String.valueOf(sum-r[i]+")\n"));
                                
                            }
                            break;
                        }
                      
                        else
                        {
                            high=mid-1;
                            ii=new ImageIcon(getClass().getResource("/customs/cross.png"));
                            decide1.setIcon(ii);
                            decide1.setVisible(true);
                        }Thread.sleep(1000);
                    }
                    
                }
            a3.setBounds(start, 310, 30, 30);
            nxt3.setVisible(true);
            nxttxt3.setVisible(true);
            ac.jLabelYUp(660, 640, 20, 2, nxt3);
            ac.jLabelYUp(658, 638, 20, 2, nxttxt3);
        }
        catch(InterruptedException e){}
        time.setLocationRelativeTo(null);
        time.stop();
        time.display(4);
    }
    public void Thread5()
    {
        try
        {
            switch(n)
                {
                    case 10:
                        Thread.sleep(100);
                        h21.setVisible(true);
                        h22.setVisible(true);
                        Thread.sleep(100);
                        h23.setVisible(true);
                        h24.setVisible(true);
                        Thread.sleep(100);
                        h25.setVisible(true);
                        h26.setVisible(true);
                        Thread.sleep(100);
                        h27.setVisible(true);
                        h28.setVisible(true);
                        Thread.sleep(100);
                        h29.setVisible(true);
                        h30.setVisible(true);
                        Thread.sleep(100);
                        h31.setVisible(true);
                        h32.setVisible(true);
                        Thread.sleep(100);
                        h33.setVisible(true);
                        h34.setVisible(true);
                        Thread.sleep(100);
                        h35.setVisible(true);
                        h36.setVisible(true);
                        Thread.sleep(100);
                        h37.setVisible(true);
                        h38.setVisible(true);
                        Thread.sleep(100);
                        h39.setVisible(true);
                        h40.setVisible(true);
                        Thread.sleep(100);
                        v12.setVisible(true);
                        v13.setVisible(true);
                        Thread.sleep(100);
                        v14.setVisible(true);
                        v15.setVisible(true);
                        Thread.sleep(100);
                        v16.setVisible(true);
                        v17.setVisible(true);
                        Thread.sleep(100);
                        v18.setVisible(true);
                        v19.setVisible(true);
                        Thread.sleep(100);
                        v20.setVisible(true);
                        v21.setVisible(true);
                        Thread.sleep(100);
                        v22.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n11);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 544, 1, 1, n16);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 424, 1, 1, n12);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 574, 1, 1, n17);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 454, 1, 1, n13);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 604, 1, 1, n18);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 484, 1, 1, n14);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 634, 1, 1, n19);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 514, 1, 1, n15);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 664, 1, 1, n20);
                        break;
                    case 9:
                        Thread.sleep(100);
                        h21.setVisible(true);
                        h22.setVisible(true);
                        Thread.sleep(100);
                        h23.setVisible(true);
                        h24.setVisible(true);
                        Thread.sleep(100);
                        h25.setVisible(true);
                        h26.setVisible(true);
                        Thread.sleep(100);
                        h27.setVisible(true);
                        h28.setVisible(true);
                        Thread.sleep(100);
                        h29.setVisible(true);
                        h30.setVisible(true);
                        Thread.sleep(100);
                        h31.setVisible(true);
                        h32.setVisible(true);
                        Thread.sleep(100);
                        h33.setVisible(true);
                        h34.setVisible(true);
                        Thread.sleep(100);
                        h35.setVisible(true);
                        h36.setVisible(true);
                        Thread.sleep(100);
                        h37.setVisible(true);
                        h38.setVisible(true);
                        
                        Thread.sleep(100);
                        v12.setVisible(true);
                        v13.setVisible(true);
                        Thread.sleep(100);
                        v14.setVisible(true);
                        v15.setVisible(true);
                        Thread.sleep(100);
                        v16.setVisible(true);
                        v17.setVisible(true);
                        Thread.sleep(100);
                        v18.setVisible(true);
                        v19.setVisible(true);
                        Thread.sleep(100);
                        v20.setVisible(true);
                        v21.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n11);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 544, 1, 1, n16);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 424, 1, 1, n12);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 574, 1, 1, n17);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 454, 1, 1, n13);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 604, 1, 1, n18);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 484, 1, 1, n14);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 634, 1, 1, n19);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 514, 1, 1, n15);
                        
                        break;
                    case 8:
                        Thread.sleep(100);
                        h21.setVisible(true);
                        h22.setVisible(true);
                        Thread.sleep(100);
                        h23.setVisible(true);
                        h24.setVisible(true);
                        Thread.sleep(100);
                        h25.setVisible(true);
                        h26.setVisible(true);
                        Thread.sleep(100);
                        h27.setVisible(true);
                        h28.setVisible(true);
                        Thread.sleep(100);
                        h29.setVisible(true);
                        h30.setVisible(true);
                        Thread.sleep(100);
                        h31.setVisible(true);
                        h32.setVisible(true);
                        Thread.sleep(100);
                        h33.setVisible(true);
                        h34.setVisible(true);
                        Thread.sleep(100);
                        h35.setVisible(true);
                        h36.setVisible(true);
                        
                        Thread.sleep(100);
                        v12.setVisible(true);
                        v13.setVisible(true);
                        Thread.sleep(100);
                        v14.setVisible(true);
                        v15.setVisible(true);
                        Thread.sleep(100);
                        v16.setVisible(true);
                        v17.setVisible(true);
                        Thread.sleep(100);
                        v18.setVisible(true);
                        v19.setVisible(true);
                        Thread.sleep(100);
                        v20.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n11);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 544, 1, 1, n16);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 424, 1, 1, n12);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 574, 1, 1, n17);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 454, 1, 1, n13);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 604, 1, 1, n18);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 484, 1, 1, n14);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 514, 1, 1, n15);
                        
                        break;
                    case 7:
                        Thread.sleep(100);
                        h21.setVisible(true);
                        h22.setVisible(true);
                        Thread.sleep(100);
                        h23.setVisible(true);
                        h24.setVisible(true);
                        Thread.sleep(100);
                        h25.setVisible(true);
                        h26.setVisible(true);
                        Thread.sleep(100);
                        h27.setVisible(true);
                        h28.setVisible(true);
                        Thread.sleep(100);
                        h29.setVisible(true);
                        h30.setVisible(true);
                        Thread.sleep(100);
                        h31.setVisible(true);
                        h32.setVisible(true);
                        Thread.sleep(100);
                        h33.setVisible(true);
                        h34.setVisible(true);
                       
                        Thread.sleep(100);
                        v12.setVisible(true);
                        v13.setVisible(true);
                        Thread.sleep(100);
                        v14.setVisible(true);
                        v15.setVisible(true);
                        Thread.sleep(100);
                        v16.setVisible(true);
                        v17.setVisible(true);
                        Thread.sleep(100);
                        v18.setVisible(true);
                        v19.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n11);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 544, 1, 1, n16);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 424, 1, 1, n12);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 574, 1, 1, n17);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 454, 1, 1, n13);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 484, 1, 1, n14);
                        Thread.sleep(100);
                       
                        ac.jLabelXRight(-25, 514, 1, 1, n15);
                        
                        break;
                    case 6:
                        Thread.sleep(100);
                        h21.setVisible(true);
                        h22.setVisible(true);
                        Thread.sleep(100);
                        h23.setVisible(true);
                        h24.setVisible(true);
                        Thread.sleep(100);
                        h25.setVisible(true);
                        h26.setVisible(true);
                        Thread.sleep(100);
                        h27.setVisible(true);
                        h28.setVisible(true);
                        Thread.sleep(100);
                        h29.setVisible(true);
                        h30.setVisible(true);
                        Thread.sleep(100);
                        h31.setVisible(true);
                        h32.setVisible(true);
                        
                        Thread.sleep(100);
                        v12.setVisible(true);
                        v13.setVisible(true);
                        Thread.sleep(100);
                        v14.setVisible(true);
                        v15.setVisible(true);
                        Thread.sleep(100);
                        v16.setVisible(true);
                        v17.setVisible(true);
                        Thread.sleep(100);
                        v18.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n11);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 544, 1, 1, n16);
                        Thread.sleep(100);
                        ac.jLabelXRight(-25, 424, 1, 1, n12);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 454, 1, 1, n13);
                        Thread.sleep(100);
                       
                        ac.jLabelXRight(-25, 484, 1, 1, n14);
                        Thread.sleep(100);
                       
                        ac.jLabelXRight(-25, 514, 1, 1, n15);
                        
                        break;
                    case 5:
                        Thread.sleep(100);
                        h21.setVisible(true);
                        h22.setVisible(true);
                        Thread.sleep(100);
                        h23.setVisible(true);
                        h24.setVisible(true);
                        Thread.sleep(100);
                        h25.setVisible(true);
                        h26.setVisible(true);
                        Thread.sleep(100);
                        h27.setVisible(true);
                        h28.setVisible(true);
                        Thread.sleep(100);
                        h29.setVisible(true);
                        h30.setVisible(true);
                        
                        Thread.sleep(100);
                        v12.setVisible(true);
                        v13.setVisible(true);
                        Thread.sleep(100);
                        v14.setVisible(true);
                        v15.setVisible(true);
                        Thread.sleep(100);
                        v16.setVisible(true);
                        v17.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n11);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 424, 1, 1, n12);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 454, 1, 1, n13);
                        Thread.sleep(100);
                       
                        ac.jLabelXRight(-25, 484, 1, 1, n14);
                        Thread.sleep(100);
                       
                        ac.jLabelXRight(-25, 514, 1, 1, n15);
                        break;
                    case 4:
                        Thread.sleep(100);
                        h21.setVisible(true);
                        h22.setVisible(true);
                        Thread.sleep(100);
                        h23.setVisible(true);
                        h24.setVisible(true);
                        Thread.sleep(100);
                        h25.setVisible(true);
                        h26.setVisible(true);
                        Thread.sleep(100);
                        h27.setVisible(true);
                        h28.setVisible(true);
                       
                        Thread.sleep(100);
                        v12.setVisible(true);
                        v13.setVisible(true);
                        Thread.sleep(100);
                        v14.setVisible(true);
                        v15.setVisible(true);
                        Thread.sleep(100);
                        v16.setVisible(true);
                       ac.jLabelXRight(-25, 394, 1, 1, n11);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 424, 1, 1, n12);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 454, 1, 1, n13);
                        Thread.sleep(100);
                       
                        ac.jLabelXRight(-25, 484, 1, 1, n14);
                        Thread.sleep(100);
                       
                        
                        break;
                    case 3:
                        Thread.sleep(100);
                        h21.setVisible(true);
                        h22.setVisible(true);
                        Thread.sleep(100);
                        h23.setVisible(true);
                        h24.setVisible(true);
                        Thread.sleep(100);
                        h25.setVisible(true);
                        h26.setVisible(true);
                        Thread.sleep(100);
                        v12.setVisible(true);
                        v13.setVisible(true);
                        Thread.sleep(100);
                        v14.setVisible(true);
                        v15.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n11);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 424, 1, 1, n12);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 454, 1, 1, n13);
                        Thread.sleep(100);
                       
                        break;       
                    case 2:
                        Thread.sleep(100);
                        h21.setVisible(true);
                        h22.setVisible(true);
                        Thread.sleep(100);
                        h23.setVisible(true);
                        h24.setVisible(true);
                        Thread.sleep(100);
                        v12.setVisible(true);
                        v13.setVisible(true);
                        Thread.sleep(100);
                        v14.setVisible(true);
                        ac.jLabelXRight(-25, 394, 1, 1, n11);
                        Thread.sleep(100);
                        
                        ac.jLabelXRight(-25, 424, 1, 1, n12);
                        Thread.sleep(100);
                        
                        break;      
                }
        }
        catch(InterruptedException e){}
    }
    public void Thread6()
    {
        numload2();
        try
        {
            switch(n)
                {
                    case 10:
                        h41.setVisible(true);
                        h42.setVisible(true);
                        h43.setVisible(true);
                        Thread.sleep(100);
                        h44.setVisible(true);
                        h45.setVisible(true);
                        h46.setVisible(true);
                        Thread.sleep(100);
                        h47.setVisible(true);
                        h48.setVisible(true);
                        h49.setVisible(true);
                        Thread.sleep(100);
                        h50.setVisible(true);
                        h51.setVisible(true);
                        h52.setVisible(true);
                        Thread.sleep(100);                        
                        h53.setVisible(true);
                        h54.setVisible(true);
                        h55.setVisible(true);
                        Thread.sleep(100);
                        h56.setVisible(true);
                        h57.setVisible(true);
                        h58.setVisible(true);
                        Thread.sleep(100);               
                        h59.setVisible(true);
                        h60.setVisible(true);
                        v23.setVisible(true);
                        Thread.sleep(100);
                        v24.setVisible(true);
                        v25.setVisible(true);
                        v26.setVisible(true);
                        Thread.sleep(100);
                        v27.setVisible(true);
                        v28.setVisible(true);
                        v29.setVisible(true);
                        Thread.sleep(100);
                        v30.setVisible(true);
                        v31.setVisible(true);
                        v32.setVisible(true);
                        Thread.sleep(100);
                        v33.setVisible(true);
                        ac.jLabelXLeft(1000, 655, 1, 1, n91);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 685, 1, 1, n92);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 715, 1, 1, n93);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 745, 1, 1, n94);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 775, 1, 1, n95);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 805, 1, 1, n96);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 835, 1, 1, n97);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 865, 1, 1, n98);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 895, 1, 1, n99);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 925, 1, 1, n100);
                        Thread.sleep(100);
                        va1.setVisible(true);
                        va2.setVisible(true);
                        Thread.sleep(100);
                        va3.setVisible(true);
                        va4.setVisible(true);
                        Thread.sleep(100);
                        va5.setVisible(true);
                        va6.setVisible(true);
                        Thread.sleep(100);
                        va7.setVisible(true);
                        va8.setVisible(true);
                        Thread.sleep(100);
                        va9.setVisible(true);
                        va10.setVisible(true);
                        Thread.sleep(100);
                        va11.setVisible(true);
                        va12.setVisible(true);
                        Thread.sleep(100);
                        va13.setVisible(true);
                        va14.setVisible(true);
                        Thread.sleep(100);
                        va15.setVisible(true);
                        va16.setVisible(true);
                        Thread.sleep(100);
                        va17.setVisible(true);
                        va18.setVisible(true);
                        Thread.sleep(100);
                        va19.setVisible(true);
                        va20.setVisible(true);
                        Thread.sleep(100);
                        ha1.setVisible(true);
                        ha2.setVisible(true);
                        Thread.sleep(100);
                        ha3.setVisible(true);
                        ha4.setVisible(true);
                        Thread.sleep(100);
                        ha5.setVisible(true);
                        ha6.setVisible(true);
                        Thread.sleep(100);
                        ha7.setVisible(true);
                        ha8.setVisible(true);
                        Thread.sleep(100);
                        ha9.setVisible(true);
                        ha10.setVisible(true);
                        Thread.sleep(100);
                        ha11.setVisible(true);
                        ha12.setVisible(true);
                        break;
                    case 9:
                        h41.setVisible(true);
                        Thread.sleep(100);
                        h42.setVisible(true);
                        h43.setVisible(true);
                        Thread.sleep(100);
                        h44.setVisible(true);
                        h45.setVisible(true);
                        Thread.sleep(100);
                        h46.setVisible(true);
                        h47.setVisible(true);
                        Thread.sleep(100);
                        h48.setVisible(true);
                        h49.setVisible(true);
                        Thread.sleep(100);
                        h50.setVisible(true);
                        h51.setVisible(true);
                        Thread.sleep(100);
                        h52.setVisible(true);
                        h53.setVisible(true);
                        Thread.sleep(100);
                        h54.setVisible(true);
                        h55.setVisible(true);
                        Thread.sleep(100);
                        h56.setVisible(true);
                        h57.setVisible(true);
                        Thread.sleep(100);
                        h58.setVisible(true);
                        Thread.sleep(100);
                        v23.setVisible(true);
                        v24.setVisible(true);
                        Thread.sleep(100);
                        v25.setVisible(true);
                        v26.setVisible(true);
                        Thread.sleep(100);
                        v27.setVisible(true);
                        v28.setVisible(true);
                        Thread.sleep(100);
                        v29.setVisible(true);
                        v30.setVisible(true);
                        Thread.sleep(100);
                        v31.setVisible(true);
                        v32.setVisible(true);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 655, 1, 1, n91);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 685, 1, 1, n92);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 715, 1, 1, n93);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 745, 1, 1, n94);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 775, 1, 1, n95);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 805, 1, 1, n96);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 835, 1, 1, n97);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 865, 1, 1, n98);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 895, 1, 1, n99);
                        Thread.sleep(100);
                        va1.setVisible(true);
                        va2.setVisible(true);
                        Thread.sleep(100);
                        va3.setVisible(true);
                        va4.setVisible(true);
                        Thread.sleep(100);
                        va5.setVisible(true);
                        va6.setVisible(true);
                        Thread.sleep(100);
                        va7.setVisible(true);
                        va8.setVisible(true);
                        Thread.sleep(100);
                        va9.setVisible(true);
                        va10.setVisible(true);
                        Thread.sleep(100);
                        va11.setVisible(true);
                        va12.setVisible(true);
                        Thread.sleep(100);
                        va13.setVisible(true);
                        va14.setVisible(true);
                        Thread.sleep(100);
                        va15.setVisible(true);
                        va16.setVisible(true);
                        Thread.sleep(100);
                        va17.setVisible(true);
                        va18.setVisible(true);
                        Thread.sleep(100);
                        va19.setVisible(true);
                        va20.setVisible(true);
                        Thread.sleep(100);
                        ha1.setVisible(true);
                        ha2.setVisible(true);
                        Thread.sleep(100);
                        ha3.setVisible(true);
                        ha4.setVisible(true);
                        Thread.sleep(100);
                        ha5.setVisible(true);
                        ha6.setVisible(true);
                        Thread.sleep(100);
                        ha7.setVisible(true);
                        ha8.setVisible(true);
                        Thread.sleep(100);
                        ha9.setVisible(true);
                        ha10.setVisible(true);
                        Thread.sleep(100);
                        ha11.setVisible(true);
                        ha12.setVisible(true);
                        break;
                    case 8:
                        h41.setVisible(true);
                        Thread.sleep(100);
                        h42.setVisible(true);
                        h43.setVisible(true);
                        Thread.sleep(100);
                        h44.setVisible(true);
                        h45.setVisible(true);
                        Thread.sleep(100);
                        h46.setVisible(true);
                        h47.setVisible(true);
                        Thread.sleep(100);
                        h48.setVisible(true);
                        h49.setVisible(true);
                        Thread.sleep(100);
                        h50.setVisible(true);
                        h51.setVisible(true);
                        Thread.sleep(100);
                        h52.setVisible(true);
                        h53.setVisible(true);
                        Thread.sleep(100);
                        h54.setVisible(true);
                        h55.setVisible(true);
                        Thread.sleep(100);
                        h56.setVisible(true);
                        Thread.sleep(100);
                        v23.setVisible(true);
                        v24.setVisible(true);
                        Thread.sleep(100);
                        v25.setVisible(true);
                        v26.setVisible(true);
                        Thread.sleep(100);
                        v27.setVisible(true);
                        v28.setVisible(true);
                        Thread.sleep(100);
                        v29.setVisible(true);
                        v30.setVisible(true);
                        Thread.sleep(100);
                        v31.setVisible(true);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 655, 1, 1, n91);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 685, 1, 1, n92);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 715, 1, 1, n93);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 745, 1, 1, n94);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 775, 1, 1, n95);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 805, 1, 1, n96);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 835, 1, 1, n97);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 865, 1, 1, n98);
                        Thread.sleep(100);
                        va1.setVisible(true);
                        va2.setVisible(true);
                        Thread.sleep(100);
                        va3.setVisible(true);
                        va4.setVisible(true);
                        Thread.sleep(100);
                        va5.setVisible(true);
                        va6.setVisible(true);
                        Thread.sleep(100);
                        va7.setVisible(true);
                        va8.setVisible(true);
                        Thread.sleep(100);
                        va9.setVisible(true);
                        va10.setVisible(true);
                        Thread.sleep(100);
                        va11.setVisible(true);
                        va12.setVisible(true);
                        Thread.sleep(100);
                        va13.setVisible(true);
                        va14.setVisible(true);
                        Thread.sleep(100);
                        va15.setVisible(true);
                        va16.setVisible(true);
                        Thread.sleep(100);
                        va17.setVisible(true);
                        va18.setVisible(true);
                        Thread.sleep(100);
                        va19.setVisible(true);
                        va20.setVisible(true);
                        Thread.sleep(100);
                        ha1.setVisible(true);
                        ha2.setVisible(true);
                        Thread.sleep(100);
                        ha3.setVisible(true);
                        ha4.setVisible(true);
                        Thread.sleep(100);
                        ha5.setVisible(true);
                        ha6.setVisible(true);
                        Thread.sleep(100);
                        ha7.setVisible(true);
                        ha8.setVisible(true);
                        Thread.sleep(100);
                        ha9.setVisible(true);
                        ha10.setVisible(true);
                        Thread.sleep(100);
                        ha11.setVisible(true);
                        ha12.setVisible(true);
                        break;
                    case 7:
                        h41.setVisible(true);
                        Thread.sleep(100);
                        h42.setVisible(true);
                        h43.setVisible(true);
                        Thread.sleep(100);
                        h44.setVisible(true);
                        h45.setVisible(true);
                        Thread.sleep(100);
                        h46.setVisible(true);
                        h47.setVisible(true);
                        Thread.sleep(100);
                        h48.setVisible(true);
                        h49.setVisible(true);
                        Thread.sleep(100);
                        h50.setVisible(true);
                        h51.setVisible(true);
                        Thread.sleep(100);
                        h52.setVisible(true);
                        h53.setVisible(true);
                        Thread.sleep(100);
                        h54.setVisible(true);
                        Thread.sleep(100);
                        v23.setVisible(true);
                        v24.setVisible(true);
                        Thread.sleep(100);
                        v25.setVisible(true);
                        v26.setVisible(true);
                        Thread.sleep(100);
                        v27.setVisible(true);
                        v28.setVisible(true);
                        Thread.sleep(100);
                        v29.setVisible(true);
                        v30.setVisible(true);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 655, 1, 1, n91);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 685, 1, 1, n92);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 715, 1, 1, n93);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 745, 1, 1, n94);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 775, 1, 1, n95);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 805, 1, 1, n96);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 835, 1, 1, n97);
                        Thread.sleep(100);
                        va1.setVisible(true);
                        va2.setVisible(true);
                        Thread.sleep(100);
                        va3.setVisible(true);
                        va4.setVisible(true);
                        Thread.sleep(100);
                        va5.setVisible(true);
                        va6.setVisible(true);
                        Thread.sleep(100);
                        va7.setVisible(true);
                        va8.setVisible(true);
                        Thread.sleep(100);
                        va9.setVisible(true);
                        va10.setVisible(true);
                        Thread.sleep(100);
                        va11.setVisible(true);
                        va12.setVisible(true);
                        Thread.sleep(100);
                        va13.setVisible(true);
                        va14.setVisible(true);
                        Thread.sleep(100);
                        va15.setVisible(true);
                        va16.setVisible(true);
                        Thread.sleep(100);
                        va17.setVisible(true);
                        va18.setVisible(true);
                        Thread.sleep(100);
                        va19.setVisible(true);
                        va20.setVisible(true);
                        Thread.sleep(100);
                        ha1.setVisible(true);
                        ha2.setVisible(true);
                        Thread.sleep(100);
                        ha3.setVisible(true);
                        ha4.setVisible(true);
                        Thread.sleep(100);
                        ha5.setVisible(true);
                        ha6.setVisible(true);
                        Thread.sleep(100);
                        ha7.setVisible(true);
                        ha8.setVisible(true);
                        Thread.sleep(100);
                        ha9.setVisible(true);
                        ha10.setVisible(true);
                        Thread.sleep(100);
                        ha11.setVisible(true);
                        ha12.setVisible(true);
                        break;
                    case 6:
                        h41.setVisible(true);
                        Thread.sleep(100);
                        h42.setVisible(true);
                        h43.setVisible(true);
                        Thread.sleep(100);
                        h44.setVisible(true);
                        h45.setVisible(true);
                        Thread.sleep(100);
                        h46.setVisible(true);
                        h47.setVisible(true);
                        Thread.sleep(100);
                        h48.setVisible(true);
                        h49.setVisible(true);
                        Thread.sleep(100);
                        h50.setVisible(true);
                        h51.setVisible(true);
                        Thread.sleep(100);
                        h52.setVisible(true);
                        Thread.sleep(100);
                        v23.setVisible(true);
                        v24.setVisible(true);
                        Thread.sleep(100);
                        v25.setVisible(true);
                        v26.setVisible(true);
                        Thread.sleep(100);
                        v27.setVisible(true);
                        v28.setVisible(true);
                        Thread.sleep(100);
                        v29.setVisible(true);
                        ac.jLabelXLeft(1000, 655, 1, 1, n91);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 685, 1, 1, n92);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 715, 1, 1, n93);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 745, 1, 1, n94);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 775, 1, 1, n95);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 805, 1, 1, n96);
                        Thread.sleep(100);
                        va1.setVisible(true);
                        va2.setVisible(true);
                        Thread.sleep(100);
                        va3.setVisible(true);
                        va4.setVisible(true);
                        Thread.sleep(100);
                        va5.setVisible(true);
                        va6.setVisible(true);
                        Thread.sleep(100);
                        va7.setVisible(true);
                        va8.setVisible(true);
                        Thread.sleep(100);
                        va9.setVisible(true);
                        va10.setVisible(true);
                        Thread.sleep(100);
                        va11.setVisible(true);
                        va12.setVisible(true);
                        Thread.sleep(100);
                        va13.setVisible(true);
                        va14.setVisible(true);
                        Thread.sleep(100);
                        va15.setVisible(true);
                        va16.setVisible(true);
                        Thread.sleep(100);
                        va17.setVisible(true);
                        va18.setVisible(true);
                        Thread.sleep(100);
                        va19.setVisible(true);
                        va20.setVisible(true);
                        Thread.sleep(100);
                        ha1.setVisible(true);
                        ha2.setVisible(true);
                        Thread.sleep(100);
                        ha3.setVisible(true);
                        ha4.setVisible(true);
                        Thread.sleep(100);
                        ha5.setVisible(true);
                        ha6.setVisible(true);
                        Thread.sleep(100);
                        ha7.setVisible(true);
                        ha8.setVisible(true);
                        Thread.sleep(100);
                        ha9.setVisible(true);
                        ha10.setVisible(true);
                        Thread.sleep(100);
                        ha11.setVisible(true);
                        ha12.setVisible(true);
                        break;
                    case 5:
                        h41.setVisible(true);
                        Thread.sleep(100);
                        h42.setVisible(true);
                        h43.setVisible(true);
                        Thread.sleep(100);
                        h44.setVisible(true);
                        h45.setVisible(true);
                        Thread.sleep(100);
                        h46.setVisible(true);
                        h47.setVisible(true);
                        Thread.sleep(100);
                        h48.setVisible(true);
                        h49.setVisible(true);
                        Thread.sleep(100);
                        h50.setVisible(true);
                        Thread.sleep(100);
                        v23.setVisible(true);
                        v24.setVisible(true);
                        Thread.sleep(100);
                        v25.setVisible(true);
                        v26.setVisible(true);
                        Thread.sleep(100);
                        v27.setVisible(true);
                        v28.setVisible(true);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 655, 1, 1, n91);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 685, 1, 1, n92);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 715, 1, 1, n93);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 745, 1, 1, n94);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 775, 1, 1, n95);
                        Thread.sleep(100);
                        va1.setVisible(true);
                        va2.setVisible(true);
                        Thread.sleep(100);
                        va3.setVisible(true);
                        va4.setVisible(true);
                        Thread.sleep(100);
                        va5.setVisible(true);
                        va6.setVisible(true);
                        Thread.sleep(100);
                        va7.setVisible(true);
                        va8.setVisible(true);
                        Thread.sleep(100);
                        va9.setVisible(true);
                        va10.setVisible(true);
                        Thread.sleep(100);
                        va11.setVisible(true);
                        va12.setVisible(true);
                        Thread.sleep(100);
                        va13.setVisible(true);
                        va14.setVisible(true);
                        Thread.sleep(100);
                        va15.setVisible(true);
                        va16.setVisible(true);
                        Thread.sleep(100);
                        va17.setVisible(true);
                        va18.setVisible(true);
                        Thread.sleep(100);
                        va19.setVisible(true);
                        va20.setVisible(true);
                        Thread.sleep(100);
                        ha1.setVisible(true);
                        ha2.setVisible(true);
                        Thread.sleep(100);
                        ha3.setVisible(true);
                        ha4.setVisible(true);
                        Thread.sleep(100);
                        ha5.setVisible(true);
                        ha6.setVisible(true);
                        Thread.sleep(100);
                        ha7.setVisible(true);
                        ha8.setVisible(true);
                        Thread.sleep(100);
                        ha9.setVisible(true);
                        ha10.setVisible(true);
                        Thread.sleep(100);
                        ha11.setVisible(true);
                        ha12.setVisible(true);
                        break;
                    case 4:
                        h41.setVisible(true);
                        Thread.sleep(100);
                        h42.setVisible(true);
                        h43.setVisible(true);
                        Thread.sleep(100);
                        h44.setVisible(true);
                        h45.setVisible(true);
                        Thread.sleep(100);
                        h46.setVisible(true);
                        h47.setVisible(true);
                        Thread.sleep(100);
                        h48.setVisible(true);
                        Thread.sleep(100);
                        v23.setVisible(true);
                        v24.setVisible(true);
                        Thread.sleep(100);
                        v25.setVisible(true);
                        v26.setVisible(true);
                        Thread.sleep(100);
                        v27.setVisible(true);
                        Thread.sleep(100);
                        va1.setVisible(true);
                        va2.setVisible(true);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 655, 1, 1, n91);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 685, 1, 1, n92);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 715, 1, 1, n93);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 745, 1, 1, n94);
                        Thread.sleep(100);
                        va3.setVisible(true);
                        va4.setVisible(true);
                        Thread.sleep(100);
                        va5.setVisible(true);
                        va6.setVisible(true);
                        Thread.sleep(100);
                        va7.setVisible(true);
                        va8.setVisible(true);
                        Thread.sleep(100);
                        va9.setVisible(true);
                        va10.setVisible(true);
                        Thread.sleep(100);
                        va11.setVisible(true);
                        va12.setVisible(true);
                        Thread.sleep(100);
                        va13.setVisible(true);
                        va14.setVisible(true);
                        Thread.sleep(100);
                        va15.setVisible(true);
                        va16.setVisible(true);
                        Thread.sleep(100);
                        va17.setVisible(true);
                        va18.setVisible(true);
                        Thread.sleep(100);
                        va19.setVisible(true);
                        va20.setVisible(true);
                        Thread.sleep(100);
                        ha1.setVisible(true);
                        ha2.setVisible(true);
                        Thread.sleep(100);
                        ha3.setVisible(true);
                        ha4.setVisible(true);
                        Thread.sleep(100);
                        ha5.setVisible(true);
                        ha6.setVisible(true);
                        Thread.sleep(100);
                        ha7.setVisible(true);
                        ha8.setVisible(true);
                        Thread.sleep(100);
                        ha9.setVisible(true);
                        ha10.setVisible(true);
                        Thread.sleep(100);
                        ha11.setVisible(true);
                        ha12.setVisible(true);
                        break;
                    case 3:
                        h41.setVisible(true);
                        Thread.sleep(100);
                        h42.setVisible(true);
                        h43.setVisible(true);
                        Thread.sleep(100);
                        h44.setVisible(true);
                        h45.setVisible(true);
                        Thread.sleep(100);
                        h46.setVisible(true);
                        Thread.sleep(100);
                        v23.setVisible(true);
                        v24.setVisible(true);
                        Thread.sleep(100);
                        v25.setVisible(true);
                        v26.setVisible(true);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 655, 1, 1, n91);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 685, 1, 1, n92);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 715, 1, 1, n93);
                        Thread.sleep(100);
                        va1.setVisible(true);
                        va2.setVisible(true);
                        Thread.sleep(100);
                        va3.setVisible(true);
                        va4.setVisible(true);
                        Thread.sleep(100);
                        va5.setVisible(true);
                        va6.setVisible(true);
                        Thread.sleep(100);
                        va7.setVisible(true);
                        va8.setVisible(true);
                        Thread.sleep(100);
                        va9.setVisible(true);
                        va10.setVisible(true);
                        Thread.sleep(100);
                        va11.setVisible(true);
                        va12.setVisible(true);
                        Thread.sleep(100);
                        va13.setVisible(true);
                        va14.setVisible(true);
                        Thread.sleep(100);
                        va15.setVisible(true);
                        va16.setVisible(true);
                        Thread.sleep(100);
                        va17.setVisible(true);
                        va18.setVisible(true);
                        Thread.sleep(100);
                        va19.setVisible(true);
                        va20.setVisible(true);
                        Thread.sleep(100);
                        ha1.setVisible(true);
                        ha2.setVisible(true);
                        Thread.sleep(100);
                        ha3.setVisible(true);
                        ha4.setVisible(true);
                        Thread.sleep(100);
                        ha5.setVisible(true);
                        ha6.setVisible(true);
                        Thread.sleep(100);
                        ha7.setVisible(true);
                        ha8.setVisible(true);
                        Thread.sleep(100);
                        ha9.setVisible(true);
                        ha10.setVisible(true);
                        Thread.sleep(100);
                        ha11.setVisible(true);
                        ha12.setVisible(true);
                        break;       
                    case 2:
                        h41.setVisible(true);
                        Thread.sleep(100);
                        h42.setVisible(true);
                        h43.setVisible(true);
                        Thread.sleep(100);
                        h44.setVisible(true);
                        Thread.sleep(100);
                        v23.setVisible(true);
                        v24.setVisible(true);
                        Thread.sleep(100);
                        v25.setVisible(true);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 655, 1, 1, n91);
                        Thread.sleep(100);
                        ac.jLabelXLeft(1000, 685, 1, 1, n92);
                        Thread.sleep(100);
                        va1.setVisible(true);
                        va2.setVisible(true);
                        Thread.sleep(100);
                        va3.setVisible(true);
                        va4.setVisible(true);
                        Thread.sleep(100);
                        va5.setVisible(true);
                        va6.setVisible(true);
                        Thread.sleep(100);
                        va7.setVisible(true);
                        va8.setVisible(true);
                        Thread.sleep(100);
                        va9.setVisible(true);
                        va10.setVisible(true);
                        Thread.sleep(100);
                        va11.setVisible(true);
                        va12.setVisible(true);
                        Thread.sleep(100);
                        va13.setVisible(true);
                        va14.setVisible(true);
                        Thread.sleep(100);
                        va15.setVisible(true);
                        va16.setVisible(true);
                        Thread.sleep(100);
                        va17.setVisible(true);
                        va18.setVisible(true);
                        Thread.sleep(100);
                        va19.setVisible(true);
                        va20.setVisible(true);
                        Thread.sleep(100);
                        ha1.setVisible(true);
                        ha2.setVisible(true);
                        Thread.sleep(100);
                        ha3.setVisible(true);
                        ha4.setVisible(true);
                        Thread.sleep(100);
                        ha5.setVisible(true);
                        ha6.setVisible(true);
                        Thread.sleep(100);
                        ha7.setVisible(true);
                        ha8.setVisible(true);
                        Thread.sleep(100);
                        ha9.setVisible(true);
                        ha10.setVisible(true);
                        Thread.sleep(100);
                        ha11.setVisible(true);
                        ha12.setVisible(true);
                        break;      
                }
        }
        catch(InterruptedException e){}
    
    }
    public void Thread7()
    {
        try{
            start=a5.getX();
            ta2.setText(null);
            msg="Hash Solution:    In    this    solution."
                    + "    for    each    x."
              + "    in    the    given    array    we    lookup    for."
                    + "    t    minus    x    in    the    array    using    Hash    Table.";
            speak();
            voice.join();
            Thread.sleep(5000);
            time.start();
            hashimp();
            int j;
            tno2.setText(String.valueOf(sum));
            sn7.setText(String.valueOf(sum));

            for(i=0;i<n;i++)
            {
                a5.setBounds(a5.getX()+30, 340, 30, 30);
                xno2.setText(String.valueOf(a[i]));
                sn8.setText(String.valueOf(a[i]));


                if((sum-a[i])>0&&lookup1(sum-a[i]))
                {
                    j=(sum-a[i])%10;
                    hashtab2[j].add(sum-a[i]);
                    if(!lookup2(a[i]))
                    {
                        System.out.println("("+a[i]+","+(sum-a[i])+")");
                        ta2.append(" ("+String.valueOf(a[i])+","+String.valueOf(sum-a[i]+")\n"));
                    }

                }
                else
                {
                    ii=new ImageIcon(getClass().getResource("/customs/cross.png"));
                    decide2.setIcon(ii);
                    decide2.setVisible(true);
                }Thread.sleep(1000);
            }
                a5.setBounds(620, 340, 30, 30);
                nxt4.setVisible(true);
                nxttxt4.setVisible(true);
                ac.jLabelYUp(660, 640, 20, 2, nxt4);
                ac.jLabelYUp(658, 638, 20, 2, nxttxt4);
        }
        catch(InterruptedException e){}
        time.setLocationRelativeTo(null);
        time.stop();
        time.display(7);
    }
    public void Thread8()
    {
        try{
        msg="Now Please give the daettaaa accordingly";
        speak();
        Thread.sleep(2500);
        msg="How many numbers:";
        flowtxt(msg,txtLabel2);
        jComboBox1.setVisible(true);
        Thread.sleep(1000);
        msg="What are they ?";
        flowtxt(msg,txtLabel3);
        ac.jTextAreaXLeft(1000, 610, 1, 1, jScrollPane1);
        Thread.sleep(500);
        msg="Give the target sum:";
        flowtxt(msg,txtLabel1);
        ac.jTextFieldXLeft(1000, 610, 1, 1, jTextField1);
        
        }
        catch(InterruptedException e)
        {}
    }
    @Override
    public void run()
    {
        try
        {
            if(threadi==0)
            {
                Thread0();
            }
            else if(threadi==1)
            {
                Thread1();
            }
            else if(threadi==2)
            {
                Thread2();
            }
            else if(threadi==3)
            {
                Thread3();
            }
            else if(threadi==4)
            {
                Thread4();
            }
            else if(threadi==5)
            {
                Thread5();
            }
            else if(threadi==6)
            {
                Thread6();
            }
            else if(threadi==7)
            {
                Thread7();
            }
            else if(threadi==8)
            {
                Thread8();
            }
        } 
        catch(Exception e){}
    }
    public void flowtxt(String msg,javax.swing.JLabel l1)
    {
        String k="";
        try
        {
            for(int i=0;i<msg.length();i++)
            {
                k+=String.valueOf(msg.charAt(i));
                l1.setText(k);
                Thread.sleep(60+i/2);
            }
        }
        catch(InterruptedException e){}
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
    public void naivesoln()
    {
        threadi=3;
        soln1=new Thread(this);
        soln1.start();
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
    public Boolean binsearch(int m,int i)
    {
        try{
         int low=0,mid;
         int high=n;
         sn4.setText(String.valueOf(sum));
         while(low<=high)
         {  
            mid=(low+high)/2;
            switch(mid)
            {
                case 0:
                    a4.setVisible(true);
                    a4.setBounds(n11.getX()+2, 310, 30, 30);
                    xno1.setText(String.valueOf(a[i]));
                    yno1.setText(String.valueOf(a[mid]));
                    
                    sn5.setText(String.valueOf(a[i]));
                    sn6.setText(String.valueOf(a[mid]));
                    break;
                case 1:
                    a4.setVisible(true);
                    a4.setBounds(n12.getX()+2, 310, 30, 30);
                    xno1.setText(String.valueOf(a[i]));
                    yno1.setText(String.valueOf(a[mid]));
                    
                    sn5.setText(String.valueOf(a[i]));
                    sn6.setText(String.valueOf(a[mid]));
                    break;
                case 2:
                    a4.setVisible(true);
                    a4.setBounds(n13.getX()+2, 310, 30, 30);
                    xno1.setText(String.valueOf(a[i]));
                    yno1.setText(String.valueOf(a[mid]));
                    
                    sn5.setText(String.valueOf(a[i]));
                    sn6.setText(String.valueOf(a[mid]));
                    break;
                case 3:
                    a4.setVisible(true);
                    a4.setBounds(n14.getX()+2, 310, 30, 30);
                    xno1.setText(String.valueOf(a[i]));
                    yno1.setText(String.valueOf(a[mid]));
                    
                    sn5.setText(String.valueOf(a[i]));
                    sn6.setText(String.valueOf(a[mid]));
                    break;
                case 4:
                    a4.setVisible(true);
                    a4.setBounds(n15.getX()+2, 310, 30, 30);
                    xno1.setText(String.valueOf(a[i]));
                    yno1.setText(String.valueOf(a[mid]));
                   
                    sn5.setText(String.valueOf(a[i]));
                    sn6.setText(String.valueOf(a[mid]));
                    break;
                case 5:
                    a4.setVisible(true);
                    a4.setBounds(n16.getX()+2, 310, 30, 30);
                    xno1.setText(String.valueOf(a[i]));
                    yno1.setText(String.valueOf(a[mid]));
                    
                    sn5.setText(String.valueOf(a[i]));
                    sn6.setText(String.valueOf(a[mid]));
                    break;
                case 6:
                    a4.setVisible(true);
                    a4.setBounds(n17.getX()+2, 310, 30, 30);
                    xno1.setText(String.valueOf(a[i]));
                    yno1.setText(String.valueOf(a[mid]));
                    
                    sn5.setText(String.valueOf(a[i]));
                    sn6.setText(String.valueOf(a[mid]));
                    break;
                case 7:
                    a4.setVisible(true);
                    a4.setBounds(n18.getX()+2, 310, 30, 30);
                    xno1.setText(String.valueOf(a[i]));
                    yno1.setText(String.valueOf(a[mid]));
                    
                    sn5.setText(String.valueOf(a[i]));
                    sn6.setText(String.valueOf(a[mid]));
                    break;
                case 8:
                    a4.setVisible(true);
                    a4.setBounds(n19.getX()+2, 310, 30, 30);
                    xno1.setText(String.valueOf(a[i]));
                    yno1.setText(String.valueOf(a[mid]));
                    
                    sn5.setText(String.valueOf(a[i]));
                    sn6.setText(String.valueOf(a[mid]));
                    break;
                case 9:
                    a4.setVisible(true);
                    a4.setBounds(n20.getX()+2, 310, 30, 30);
                    xno1.setText(String.valueOf(a[i]));
                    yno1.setText(String.valueOf(a[mid]));
                    
                    sn5.setText(String.valueOf(a[i]));
                    sn6.setText(String.valueOf(a[mid]));
                    break;
            }
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
         Thread.sleep(1);
        }
        catch(InterruptedException e)
        {
            
        }
     return false;    
    }
    public void sortsoln()
    {
        threadi=4;
        soln2=new Thread(this);
        soln2.start();
    }
    public void sortsolnswitch(int mid)
    {
        switch(mid)
        {
            case 0:
                a4.setVisible(true);
                a4.setBounds(n11.getX()+2, 310, 30, 30);
                yno1.setText(String.valueOf(r[mid]));
                sn6.setText(String.valueOf(r[mid]));
                
                break;
            case 1:
                a4.setVisible(true);
                a4.setBounds(n12.getX()+2, 310, 30, 30);
                yno1.setText(String.valueOf(r[mid]));
                sn6.setText(String.valueOf(r[mid]));
                
                break;
            case 2:
                a4.setVisible(true);
                a4.setBounds(n13.getX()+2, 310, 30, 30);
                yno1.setText(String.valueOf(r[mid]));
                sn6.setText(String.valueOf(r[mid]));
                
                break;
            case 3:
                a4.setVisible(true);
                a4.setBounds(n14.getX()+2, 310, 30, 30);
                yno1.setText(String.valueOf(r[mid]));
                sn6.setText(String.valueOf(r[mid]));
                
                break;
            case 4:
                a4.setVisible(true);
                a4.setBounds(n15.getX()+2, 310, 30, 30);
                yno1.setText(String.valueOf(r[mid]));
                sn6.setText(String.valueOf(r[mid]));
                
                break;
            case 5:
                a4.setVisible(true);
                a4.setBounds(n16.getX()+2, 310, 30, 30);
                yno1.setText(String.valueOf(r[mid]));
                sn6.setText(String.valueOf(r[mid]));
                
                break;
            case 6:
                a4.setVisible(true);
                a4.setBounds(n17.getX()+2, 310, 30, 30);
                yno1.setText(String.valueOf(r[mid]));
                sn6.setText(String.valueOf(r[mid]));
                
                break;
            case 7:
                a4.setVisible(true);
                a4.setBounds(n18.getX()+2, 310, 30, 30);
                yno1.setText(String.valueOf(r[mid]));
                sn6.setText(String.valueOf(r[mid]));
                
                break;
            case 8:
                a4.setVisible(true);
                a4.setBounds(n19.getX()+2, 310, 30, 30);
                yno1.setText(String.valueOf(r[mid]));
                sn6.setText(String.valueOf(r[mid]));
                
                break;
            case 9:
                a4.setVisible(true);
                a4.setBounds(n20.getX()+2, 310, 30, 30);            
                yno1.setText(String.valueOf(r[mid]));
                sn6.setText(String.valueOf(r[mid]));
                
                break;
        }
        if(sum-r[i]==r[mid]&&sum-r[i]>0)
        {
                ii=new ImageIcon(getClass().getResource("/customs/tick.png"));
                decide1.setIcon(ii);
                decide1.setVisible(true);
        }
    }
    public void hashsoln()
    {
        threadi=7;
        soln3=new Thread(this);
        soln3.start();
    }
    public Boolean lookup1(int m)
    {
        int k=m%10;
        switch(k)
        {
            case 0:
                a8.setBounds(225, n21.getY()-5, 30, 30);
                break;
            case 1:
                a8.setBounds(225, n22.getY()-5, 30, 30);
                break;
            case 2:
                a8.setBounds(225, n23.getY()-5, 30, 30);
                break;
            case 3:
                a8.setBounds(225, n24.getY()-5, 30, 30);
                break;
            case 4:
                a8.setBounds(225, n25.getY()-5, 30, 30);
                break;
            case 5:
                a8.setBounds(225, n26.getY()-5, 30, 30);
                break;
            case 6:
                a8.setBounds(225, n27.getY()-5, 30, 30);
                break;
            case 7:
                a8.setBounds(225, n28.getY()-5, 30, 30);
                break;
            case 8:
                a8.setBounds(225, n29.getY()-5, 30, 30);
                break;
            case 9:
                a8.setBounds(225, n30.getY()-5, 30, 30);
                break;
            
        }
        for( int j:hashtab1[k])
        {   
            yno2.setText(String.valueOf(j));
            sn9.setText(String.valueOf(j));
            if(m==j)
            {          
                ii=new ImageIcon(getClass().getResource("/customs/tick.png"));
                decide2.setIcon(ii);
                decide2.setVisible(true);
                return true;
            }
        }
        return false;
    }
    public void hashimp()
    {
        int j[]=new int[10];
        
        for(i=0;i<10;i++)
        {
           hashtab1[i]=new ArrayList();
           hashtab2[i]=new ArrayList();
           j[i]=0;
        }
        try{
            ac.jLabelYDown(-20, 250, 1, 1, n21);
            ac.jLabelYDown(-20, 290, 1, 1, n22);
            ac.jLabelYDown(-20, 330, 1, 1, n23);
            ac.jLabelYDown(-20, 370, 1, 1, n24);
            ac.jLabelYDown(-20, 410, 1, 1, n25);
            ac.jLabelYDown(-20, 450, 1, 1, n26);
            ac.jLabelYDown(-20, 490, 1, 1, n27);
            ac.jLabelYDown(-20, 530, 1, 1, n28);
            ac.jLabelYDown(-20, 570, 1, 1, n29);
            ac.jLabelYDown(-20, 610, 1, 1, n30);
            Thread.sleep(500);
        }
        catch(InterruptedException e){}
        for(i=0;i<n;i++)
        {
            int k=a[i]%10;
            j[k]++;
            hashtab1[k].add(a[i]);
            try
            {
                switch(j[k])
                {
                    case 1:
                        switch(k)
                        {
                            case 0: n21.setText(String.valueOf(a[i]));
                                break;
                            case 1: n22.setText(String.valueOf(a[i]));
                                break;
                            case 2: n23.setText(String.valueOf(a[i]));
                                break;
                            case 3: n24.setText(String.valueOf(a[i]));
                                break;
                            case 4: n25.setText(String.valueOf(a[i]));
                                break;
                            case 5: n26.setText(String.valueOf(a[i]));
                                break;
                            case 6: n27.setText(String.valueOf(a[i]));
                                break;
                            case 7: n28.setText(String.valueOf(a[i]));
                                break;
                            case 8: n29.setText(String.valueOf(a[i]));
                                break;
                            case 9: n30.setText(String.valueOf(a[i]));
                                break;

                        }
                        break;
                    case 2:
                        switch(k)
                        {
                            case 0:
                                at1.setVisible(true);
                                hb1.setVisible(true);
                                hb2.setVisible(true);
                                Thread.sleep(100);
                                vb1.setVisible(true);
                                vb2.setVisible(true);
                                n31.setText(String.valueOf(a[i]));
                                n31.setVisible(true);
                                break;
                            case 1:
                                at7.setVisible(true);
                                hb13.setVisible(true);
                                hb14.setVisible(true);
                                Thread.sleep(100);
                                vb13.setVisible(true);
                                vb14.setVisible(true);
                                n37.setText(String.valueOf(a[i]));
                                n37.setVisible(true);
                                break;
                            case 2:
                                at13.setVisible(true);
                                hb25.setVisible(true);
                                hb26.setVisible(true);
                                Thread.sleep(100);
                                vb25.setVisible(true);
                                vb26.setVisible(true);
                                n43.setText(String.valueOf(a[i]));
                                n43.setVisible(true);
                                break;
                            case 3:
                                at19.setVisible(true);
                                hb37.setVisible(true);
                                hb38.setVisible(true);
                                Thread.sleep(100);
                                vb37.setVisible(true);
                                vb38.setVisible(true);
                                n49.setText(String.valueOf(a[i]));
                                n49.setVisible(true);
                                break;
                            case 4:
                                at25.setVisible(true);
                                hb49.setVisible(true);
                                hb50.setVisible(true);
                                Thread.sleep(100);
                                vb49.setVisible(true);
                                vb50.setVisible(true);
                                n55.setText(String.valueOf(a[i]));
                                n55.setVisible(true);
                                break;
                            case 5:
                                at31.setVisible(true);
                                hb61.setVisible(true);
                                hb62.setVisible(true);
                                Thread.sleep(100);
                                vb61.setVisible(true);
                                vb62.setVisible(true);	
                                n61.setText(String.valueOf(a[i]));
                                break;
                            case 6:
                                at37.setVisible(true);
                                hb73.setVisible(true);
                                hb74.setVisible(true);
                                Thread.sleep(100);
                                vb73.setVisible(true);
                                vb74.setVisible(true);
                                n67.setText(String.valueOf(a[i]));
                                n67.setVisible(true);
                                break;
                            case 7:
                                at43.setVisible(true);
                                hb85.setVisible(true);
                                hb86.setVisible(true);
                                Thread.sleep(100);
                                vb85.setVisible(true);
                                vb86.setVisible(true);
                                n73.setText(String.valueOf(a[i]));
                                n73.setVisible(true);
                                break;
                            case 8:
                                at49.setVisible(true);
                                hb97.setVisible(true);
                                hb98.setVisible(true);
                                Thread.sleep(100);
                                vb97.setVisible(true);
                                vb98.setVisible(true);
                                n79.setText(String.valueOf(a[i]));
                                n79.setVisible(true);
                                break;
                            case 9:
                                at55.setVisible(true);
                                hb109.setVisible(true);
                                hb110.setVisible(true);
                                Thread.sleep(100);
                                vb109.setVisible(true);
                                vb110.setVisible(true);
                                n85.setText(String.valueOf(a[i]));
                                n85.setVisible(true);
                                break;

                        }
                        break;
                    case 3:
                        switch(k)
                        {
                            case 0:
                                at2.setVisible(true);
                                hb3.setVisible(true);
                                hb4.setVisible(true);
                                Thread.sleep(100);
                                vb3.setVisible(true);
                                vb4.setVisible(true);
                                n32.setText(String.valueOf(a[i]));
                                n32.setVisible(true);
                                break;
                            case 1:
                                at8.setVisible(true);
                                hb15.setVisible(true);
                                hb16.setVisible(true);
                                Thread.sleep(100);
                                vb15.setVisible(true);
                                vb16.setVisible(true);
                                n38.setText(String.valueOf(a[i]));
                                n38.setVisible(true);
                                break;
                            case 2:
                                at14.setVisible(true);
                                hb27.setVisible(true);
                                hb28.setVisible(true);
                                Thread.sleep(100);
                                vb27.setVisible(true);
                                vb28.setVisible(true);
                                n44.setText(String.valueOf(a[i]));
                                n44.setVisible(true);
                                break;
                            case 3:
                                at20.setVisible(true);
                                hb39.setVisible(true);
                                hb40.setVisible(true);
                                Thread.sleep(100);
                                vb39.setVisible(true);
                                vb40.setVisible(true);
                                n50.setText(String.valueOf(a[i]));
                                n50.setVisible(true);
                                break;
                            case 4:
                                at26.setVisible(true);
                                hb51.setVisible(true);
                                hb52.setVisible(true);
                                Thread.sleep(100);
                                vb51.setVisible(true);
                                vb52.setVisible(true);
                                n56.setText(String.valueOf(a[i]));
                                n56.setVisible(true);
                                break;
                            case 5:
                                at32.setVisible(true);
                                hb63.setVisible(true);
                                hb64.setVisible(true);
                                Thread.sleep(100);
                                vb63.setVisible(true);
                                vb64.setVisible(true);
                                n62.setText(String.valueOf(a[i]));
                                n62.setVisible(true);
                                break;
                            case 6:
                                at38.setVisible(true);
                                hb75.setVisible(true);
                                hb76.setVisible(true);
                                Thread.sleep(100);
                                vb75.setVisible(true);
                                vb76.setVisible(true);
                                n68.setText(String.valueOf(a[i]));
                                n68.setVisible(true);
                                break;
                            case 7:
                                at44.setVisible(true);
                                hb87.setVisible(true);
                                hb88.setVisible(true);
                                Thread.sleep(100);
                                vb87.setVisible(true);
                                vb88.setVisible(true);
                                n74.setText(String.valueOf(a[i]));
                                n74.setVisible(true);
                                break;
                            case 8:
                                at50.setVisible(true);
                                hb99.setVisible(true);
                                hb100.setVisible(true);
                                Thread.sleep(100);
                                vb99.setVisible(true);
                                vb100.setVisible(true);
                                n80.setText(String.valueOf(a[i]));
                                n80.setVisible(true);
                                break;
                            case 9:
                                at56.setVisible(true);
                                hb111.setVisible(true);
                                hb112.setVisible(true);
                                Thread.sleep(100);
                                vb111.setVisible(true);
                                vb112.setVisible(true);
                                n86.setText(String.valueOf(a[i]));
                                n86.setVisible(true);
                                break;

                        }
                        break;
                    case 4:
                        switch(k)
                        {
                            case 0:
                                at3.setVisible(true);
                                hb5.setVisible(true);
                                hb6.setVisible(true);
                                Thread.sleep(100);
                                vb5.setVisible(true);
                                vb6.setVisible(true);
                                n33.setText(String.valueOf(a[i]));
                                n33.setVisible(true);
                                break;
                            case 1:
                                at9.setVisible(true);
                                hb17.setVisible(true);
                                hb18.setVisible(true);
                                Thread.sleep(100);
                                vb17.setVisible(true);
                                vb18.setVisible(true);
                                n39.setText(String.valueOf(a[i]));
                                n39.setVisible(true);
                                break;
                            case 2:
                                at15.setVisible(true);
                                hb29.setVisible(true);
                                hb30.setVisible(true);
                                Thread.sleep(100);
                                vb29.setVisible(true);
                                vb30.setVisible(true);
                                n45.setText(String.valueOf(a[i]));
                                n45.setVisible(true);
                                break;
                            case 3:
                                at21.setVisible(true);
                                hb41.setVisible(true);
                                hb42.setVisible(true);
                                Thread.sleep(100);
                                vb41.setVisible(true);
                                vb42.setVisible(true);
                                n51.setText(String.valueOf(a[i]));
                                n45.setVisible(true);
                                break;
                            case 4:

                                at27.setVisible(true);
                                hb53.setVisible(true);
                                hb54.setVisible(true);
                                Thread.sleep(100);
                                vb53.setVisible(true);
                                vb54.setVisible(true);
                                n57.setText(String.valueOf(a[i]));
                                break;
                            case 5:
                                at33.setVisible(true);
                                hb65.setVisible(true);
                                hb66.setVisible(true);
                                Thread.sleep(100);
                                vb65.setVisible(true);
                                vb66.setVisible(true);
                                n63.setText(String.valueOf(a[i]));
                                n63.setVisible(true);
                                break;
                            case 6:
                                at39.setVisible(true);
                                hb77.setVisible(true);
                                hb78.setVisible(true);
                                Thread.sleep(100);
                                vb77.setVisible(true);
                                vb78.setVisible(true);
                                n69.setText(String.valueOf(a[i]));
                                n69.setVisible(true);
                                break;
                            case 7:
                                at44.setVisible(true);
                                hb89.setVisible(true);
                                hb90.setVisible(true);
                                Thread.sleep(100);
                                vb89.setVisible(true);
                                vb90.setVisible(true);
                                n75.setText(String.valueOf(a[i]));
                                n75.setVisible(true);
                                break;
                            case 8:
                                at51.setVisible(true);
                                hb101.setVisible(true);
                                hb102.setVisible(true);
                                Thread.sleep(100);
                                vb101.setVisible(true);
                                vb102.setVisible(true);
                                n81.setText(String.valueOf(a[i]));
                                n81.setVisible(true);
                                break;
                            case 9:
                                at57.setVisible(true);
                                hb113.setVisible(true);
                                hb114.setVisible(true);
                                Thread.sleep(100);
                                vb113.setVisible(true);
                                vb114.setVisible(true);
                                n87.setText(String.valueOf(a[i]));
                                n87.setVisible(true);
                                break;

                        }
                        break;
                    case 5:
                        switch(k)
                        {
                            case 0:
                                at4.setVisible(true);
                                hb7.setVisible(true);
                                hb8.setVisible(true);
                                Thread.sleep(100);
                                vb7.setVisible(true);
                                vb8.setVisible(true);
                                n34.setText(String.valueOf(a[i]));
                                n34.setVisible(true);
                                break;
                            case 1:
                                at10.setVisible(true);
                                hb19.setVisible(true);
                                hb20.setVisible(true);
                                Thread.sleep(100);
                                vb19.setVisible(true);
                                vb20.setVisible(true);
                                n40.setText(String.valueOf(a[i]));
                                n40.setVisible(true);
                                break;
                            case 2:
                                at16.setVisible(true);
                                hb31.setVisible(true);
                                hb32.setVisible(true);
                                Thread.sleep(100);
                                vb31.setVisible(true);
                                vb32.setVisible(true);
                                n46.setText(String.valueOf(a[i]));
                                n46.setVisible(true);
                                break;
                            case 3:
                                at22.setVisible(true);
                                hb43.setVisible(true);
                                hb44.setVisible(true);
                                Thread.sleep(100);
                                vb43.setVisible(true);
                                vb44.setVisible(true);
                                n52.setText(String.valueOf(a[i]));
                                n52.setVisible(true);
                                break;
                            case 4:
                                at28.setVisible(true);
                                hb55.setVisible(true);
                                hb56.setVisible(true);
                                Thread.sleep(100);
                                vb55.setVisible(true);
                                vb56.setVisible(true);
                                n58.setText(String.valueOf(a[i]));
                                n58.setVisible(true);
                                break;
                            case 5:
                                at34.setVisible(true);
                                hb67.setVisible(true);
                                hb68.setVisible(true);
                                Thread.sleep(100);
                                vb67.setVisible(true);
                                vb68.setVisible(true);
                                n64.setText(String.valueOf(a[i]));
                                n64.setVisible(true);
                                break;
                            case 6:
                                at40.setVisible(true);
                                hb79.setVisible(true);
                                hb80.setVisible(true);
                                Thread.sleep(100);
                                vb79.setVisible(true);
                                vb80.setVisible(true);
                                n70.setText(String.valueOf(a[i]));
                                n70.setVisible(true);
                                break;
                            case 7:
                                at46.setVisible(true);
                                hb91.setVisible(true);
                                hb92.setVisible(true);
                                Thread.sleep(100);
                                vb91.setVisible(true);
                                vb92.setVisible(true);
                                n76.setText(String.valueOf(a[i]));
                                n76.setVisible(true);
                                break;
                            case 8:
                                at52.setVisible(true);
                                hb103.setVisible(true);
                                hb104.setVisible(true);
                                Thread.sleep(100);
                                vb103.setVisible(true);
                                vb104.setVisible(true);
                                n82.setText(String.valueOf(a[i]));
                                n82.setVisible(true);
                                break;
                            case 9:
                                at58.setVisible(true);
                                hb115.setVisible(true);
                                hb116.setVisible(true);
                                Thread.sleep(100);
                                vb115.setVisible(true);
                                vb116.setVisible(true);
                                n88.setText(String.valueOf(a[i]));
                                n88.setVisible(true);
                                break;

                        }
                        break;
                    case 6:
                        switch(k)
                        {
                            case 0:
                                at5.setVisible(true);
                                hb9.setVisible(true);
                                hb10.setVisible(true);
                                Thread.sleep(100);
                                vb9.setVisible(true);
                                vb10.setVisible(true);
                                n35.setText(String.valueOf(a[i]));
                                n35.setVisible(true);
                                break;
                            case 1:
                                at11.setVisible(true);
                                hb21.setVisible(true);
                                hb22.setVisible(true);
                                Thread.sleep(100);
                                vb21.setVisible(true);
                                vb22.setVisible(true);
                                n41.setText(String.valueOf(a[i]));
                                n41.setVisible(true);
                                break;
                            case 2:
                                at17.setVisible(true);
                                hb33.setVisible(true);
                                hb34.setVisible(true);
                                Thread.sleep(100);
                                vb33.setVisible(true);
                                vb34.setVisible(true);
                                n47.setText(String.valueOf(a[i]));
                                n47.setVisible(true);
                                break;
                            case 3:
                                at23.setVisible(true);
                                hb45.setVisible(true);
                                hb46.setVisible(true);
                                Thread.sleep(100);
                                vb45.setVisible(true);
                                vb46.setVisible(true);
                                n53.setText(String.valueOf(a[i]));
                                n53.setVisible(true);
                                break;
                            case 4:

                                at29.setVisible(true);
                                hb57.setVisible(true);
                                hb58.setVisible(true);
                                Thread.sleep(100);
                                vb57.setVisible(true);
                                vb58.setVisible(true);
                                n59.setText(String.valueOf(a[i]));
                                n59.setVisible(true);
                                break;
                            case 5:
                                at35.setVisible(true);
                                hb69.setVisible(true);
                                hb70.setVisible(true);
                                Thread.sleep(100);
                                vb69.setVisible(true);
                                vb70.setVisible(true);
                                n65.setText(String.valueOf(a[i]));
                                n65.setVisible(true);
                                break;
                            case 6:
                                at41.setVisible(true);
                                hb81.setVisible(true);
                                hb82.setVisible(true);
                                Thread.sleep(100);
                                vb81.setVisible(true);
                                vb82.setVisible(true);
                                n71.setText(String.valueOf(a[i]));
                                n71.setVisible(true);
                                break;
                            case 7:
                                at47.setVisible(true);
                                hb93.setVisible(true);
                                hb94.setVisible(true);
                                Thread.sleep(100);
                                vb93.setVisible(true);
                                vb94.setVisible(true);
                                n77.setText(String.valueOf(a[i]));
                                n77.setVisible(true);
                                break;
                            case 8:
                                at53.setVisible(true);
                                hb105.setVisible(true);
                                hb106.setVisible(true);
                                Thread.sleep(100);
                                vb105.setVisible(true);
                                vb106.setVisible(true);
                                n83.setText(String.valueOf(a[i]));
                                n83.setVisible(true);
                                break;
                            case 9:
                                at59.setVisible(true);
                                hb117.setVisible(true);
                                hb118.setVisible(true);
                                Thread.sleep(100);
                                vb117.setVisible(true);
                                vb118.setVisible(true);
                                n89.setText(String.valueOf(a[i]));
                                n89.setVisible(true);
                                break;

                        }
                        break;
                    case 7:
                        switch(k)
                        {
                            case 0:
                                at6.setVisible(true);
                                hb11.setVisible(true);
                                hb12.setVisible(true);
                                Thread.sleep(100);
                                vb11.setVisible(true);
                                vb12.setVisible(true);
                                n36.setText(String.valueOf(a[i]));
                                n36.setVisible(true);
                                break;
                            case 1:
                                at12.setVisible(true);
                                hb23.setVisible(true);
                                hb24.setVisible(true);
                                Thread.sleep(100);
                                vb23.setVisible(true);
                                vb24.setVisible(true);
                                n42.setText(String.valueOf(a[i]));
                                n36.setVisible(true);
                                break;
                            case 2:
                                at18.setVisible(true);
                                hb35.setVisible(true);
                                hb36.setVisible(true);
                                Thread.sleep(100);
                                vb35.setVisible(true);
                                vb36.setVisible(true);
                                n48.setText(String.valueOf(a[i]));
                                n36.setVisible(true);
                                break;
                            case 3:
                                at24.setVisible(true);
                                hb47.setVisible(true);
                                hb48.setVisible(true);
                                Thread.sleep(100);
                                vb47.setVisible(true);
                                vb48.setVisible(true);
                                n54.setText(String.valueOf(a[i]));
                                n54.setVisible(true);
                                break;
                            case 4:
                                at30.setVisible(true);
                                hb59.setVisible(true);
                                hb60.setVisible(true);
                                Thread.sleep(100);
                                vb59.setVisible(true);
                                vb60.setVisible(true);
                                n60.setText(String.valueOf(a[i]));
                                n60.setVisible(true);
                                break;
                            case 5:
                                at36.setVisible(true);
                                hb71.setVisible(true);
                                hb72.setVisible(true);
                                Thread.sleep(100);
                                vb71.setVisible(true);
                                vb72.setVisible(true);
                                n66.setText(String.valueOf(a[i]));
                                n66.setVisible(true);
                                break;
                            case 6:
                                at42.setVisible(true);
                                hb83.setVisible(true);
                                hb84.setVisible(true);
                                Thread.sleep(100);
                                vb83.setVisible(true);
                                vb84.setVisible(true);
                                n72.setText(String.valueOf(a[i]));
                                n72.setVisible(true);
                                break;
                            case 7:
                                at48.setVisible(true);
                                hb95.setVisible(true);
                                hb96.setVisible(true);
                                Thread.sleep(100);
                                vb95.setVisible(true);
                                vb96.setVisible(true);
                                n78.setText(String.valueOf(a[i]));
                                n78.setVisible(true);
                                break;
                            case 8:
                                at54.setVisible(true);
                                hb107.setVisible(true);
                                hb108.setVisible(true);
                                Thread.sleep(100);
                                vb107.setVisible(true);
                                vb108.setVisible(true);
                                n84.setText(String.valueOf(a[i]));
                                n84.setVisible(true);
                                break;
                            case 9:
                                at60.setVisible(true);
                                hb119.setVisible(true);
                                hb120.setVisible(true);
                                Thread.sleep(100);
                                vb119.setVisible(true);
                                vb120.setVisible(true);
                                n90.setText(String.valueOf(a[i]));
                                n90.setVisible(true);
                                break;

                        }
                        break;	
                }
            }
            catch(InterruptedException e){}
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        MainBar = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        Prblmstmt1 = new javax.swing.JLabel();
        Prblmstmt2 = new javax.swing.JLabel();
        Prblmstmt3 = new javax.swing.JLabel();
        nxttxt = new javax.swing.JLabel();
        nxt = new javax.swing.JLabel();
        Frame = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        Close1 = new javax.swing.JLabel();
        Minimize1 = new javax.swing.JLabel();
        MainBar1 = new javax.swing.JLabel();
        help2pg = new javax.swing.JLabel();
        Heading1 = new javax.swing.JLabel();
        txtLabel1 = new javax.swing.JLabel();
        txtLabel2 = new javax.swing.JLabel();
        txtLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtnum = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        nxttxt1 = new javax.swing.JLabel();
        nxt1 = new javax.swing.JLabel();
        help2 = new javax.swing.JLabel();
        Frame1 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        Close2 = new javax.swing.JLabel();
        Minimize2 = new javax.swing.JLabel();
        MainBar2 = new javax.swing.JLabel();
        help2pg1 = new javax.swing.JLabel();
        help3 = new javax.swing.JLabel();
        SubHeading = new javax.swing.JLabel();
        Heading2 = new javax.swing.JLabel();
        play = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n5 = new javax.swing.JLabel();
        n6 = new javax.swing.JLabel();
        n7 = new javax.swing.JLabel();
        n8 = new javax.swing.JLabel();
        n9 = new javax.swing.JLabel();
        n10 = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        v3 = new javax.swing.JLabel();
        v4 = new javax.swing.JLabel();
        v5 = new javax.swing.JLabel();
        v6 = new javax.swing.JLabel();
        v7 = new javax.swing.JLabel();
        v8 = new javax.swing.JLabel();
        v9 = new javax.swing.JLabel();
        v10 = new javax.swing.JLabel();
        v11 = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        h3 = new javax.swing.JLabel();
        h4 = new javax.swing.JLabel();
        h5 = new javax.swing.JLabel();
        h6 = new javax.swing.JLabel();
        h7 = new javax.swing.JLabel();
        h8 = new javax.swing.JLabel();
        h9 = new javax.swing.JLabel();
        h10 = new javax.swing.JLabel();
        h11 = new javax.swing.JLabel();
        h12 = new javax.swing.JLabel();
        h13 = new javax.swing.JLabel();
        h14 = new javax.swing.JLabel();
        h15 = new javax.swing.JLabel();
        h16 = new javax.swing.JLabel();
        h17 = new javax.swing.JLabel();
        h18 = new javax.swing.JLabel();
        h19 = new javax.swing.JLabel();
        h20 = new javax.swing.JLabel();
        decide = new javax.swing.JLabel();
        sn1 = new javax.swing.JLabel();
        sn2 = new javax.swing.JLabel();
        sn3 = new javax.swing.JLabel();
        op1 = new javax.swing.JLabel();
        op2 = new javax.swing.JLabel();
        nxttxt2 = new javax.swing.JLabel();
        nxt2 = new javax.swing.JLabel();
        Y = new javax.swing.JLabel();
        T = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        yno = new javax.swing.JLabel();
        tno = new javax.swing.JLabel();
        xno = new javax.swing.JLabel();
        T2 = new javax.swing.JLabel();
        Y2 = new javax.swing.JLabel();
        X2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        reslabel = new javax.swing.JLabel();
        resbox = new javax.swing.JLabel();
        Frame2 = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        Close3 = new javax.swing.JLabel();
        Minimize3 = new javax.swing.JLabel();
        MainBar3 = new javax.swing.JLabel();
        help2pg2 = new javax.swing.JLabel();
        help4 = new javax.swing.JLabel();
        SubHeading1 = new javax.swing.JLabel();
        Heading3 = new javax.swing.JLabel();
        play1 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        n11 = new javax.swing.JLabel();
        n12 = new javax.swing.JLabel();
        n13 = new javax.swing.JLabel();
        n14 = new javax.swing.JLabel();
        n15 = new javax.swing.JLabel();
        n16 = new javax.swing.JLabel();
        n17 = new javax.swing.JLabel();
        n18 = new javax.swing.JLabel();
        n19 = new javax.swing.JLabel();
        n20 = new javax.swing.JLabel();
        v12 = new javax.swing.JLabel();
        v13 = new javax.swing.JLabel();
        v14 = new javax.swing.JLabel();
        v15 = new javax.swing.JLabel();
        v16 = new javax.swing.JLabel();
        v17 = new javax.swing.JLabel();
        v18 = new javax.swing.JLabel();
        v19 = new javax.swing.JLabel();
        v20 = new javax.swing.JLabel();
        v21 = new javax.swing.JLabel();
        v22 = new javax.swing.JLabel();
        h21 = new javax.swing.JLabel();
        h22 = new javax.swing.JLabel();
        h23 = new javax.swing.JLabel();
        h24 = new javax.swing.JLabel();
        h25 = new javax.swing.JLabel();
        h26 = new javax.swing.JLabel();
        h27 = new javax.swing.JLabel();
        h28 = new javax.swing.JLabel();
        h29 = new javax.swing.JLabel();
        h30 = new javax.swing.JLabel();
        h31 = new javax.swing.JLabel();
        h32 = new javax.swing.JLabel();
        h33 = new javax.swing.JLabel();
        h34 = new javax.swing.JLabel();
        h35 = new javax.swing.JLabel();
        h36 = new javax.swing.JLabel();
        h37 = new javax.swing.JLabel();
        h38 = new javax.swing.JLabel();
        h39 = new javax.swing.JLabel();
        h40 = new javax.swing.JLabel();
        decide1 = new javax.swing.JLabel();
        sn4 = new javax.swing.JLabel();
        sn5 = new javax.swing.JLabel();
        sn6 = new javax.swing.JLabel();
        op3 = new javax.swing.JLabel();
        op4 = new javax.swing.JLabel();
        nxttxt3 = new javax.swing.JLabel();
        nxt3 = new javax.swing.JLabel();
        Y1 = new javax.swing.JLabel();
        T1 = new javax.swing.JLabel();
        X1 = new javax.swing.JLabel();
        Y3 = new javax.swing.JLabel();
        X3 = new javax.swing.JLabel();
        T3 = new javax.swing.JLabel();
        yno1 = new javax.swing.JLabel();
        tno1 = new javax.swing.JLabel();
        xno1 = new javax.swing.JLabel();
        resbox1 = new javax.swing.JLabel();
        reslabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        Frame3 = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        Close4 = new javax.swing.JLabel();
        Minimize4 = new javax.swing.JLabel();
        MainBar4 = new javax.swing.JLabel();
        help2pg3 = new javax.swing.JLabel();
        help5 = new javax.swing.JLabel();
        SubHeading2 = new javax.swing.JLabel();
        Heading4 = new javax.swing.JLabel();
        play2 = new javax.swing.JLabel();
        n21 = new javax.swing.JLabel();
        n22 = new javax.swing.JLabel();
        n23 = new javax.swing.JLabel();
        n24 = new javax.swing.JLabel();
        n25 = new javax.swing.JLabel();
        n26 = new javax.swing.JLabel();
        n27 = new javax.swing.JLabel();
        n28 = new javax.swing.JLabel();
        n29 = new javax.swing.JLabel();
        n30 = new javax.swing.JLabel();
        n31 = new javax.swing.JLabel();
        n32 = new javax.swing.JLabel();
        n33 = new javax.swing.JLabel();
        n34 = new javax.swing.JLabel();
        n35 = new javax.swing.JLabel();
        n36 = new javax.swing.JLabel();
        at1 = new javax.swing.JLabel();
        at2 = new javax.swing.JLabel();
        at3 = new javax.swing.JLabel();
        at4 = new javax.swing.JLabel();
        at5 = new javax.swing.JLabel();
        at6 = new javax.swing.JLabel();
        at7 = new javax.swing.JLabel();
        at8 = new javax.swing.JLabel();
        at9 = new javax.swing.JLabel();
        at10 = new javax.swing.JLabel();
        at11 = new javax.swing.JLabel();
        at12 = new javax.swing.JLabel();
        at13 = new javax.swing.JLabel();
        at14 = new javax.swing.JLabel();
        at15 = new javax.swing.JLabel();
        at16 = new javax.swing.JLabel();
        at17 = new javax.swing.JLabel();
        at18 = new javax.swing.JLabel();
        at19 = new javax.swing.JLabel();
        at20 = new javax.swing.JLabel();
        at21 = new javax.swing.JLabel();
        at22 = new javax.swing.JLabel();
        at23 = new javax.swing.JLabel();
        at24 = new javax.swing.JLabel();
        at25 = new javax.swing.JLabel();
        at26 = new javax.swing.JLabel();
        at27 = new javax.swing.JLabel();
        at28 = new javax.swing.JLabel();
        at29 = new javax.swing.JLabel();
        at30 = new javax.swing.JLabel();
        at31 = new javax.swing.JLabel();
        at32 = new javax.swing.JLabel();
        at33 = new javax.swing.JLabel();
        at34 = new javax.swing.JLabel();
        at35 = new javax.swing.JLabel();
        at36 = new javax.swing.JLabel();
        at37 = new javax.swing.JLabel();
        at38 = new javax.swing.JLabel();
        at39 = new javax.swing.JLabel();
        at40 = new javax.swing.JLabel();
        at41 = new javax.swing.JLabel();
        at42 = new javax.swing.JLabel();
        at43 = new javax.swing.JLabel();
        at44 = new javax.swing.JLabel();
        at45 = new javax.swing.JLabel();
        at46 = new javax.swing.JLabel();
        at47 = new javax.swing.JLabel();
        at48 = new javax.swing.JLabel();
        at49 = new javax.swing.JLabel();
        at50 = new javax.swing.JLabel();
        at51 = new javax.swing.JLabel();
        at52 = new javax.swing.JLabel();
        at53 = new javax.swing.JLabel();
        at54 = new javax.swing.JLabel();
        at55 = new javax.swing.JLabel();
        at56 = new javax.swing.JLabel();
        at57 = new javax.swing.JLabel();
        at58 = new javax.swing.JLabel();
        at59 = new javax.swing.JLabel();
        at60 = new javax.swing.JLabel();
        va1 = new javax.swing.JLabel();
        va2 = new javax.swing.JLabel();
        va3 = new javax.swing.JLabel();
        va4 = new javax.swing.JLabel();
        va5 = new javax.swing.JLabel();
        va6 = new javax.swing.JLabel();
        va7 = new javax.swing.JLabel();
        va8 = new javax.swing.JLabel();
        va9 = new javax.swing.JLabel();
        va10 = new javax.swing.JLabel();
        ha1 = new javax.swing.JLabel();
        ha2 = new javax.swing.JLabel();
        ha3 = new javax.swing.JLabel();
        ha4 = new javax.swing.JLabel();
        ha5 = new javax.swing.JLabel();
        ha6 = new javax.swing.JLabel();
        va11 = new javax.swing.JLabel();
        va12 = new javax.swing.JLabel();
        va13 = new javax.swing.JLabel();
        va14 = new javax.swing.JLabel();
        va15 = new javax.swing.JLabel();
        va16 = new javax.swing.JLabel();
        va17 = new javax.swing.JLabel();
        va18 = new javax.swing.JLabel();
        va19 = new javax.swing.JLabel();
        va20 = new javax.swing.JLabel();
        ha7 = new javax.swing.JLabel();
        ha8 = new javax.swing.JLabel();
        ha9 = new javax.swing.JLabel();
        ha10 = new javax.swing.JLabel();
        ha11 = new javax.swing.JLabel();
        ha12 = new javax.swing.JLabel();
        vb1 = new javax.swing.JLabel();
        vb2 = new javax.swing.JLabel();
        hb1 = new javax.swing.JLabel();
        hb2 = new javax.swing.JLabel();
        hb3 = new javax.swing.JLabel();
        vb3 = new javax.swing.JLabel();
        vb4 = new javax.swing.JLabel();
        hb4 = new javax.swing.JLabel();
        hb5 = new javax.swing.JLabel();
        vb5 = new javax.swing.JLabel();
        vb6 = new javax.swing.JLabel();
        hb6 = new javax.swing.JLabel();
        vb7 = new javax.swing.JLabel();
        vb8 = new javax.swing.JLabel();
        hb7 = new javax.swing.JLabel();
        hb8 = new javax.swing.JLabel();
        hb9 = new javax.swing.JLabel();
        vb9 = new javax.swing.JLabel();
        vb10 = new javax.swing.JLabel();
        hb10 = new javax.swing.JLabel();
        hb11 = new javax.swing.JLabel();
        vb11 = new javax.swing.JLabel();
        vb12 = new javax.swing.JLabel();
        hb12 = new javax.swing.JLabel();
        vb13 = new javax.swing.JLabel();
        vb14 = new javax.swing.JLabel();
        hb13 = new javax.swing.JLabel();
        hb14 = new javax.swing.JLabel();
        hb15 = new javax.swing.JLabel();
        vb15 = new javax.swing.JLabel();
        vb16 = new javax.swing.JLabel();
        hb16 = new javax.swing.JLabel();
        hb17 = new javax.swing.JLabel();
        vb17 = new javax.swing.JLabel();
        vb18 = new javax.swing.JLabel();
        hb18 = new javax.swing.JLabel();
        vb19 = new javax.swing.JLabel();
        vb20 = new javax.swing.JLabel();
        hb19 = new javax.swing.JLabel();
        hb20 = new javax.swing.JLabel();
        hb21 = new javax.swing.JLabel();
        vb21 = new javax.swing.JLabel();
        vb22 = new javax.swing.JLabel();
        hb22 = new javax.swing.JLabel();
        hb23 = new javax.swing.JLabel();
        vb23 = new javax.swing.JLabel();
        vb24 = new javax.swing.JLabel();
        hb24 = new javax.swing.JLabel();
        vb25 = new javax.swing.JLabel();
        vb26 = new javax.swing.JLabel();
        hb25 = new javax.swing.JLabel();
        hb26 = new javax.swing.JLabel();
        hb27 = new javax.swing.JLabel();
        vb27 = new javax.swing.JLabel();
        vb28 = new javax.swing.JLabel();
        hb28 = new javax.swing.JLabel();
        hb29 = new javax.swing.JLabel();
        vb29 = new javax.swing.JLabel();
        vb30 = new javax.swing.JLabel();
        hb30 = new javax.swing.JLabel();
        vb31 = new javax.swing.JLabel();
        vb32 = new javax.swing.JLabel();
        hb31 = new javax.swing.JLabel();
        hb32 = new javax.swing.JLabel();
        hb33 = new javax.swing.JLabel();
        vb33 = new javax.swing.JLabel();
        vb34 = new javax.swing.JLabel();
        hb34 = new javax.swing.JLabel();
        hb35 = new javax.swing.JLabel();
        vb35 = new javax.swing.JLabel();
        vb36 = new javax.swing.JLabel();
        hb36 = new javax.swing.JLabel();
        vb37 = new javax.swing.JLabel();
        vb38 = new javax.swing.JLabel();
        hb37 = new javax.swing.JLabel();
        hb38 = new javax.swing.JLabel();
        hb39 = new javax.swing.JLabel();
        vb39 = new javax.swing.JLabel();
        vb40 = new javax.swing.JLabel();
        hb40 = new javax.swing.JLabel();
        hb41 = new javax.swing.JLabel();
        vb41 = new javax.swing.JLabel();
        vb42 = new javax.swing.JLabel();
        hb42 = new javax.swing.JLabel();
        vb43 = new javax.swing.JLabel();
        vb44 = new javax.swing.JLabel();
        hb43 = new javax.swing.JLabel();
        hb44 = new javax.swing.JLabel();
        hb45 = new javax.swing.JLabel();
        vb45 = new javax.swing.JLabel();
        vb46 = new javax.swing.JLabel();
        hb46 = new javax.swing.JLabel();
        hb47 = new javax.swing.JLabel();
        vb47 = new javax.swing.JLabel();
        vb48 = new javax.swing.JLabel();
        hb48 = new javax.swing.JLabel();
        vb49 = new javax.swing.JLabel();
        vb50 = new javax.swing.JLabel();
        hb49 = new javax.swing.JLabel();
        hb50 = new javax.swing.JLabel();
        hb51 = new javax.swing.JLabel();
        vb51 = new javax.swing.JLabel();
        vb52 = new javax.swing.JLabel();
        hb52 = new javax.swing.JLabel();
        hb53 = new javax.swing.JLabel();
        vb53 = new javax.swing.JLabel();
        vb54 = new javax.swing.JLabel();
        hb54 = new javax.swing.JLabel();
        vb55 = new javax.swing.JLabel();
        vb56 = new javax.swing.JLabel();
        hb55 = new javax.swing.JLabel();
        hb56 = new javax.swing.JLabel();
        hb57 = new javax.swing.JLabel();
        vb57 = new javax.swing.JLabel();
        vb58 = new javax.swing.JLabel();
        hb58 = new javax.swing.JLabel();
        hb59 = new javax.swing.JLabel();
        vb59 = new javax.swing.JLabel();
        vb60 = new javax.swing.JLabel();
        hb60 = new javax.swing.JLabel();
        vb61 = new javax.swing.JLabel();
        vb62 = new javax.swing.JLabel();
        hb61 = new javax.swing.JLabel();
        hb62 = new javax.swing.JLabel();
        hb63 = new javax.swing.JLabel();
        vb63 = new javax.swing.JLabel();
        vb64 = new javax.swing.JLabel();
        hb64 = new javax.swing.JLabel();
        hb65 = new javax.swing.JLabel();
        vb65 = new javax.swing.JLabel();
        vb66 = new javax.swing.JLabel();
        hb66 = new javax.swing.JLabel();
        vb67 = new javax.swing.JLabel();
        vb68 = new javax.swing.JLabel();
        hb67 = new javax.swing.JLabel();
        hb68 = new javax.swing.JLabel();
        hb69 = new javax.swing.JLabel();
        vb69 = new javax.swing.JLabel();
        vb70 = new javax.swing.JLabel();
        hb70 = new javax.swing.JLabel();
        hb71 = new javax.swing.JLabel();
        vb71 = new javax.swing.JLabel();
        vb72 = new javax.swing.JLabel();
        hb72 = new javax.swing.JLabel();
        vb73 = new javax.swing.JLabel();
        vb74 = new javax.swing.JLabel();
        hb73 = new javax.swing.JLabel();
        hb74 = new javax.swing.JLabel();
        hb75 = new javax.swing.JLabel();
        vb75 = new javax.swing.JLabel();
        vb76 = new javax.swing.JLabel();
        hb76 = new javax.swing.JLabel();
        hb77 = new javax.swing.JLabel();
        vb77 = new javax.swing.JLabel();
        vb78 = new javax.swing.JLabel();
        hb78 = new javax.swing.JLabel();
        vb79 = new javax.swing.JLabel();
        vb80 = new javax.swing.JLabel();
        hb79 = new javax.swing.JLabel();
        hb80 = new javax.swing.JLabel();
        hb81 = new javax.swing.JLabel();
        vb81 = new javax.swing.JLabel();
        vb82 = new javax.swing.JLabel();
        hb82 = new javax.swing.JLabel();
        hb83 = new javax.swing.JLabel();
        vb83 = new javax.swing.JLabel();
        vb84 = new javax.swing.JLabel();
        hb84 = new javax.swing.JLabel();
        vb85 = new javax.swing.JLabel();
        vb86 = new javax.swing.JLabel();
        hb85 = new javax.swing.JLabel();
        hb86 = new javax.swing.JLabel();
        hb87 = new javax.swing.JLabel();
        vb87 = new javax.swing.JLabel();
        vb88 = new javax.swing.JLabel();
        hb88 = new javax.swing.JLabel();
        hb89 = new javax.swing.JLabel();
        vb89 = new javax.swing.JLabel();
        vb90 = new javax.swing.JLabel();
        hb90 = new javax.swing.JLabel();
        vb91 = new javax.swing.JLabel();
        vb92 = new javax.swing.JLabel();
        hb91 = new javax.swing.JLabel();
        hb92 = new javax.swing.JLabel();
        hb93 = new javax.swing.JLabel();
        vb93 = new javax.swing.JLabel();
        vb94 = new javax.swing.JLabel();
        hb94 = new javax.swing.JLabel();
        hb95 = new javax.swing.JLabel();
        vb95 = new javax.swing.JLabel();
        vb96 = new javax.swing.JLabel();
        hb96 = new javax.swing.JLabel();
        vb97 = new javax.swing.JLabel();
        vb98 = new javax.swing.JLabel();
        hb97 = new javax.swing.JLabel();
        hb98 = new javax.swing.JLabel();
        hb99 = new javax.swing.JLabel();
        vb99 = new javax.swing.JLabel();
        vb100 = new javax.swing.JLabel();
        hb100 = new javax.swing.JLabel();
        hb101 = new javax.swing.JLabel();
        vb101 = new javax.swing.JLabel();
        vb102 = new javax.swing.JLabel();
        hb102 = new javax.swing.JLabel();
        vb103 = new javax.swing.JLabel();
        vb104 = new javax.swing.JLabel();
        hb103 = new javax.swing.JLabel();
        hb104 = new javax.swing.JLabel();
        hb105 = new javax.swing.JLabel();
        vb105 = new javax.swing.JLabel();
        vb106 = new javax.swing.JLabel();
        hb106 = new javax.swing.JLabel();
        hb107 = new javax.swing.JLabel();
        vb107 = new javax.swing.JLabel();
        vb108 = new javax.swing.JLabel();
        hb108 = new javax.swing.JLabel();
        vb109 = new javax.swing.JLabel();
        vb110 = new javax.swing.JLabel();
        hb109 = new javax.swing.JLabel();
        hb110 = new javax.swing.JLabel();
        hb111 = new javax.swing.JLabel();
        vb111 = new javax.swing.JLabel();
        vb112 = new javax.swing.JLabel();
        hb112 = new javax.swing.JLabel();
        hb113 = new javax.swing.JLabel();
        vb113 = new javax.swing.JLabel();
        vb114 = new javax.swing.JLabel();
        hb114 = new javax.swing.JLabel();
        vb115 = new javax.swing.JLabel();
        vb116 = new javax.swing.JLabel();
        hb115 = new javax.swing.JLabel();
        hb116 = new javax.swing.JLabel();
        hb117 = new javax.swing.JLabel();
        vb117 = new javax.swing.JLabel();
        vb118 = new javax.swing.JLabel();
        hb118 = new javax.swing.JLabel();
        hb119 = new javax.swing.JLabel();
        vb119 = new javax.swing.JLabel();
        vb120 = new javax.swing.JLabel();
        hb120 = new javax.swing.JLabel();
        Y4 = new javax.swing.JLabel();
        T4 = new javax.swing.JLabel();
        X4 = new javax.swing.JLabel();
        yno2 = new javax.swing.JLabel();
        tno2 = new javax.swing.JLabel();
        xno2 = new javax.swing.JLabel();
        sn7 = new javax.swing.JLabel();
        sn8 = new javax.swing.JLabel();
        sn9 = new javax.swing.JLabel();
        op5 = new javax.swing.JLabel();
        op6 = new javax.swing.JLabel();
        Y5 = new javax.swing.JLabel();
        X5 = new javax.swing.JLabel();
        T5 = new javax.swing.JLabel();
        n37 = new javax.swing.JLabel();
        n38 = new javax.swing.JLabel();
        n39 = new javax.swing.JLabel();
        n40 = new javax.swing.JLabel();
        n41 = new javax.swing.JLabel();
        n42 = new javax.swing.JLabel();
        n43 = new javax.swing.JLabel();
        n44 = new javax.swing.JLabel();
        n45 = new javax.swing.JLabel();
        n46 = new javax.swing.JLabel();
        n47 = new javax.swing.JLabel();
        n48 = new javax.swing.JLabel();
        n49 = new javax.swing.JLabel();
        n50 = new javax.swing.JLabel();
        n51 = new javax.swing.JLabel();
        n52 = new javax.swing.JLabel();
        n53 = new javax.swing.JLabel();
        n54 = new javax.swing.JLabel();
        n55 = new javax.swing.JLabel();
        n56 = new javax.swing.JLabel();
        n57 = new javax.swing.JLabel();
        n58 = new javax.swing.JLabel();
        n59 = new javax.swing.JLabel();
        n60 = new javax.swing.JLabel();
        n61 = new javax.swing.JLabel();
        n62 = new javax.swing.JLabel();
        n63 = new javax.swing.JLabel();
        n64 = new javax.swing.JLabel();
        n65 = new javax.swing.JLabel();
        n66 = new javax.swing.JLabel();
        n67 = new javax.swing.JLabel();
        n68 = new javax.swing.JLabel();
        n69 = new javax.swing.JLabel();
        n70 = new javax.swing.JLabel();
        n71 = new javax.swing.JLabel();
        n72 = new javax.swing.JLabel();
        n73 = new javax.swing.JLabel();
        n74 = new javax.swing.JLabel();
        n75 = new javax.swing.JLabel();
        n76 = new javax.swing.JLabel();
        n77 = new javax.swing.JLabel();
        n78 = new javax.swing.JLabel();
        n79 = new javax.swing.JLabel();
        n80 = new javax.swing.JLabel();
        n81 = new javax.swing.JLabel();
        n82 = new javax.swing.JLabel();
        n83 = new javax.swing.JLabel();
        n84 = new javax.swing.JLabel();
        n85 = new javax.swing.JLabel();
        n86 = new javax.swing.JLabel();
        n87 = new javax.swing.JLabel();
        n88 = new javax.swing.JLabel();
        n89 = new javax.swing.JLabel();
        n90 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        decide2 = new javax.swing.JLabel();
        n91 = new javax.swing.JLabel();
        n92 = new javax.swing.JLabel();
        n93 = new javax.swing.JLabel();
        n94 = new javax.swing.JLabel();
        n95 = new javax.swing.JLabel();
        n96 = new javax.swing.JLabel();
        n97 = new javax.swing.JLabel();
        n98 = new javax.swing.JLabel();
        n99 = new javax.swing.JLabel();
        n100 = new javax.swing.JLabel();
        v23 = new javax.swing.JLabel();
        v24 = new javax.swing.JLabel();
        v25 = new javax.swing.JLabel();
        v26 = new javax.swing.JLabel();
        v27 = new javax.swing.JLabel();
        v28 = new javax.swing.JLabel();
        v29 = new javax.swing.JLabel();
        v30 = new javax.swing.JLabel();
        v31 = new javax.swing.JLabel();
        v32 = new javax.swing.JLabel();
        v33 = new javax.swing.JLabel();
        h41 = new javax.swing.JLabel();
        h42 = new javax.swing.JLabel();
        h43 = new javax.swing.JLabel();
        h44 = new javax.swing.JLabel();
        h45 = new javax.swing.JLabel();
        h46 = new javax.swing.JLabel();
        h47 = new javax.swing.JLabel();
        h48 = new javax.swing.JLabel();
        h49 = new javax.swing.JLabel();
        h50 = new javax.swing.JLabel();
        h51 = new javax.swing.JLabel();
        h52 = new javax.swing.JLabel();
        h53 = new javax.swing.JLabel();
        h54 = new javax.swing.JLabel();
        h55 = new javax.swing.JLabel();
        h56 = new javax.swing.JLabel();
        h57 = new javax.swing.JLabel();
        h58 = new javax.swing.JLabel();
        h59 = new javax.swing.JLabel();
        h60 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        resbox2 = new javax.swing.JLabel();
        reslabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();
        home = new javax.swing.JLabel();
        Frame4 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        nxttxt4 = new javax.swing.JLabel();
        nxt4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setUndecorated(true);
        getContentPane().setLayout(null);

        mainpanel.setMaximumSize(new java.awt.Dimension(1000, 700));
        mainpanel.setMinimumSize(new java.awt.Dimension(1000, 700));
        mainpanel.setLayout(new java.awt.CardLayout());

        Panel1.setMaximumSize(new java.awt.Dimension(1000, 700));
        Panel1.setMinimumSize(new java.awt.Dimension(1000, 700));
        Panel1.setLayout(null);

        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        Panel1.add(Minimize);
        Minimize.setBounds(938, 5, 20, 20);

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        Panel1.add(Close);
        Close.setBounds(965, 5, 20, 20);

        MainBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainBarMousePressed(evt);
            }
        });
        MainBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainBarMouseDragged(evt);
            }
        });
        Panel1.add(MainBar);
        MainBar.setBounds(0, 0, 1000, 20);

        Heading.setFont(new java.awt.Font("Jing Jing", 0, 60)); // NOI18N
        Heading.setForeground(new java.awt.Color(102, 0, 0));
        Heading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/heading.png"))); // NOI18N
        Panel1.add(Heading);
        Heading.setBounds(250, 260, 620, 130);

        Prblmstmt1.setFont(new java.awt.Font("Silent Reaction", 0, 40)); // NOI18N
        Prblmstmt1.setForeground(new java.awt.Color(255, 255, 255));
        Prblmstmt1.setAutoscrolls(true);
        Panel1.add(Prblmstmt1);
        Prblmstmt1.setBounds(60, 260, 930, 100);

        Prblmstmt2.setFont(new java.awt.Font("Silent Reaction", 0, 40)); // NOI18N
        Prblmstmt2.setForeground(new java.awt.Color(255, 255, 255));
        Prblmstmt2.setAutoscrolls(true);
        Panel1.add(Prblmstmt2);
        Prblmstmt2.setBounds(60, 310, 910, 100);

        Prblmstmt3.setFont(new java.awt.Font("Silent Reaction", 0, 40)); // NOI18N
        Prblmstmt3.setForeground(new java.awt.Color(255, 255, 255));
        Prblmstmt3.setAutoscrolls(true);
        Panel1.add(Prblmstmt3);
        Prblmstmt3.setBounds(60, 360, 910, 100);

        nxttxt.setFont(new java.awt.Font("Segoe UI Mono", 1, 14)); // NOI18N
        nxttxt.setForeground(new java.awt.Color(51, 102, 0));
        nxttxt.setText("next");
        nxttxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel1.add(nxttxt);
        nxttxt.setBounds(890, 610, 40, 30);

        nxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/green.png"))); // NOI18N
        nxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nxtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nxtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nxtMouseReleased(evt);
            }
        });
        Panel1.add(nxt);
        nxt.setBounds(900, 660, 70, 30);

        Frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/background.png"))); // NOI18N
        Frame.setOpaque(true);
        Panel1.add(Frame);
        Frame.setBounds(0, 0, 1000, 700);

        mainpanel.add(Panel1, "card2");

        Panel2.setMaximumSize(new java.awt.Dimension(1000, 700));
        Panel2.setMinimumSize(new java.awt.Dimension(1000, 700));
        Panel2.setLayout(null);

        Close1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Close1MouseClicked(evt);
            }
        });
        Panel2.add(Close1);
        Close1.setBounds(965, 5, 20, 20);

        Minimize1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Minimize1MouseClicked(evt);
            }
        });
        Panel2.add(Minimize1);
        Minimize1.setBounds(938, 5, 20, 20);

        MainBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainBar1MousePressed(evt);
            }
        });
        MainBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainBar1MouseDragged(evt);
            }
        });
        Panel2.add(MainBar1);
        MainBar1.setBounds(0, 0, 1000, 20);

        help2pg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/scroll2.png"))); // NOI18N
        Panel2.add(help2pg);
        help2pg.setBounds(410, 90, 510, 590);

        Heading1.setFont(new java.awt.Font("Jing Jing", 0, 60)); // NOI18N
        Heading1.setForeground(new java.awt.Color(102, 0, 0));
        Heading1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/heading.png"))); // NOI18N
        Panel2.add(Heading1);
        Heading1.setBounds(250, 60, 620, 130);

        txtLabel1.setFont(new java.awt.Font("Silent Reaction", 0, 48)); // NOI18N
        txtLabel1.setForeground(new java.awt.Color(204, 51, 0));
        Panel2.add(txtLabel1);
        txtLabel1.setBounds(150, 460, 380, 80);

        txtLabel2.setFont(new java.awt.Font("Silent Reaction", 0, 48)); // NOI18N
        txtLabel2.setForeground(new java.awt.Color(204, 51, 0));
        Panel2.add(txtLabel2);
        txtLabel2.setBounds(160, 250, 380, 80);

        txtLabel3.setFont(new java.awt.Font("Silent Reaction", 0, 48)); // NOI18N
        txtLabel3.setForeground(new java.awt.Color(204, 51, 0));
        Panel2.add(txtLabel3);
        txtLabel3.setBounds(160, 350, 380, 80);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox1.setSelectedIndex(8);
        jComboBox1.setToolTipText("");
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        Panel2.add(jComboBox1);
        jComboBox1.setBounds(610, 280, 160, 30);

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

        Panel2.add(jScrollPane1);
        jScrollPane1.setBounds(1000, 370, 160, 40);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        Panel2.add(jTextField1);
        jTextField1.setBounds(1000, 480, 170, 40);

        nxttxt1.setFont(new java.awt.Font("Segoe UI Mono", 1, 14)); // NOI18N
        nxttxt1.setForeground(new java.awt.Color(51, 102, 0));
        nxttxt1.setText("OK");
        nxttxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel2.add(nxttxt1);
        nxttxt1.setBounds(494, 610, 20, 30);

        nxt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/green.png"))); // NOI18N
        nxt1.setText("Next");
        nxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nxt1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nxt1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nxt1MouseReleased(evt);
            }
        });
        Panel2.add(nxt1);
        nxt1.setBounds(470, 610, 70, 30);

        help2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/questionMark2.png"))); // NOI18N
        help2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                help2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                help2MouseExited(evt);
            }
        });
        Panel2.add(help2);
        help2.setBounds(920, 50, 60, 50);

        Frame1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/background.png"))); // NOI18N
        Frame1.setOpaque(true);
        Panel2.add(Frame1);
        Frame1.setBounds(0, 0, 1000, 700);

        mainpanel.add(Panel2, "card3");

        Panel3.setMaximumSize(new java.awt.Dimension(1000, 700));
        Panel3.setMinimumSize(new java.awt.Dimension(1000, 700));
        Panel3.setLayout(null);

        Close2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Close2MouseClicked(evt);
            }
        });
        Panel3.add(Close2);
        Close2.setBounds(965, 5, 20, 20);

        Minimize2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Minimize2MouseClicked(evt);
            }
        });
        Panel3.add(Minimize2);
        Minimize2.setBounds(938, 5, 20, 20);

        MainBar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainBar2MousePressed(evt);
            }
        });
        MainBar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainBar2MouseDragged(evt);
            }
        });
        Panel3.add(MainBar2);
        MainBar2.setBounds(0, 0, 1000, 20);

        help2pg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/scroll3.png"))); // NOI18N
        Panel3.add(help2pg1);
        help2pg1.setBounds(410, 90, 510, 590);

        help3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/questionMark2.png"))); // NOI18N
        help3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                help3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                help3MouseExited(evt);
            }
        });
        Panel3.add(help3);
        help3.setBounds(920, 50, 60, 50);

        SubHeading.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        SubHeading.setForeground(new java.awt.Color(204, 204, 255));
        SubHeading.setText("Naive Solution:");
        Panel3.add(SubHeading);
        SubHeading.setBounds(320, 170, 360, 64);

        Heading2.setFont(new java.awt.Font("Jing Jing", 0, 60)); // NOI18N
        Heading2.setForeground(new java.awt.Color(102, 0, 0));
        Heading2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/heading.png"))); // NOI18N
        Panel3.add(Heading2);
        Heading2.setBounds(250, 60, 620, 130);

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/PLAYBUTTON.png"))); // NOI18N
        play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playMouseReleased(evt);
            }
        });
        Panel3.add(play);
        play.setBounds(690, 182, 50, 50);

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/lightgreen.png"))); // NOI18N
        Panel3.add(a1);
        a1.setBounds(362, 310, 30, 30);

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/darkgreen.png"))); // NOI18N
        Panel3.add(a2);
        a2.setBounds(482, 310, 30, 30);

        n1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n1.setForeground(new java.awt.Color(0, 153, 153));
        n1.setText("00");
        Panel3.add(n1);
        n1.setBounds(-25, 278, 30, 22);

        n2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n2.setForeground(new java.awt.Color(0, 153, 153));
        n2.setText("00");
        Panel3.add(n2);
        n2.setBounds(-25, 278, 30, 22);

        n3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n3.setForeground(new java.awt.Color(0, 153, 153));
        n3.setText("00");
        Panel3.add(n3);
        n3.setBounds(-25, 278, 30, 22);

        n4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n4.setForeground(new java.awt.Color(0, 153, 153));
        n4.setText("00");
        Panel3.add(n4);
        n4.setBounds(-25, 278, 30, 22);

        n5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n5.setForeground(new java.awt.Color(0, 153, 153));
        n5.setText("00");
        Panel3.add(n5);
        n5.setBounds(-25, 278, 30, 22);

        n6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n6.setForeground(new java.awt.Color(0, 153, 153));
        n6.setText("00");
        Panel3.add(n6);
        n6.setBounds(1000, 278, 30, 22);

        n7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n7.setForeground(new java.awt.Color(0, 153, 153));
        n7.setText("00");
        Panel3.add(n7);
        n7.setBounds(1000, 278, 30, 22);

        n8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n8.setForeground(new java.awt.Color(0, 153, 153));
        n8.setText("00");
        Panel3.add(n8);
        n8.setBounds(1000, 278, 30, 22);

        n9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n9.setForeground(new java.awt.Color(0, 153, 153));
        n9.setText("00");
        Panel3.add(n9);
        n9.setBounds(1000, 278, 30, 22);

        n10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n10.setForeground(new java.awt.Color(0, 153, 153));
        n10.setText("00");
        Panel3.add(n10);
        n10.setBounds(1000, 278, 30, 22);

        v1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel3.add(v1);
        v1.setBounds(390, 270, 20, 37);

        v2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel3.add(v2);
        v2.setBounds(420, 270, 20, 37);

        v3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel3.add(v3);
        v3.setBounds(452, 270, 20, 37);

        v4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel3.add(v4);
        v4.setBounds(480, 270, 20, 37);

        v5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel3.add(v5);
        v5.setBounds(510, 270, 20, 37);

        v6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel3.add(v6);
        v6.setBounds(542, 270, 20, 37);

        v7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel3.add(v7);
        v7.setBounds(572, 270, 20, 37);

        v8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel3.add(v8);
        v8.setBounds(602, 270, 20, 37);

        v9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel3.add(v9);
        v9.setBounds(632, 270, 20, 37);

        v10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel3.add(v10);
        v10.setBounds(662, 270, 20, 37);

        v11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel3.add(v11);
        v11.setBounds(693, 270, 10, 37);

        h1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h1.setText("jLabel1");
        Panel3.add(h1);
        h1.setBounds(390, 262, 34, 14);

        h2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h2.setText("jLabel1");
        Panel3.add(h2);
        h2.setBounds(390, 300, 34, 14);

        h3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h3.setText("jLabel1");
        Panel3.add(h3);
        h3.setBounds(420, 262, 34, 14);

        h4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h4.setText("jLabel1");
        Panel3.add(h4);
        h4.setBounds(420, 300, 34, 14);

        h5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h5.setText("jLabel1");
        Panel3.add(h5);
        h5.setBounds(450, 262, 34, 14);

        h6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h6.setText("jLabel1");
        Panel3.add(h6);
        h6.setBounds(450, 300, 34, 14);

        h7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h7.setText("jLabel1");
        Panel3.add(h7);
        h7.setBounds(480, 300, 34, 14);

        h8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h8.setText("jLabel1");
        Panel3.add(h8);
        h8.setBounds(480, 262, 34, 14);

        h9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h9.setText("jLabel1");
        Panel3.add(h9);
        h9.setBounds(510, 262, 34, 14);

        h10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h10.setText("jLabel1");
        Panel3.add(h10);
        h10.setBounds(510, 300, 34, 14);

        h11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h11.setText("jLabel1");
        Panel3.add(h11);
        h11.setBounds(540, 262, 34, 14);

        h12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h12.setText("jLabel1");
        Panel3.add(h12);
        h12.setBounds(540, 300, 34, 14);

        h13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h13.setText("jLabel1");
        Panel3.add(h13);
        h13.setBounds(570, 300, 34, 14);

        h14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h14.setText("jLabel1");
        Panel3.add(h14);
        h14.setBounds(570, 262, 34, 14);

        h15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h15.setText("jLabel1");
        Panel3.add(h15);
        h15.setBounds(600, 262, 34, 14);

        h16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h16.setText("jLabel1");
        Panel3.add(h16);
        h16.setBounds(600, 300, 34, 14);

        h17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h17.setText("jLabel1");
        Panel3.add(h17);
        h17.setBounds(630, 300, 34, 14);

        h18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h18.setText("jLabel1");
        Panel3.add(h18);
        h18.setBounds(630, 262, 34, 14);

        h19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h19.setText("jLabel1");
        Panel3.add(h19);
        h19.setBounds(660, 262, 34, 14);

        h20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h20.setText("jLabel1");
        Panel3.add(h20);
        h20.setBounds(660, 300, 34, 14);

        decide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/tick.png"))); // NOI18N
        Panel3.add(decide);
        decide.setBounds(820, 415, 80, 70);

        sn1.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        sn1.setForeground(new java.awt.Color(0, 153, 153));
        sn1.setText("00");
        Panel3.add(sn1);
        sn1.setBounds(280, 400, 130, 80);

        sn2.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        sn2.setForeground(new java.awt.Color(0, 153, 153));
        sn2.setText("00");
        Panel3.add(sn2);
        sn2.setBounds(480, 400, 130, 80);

        sn3.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        sn3.setForeground(new java.awt.Color(0, 153, 153));
        sn3.setText("00");
        Panel3.add(sn3);
        sn3.setBounds(680, 400, 190, 80);

        op1.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        op1.setForeground(new java.awt.Color(153, 0, 153));
        op1.setText("+");
        Panel3.add(op1);
        op1.setBounds(400, 400, 60, 80);

        op2.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        op2.setForeground(new java.awt.Color(153, 0, 153));
        op2.setText("=");
        Panel3.add(op2);
        op2.setBounds(600, 400, 60, 80);

        nxttxt2.setFont(new java.awt.Font("Segoe UI Mono", 1, 14)); // NOI18N
        nxttxt2.setForeground(new java.awt.Color(51, 102, 0));
        nxttxt2.setText("next");
        nxttxt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel3.add(nxttxt2);
        nxttxt2.setBounds(915, 658, 32, 30);

        nxt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/green.png"))); // NOI18N
        nxt2.setText("Next");
        nxt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nxt2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nxt2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nxt2MouseReleased(evt);
            }
        });
        Panel3.add(nxt2);
        nxt2.setBounds(900, 660, 70, 30);

        Y.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        Y.setForeground(new java.awt.Color(153, 0, 0));
        Y.setText("Y :");
        Panel3.add(Y);
        Y.setBounds(780, 260, 60, 50);

        T.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        T.setForeground(new java.awt.Color(153, 0, 0));
        T.setText("T");
        Panel3.add(T);
        T.setBounds(710, 470, 60, 50);

        X.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        X.setForeground(new java.awt.Color(153, 0, 0));
        X.setText("X :");
        Panel3.add(X);
        X.setBounds(780, 220, 60, 50);

        yno.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        yno.setForeground(new java.awt.Color(0, 153, 153));
        yno.setText("00");
        Panel3.add(yno);
        yno.setBounds(830, 250, 40, 70);

        tno.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        tno.setForeground(new java.awt.Color(0, 153, 153));
        tno.setText("00");
        Panel3.add(tno);
        tno.setBounds(830, 170, 40, 70);

        xno.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        xno.setForeground(new java.awt.Color(0, 153, 153));
        xno.setText("00");
        Panel3.add(xno);
        xno.setBounds(830, 210, 40, 70);

        T2.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        T2.setForeground(new java.awt.Color(153, 0, 0));
        T2.setText("T :");
        Panel3.add(T2);
        T2.setBounds(780, 180, 60, 50);

        Y2.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        Y2.setForeground(new java.awt.Color(153, 0, 0));
        Y2.setText("Y ");
        Panel3.add(Y2);
        Y2.setBounds(510, 470, 60, 50);

        X2.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        X2.setForeground(new java.awt.Color(153, 0, 0));
        X2.setText("X ");
        Panel3.add(X2);
        X2.setBounds(310, 470, 60, 50);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setOpaque(false);

        ta.setColumns(20);
        ta.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ta.setRows(5);
        ta.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ta.setMaximumSize(new java.awt.Dimension(4, 22));
        jScrollPane2.setViewportView(ta);

        Panel3.add(jScrollPane2);
        jScrollPane2.setBounds(70, 340, 120, 150);

        reslabel.setFont(new java.awt.Font("Tekton Pro Cond", 3, 24)); // NOI18N
        reslabel.setForeground(new java.awt.Color(255, 255, 255));
        reslabel.setText("Result Sets :");
        Panel3.add(reslabel);
        reslabel.setBounds(50, 290, 160, 50);

        resbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/resultbox.png"))); // NOI18N
        Panel3.add(resbox);
        resbox.setBounds(40, 320, 200, 190);

        Frame2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/background.png"))); // NOI18N
        Frame2.setOpaque(true);
        Frame2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Frame2MouseMoved(evt);
            }
        });
        Panel3.add(Frame2);
        Frame2.setBounds(0, 0, 1000, 700);

        mainpanel.add(Panel3, "card3");

        Panel4.setMaximumSize(new java.awt.Dimension(1000, 700));
        Panel4.setMinimumSize(new java.awt.Dimension(1000, 700));
        Panel4.setLayout(null);

        Close3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Close3MouseClicked(evt);
            }
        });
        Panel4.add(Close3);
        Close3.setBounds(965, 5, 20, 20);

        Minimize3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Minimize3MouseClicked(evt);
            }
        });
        Panel4.add(Minimize3);
        Minimize3.setBounds(938, 5, 20, 20);

        MainBar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainBar3MousePressed(evt);
            }
        });
        MainBar3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainBar3MouseDragged(evt);
            }
        });
        Panel4.add(MainBar3);
        MainBar3.setBounds(0, 0, 1000, 20);

        help2pg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/scroll4.png"))); // NOI18N
        Panel4.add(help2pg2);
        help2pg2.setBounds(410, 90, 510, 590);

        help4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/questionMark2.png"))); // NOI18N
        help4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                help4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                help4MouseExited(evt);
            }
        });
        Panel4.add(help4);
        help4.setBounds(920, 50, 60, 50);

        SubHeading1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        SubHeading1.setForeground(new java.awt.Color(204, 204, 255));
        SubHeading1.setText("Sort Solution:");
        Panel4.add(SubHeading1);
        SubHeading1.setBounds(340, 170, 380, 64);

        Heading3.setFont(new java.awt.Font("Jing Jing", 0, 60)); // NOI18N
        Heading3.setForeground(new java.awt.Color(102, 0, 0));
        Heading3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/heading.png"))); // NOI18N
        Panel4.add(Heading3);
        Heading3.setBounds(250, 60, 620, 130);

        play1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/PLAYBUTTON.png"))); // NOI18N
        play1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        play1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                play1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                play1MouseReleased(evt);
            }
        });
        Panel4.add(play1);
        play1.setBounds(690, 182, 50, 50);

        a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/lightgreen.png"))); // NOI18N
        Panel4.add(a3);
        a3.setBounds(362, 310, 30, 30);

        a4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/darkgreen.png"))); // NOI18N
        Panel4.add(a4);
        a4.setBounds(482, 310, 30, 30);

        n11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n11.setForeground(new java.awt.Color(0, 153, 153));
        n11.setText("00");
        Panel4.add(n11);
        n11.setBounds(-25, 278, 30, 22);

        n12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n12.setForeground(new java.awt.Color(0, 153, 153));
        n12.setText("00");
        Panel4.add(n12);
        n12.setBounds(-25, 278, 30, 22);

        n13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n13.setForeground(new java.awt.Color(0, 153, 153));
        n13.setText("00");
        Panel4.add(n13);
        n13.setBounds(-25, 278, 30, 22);

        n14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n14.setForeground(new java.awt.Color(0, 153, 153));
        n14.setText("00");
        Panel4.add(n14);
        n14.setBounds(-25, 278, 30, 22);

        n15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n15.setForeground(new java.awt.Color(0, 153, 153));
        n15.setText("00");
        Panel4.add(n15);
        n15.setBounds(-25, 278, 30, 22);

        n16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n16.setForeground(new java.awt.Color(0, 153, 153));
        n16.setText("00");
        Panel4.add(n16);
        n16.setBounds(1000, 278, 30, 22);

        n17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n17.setForeground(new java.awt.Color(0, 153, 153));
        n17.setText("00");
        Panel4.add(n17);
        n17.setBounds(1000, 278, 30, 22);

        n18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n18.setForeground(new java.awt.Color(0, 153, 153));
        n18.setText("00");
        Panel4.add(n18);
        n18.setBounds(1000, 278, 30, 22);

        n19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n19.setForeground(new java.awt.Color(0, 153, 153));
        n19.setText("00");
        Panel4.add(n19);
        n19.setBounds(1000, 278, 30, 22);

        n20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n20.setForeground(new java.awt.Color(0, 153, 153));
        n20.setText("00");
        Panel4.add(n20);
        n20.setBounds(1000, 278, 30, 22);

        v12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel4.add(v12);
        v12.setBounds(390, 270, 20, 37);

        v13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel4.add(v13);
        v13.setBounds(420, 270, 20, 37);

        v14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel4.add(v14);
        v14.setBounds(450, 270, 20, 37);

        v15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel4.add(v15);
        v15.setBounds(480, 270, 20, 37);

        v16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel4.add(v16);
        v16.setBounds(510, 270, 20, 37);

        v17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel4.add(v17);
        v17.setBounds(542, 270, 20, 37);

        v18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel4.add(v18);
        v18.setBounds(572, 270, 20, 37);

        v19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel4.add(v19);
        v19.setBounds(602, 270, 20, 37);

        v20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel4.add(v20);
        v20.setBounds(632, 270, 20, 37);

        v21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel4.add(v21);
        v21.setBounds(662, 270, 20, 37);

        v22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel4.add(v22);
        v22.setBounds(693, 270, 10, 37);

        h21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h21.setText("jLabel1");
        Panel4.add(h21);
        h21.setBounds(390, 262, 34, 14);

        h22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h22.setText("jLabel1");
        Panel4.add(h22);
        h22.setBounds(390, 300, 34, 14);

        h23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h23.setText("jLabel1");
        Panel4.add(h23);
        h23.setBounds(420, 262, 34, 14);

        h24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h24.setText("jLabel1");
        Panel4.add(h24);
        h24.setBounds(420, 300, 34, 14);

        h25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h25.setText("jLabel1");
        Panel4.add(h25);
        h25.setBounds(450, 262, 34, 14);

        h26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h26.setText("jLabel1");
        Panel4.add(h26);
        h26.setBounds(450, 300, 34, 14);

        h27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h27.setText("jLabel1");
        Panel4.add(h27);
        h27.setBounds(480, 300, 34, 14);

        h28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h28.setText("jLabel1");
        Panel4.add(h28);
        h28.setBounds(480, 262, 34, 14);

        h29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h29.setText("jLabel1");
        Panel4.add(h29);
        h29.setBounds(510, 262, 34, 14);

        h30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h30.setText("jLabel1");
        Panel4.add(h30);
        h30.setBounds(510, 300, 34, 14);

        h31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h31.setText("jLabel1");
        Panel4.add(h31);
        h31.setBounds(540, 262, 34, 14);

        h32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h32.setText("jLabel1");
        Panel4.add(h32);
        h32.setBounds(540, 300, 34, 14);

        h33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h33.setText("jLabel1");
        Panel4.add(h33);
        h33.setBounds(570, 300, 34, 14);

        h34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h34.setText("jLabel1");
        Panel4.add(h34);
        h34.setBounds(570, 262, 34, 14);

        h35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h35.setText("jLabel1");
        Panel4.add(h35);
        h35.setBounds(600, 262, 34, 14);

        h36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h36.setText("jLabel1");
        Panel4.add(h36);
        h36.setBounds(600, 300, 34, 14);

        h37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h37.setText("jLabel1");
        Panel4.add(h37);
        h37.setBounds(630, 300, 34, 14);

        h38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h38.setText("jLabel1");
        Panel4.add(h38);
        h38.setBounds(630, 262, 34, 14);

        h39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h39.setText("jLabel1");
        Panel4.add(h39);
        h39.setBounds(660, 262, 34, 14);

        h40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h40.setText("jLabel1");
        Panel4.add(h40);
        h40.setBounds(660, 300, 34, 14);

        decide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/tick.png"))); // NOI18N
        Panel4.add(decide1);
        decide1.setBounds(820, 415, 80, 70);

        sn4.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        sn4.setForeground(new java.awt.Color(0, 153, 153));
        sn4.setText("00");
        Panel4.add(sn4);
        sn4.setBounds(280, 400, 130, 80);

        sn5.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        sn5.setForeground(new java.awt.Color(0, 153, 153));
        sn5.setText("00");
        Panel4.add(sn5);
        sn5.setBounds(480, 400, 130, 80);

        sn6.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        sn6.setForeground(new java.awt.Color(0, 153, 153));
        sn6.setText("00");
        Panel4.add(sn6);
        sn6.setBounds(680, 400, 190, 80);

        op3.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        op3.setForeground(new java.awt.Color(153, 0, 153));
        op3.setText("-");
        Panel4.add(op3);
        op3.setBounds(400, 400, 60, 80);

        op4.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        op4.setForeground(new java.awt.Color(153, 0, 153));
        op4.setText("=");
        Panel4.add(op4);
        op4.setBounds(600, 400, 60, 80);

        nxttxt3.setFont(new java.awt.Font("Segoe UI Mono", 1, 14)); // NOI18N
        nxttxt3.setForeground(new java.awt.Color(51, 102, 0));
        nxttxt3.setText("next");
        nxttxt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel4.add(nxttxt3);
        nxttxt3.setBounds(915, 658, 40, 30);

        nxt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/green.png"))); // NOI18N
        nxt3.setText("Next");
        nxt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nxt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nxt3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nxt3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nxt3MouseReleased(evt);
            }
        });
        Panel4.add(nxt3);
        nxt3.setBounds(900, 660, 70, 30);

        Y1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        Y1.setForeground(new java.awt.Color(153, 0, 0));
        Y1.setText("Y :");
        Panel4.add(Y1);
        Y1.setBounds(780, 260, 60, 50);

        T1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        T1.setForeground(new java.awt.Color(153, 0, 0));
        T1.setText("T :");
        Panel4.add(T1);
        T1.setBounds(780, 180, 60, 50);

        X1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        X1.setForeground(new java.awt.Color(153, 0, 0));
        X1.setText("X :");
        Panel4.add(X1);
        X1.setBounds(780, 220, 60, 50);

        Y3.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        Y3.setForeground(new java.awt.Color(153, 0, 0));
        Y3.setText("Y ");
        Panel4.add(Y3);
        Y3.setBounds(710, 470, 60, 50);

        X3.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        X3.setForeground(new java.awt.Color(153, 0, 0));
        X3.setText("X ");
        Panel4.add(X3);
        X3.setBounds(510, 470, 60, 50);

        T3.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        T3.setForeground(new java.awt.Color(153, 0, 0));
        T3.setText("T ");
        Panel4.add(T3);
        T3.setBounds(310, 470, 60, 50);

        yno1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        yno1.setForeground(new java.awt.Color(0, 153, 153));
        yno1.setText("00");
        Panel4.add(yno1);
        yno1.setBounds(830, 250, 40, 70);

        tno1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        tno1.setForeground(new java.awt.Color(0, 153, 153));
        tno1.setText("00");
        Panel4.add(tno1);
        tno1.setBounds(830, 170, 40, 70);

        xno1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        xno1.setForeground(new java.awt.Color(0, 153, 153));
        xno1.setText("00");
        Panel4.add(xno1);
        xno1.setBounds(830, 210, 40, 70);

        resbox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/resultbox.png"))); // NOI18N
        Panel4.add(resbox1);
        resbox1.setBounds(40, 320, 200, 190);

        reslabel1.setFont(new java.awt.Font("Tekton Pro Cond", 3, 24)); // NOI18N
        reslabel1.setForeground(new java.awt.Color(255, 255, 255));
        reslabel1.setText("Result Sets :");
        Panel4.add(reslabel1);
        reslabel1.setBounds(50, 290, 160, 50);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setOpaque(false);

        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ta1.setRows(5);
        ta1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ta1.setMaximumSize(new java.awt.Dimension(4, 22));
        jScrollPane3.setViewportView(ta1);

        Panel4.add(jScrollPane3);
        jScrollPane3.setBounds(70, 340, 120, 150);

        Frame3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/background.png"))); // NOI18N
        Frame3.setOpaque(true);
        Frame3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Frame3MouseMoved(evt);
            }
        });
        Panel4.add(Frame3);
        Frame3.setBounds(0, 0, 1000, 700);

        mainpanel.add(Panel4, "card3");

        Panel5.setMaximumSize(new java.awt.Dimension(1000, 700));
        Panel5.setMinimumSize(new java.awt.Dimension(1000, 700));
        Panel5.setLayout(null);

        Close4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Close4MouseClicked(evt);
            }
        });
        Panel5.add(Close4);
        Close4.setBounds(965, 5, 20, 20);

        Minimize4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Minimize4MouseClicked(evt);
            }
        });
        Panel5.add(Minimize4);
        Minimize4.setBounds(938, 5, 20, 20);

        MainBar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainBar4MousePressed(evt);
            }
        });
        MainBar4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainBar4MouseDragged(evt);
            }
        });
        Panel5.add(MainBar4);
        MainBar4.setBounds(0, 0, 1000, 20);

        help2pg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/scroll5.png"))); // NOI18N
        Panel5.add(help2pg3);
        help2pg3.setBounds(410, 90, 510, 590);

        help5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/questionMark2.png"))); // NOI18N
        help5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                help5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                help5MouseExited(evt);
            }
        });
        Panel5.add(help5);
        help5.setBounds(920, 50, 60, 50);

        SubHeading2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        SubHeading2.setForeground(new java.awt.Color(204, 204, 255));
        SubHeading2.setText("Hash Solution:");
        Panel5.add(SubHeading2);
        SubHeading2.setBounds(320, 170, 380, 64);

        Heading4.setFont(new java.awt.Font("Jing Jing", 0, 60)); // NOI18N
        Heading4.setForeground(new java.awt.Color(102, 0, 0));
        Heading4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/heading.png"))); // NOI18N
        Panel5.add(Heading4);
        Heading4.setBounds(250, 60, 620, 130);

        play2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/PLAYBUTTON.png"))); // NOI18N
        play2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        play2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                play2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                play2MouseReleased(evt);
            }
        });
        Panel5.add(play2);
        play2.setBounds(660, 182, 50, 50);

        n21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n21.setForeground(new java.awt.Color(0, 153, 153));
        n21.setText("00");
        Panel5.add(n21);
        n21.setBounds(265, -20, 30, 22);

        n22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n22.setForeground(new java.awt.Color(0, 153, 153));
        n22.setText("00");
        Panel5.add(n22);
        n22.setBounds(265, -20, 30, 22);

        n23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n23.setForeground(new java.awt.Color(0, 153, 153));
        n23.setText("00");
        Panel5.add(n23);
        n23.setBounds(265, -20, 30, 22);

        n24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n24.setForeground(new java.awt.Color(0, 153, 153));
        n24.setText("00");
        Panel5.add(n24);
        n24.setBounds(265, -20, 30, 22);

        n25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n25.setForeground(new java.awt.Color(0, 153, 153));
        n25.setText("00");
        Panel5.add(n25);
        n25.setBounds(265, -20, 30, 22);

        n26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n26.setForeground(new java.awt.Color(0, 153, 153));
        n26.setText("00");
        Panel5.add(n26);
        n26.setBounds(265, -20, 30, 22);

        n27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n27.setForeground(new java.awt.Color(0, 153, 153));
        n27.setText("00");
        Panel5.add(n27);
        n27.setBounds(265, -20, 30, 22);

        n28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n28.setForeground(new java.awt.Color(0, 153, 153));
        n28.setText("00");
        Panel5.add(n28);
        n28.setBounds(265, -20, 30, 22);

        n29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n29.setForeground(new java.awt.Color(0, 153, 153));
        n29.setText("00");
        Panel5.add(n29);
        n29.setBounds(265, -20, 30, 22);

        n30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n30.setForeground(new java.awt.Color(0, 153, 153));
        n30.setText("00");
        Panel5.add(n30);
        n30.setBounds(265, -20, 30, 22);

        n31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n31.setForeground(new java.awt.Color(0, 153, 153));
        n31.setText("00");
        Panel5.add(n31);
        n31.setBounds(317, 247, 30, 22);

        n32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n32.setForeground(new java.awt.Color(0, 153, 153));
        n32.setText("00");
        Panel5.add(n32);
        n32.setBounds(367, 247, 30, 22);

        n33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n33.setForeground(new java.awt.Color(0, 153, 153));
        n33.setText("00");
        Panel5.add(n33);
        n33.setBounds(417, 247, 30, 22);

        n34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n34.setForeground(new java.awt.Color(0, 153, 153));
        n34.setText("00");
        Panel5.add(n34);
        n34.setBounds(467, 247, 30, 22);

        n35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n35.setForeground(new java.awt.Color(0, 153, 153));
        n35.setText("00");
        Panel5.add(n35);
        n35.setBounds(517, 247, 30, 22);

        n36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n36.setForeground(new java.awt.Color(0, 153, 153));
        n36.setText("00");
        Panel5.add(n36);
        n36.setBounds(567, 247, 30, 22);

        at1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at1.setText("jLabel1");
        Panel5.add(at1);
        at1.setBounds(295, 250, 10, 14);

        at2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at2.setText("jLabel1");
        Panel5.add(at2);
        at2.setBounds(347, 250, 10, 14);

        at3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at3.setText("jLabel1");
        Panel5.add(at3);
        at3.setBounds(397, 250, 10, 14);

        at4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at4.setText("jLabel1");
        Panel5.add(at4);
        at4.setBounds(447, 250, 10, 14);

        at5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at5.setText("jLabel1");
        Panel5.add(at5);
        at5.setBounds(497, 250, 10, 14);

        at6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at6.setText("jLabel1");
        Panel5.add(at6);
        at6.setBounds(547, 250, 10, 14);

        at7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at7.setText("jLabel1");
        Panel5.add(at7);
        at7.setBounds(295, 294, 10, 14);

        at8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at8.setText("jLabel1");
        Panel5.add(at8);
        at8.setBounds(347, 294, 10, 14);

        at9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at9.setText("jLabel1");
        Panel5.add(at9);
        at9.setBounds(397, 294, 10, 14);

        at10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at10.setText("jLabel1");
        Panel5.add(at10);
        at10.setBounds(447, 294, 10, 14);

        at11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at11.setText("jLabel1");
        Panel5.add(at11);
        at11.setBounds(497, 294, 10, 14);

        at12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at12.setText("jLabel1");
        Panel5.add(at12);
        at12.setBounds(547, 294, 10, 14);

        at13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at13.setText("jLabel1");
        Panel5.add(at13);
        at13.setBounds(295, 332, 10, 14);

        at14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at14.setText("jLabel1");
        Panel5.add(at14);
        at14.setBounds(347, 332, 10, 14);

        at15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at15.setText("jLabel1");
        Panel5.add(at15);
        at15.setBounds(397, 332, 10, 14);

        at16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at16.setText("jLabel1");
        Panel5.add(at16);
        at16.setBounds(447, 332, 10, 14);

        at17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at17.setText("jLabel1");
        Panel5.add(at17);
        at17.setBounds(497, 332, 10, 14);

        at18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at18.setText("jLabel1");
        Panel5.add(at18);
        at18.setBounds(547, 332, 10, 14);

        at19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at19.setText("jLabel1");
        Panel5.add(at19);
        at19.setBounds(295, 370, 10, 14);

        at20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at20.setText("jLabel1");
        Panel5.add(at20);
        at20.setBounds(347, 370, 10, 14);

        at21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at21.setText("jLabel1");
        Panel5.add(at21);
        at21.setBounds(397, 370, 10, 14);

        at22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at22.setText("jLabel1");
        Panel5.add(at22);
        at22.setBounds(447, 370, 10, 14);

        at23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at23.setText("jLabel1");
        Panel5.add(at23);
        at23.setBounds(497, 370, 10, 14);

        at24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at24.setText("jLabel1");
        Panel5.add(at24);
        at24.setBounds(547, 370, 10, 14);

        at25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at25.setText("jLabel1");
        Panel5.add(at25);
        at25.setBounds(295, 417, 10, 14);

        at26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at26.setText("jLabel1");
        Panel5.add(at26);
        at26.setBounds(347, 420, 10, 14);

        at27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at27.setText("jLabel1");
        Panel5.add(at27);
        at27.setBounds(397, 420, 10, 14);

        at28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at28.setText("jLabel1");
        Panel5.add(at28);
        at28.setBounds(447, 420, 10, 14);

        at29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at29.setText("jLabel1");
        Panel5.add(at29);
        at29.setBounds(497, 420, 10, 14);

        at30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at30.setText("jLabel1");
        Panel5.add(at30);
        at30.setBounds(547, 420, 10, 14);

        at31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at31.setText("jLabel1");
        Panel5.add(at31);
        at31.setBounds(295, 460, 10, 14);

        at32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at32.setText("jLabel1");
        Panel5.add(at32);
        at32.setBounds(347, 460, 10, 14);

        at33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at33.setText("jLabel1");
        Panel5.add(at33);
        at33.setBounds(397, 460, 10, 14);

        at34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at34.setText("jLabel1");
        Panel5.add(at34);
        at34.setBounds(447, 460, 10, 14);

        at35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at35.setText("jLabel1");
        Panel5.add(at35);
        at35.setBounds(497, 460, 10, 14);

        at36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at36.setText("jLabel1");
        Panel5.add(at36);
        at36.setBounds(547, 460, 10, 14);

        at37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at37.setText("jLabel1");
        Panel5.add(at37);
        at37.setBounds(295, 500, 10, 14);

        at38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at38.setText("jLabel1");
        Panel5.add(at38);
        at38.setBounds(347, 500, 10, 14);

        at39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at39.setText("jLabel1");
        Panel5.add(at39);
        at39.setBounds(397, 500, 10, 14);

        at40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at40.setText("jLabel1");
        Panel5.add(at40);
        at40.setBounds(447, 500, 10, 14);

        at41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at41.setText("jLabel1");
        Panel5.add(at41);
        at41.setBounds(497, 500, 10, 14);

        at42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at42.setText("jLabel1");
        Panel5.add(at42);
        at42.setBounds(547, 500, 10, 14);

        at43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at43.setText("jLabel1");
        Panel5.add(at43);
        at43.setBounds(295, 540, 10, 14);

        at44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at44.setText("jLabel1");
        Panel5.add(at44);
        at44.setBounds(347, 540, 10, 14);

        at45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at45.setText("jLabel1");
        Panel5.add(at45);
        at45.setBounds(397, 540, 10, 14);

        at46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at46.setText("jLabel1");
        Panel5.add(at46);
        at46.setBounds(447, 540, 10, 14);

        at47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at47.setText("jLabel1");
        Panel5.add(at47);
        at47.setBounds(497, 540, 10, 14);

        at48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at48.setText("jLabel1");
        Panel5.add(at48);
        at48.setBounds(547, 540, 10, 14);

        at49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at49.setText("jLabel1");
        Panel5.add(at49);
        at49.setBounds(295, 580, 10, 14);

        at50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at50.setText("jLabel1");
        Panel5.add(at50);
        at50.setBounds(347, 580, 10, 14);

        at51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at51.setText("jLabel1");
        Panel5.add(at51);
        at51.setBounds(397, 580, 10, 14);

        at52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at52.setText("jLabel1");
        Panel5.add(at52);
        at52.setBounds(447, 580, 10, 14);

        at53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at53.setText("jLabel1");
        Panel5.add(at53);
        at53.setBounds(497, 580, 10, 14);

        at54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at54.setText("jLabel1");
        Panel5.add(at54);
        at54.setBounds(547, 580, 10, 14);

        at55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at55.setText("jLabel1");
        Panel5.add(at55);
        at55.setBounds(295, 620, 10, 14);

        at56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at56.setText("jLabel1");
        Panel5.add(at56);
        at56.setBounds(347, 620, 10, 14);

        at57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at57.setText("jLabel1");
        Panel5.add(at57);
        at57.setBounds(397, 620, 10, 14);

        at58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at58.setText("jLabel1");
        Panel5.add(at58);
        at58.setBounds(447, 620, 10, 14);

        at59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at59.setText("jLabel1");
        Panel5.add(at59);
        at59.setBounds(497, 620, 10, 14);

        at60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        at60.setText("jLabel1");
        Panel5.add(at60);
        at60.setBounds(547, 620, 10, 14);

        va1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va1);
        va1.setBounds(260, 240, 20, 37);

        va2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va2);
        va2.setBounds(290, 240, 20, 37);

        va3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va3);
        va3.setBounds(260, 280, 20, 37);

        va4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va4);
        va4.setBounds(290, 280, 20, 37);

        va5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va5);
        va5.setBounds(260, 320, 20, 37);

        va6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va6);
        va6.setBounds(290, 320, 20, 37);

        va7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va7);
        va7.setBounds(260, 360, 20, 37);

        va8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va8);
        va8.setBounds(290, 360, 20, 37);

        va9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va9);
        va9.setBounds(260, 400, 20, 37);

        va10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va10);
        va10.setBounds(290, 400, 20, 37);

        ha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        ha1.setText("jLabel1");
        Panel5.add(ha1);
        ha1.setBounds(260, 232, 30, 14);

        ha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        ha2.setText("jLabel1");
        Panel5.add(ha2);
        ha2.setBounds(260, 270, 30, 14);

        ha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        ha3.setText("jLabel1");
        Panel5.add(ha3);
        ha3.setBounds(260, 310, 30, 14);

        ha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        ha4.setText("jLabel1");
        Panel5.add(ha4);
        ha4.setBounds(260, 350, 30, 14);

        ha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        ha5.setText("jLabel1");
        Panel5.add(ha5);
        ha5.setBounds(260, 390, 30, 14);

        ha6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        ha6.setText("jLabel1");
        Panel5.add(ha6);
        ha6.setBounds(260, 430, 30, 14);

        va11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va11);
        va11.setBounds(260, 440, 20, 37);

        va12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va12);
        va12.setBounds(290, 440, 20, 37);

        va13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va13);
        va13.setBounds(260, 480, 20, 37);

        va14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va14);
        va14.setBounds(290, 480, 20, 37);

        va15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va15);
        va15.setBounds(260, 520, 20, 37);

        va16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va16);
        va16.setBounds(290, 520, 20, 37);

        va17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va17);
        va17.setBounds(260, 560, 20, 37);

        va18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va18);
        va18.setBounds(290, 560, 20, 37);

        va19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va19);
        va19.setBounds(260, 600, 20, 37);

        va20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(va20);
        va20.setBounds(290, 600, 20, 37);

        ha7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        ha7.setText("jLabel1");
        Panel5.add(ha7);
        ha7.setBounds(260, 430, 30, 14);

        ha8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        ha8.setText("jLabel1");
        Panel5.add(ha8);
        ha8.setBounds(260, 470, 30, 14);

        ha9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        ha9.setText("jLabel1");
        Panel5.add(ha9);
        ha9.setBounds(260, 510, 30, 14);

        ha10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        ha10.setText("jLabel1");
        Panel5.add(ha10);
        ha10.setBounds(260, 550, 30, 14);

        ha11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        ha11.setText("jLabel1");
        Panel5.add(ha11);
        ha11.setBounds(260, 590, 30, 14);

        ha12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        ha12.setText("jLabel1");
        Panel5.add(ha12);
        ha12.setBounds(260, 630, 30, 14);

        vb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb1);
        vb1.setBounds(310, 242, 10, 30);

        vb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb2);
        vb2.setBounds(343, 242, 10, 30);

        hb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb1.setText("jLabel1");
        Panel5.add(hb1);
        hb1.setBounds(310, 235, 34, 14);

        hb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb2.setText("jLabel1");
        Panel5.add(hb2);
        hb2.setBounds(310, 265, 34, 14);

        hb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb3.setText("jLabel1");
        Panel5.add(hb3);
        hb3.setBounds(360, 235, 34, 14);

        vb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb3);
        vb3.setBounds(360, 242, 10, 30);

        vb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb4);
        vb4.setBounds(393, 242, 10, 30);

        hb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb4.setText("jLabel1");
        Panel5.add(hb4);
        hb4.setBounds(360, 265, 34, 14);

        hb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb5.setText("jLabel1");
        Panel5.add(hb5);
        hb5.setBounds(410, 235, 34, 14);

        vb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb5);
        vb5.setBounds(410, 243, 10, 30);

        vb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb6);
        vb6.setBounds(443, 243, 10, 30);

        hb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb6.setText("jLabel1");
        Panel5.add(hb6);
        hb6.setBounds(410, 265, 34, 14);

        vb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb7);
        vb7.setBounds(460, 243, 10, 30);

        vb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb8);
        vb8.setBounds(493, 243, 10, 30);

        hb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb7.setText("jLabel1");
        Panel5.add(hb7);
        hb7.setBounds(460, 235, 34, 14);

        hb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb8.setText("jLabel1");
        Panel5.add(hb8);
        hb8.setBounds(460, 265, 34, 14);

        hb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb9.setText("jLabel1");
        Panel5.add(hb9);
        hb9.setBounds(510, 235, 34, 14);

        vb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb9);
        vb9.setBounds(510, 243, 10, 30);

        vb10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb10);
        vb10.setBounds(543, 243, 10, 30);

        hb10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb10.setText("jLabel1");
        Panel5.add(hb10);
        hb10.setBounds(510, 265, 34, 14);

        hb11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb11.setText("jLabel1");
        Panel5.add(hb11);
        hb11.setBounds(560, 235, 34, 14);

        vb11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb11);
        vb11.setBounds(560, 243, 10, 30);

        vb12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb12);
        vb12.setBounds(593, 243, 10, 30);

        hb12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb12.setText("jLabel1");
        Panel5.add(hb12);
        hb12.setBounds(560, 265, 34, 14);

        vb13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb13);
        vb13.setBounds(310, 288, 10, 30);

        vb14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb14);
        vb14.setBounds(343, 288, 10, 30);

        hb13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb13.setText("jLabel1");
        Panel5.add(hb13);
        hb13.setBounds(310, 280, 34, 14);

        hb14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb14.setText("jLabel1");
        Panel5.add(hb14);
        hb14.setBounds(310, 310, 34, 14);

        hb15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb15.setText("jLabel1");
        Panel5.add(hb15);
        hb15.setBounds(360, 280, 34, 14);

        vb15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb15);
        vb15.setBounds(360, 288, 10, 30);

        vb16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb16);
        vb16.setBounds(393, 288, 10, 30);

        hb16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb16.setText("jLabel1");
        Panel5.add(hb16);
        hb16.setBounds(360, 310, 34, 14);

        hb17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb17.setText("jLabel1");
        Panel5.add(hb17);
        hb17.setBounds(410, 280, 34, 14);

        vb17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb17);
        vb17.setBounds(410, 288, 10, 30);

        vb18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb18);
        vb18.setBounds(443, 288, 10, 30);

        hb18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb18.setText("jLabel1");
        Panel5.add(hb18);
        hb18.setBounds(410, 310, 34, 14);

        vb19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb19);
        vb19.setBounds(460, 288, 10, 30);

        vb20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb20);
        vb20.setBounds(493, 288, 10, 30);

        hb19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb19.setText("jLabel1");
        Panel5.add(hb19);
        hb19.setBounds(460, 280, 34, 14);

        hb20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb20.setText("jLabel1");
        Panel5.add(hb20);
        hb20.setBounds(460, 310, 34, 14);

        hb21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb21.setText("jLabel1");
        Panel5.add(hb21);
        hb21.setBounds(510, 280, 34, 14);

        vb21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb21);
        vb21.setBounds(510, 288, 10, 30);

        vb22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb22);
        vb22.setBounds(543, 288, 10, 30);

        hb22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb22.setText("jLabel1");
        Panel5.add(hb22);
        hb22.setBounds(510, 310, 34, 14);

        hb23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb23.setText("jLabel1");
        Panel5.add(hb23);
        hb23.setBounds(560, 280, 34, 14);

        vb23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb23);
        vb23.setBounds(560, 288, 10, 30);

        vb24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb24);
        vb24.setBounds(593, 288, 10, 30);

        hb24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb24.setText("jLabel1");
        Panel5.add(hb24);
        hb24.setBounds(560, 310, 34, 14);

        vb25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb25);
        vb25.setBounds(310, 327, 10, 30);

        vb26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb26);
        vb26.setBounds(343, 327, 10, 30);

        hb25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb25.setText("jLabel1");
        Panel5.add(hb25);
        hb25.setBounds(310, 320, 34, 14);

        hb26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb26.setText("jLabel1");
        Panel5.add(hb26);
        hb26.setBounds(310, 350, 34, 14);

        hb27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb27.setText("jLabel1");
        Panel5.add(hb27);
        hb27.setBounds(360, 320, 34, 14);

        vb27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb27);
        vb27.setBounds(360, 327, 10, 30);

        vb28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb28);
        vb28.setBounds(393, 327, 10, 30);

        hb28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb28.setText("jLabel1");
        Panel5.add(hb28);
        hb28.setBounds(360, 350, 34, 14);

        hb29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb29.setText("jLabel1");
        Panel5.add(hb29);
        hb29.setBounds(410, 320, 34, 14);

        vb29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb29);
        vb29.setBounds(410, 327, 10, 30);

        vb30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb30);
        vb30.setBounds(443, 327, 10, 30);

        hb30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb30.setText("jLabel1");
        Panel5.add(hb30);
        hb30.setBounds(410, 350, 34, 14);

        vb31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb31);
        vb31.setBounds(460, 327, 10, 30);

        vb32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb32);
        vb32.setBounds(493, 327, 10, 30);

        hb31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb31.setText("jLabel1");
        Panel5.add(hb31);
        hb31.setBounds(460, 320, 34, 14);

        hb32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb32.setText("jLabel1");
        Panel5.add(hb32);
        hb32.setBounds(460, 350, 34, 14);

        hb33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb33.setText("jLabel1");
        Panel5.add(hb33);
        hb33.setBounds(510, 320, 34, 14);

        vb33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb33);
        vb33.setBounds(510, 327, 10, 30);

        vb34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb34);
        vb34.setBounds(543, 327, 10, 30);

        hb34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb34.setText("jLabel1");
        Panel5.add(hb34);
        hb34.setBounds(510, 350, 34, 14);

        hb35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb35.setText("jLabel1");
        Panel5.add(hb35);
        hb35.setBounds(560, 320, 34, 14);

        vb35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb35);
        vb35.setBounds(560, 327, 10, 30);

        vb36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb36);
        vb36.setBounds(593, 327, 10, 30);

        hb36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb36.setText("jLabel1");
        Panel5.add(hb36);
        hb36.setBounds(560, 350, 34, 14);

        vb37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb37);
        vb37.setBounds(310, 366, 10, 30);

        vb38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb38);
        vb38.setBounds(343, 366, 10, 30);

        hb37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb37.setText("jLabel1");
        Panel5.add(hb37);
        hb37.setBounds(310, 359, 34, 14);

        hb38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb38.setText("jLabel1");
        Panel5.add(hb38);
        hb38.setBounds(310, 389, 34, 14);

        hb39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb39.setText("jLabel1");
        Panel5.add(hb39);
        hb39.setBounds(360, 359, 34, 14);

        vb39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb39);
        vb39.setBounds(360, 366, 10, 30);

        vb40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb40);
        vb40.setBounds(393, 366, 10, 30);

        hb40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb40.setText("jLabel1");
        Panel5.add(hb40);
        hb40.setBounds(360, 389, 34, 14);

        hb41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb41.setText("jLabel1");
        Panel5.add(hb41);
        hb41.setBounds(410, 359, 34, 14);

        vb41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb41);
        vb41.setBounds(410, 366, 10, 30);

        vb42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb42);
        vb42.setBounds(443, 366, 10, 30);

        hb42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb42.setText("jLabel1");
        Panel5.add(hb42);
        hb42.setBounds(410, 389, 34, 14);

        vb43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb43);
        vb43.setBounds(460, 366, 10, 30);

        vb44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb44);
        vb44.setBounds(493, 366, 10, 30);

        hb43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb43.setText("jLabel1");
        Panel5.add(hb43);
        hb43.setBounds(460, 359, 34, 14);

        hb44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb44.setText("jLabel1");
        Panel5.add(hb44);
        hb44.setBounds(460, 389, 34, 14);

        hb45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb45.setText("jLabel1");
        Panel5.add(hb45);
        hb45.setBounds(510, 359, 34, 14);

        vb45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb45);
        vb45.setBounds(510, 366, 10, 30);

        vb46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb46);
        vb46.setBounds(543, 366, 10, 30);

        hb46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb46.setText("jLabel1");
        Panel5.add(hb46);
        hb46.setBounds(510, 389, 34, 14);

        hb47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb47.setText("jLabel1");
        Panel5.add(hb47);
        hb47.setBounds(560, 359, 34, 14);

        vb47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb47);
        vb47.setBounds(560, 366, 10, 30);

        vb48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb48);
        vb48.setBounds(593, 366, 10, 30);

        hb48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb48.setText("jLabel1");
        Panel5.add(hb48);
        hb48.setBounds(560, 389, 34, 14);

        vb49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb49);
        vb49.setBounds(310, 410, 10, 30);

        vb50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb50);
        vb50.setBounds(343, 410, 10, 30);

        hb49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb49.setText("jLabel1");
        Panel5.add(hb49);
        hb49.setBounds(310, 402, 34, 14);

        hb50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb50.setText("jLabel1");
        Panel5.add(hb50);
        hb50.setBounds(310, 432, 34, 14);

        hb51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb51.setText("jLabel1");
        Panel5.add(hb51);
        hb51.setBounds(360, 402, 34, 14);

        vb51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb51);
        vb51.setBounds(360, 410, 10, 30);

        vb52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb52);
        vb52.setBounds(393, 410, 10, 30);

        hb52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb52.setText("jLabel1");
        Panel5.add(hb52);
        hb52.setBounds(360, 432, 34, 14);

        hb53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb53.setText("jLabel1");
        Panel5.add(hb53);
        hb53.setBounds(410, 402, 34, 14);

        vb53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb53);
        vb53.setBounds(410, 410, 10, 30);

        vb54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb54);
        vb54.setBounds(443, 410, 10, 30);

        hb54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb54.setText("jLabel1");
        Panel5.add(hb54);
        hb54.setBounds(410, 432, 34, 14);

        vb55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb55);
        vb55.setBounds(460, 410, 10, 30);

        vb56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb56);
        vb56.setBounds(493, 410, 10, 30);

        hb55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb55.setText("jLabel1");
        Panel5.add(hb55);
        hb55.setBounds(460, 402, 34, 14);

        hb56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb56.setText("jLabel1");
        Panel5.add(hb56);
        hb56.setBounds(460, 432, 34, 14);

        hb57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb57.setText("jLabel1");
        Panel5.add(hb57);
        hb57.setBounds(510, 402, 34, 14);

        vb57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb57);
        vb57.setBounds(510, 410, 10, 30);

        vb58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb58);
        vb58.setBounds(543, 410, 10, 30);

        hb58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb58.setText("jLabel1");
        Panel5.add(hb58);
        hb58.setBounds(510, 432, 34, 14);

        hb59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb59.setText("jLabel1");
        Panel5.add(hb59);
        hb59.setBounds(560, 402, 34, 14);

        vb59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb59);
        vb59.setBounds(560, 410, 10, 30);

        vb60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb60);
        vb60.setBounds(593, 410, 10, 30);

        hb60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb60.setText("jLabel1");
        Panel5.add(hb60);
        hb60.setBounds(560, 432, 34, 14);

        vb61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb61);
        vb61.setBounds(310, 450, 10, 30);

        vb62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb62);
        vb62.setBounds(343, 450, 10, 30);

        hb61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb61.setText("jLabel1");
        Panel5.add(hb61);
        hb61.setBounds(310, 442, 34, 14);

        hb62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb62.setText("jLabel1");
        Panel5.add(hb62);
        hb62.setBounds(310, 472, 34, 14);

        hb63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb63.setText("jLabel1");
        Panel5.add(hb63);
        hb63.setBounds(360, 442, 34, 14);

        vb63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb63);
        vb63.setBounds(360, 450, 10, 30);

        vb64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb64);
        vb64.setBounds(393, 450, 10, 30);

        hb64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb64.setText("jLabel1");
        Panel5.add(hb64);
        hb64.setBounds(360, 472, 34, 14);

        hb65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb65.setText("jLabel1");
        Panel5.add(hb65);
        hb65.setBounds(410, 442, 34, 14);

        vb65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb65);
        vb65.setBounds(410, 450, 10, 30);

        vb66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb66);
        vb66.setBounds(443, 450, 10, 30);

        hb66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb66.setText("jLabel1");
        Panel5.add(hb66);
        hb66.setBounds(410, 472, 34, 14);

        vb67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb67);
        vb67.setBounds(460, 450, 10, 30);

        vb68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb68);
        vb68.setBounds(493, 450, 10, 30);

        hb67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb67.setText("jLabel1");
        Panel5.add(hb67);
        hb67.setBounds(460, 442, 34, 14);

        hb68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb68.setText("jLabel1");
        Panel5.add(hb68);
        hb68.setBounds(460, 472, 34, 14);

        hb69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb69.setText("jLabel1");
        Panel5.add(hb69);
        hb69.setBounds(510, 442, 34, 14);

        vb69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb69);
        vb69.setBounds(510, 450, 10, 30);

        vb70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb70);
        vb70.setBounds(543, 450, 10, 30);

        hb70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb70.setText("jLabel1");
        Panel5.add(hb70);
        hb70.setBounds(510, 472, 34, 14);

        hb71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb71.setText("jLabel1");
        Panel5.add(hb71);
        hb71.setBounds(560, 442, 34, 14);

        vb71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb71);
        vb71.setBounds(560, 450, 10, 30);

        vb72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb72);
        vb72.setBounds(593, 450, 10, 30);

        hb72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb72.setText("jLabel1");
        Panel5.add(hb72);
        hb72.setBounds(560, 472, 34, 14);

        vb73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb73);
        vb73.setBounds(310, 490, 10, 30);

        vb74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb74);
        vb74.setBounds(343, 490, 10, 30);

        hb73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb73.setText("jLabel1");
        Panel5.add(hb73);
        hb73.setBounds(310, 483, 34, 14);

        hb74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb74.setText("jLabel1");
        Panel5.add(hb74);
        hb74.setBounds(310, 513, 34, 14);

        hb75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb75.setText("jLabel1");
        Panel5.add(hb75);
        hb75.setBounds(360, 483, 34, 14);

        vb75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb75);
        vb75.setBounds(360, 490, 10, 30);

        vb76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb76);
        vb76.setBounds(393, 490, 10, 30);

        hb76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb76.setText("jLabel1");
        Panel5.add(hb76);
        hb76.setBounds(360, 513, 34, 14);

        hb77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb77.setText("jLabel1");
        Panel5.add(hb77);
        hb77.setBounds(410, 483, 34, 14);

        vb77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb77);
        vb77.setBounds(410, 490, 10, 30);

        vb78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb78);
        vb78.setBounds(443, 490, 10, 30);

        hb78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb78.setText("jLabel1");
        Panel5.add(hb78);
        hb78.setBounds(410, 513, 34, 14);

        vb79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb79);
        vb79.setBounds(460, 490, 10, 30);

        vb80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb80);
        vb80.setBounds(493, 490, 10, 30);

        hb79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb79.setText("jLabel1");
        Panel5.add(hb79);
        hb79.setBounds(460, 483, 34, 14);

        hb80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb80.setText("jLabel1");
        Panel5.add(hb80);
        hb80.setBounds(460, 513, 34, 14);

        hb81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb81.setText("jLabel1");
        Panel5.add(hb81);
        hb81.setBounds(510, 483, 34, 14);

        vb81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb81);
        vb81.setBounds(510, 490, 10, 30);

        vb82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb82);
        vb82.setBounds(543, 490, 10, 30);

        hb82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb82.setText("jLabel1");
        Panel5.add(hb82);
        hb82.setBounds(510, 513, 34, 14);

        hb83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb83.setText("jLabel1");
        Panel5.add(hb83);
        hb83.setBounds(560, 483, 34, 14);

        vb83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb83);
        vb83.setBounds(560, 490, 10, 30);

        vb84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb84);
        vb84.setBounds(593, 490, 10, 30);

        hb84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb84.setText("jLabel1");
        Panel5.add(hb84);
        hb84.setBounds(560, 513, 34, 14);

        vb85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb85);
        vb85.setBounds(310, 530, 10, 30);

        vb86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb86);
        vb86.setBounds(343, 530, 10, 30);

        hb85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb85.setText("jLabel1");
        Panel5.add(hb85);
        hb85.setBounds(310, 523, 34, 14);

        hb86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb86.setText("jLabel1");
        Panel5.add(hb86);
        hb86.setBounds(310, 553, 34, 14);

        hb87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb87.setText("jLabel1");
        Panel5.add(hb87);
        hb87.setBounds(360, 523, 34, 14);

        vb87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb87);
        vb87.setBounds(360, 530, 10, 30);

        vb88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb88);
        vb88.setBounds(393, 530, 10, 30);

        hb88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb88.setText("jLabel1");
        Panel5.add(hb88);
        hb88.setBounds(360, 553, 34, 14);

        hb89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb89.setText("jLabel1");
        Panel5.add(hb89);
        hb89.setBounds(410, 523, 34, 14);

        vb89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb89);
        vb89.setBounds(410, 530, 10, 30);

        vb90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb90);
        vb90.setBounds(443, 530, 10, 30);

        hb90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb90.setText("jLabel1");
        Panel5.add(hb90);
        hb90.setBounds(410, 553, 34, 14);

        vb91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb91);
        vb91.setBounds(460, 530, 10, 30);

        vb92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb92);
        vb92.setBounds(493, 530, 10, 30);

        hb91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb91.setText("jLabel1");
        Panel5.add(hb91);
        hb91.setBounds(460, 523, 34, 14);

        hb92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb92.setText("jLabel1");
        Panel5.add(hb92);
        hb92.setBounds(460, 553, 34, 14);

        hb93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb93.setText("jLabel1");
        Panel5.add(hb93);
        hb93.setBounds(510, 523, 34, 14);

        vb93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb93);
        vb93.setBounds(510, 530, 10, 30);

        vb94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb94);
        vb94.setBounds(543, 530, 10, 30);

        hb94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb94.setText("jLabel1");
        Panel5.add(hb94);
        hb94.setBounds(510, 553, 34, 14);

        hb95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb95.setText("jLabel1");
        Panel5.add(hb95);
        hb95.setBounds(560, 523, 34, 14);

        vb95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb95);
        vb95.setBounds(560, 530, 10, 30);

        vb96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb96);
        vb96.setBounds(593, 530, 10, 30);

        hb96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb96.setText("jLabel1");
        Panel5.add(hb96);
        hb96.setBounds(560, 553, 34, 14);

        vb97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb97);
        vb97.setBounds(310, 570, 10, 30);

        vb98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb98);
        vb98.setBounds(343, 570, 10, 30);

        hb97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb97.setText("jLabel1");
        Panel5.add(hb97);
        hb97.setBounds(310, 563, 34, 14);

        hb98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb98.setText("jLabel1");
        Panel5.add(hb98);
        hb98.setBounds(310, 593, 34, 14);

        hb99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb99.setText("jLabel1");
        Panel5.add(hb99);
        hb99.setBounds(360, 563, 34, 14);

        vb99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb99);
        vb99.setBounds(360, 570, 10, 30);

        vb100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb100);
        vb100.setBounds(393, 570, 10, 30);

        hb100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb100.setText("jLabel1");
        Panel5.add(hb100);
        hb100.setBounds(360, 593, 34, 14);

        hb101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb101.setText("jLabel1");
        Panel5.add(hb101);
        hb101.setBounds(410, 563, 34, 14);

        vb101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb101);
        vb101.setBounds(410, 570, 10, 30);

        vb102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb102);
        vb102.setBounds(443, 570, 10, 30);

        hb102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb102.setText("jLabel1");
        Panel5.add(hb102);
        hb102.setBounds(410, 593, 34, 14);

        vb103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb103);
        vb103.setBounds(460, 570, 10, 30);

        vb104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb104);
        vb104.setBounds(493, 570, 10, 30);

        hb103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb103.setText("jLabel1");
        Panel5.add(hb103);
        hb103.setBounds(460, 563, 34, 14);

        hb104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb104.setText("jLabel1");
        Panel5.add(hb104);
        hb104.setBounds(460, 593, 34, 14);

        hb105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb105.setText("jLabel1");
        Panel5.add(hb105);
        hb105.setBounds(510, 563, 34, 14);

        vb105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb105);
        vb105.setBounds(510, 570, 10, 30);

        vb106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb106);
        vb106.setBounds(543, 570, 10, 30);

        hb106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb106.setText("jLabel1");
        Panel5.add(hb106);
        hb106.setBounds(510, 593, 34, 14);

        hb107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb107.setText("jLabel1");
        Panel5.add(hb107);
        hb107.setBounds(560, 563, 34, 14);

        vb107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb107);
        vb107.setBounds(560, 570, 10, 30);

        vb108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb108);
        vb108.setBounds(593, 570, 10, 30);

        hb108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb108.setText("jLabel1");
        Panel5.add(hb108);
        hb108.setBounds(560, 593, 34, 14);

        vb109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb109);
        vb109.setBounds(310, 610, 10, 30);

        vb110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb110);
        vb110.setBounds(343, 610, 10, 30);

        hb109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb109.setText("jLabel1");
        Panel5.add(hb109);
        hb109.setBounds(310, 603, 34, 14);

        hb110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb110.setText("jLabel1");
        Panel5.add(hb110);
        hb110.setBounds(310, 633, 34, 14);

        hb111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb111.setText("jLabel1");
        Panel5.add(hb111);
        hb111.setBounds(360, 603, 34, 14);

        vb111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb111);
        vb111.setBounds(360, 610, 10, 30);

        vb112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb112);
        vb112.setBounds(393, 610, 10, 30);

        hb112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb112.setText("jLabel1");
        Panel5.add(hb112);
        hb112.setBounds(360, 633, 34, 14);

        hb113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb113.setText("jLabel1");
        Panel5.add(hb113);
        hb113.setBounds(410, 603, 34, 14);

        vb113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb113);
        vb113.setBounds(410, 610, 10, 30);

        vb114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb114);
        vb114.setBounds(443, 610, 10, 30);

        hb114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb114.setText("jLabel1");
        Panel5.add(hb114);
        hb114.setBounds(410, 633, 34, 14);

        vb115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb115);
        vb115.setBounds(460, 610, 10, 30);

        vb116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb116);
        vb116.setBounds(493, 610, 10, 30);

        hb115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb115.setText("jLabel1");
        Panel5.add(hb115);
        hb115.setBounds(460, 603, 34, 14);

        hb116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb116.setText("jLabel1");
        Panel5.add(hb116);
        hb116.setBounds(460, 633, 34, 14);

        hb117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb117.setText("jLabel1");
        Panel5.add(hb117);
        hb117.setBounds(510, 603, 34, 14);

        vb117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb117);
        vb117.setBounds(510, 610, 10, 30);

        vb118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb118);
        vb118.setBounds(543, 610, 10, 30);

        hb118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb118.setText("jLabel1");
        Panel5.add(hb118);
        hb118.setBounds(510, 633, 34, 14);

        hb119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb119.setText("jLabel1");
        Panel5.add(hb119);
        hb119.setBounds(560, 603, 34, 14);

        vb119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb119);
        vb119.setBounds(560, 610, 10, 30);

        vb120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(vb120);
        vb120.setBounds(593, 610, 10, 30);

        hb120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        hb120.setText("jLabel1");
        Panel5.add(hb120);
        hb120.setBounds(560, 633, 34, 14);

        Y4.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        Y4.setForeground(new java.awt.Color(153, 0, 0));
        Y4.setText("Y :");
        Panel5.add(Y4);
        Y4.setBounds(780, 240, 60, 50);

        T4.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        T4.setForeground(new java.awt.Color(153, 0, 0));
        T4.setText("T :");
        Panel5.add(T4);
        T4.setBounds(780, 160, 60, 50);

        X4.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        X4.setForeground(new java.awt.Color(153, 0, 0));
        X4.setText("X :");
        Panel5.add(X4);
        X4.setBounds(780, 200, 60, 50);

        yno2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        yno2.setForeground(new java.awt.Color(0, 153, 153));
        yno2.setText("00");
        Panel5.add(yno2);
        yno2.setBounds(830, 230, 40, 70);

        tno2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        tno2.setForeground(new java.awt.Color(0, 153, 153));
        tno2.setText("00");
        Panel5.add(tno2);
        tno2.setBounds(830, 150, 40, 70);

        xno2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        xno2.setForeground(new java.awt.Color(0, 153, 153));
        xno2.setText("00");
        Panel5.add(xno2);
        xno2.setBounds(830, 190, 40, 70);

        sn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sn7.setForeground(new java.awt.Color(0, 153, 153));
        sn7.setText("00");
        Panel5.add(sn7);
        sn7.setBounds(670, 400, 50, 80);

        sn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sn8.setForeground(new java.awt.Color(0, 153, 153));
        sn8.setText("00");
        Panel5.add(sn8);
        sn8.setBounds(760, 400, 50, 80);

        sn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sn9.setForeground(new java.awt.Color(0, 153, 153));
        sn9.setText("00");
        Panel5.add(sn9);
        sn9.setBounds(870, 400, 100, 80);

        op5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        op5.setForeground(new java.awt.Color(153, 0, 153));
        op5.setText("-");
        Panel5.add(op5);
        op5.setBounds(730, 400, 40, 80);

        op6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        op6.setForeground(new java.awt.Color(153, 0, 153));
        op6.setText("=");
        Panel5.add(op6);
        op6.setBounds(820, 400, 60, 80);

        Y5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Y5.setForeground(new java.awt.Color(153, 0, 0));
        Y5.setText("Y ");
        Panel5.add(Y5);
        Y5.setBounds(880, 450, 60, 50);

        X5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        X5.setForeground(new java.awt.Color(153, 0, 0));
        X5.setText("X ");
        Panel5.add(X5);
        X5.setBounds(770, 450, 60, 50);

        T5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        T5.setForeground(new java.awt.Color(153, 0, 0));
        T5.setText("T ");
        Panel5.add(T5);
        T5.setBounds(680, 450, 60, 50);

        n37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n37.setForeground(new java.awt.Color(0, 153, 153));
        n37.setText("00");
        Panel5.add(n37);
        n37.setBounds(317, 292, 30, 22);

        n38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n38.setForeground(new java.awt.Color(0, 153, 153));
        n38.setText("00");
        Panel5.add(n38);
        n38.setBounds(367, 292, 30, 22);

        n39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n39.setForeground(new java.awt.Color(0, 153, 153));
        n39.setText("00");
        Panel5.add(n39);
        n39.setBounds(417, 292, 30, 22);

        n40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n40.setForeground(new java.awt.Color(0, 153, 153));
        n40.setText("00");
        Panel5.add(n40);
        n40.setBounds(467, 292, 30, 22);

        n41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n41.setForeground(new java.awt.Color(0, 153, 153));
        n41.setText("00");
        Panel5.add(n41);
        n41.setBounds(517, 292, 30, 22);

        n42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n42.setForeground(new java.awt.Color(0, 153, 153));
        n42.setText("00");
        Panel5.add(n42);
        n42.setBounds(567, 292, 30, 22);

        n43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n43.setForeground(new java.awt.Color(0, 153, 153));
        n43.setText("00");
        Panel5.add(n43);
        n43.setBounds(317, 332, 30, 22);

        n44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n44.setForeground(new java.awt.Color(0, 153, 153));
        n44.setText("00");
        Panel5.add(n44);
        n44.setBounds(367, 332, 30, 22);

        n45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n45.setForeground(new java.awt.Color(0, 153, 153));
        n45.setText("00");
        Panel5.add(n45);
        n45.setBounds(417, 332, 30, 22);

        n46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n46.setForeground(new java.awt.Color(0, 153, 153));
        n46.setText("00");
        Panel5.add(n46);
        n46.setBounds(467, 332, 30, 22);

        n47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n47.setForeground(new java.awt.Color(0, 153, 153));
        n47.setText("00");
        Panel5.add(n47);
        n47.setBounds(517, 332, 30, 22);

        n48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n48.setForeground(new java.awt.Color(0, 153, 153));
        n48.setText("00");
        Panel5.add(n48);
        n48.setBounds(567, 332, 30, 22);

        n49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n49.setForeground(new java.awt.Color(0, 153, 153));
        n49.setText("00");
        Panel5.add(n49);
        n49.setBounds(317, 372, 30, 22);

        n50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n50.setForeground(new java.awt.Color(0, 153, 153));
        n50.setText("00");
        Panel5.add(n50);
        n50.setBounds(367, 372, 30, 22);

        n51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n51.setForeground(new java.awt.Color(0, 153, 153));
        n51.setText("00");
        Panel5.add(n51);
        n51.setBounds(417, 372, 30, 22);

        n52.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n52.setForeground(new java.awt.Color(0, 153, 153));
        n52.setText("00");
        Panel5.add(n52);
        n52.setBounds(467, 372, 30, 22);

        n53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n53.setForeground(new java.awt.Color(0, 153, 153));
        n53.setText("00");
        Panel5.add(n53);
        n53.setBounds(517, 372, 30, 22);

        n54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n54.setForeground(new java.awt.Color(0, 153, 153));
        n54.setText("00");
        Panel5.add(n54);
        n54.setBounds(567, 372, 30, 22);

        n55.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n55.setForeground(new java.awt.Color(0, 153, 153));
        n55.setText("00");
        Panel5.add(n55);
        n55.setBounds(317, 412, 30, 22);

        n56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n56.setForeground(new java.awt.Color(0, 153, 153));
        n56.setText("00");
        Panel5.add(n56);
        n56.setBounds(367, 412, 30, 22);

        n57.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n57.setForeground(new java.awt.Color(0, 153, 153));
        n57.setText("00");
        Panel5.add(n57);
        n57.setBounds(417, 412, 30, 22);

        n58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n58.setForeground(new java.awt.Color(0, 153, 153));
        n58.setText("00");
        Panel5.add(n58);
        n58.setBounds(467, 412, 30, 22);

        n59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n59.setForeground(new java.awt.Color(0, 153, 153));
        n59.setText("00");
        Panel5.add(n59);
        n59.setBounds(517, 412, 30, 22);

        n60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n60.setForeground(new java.awt.Color(0, 153, 153));
        n60.setText("00");
        Panel5.add(n60);
        n60.setBounds(567, 412, 30, 22);

        n61.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n61.setForeground(new java.awt.Color(0, 153, 153));
        n61.setText("00");
        Panel5.add(n61);
        n61.setBounds(317, 452, 30, 22);

        n62.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n62.setForeground(new java.awt.Color(0, 153, 153));
        n62.setText("00");
        Panel5.add(n62);
        n62.setBounds(367, 452, 30, 22);

        n63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n63.setForeground(new java.awt.Color(0, 153, 153));
        n63.setText("00");
        Panel5.add(n63);
        n63.setBounds(417, 452, 30, 22);

        n64.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n64.setForeground(new java.awt.Color(0, 153, 153));
        n64.setText("00");
        Panel5.add(n64);
        n64.setBounds(467, 452, 30, 22);

        n65.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n65.setForeground(new java.awt.Color(0, 153, 153));
        n65.setText("00");
        Panel5.add(n65);
        n65.setBounds(517, 452, 30, 22);

        n66.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n66.setForeground(new java.awt.Color(0, 153, 153));
        n66.setText("00");
        Panel5.add(n66);
        n66.setBounds(567, 452, 30, 22);

        n67.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n67.setForeground(new java.awt.Color(0, 153, 153));
        n67.setText("00");
        Panel5.add(n67);
        n67.setBounds(317, 492, 30, 22);

        n68.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n68.setForeground(new java.awt.Color(0, 153, 153));
        n68.setText("00");
        Panel5.add(n68);
        n68.setBounds(367, 492, 30, 22);

        n69.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n69.setForeground(new java.awt.Color(0, 153, 153));
        n69.setText("00");
        Panel5.add(n69);
        n69.setBounds(417, 492, 30, 22);

        n70.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n70.setForeground(new java.awt.Color(0, 153, 153));
        n70.setText("00");
        Panel5.add(n70);
        n70.setBounds(467, 492, 30, 22);

        n71.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n71.setForeground(new java.awt.Color(0, 153, 153));
        n71.setText("00");
        Panel5.add(n71);
        n71.setBounds(517, 492, 30, 22);

        n72.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n72.setForeground(new java.awt.Color(0, 153, 153));
        n72.setText("00");
        Panel5.add(n72);
        n72.setBounds(567, 492, 30, 22);

        n73.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n73.setForeground(new java.awt.Color(0, 153, 153));
        n73.setText("00");
        Panel5.add(n73);
        n73.setBounds(317, 532, 30, 22);

        n74.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n74.setForeground(new java.awt.Color(0, 153, 153));
        n74.setText("00");
        Panel5.add(n74);
        n74.setBounds(367, 532, 30, 22);

        n75.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n75.setForeground(new java.awt.Color(0, 153, 153));
        n75.setText("00");
        Panel5.add(n75);
        n75.setBounds(417, 532, 30, 22);

        n76.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n76.setForeground(new java.awt.Color(0, 153, 153));
        n76.setText("00");
        Panel5.add(n76);
        n76.setBounds(467, 532, 30, 22);

        n77.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n77.setForeground(new java.awt.Color(0, 153, 153));
        n77.setText("00");
        Panel5.add(n77);
        n77.setBounds(517, 532, 30, 22);

        n78.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n78.setForeground(new java.awt.Color(0, 153, 153));
        n78.setText("00");
        Panel5.add(n78);
        n78.setBounds(567, 532, 30, 22);

        n79.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n79.setForeground(new java.awt.Color(0, 153, 153));
        n79.setText("00");
        Panel5.add(n79);
        n79.setBounds(317, 572, 30, 22);

        n80.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n80.setForeground(new java.awt.Color(0, 153, 153));
        n80.setText("00");
        Panel5.add(n80);
        n80.setBounds(367, 572, 30, 22);

        n81.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n81.setForeground(new java.awt.Color(0, 153, 153));
        n81.setText("00");
        Panel5.add(n81);
        n81.setBounds(417, 572, 30, 22);

        n82.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n82.setForeground(new java.awt.Color(0, 153, 153));
        n82.setText("00");
        Panel5.add(n82);
        n82.setBounds(467, 572, 30, 22);

        n83.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n83.setForeground(new java.awt.Color(0, 153, 153));
        n83.setText("00");
        Panel5.add(n83);
        n83.setBounds(517, 572, 30, 22);

        n84.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n84.setForeground(new java.awt.Color(0, 153, 153));
        n84.setText("00");
        Panel5.add(n84);
        n84.setBounds(567, 572, 30, 22);

        n85.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n85.setForeground(new java.awt.Color(0, 153, 153));
        n85.setText("00");
        Panel5.add(n85);
        n85.setBounds(317, 612, 30, 22);

        n86.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n86.setForeground(new java.awt.Color(0, 153, 153));
        n86.setText("00");
        Panel5.add(n86);
        n86.setBounds(367, 612, 30, 22);

        n87.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n87.setForeground(new java.awt.Color(0, 153, 153));
        n87.setText("00");
        Panel5.add(n87);
        n87.setBounds(417, 612, 30, 22);

        n88.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n88.setForeground(new java.awt.Color(0, 153, 153));
        n88.setText("00");
        Panel5.add(n88);
        n88.setBounds(467, 612, 30, 22);

        n89.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n89.setForeground(new java.awt.Color(0, 153, 153));
        n89.setText("00");
        Panel5.add(n89);
        n89.setBounds(517, 612, 30, 22);

        n90.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n90.setForeground(new java.awt.Color(0, 153, 153));
        n90.setText("00");
        Panel5.add(n90);
        n90.setBounds(567, 612, 30, 22);

        a8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/darkgreenrot.png"))); // NOI18N
        Panel5.add(a8);
        a8.setBounds(225, 250, 30, 30);

        decide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/tick.png"))); // NOI18N
        Panel5.add(decide2);
        decide2.setBounds(925, 400, 80, 70);

        n91.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n91.setForeground(new java.awt.Color(0, 153, 153));
        n91.setText("00");
        Panel5.add(n91);
        n91.setBounds(1000, 310, 30, 22);

        n92.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n92.setForeground(new java.awt.Color(0, 153, 153));
        n92.setText("00");
        Panel5.add(n92);
        n92.setBounds(1000, 310, 30, 22);

        n93.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n93.setForeground(new java.awt.Color(0, 153, 153));
        n93.setText("00");
        Panel5.add(n93);
        n93.setBounds(1000, 310, 30, 22);

        n94.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n94.setForeground(new java.awt.Color(0, 153, 153));
        n94.setText("00");
        Panel5.add(n94);
        n94.setBounds(1000, 310, 30, 22);

        n95.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n95.setForeground(new java.awt.Color(0, 153, 153));
        n95.setText("00");
        Panel5.add(n95);
        n95.setBounds(1000, 310, 30, 22);

        n96.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n96.setForeground(new java.awt.Color(0, 153, 153));
        n96.setText("00");
        Panel5.add(n96);
        n96.setBounds(1000, 310, 30, 22);

        n97.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n97.setForeground(new java.awt.Color(0, 153, 153));
        n97.setText("00");
        Panel5.add(n97);
        n97.setBounds(1000, 310, 30, 22);

        n98.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n98.setForeground(new java.awt.Color(0, 153, 153));
        n98.setText("00");
        Panel5.add(n98);
        n98.setBounds(1000, 310, 30, 22);

        n99.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n99.setForeground(new java.awt.Color(0, 153, 153));
        n99.setText("00");
        Panel5.add(n99);
        n99.setBounds(1000, 310, 30, 22);

        n100.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n100.setForeground(new java.awt.Color(0, 153, 153));
        n100.setText("00");
        Panel5.add(n100);
        n100.setBounds(1000, 310, 30, 22);

        v23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(v23);
        v23.setBounds(650, 300, 20, 37);

        v24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(v24);
        v24.setBounds(680, 300, 20, 37);

        v25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(v25);
        v25.setBounds(710, 300, 20, 37);

        v26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(v26);
        v26.setBounds(740, 300, 20, 37);

        v27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(v27);
        v27.setBounds(770, 300, 20, 37);

        v28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(v28);
        v28.setBounds(802, 300, 20, 37);

        v29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(v29);
        v29.setBounds(830, 300, 20, 37);

        v30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(v30);
        v30.setBounds(860, 300, 20, 37);

        v31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(v31);
        v31.setBounds(892, 300, 20, 37);

        v32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(v32);
        v32.setBounds(920, 300, 20, 37);

        v33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/v.png"))); // NOI18N
        Panel5.add(v33);
        v33.setBounds(953, 300, 10, 37);

        h41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h41.setText("jLabel1");
        Panel5.add(h41);
        h41.setBounds(650, 292, 34, 14);

        h42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h42.setText("jLabel1");
        Panel5.add(h42);
        h42.setBounds(650, 330, 34, 14);

        h43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h43.setText("jLabel1");
        Panel5.add(h43);
        h43.setBounds(680, 292, 34, 14);

        h44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h44.setText("jLabel1");
        Panel5.add(h44);
        h44.setBounds(680, 330, 34, 14);

        h45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h45.setText("jLabel1");
        Panel5.add(h45);
        h45.setBounds(710, 292, 34, 14);

        h46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h46.setText("jLabel1");
        Panel5.add(h46);
        h46.setBounds(710, 330, 34, 14);

        h47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h47.setText("jLabel1");
        Panel5.add(h47);
        h47.setBounds(740, 330, 34, 14);

        h48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h48.setText("jLabel1");
        Panel5.add(h48);
        h48.setBounds(740, 292, 34, 14);

        h49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h49.setText("jLabel1");
        Panel5.add(h49);
        h49.setBounds(770, 292, 34, 14);

        h50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h50.setText("jLabel1");
        Panel5.add(h50);
        h50.setBounds(770, 330, 34, 14);

        h51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h51.setText("jLabel1");
        Panel5.add(h51);
        h51.setBounds(800, 292, 34, 14);

        h52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h52.setText("jLabel1");
        Panel5.add(h52);
        h52.setBounds(800, 330, 34, 14);

        h53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h53.setText("jLabel1");
        Panel5.add(h53);
        h53.setBounds(830, 330, 34, 14);

        h54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h54.setText("jLabel1");
        Panel5.add(h54);
        h54.setBounds(830, 292, 34, 14);

        h55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h55.setText("jLabel1");
        Panel5.add(h55);
        h55.setBounds(860, 292, 34, 14);

        h56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h56.setText("jLabel1");
        Panel5.add(h56);
        h56.setBounds(860, 330, 34, 14);

        h57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h57.setText("jLabel1");
        Panel5.add(h57);
        h57.setBounds(890, 330, 34, 14);

        h58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h58.setText("jLabel1");
        Panel5.add(h58);
        h58.setBounds(890, 292, 34, 14);

        h59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h59.setText("jLabel1");
        Panel5.add(h59);
        h59.setBounds(920, 292, 34, 14);

        h60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/h.png"))); // NOI18N
        h60.setText("jLabel1");
        Panel5.add(h60);
        h60.setBounds(920, 330, 34, 14);

        a5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/lightgreen.png"))); // NOI18N
        Panel5.add(a5);
        a5.setBounds(620, 340, 30, 30);

        resbox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/resultbox.png"))); // NOI18N
        Panel5.add(resbox2);
        resbox2.setBounds(40, 310, 200, 210);

        reslabel2.setFont(new java.awt.Font("Tekton Pro Cond", 3, 24)); // NOI18N
        reslabel2.setForeground(new java.awt.Color(255, 255, 255));
        reslabel2.setText("Result Sets :");
        Panel5.add(reslabel2);
        reslabel2.setBounds(50, 290, 160, 50);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setOpaque(false);

        ta2.setColumns(20);
        ta2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ta2.setRows(5);
        ta2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ta2.setMaximumSize(new java.awt.Dimension(4, 22));
        jScrollPane4.setViewportView(ta2);

        Panel5.add(jScrollPane4);
        jScrollPane4.setBounds(70, 340, 120, 150);

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/home.png"))); // NOI18N
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                homeMouseReleased(evt);
            }
        });
        Panel5.add(home);
        home.setBounds(910, 600, 60, 70);

        Frame4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/background.png"))); // NOI18N
        Frame4.setOpaque(true);
        Frame4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Frame4MouseMoved(evt);
            }
        });
        Panel5.add(Frame4);
        Frame4.setBounds(0, 0, 1000, 700);

        a6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/darkgreen.png"))); // NOI18N
        Panel5.add(a6);
        a6.setBounds(482, 310, 30, 30);

        nxttxt4.setFont(new java.awt.Font("Segoe UI Mono", 1, 14)); // NOI18N
        nxttxt4.setForeground(new java.awt.Color(51, 102, 0));
        nxttxt4.setText("next");
        nxttxt4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel5.add(nxttxt4);
        nxttxt4.setBounds(915, 627, 40, 30);

        nxt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customs/green.png"))); // NOI18N
        nxt4.setText("Next");
        nxt4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nxt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nxt4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nxt4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nxt4MouseReleased(evt);
            }
        });
        Panel5.add(nxt4);
        nxt4.setBounds(900, 628, 70, 30);

        mainpanel.add(Panel5, "card3");

        getContentPane().add(mainpanel);
        mainpanel.setBounds(0, 0, 1000, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
       this.setState(Hashing.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void MainBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainBarMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MainBarMouseDragged

    private void MainBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainBarMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_MainBarMousePressed

    private void nxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxtMousePressed
       ImageIcon ii=new ImageIcon(getClass().getResource("/customs/greenclk.png"));
       nxt.setIcon(ii);
    }//GEN-LAST:event_nxtMousePressed

    private void nxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxtMouseReleased
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/green.png"));
        nxt.setIcon(ii);
    }//GEN-LAST:event_nxtMouseReleased

    private void nxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxtMouseClicked
        this.add(mainpanel);
        mainpanel.setLayout(card);
        card.next(mainpanel);
        threadi=8;
        txt=new Thread(this);
        txt.start();
    }//GEN-LAST:event_nxtMouseClicked

    private void Close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_Close1MouseClicked

    private void Minimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimize1MouseClicked
        this.setState(Hashing.ICONIFIED);
    }//GEN-LAST:event_Minimize1MouseClicked

    private void MainBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainBar1MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_MainBar1MousePressed

    private void MainBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainBar1MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MainBar1MouseDragged

    private void txtnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumKeyTyped
        i=0;
        nxttxt1.setVisible(false);
        nxt1.setVisible(false);
        jTextField1.setText("");
    }//GEN-LAST:event_txtnumKeyTyped

    private void nxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxt1MouseClicked
        try{
        n=Integer.parseInt(jComboBox1.getSelectedItem().toString());
        sum=Integer.parseInt(jTextField1.getText());
        
        card.next(mainpanel);
        }
        catch(Exception e)
        {
            msg="Please Check the inputs properly";
            speak();
        }
    }//GEN-LAST:event_nxt1MouseClicked

    private void nxt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxt1MousePressed
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/greenclk.png"));
        nxt1.setIcon(ii);
    }//GEN-LAST:event_nxt1MousePressed

    private void nxt1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxt1MouseReleased
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/green.png"));
        nxt1.setIcon(ii);
    }//GEN-LAST:event_nxt1MouseReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        try{
        int g;
        n=Integer.parseInt(jComboBox1.getSelectedItem().toString());
        sum=Integer.parseInt(jTextField1.getText());
        StringTokenizer st=new StringTokenizer(txtnum.getText(),",");
        if(i==0)
        {
            while(st.hasMoreTokens())
            {
                g=Integer.parseInt(st.nextToken());
                if(g>0&&g<100)
                {
                    a[i]=g;
                    i++;
                }
            }
        if(sum<200&&n==i&&sum>0)
        {
            nxttxt1.setVisible(true);
            nxt1.setVisible(true);
        }
        
        else
        {
            i=0;
            nxttxt1.setVisible(false);
            nxt1.setVisible(false);
        }
        }
        }
        catch(Exception e){}
    }//GEN-LAST:event_jTextField1KeyReleased

    private void Frame2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Frame2MouseMoved
       // System.out.println("("+evt.getX()+","+evt.getY()+")");
    }//GEN-LAST:event_Frame2MouseMoved

    private void playMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseReleased
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/green.png"));
        nxt.setIcon(ii);
    }//GEN-LAST:event_playMouseReleased

    private void playMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMousePressed
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/greenclk.png"));
        nxt.setIcon(ii);
    }//GEN-LAST:event_playMousePressed

    private void playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseClicked
        ta.setText("");
        boxvisible();
        numload();
        naivesoln();
    }//GEN-LAST:event_playMouseClicked

    private void MainBar2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainBar2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MainBar2MouseDragged

    private void MainBar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainBar2MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_MainBar2MousePressed

    private void Minimize2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimize2MouseClicked
        this.setState(Hashing.ICONIFIED);
    }//GEN-LAST:event_Minimize2MouseClicked

    private void Close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_Close2MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        i=0;
        nxttxt1.setVisible(false);
        nxt1.setVisible(false);
        jTextField1.setText("");
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void nxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxt2MouseClicked

        time.setVisible(false);
        card.next(mainpanel);
    }//GEN-LAST:event_nxt2MouseClicked

    private void nxt2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxt2MousePressed
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/greenclk.png"));
        nxt2.setIcon(ii);
    }//GEN-LAST:event_nxt2MousePressed

    private void nxt2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxt2MouseReleased
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/green.png"));
        nxt2.setIcon(ii);
    }//GEN-LAST:event_nxt2MouseReleased

    private void Close3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_Close3MouseClicked

    private void Minimize3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimize3MouseClicked
        this.setState(Hashing.ICONIFIED);
    }//GEN-LAST:event_Minimize3MouseClicked

    private void MainBar3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainBar3MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_MainBar3MousePressed

    private void MainBar3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainBar3MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MainBar3MouseDragged

    private void play1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play1MouseClicked
        
        ta1.setText("");
        boxvisible1();
        link=new int[n+1];
        r=new int[n+1];
        r[0]=0;Arrays.fill(link, 0);
        for(i=1;i<n+1;i++)
         {
           r[i]=a[i-1];
         }
        rms(1,n);
        rupdate();
        numload1();
        sortsoln();
       
    }//GEN-LAST:event_play1MouseClicked

    private void play1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_play1MousePressed

    private void play1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_play1MouseReleased

    private void nxt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxt3MouseClicked
        time.setVisible(false);
        card.next(mainpanel);
        
    }//GEN-LAST:event_nxt3MouseClicked

    private void nxt3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxt3MousePressed
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/greenclk.png"));
        nxt3.setIcon(ii);
    }//GEN-LAST:event_nxt3MousePressed

    private void nxt3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxt3MouseReleased
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/green.png"));
        nxt3.setIcon(ii);
    }//GEN-LAST:event_nxt3MouseReleased

    private void Frame3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Frame3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Frame3MouseMoved

    private void Close4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_Close4MouseClicked

    private void Minimize4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimize4MouseClicked
       this.setState(Hashing.ICONIFIED);
    }//GEN-LAST:event_Minimize4MouseClicked

    private void MainBar4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainBar4MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_MainBar4MousePressed

    private void MainBar4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainBar4MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MainBar4MouseDragged

    private void play2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play2MouseClicked
        
        ta2.setText("");
        boxvisible2();
        play2.setVisible(false);
        hashsoln();
    }//GEN-LAST:event_play2MouseClicked

    private void play2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_play2MousePressed

    private void play2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_play2MouseReleased

    private void nxt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxt4MouseClicked
       
        
    }//GEN-LAST:event_nxt4MouseClicked

    private void nxt4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxt4MousePressed
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/greenclk.png"));
        nxt.setIcon(ii);
    }//GEN-LAST:event_nxt4MousePressed

    private void nxt4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxt4MouseReleased
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/green.png"));
        nxt.setIcon(ii);
    }//GEN-LAST:event_nxt4MouseReleased

    private void Frame4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Frame4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Frame4MouseMoved

    private void help2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help2MouseEntered
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/hover.png"));
        help2.setIcon(ii);
        help2pg.setVisible(true);
    }//GEN-LAST:event_help2MouseEntered

    private void help2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help2MouseExited
       ImageIcon ii=new ImageIcon(getClass().getResource("/customs/questionMark2.png"));
        help2.setIcon(ii);
        help2pg.setVisible(false);
    }//GEN-LAST:event_help2MouseExited

    private void help3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help3MouseEntered
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/hover.png"));
        help3.setIcon(ii);
        help2pg1.setVisible(true);
    }//GEN-LAST:event_help3MouseEntered

    private void help3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help3MouseExited
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/questionMark2.png"));
        help3.setIcon(ii);
        help2pg1.setVisible(false);
    }//GEN-LAST:event_help3MouseExited

    private void help4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help4MouseEntered
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/hover.png"));
        help4.setIcon(ii);
        help2pg2.setVisible(true);
    }//GEN-LAST:event_help4MouseEntered

    private void help4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help4MouseExited
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/questionMark2.png"));
        help4.setIcon(ii);
        help2pg2.setVisible(false);
    }//GEN-LAST:event_help4MouseExited

    private void help5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help5MouseEntered
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/hover.png"));
        help5.setIcon(ii);
        help2pg3.setVisible(true);
    }//GEN-LAST:event_help5MouseEntered

    private void help5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help5MouseExited
       ImageIcon ii=new ImageIcon(getClass().getResource("/customs/questionMark2.png"));
        help5.setIcon(ii);
        help2pg3.setVisible(false);
    }//GEN-LAST:event_help5MouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        card.previous(mainpanel);
        card.previous(mainpanel);
        card.previous(mainpanel);
    }//GEN-LAST:event_homeMouseClicked

    private void homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMousePressed
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/homehover.png"));
        home.setIcon(ii);
    }//GEN-LAST:event_homeMousePressed

    private void homeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseReleased
        ImageIcon ii=new ImageIcon(getClass().getResource("/customs/home.png"));
        home.setIcon(ii);
    }//GEN-LAST:event_homeMouseReleased

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
            java.util.logging.Logger.getLogger(Hashing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hashing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hashing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hashing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hashing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Close1;
    private javax.swing.JLabel Close2;
    private javax.swing.JLabel Close3;
    private javax.swing.JLabel Close4;
    private javax.swing.JLabel Frame;
    private javax.swing.JLabel Frame1;
    private javax.swing.JLabel Frame2;
    private javax.swing.JLabel Frame3;
    private javax.swing.JLabel Frame4;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Heading1;
    private javax.swing.JLabel Heading2;
    private javax.swing.JLabel Heading3;
    private javax.swing.JLabel Heading4;
    private javax.swing.JLabel MainBar;
    private javax.swing.JLabel MainBar1;
    private javax.swing.JLabel MainBar2;
    private javax.swing.JLabel MainBar3;
    private javax.swing.JLabel MainBar4;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel Minimize1;
    private javax.swing.JLabel Minimize2;
    private javax.swing.JLabel Minimize3;
    private javax.swing.JLabel Minimize4;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JLabel Prblmstmt1;
    private javax.swing.JLabel Prblmstmt2;
    private javax.swing.JLabel Prblmstmt3;
    private javax.swing.JLabel SubHeading;
    private javax.swing.JLabel SubHeading1;
    private javax.swing.JLabel SubHeading2;
    private javax.swing.JLabel T;
    private javax.swing.JLabel T1;
    private javax.swing.JLabel T2;
    private javax.swing.JLabel T3;
    private javax.swing.JLabel T4;
    private javax.swing.JLabel T5;
    private javax.swing.JLabel X;
    private javax.swing.JLabel X1;
    private javax.swing.JLabel X2;
    private javax.swing.JLabel X3;
    private javax.swing.JLabel X4;
    private javax.swing.JLabel X5;
    private javax.swing.JLabel Y;
    private javax.swing.JLabel Y1;
    private javax.swing.JLabel Y2;
    private javax.swing.JLabel Y3;
    private javax.swing.JLabel Y4;
    private javax.swing.JLabel Y5;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a8;
    private javax.swing.JLabel at1;
    private javax.swing.JLabel at10;
    private javax.swing.JLabel at11;
    private javax.swing.JLabel at12;
    private javax.swing.JLabel at13;
    private javax.swing.JLabel at14;
    private javax.swing.JLabel at15;
    private javax.swing.JLabel at16;
    private javax.swing.JLabel at17;
    private javax.swing.JLabel at18;
    private javax.swing.JLabel at19;
    private javax.swing.JLabel at2;
    private javax.swing.JLabel at20;
    private javax.swing.JLabel at21;
    private javax.swing.JLabel at22;
    private javax.swing.JLabel at23;
    private javax.swing.JLabel at24;
    private javax.swing.JLabel at25;
    private javax.swing.JLabel at26;
    private javax.swing.JLabel at27;
    private javax.swing.JLabel at28;
    private javax.swing.JLabel at29;
    private javax.swing.JLabel at3;
    private javax.swing.JLabel at30;
    private javax.swing.JLabel at31;
    private javax.swing.JLabel at32;
    private javax.swing.JLabel at33;
    private javax.swing.JLabel at34;
    private javax.swing.JLabel at35;
    private javax.swing.JLabel at36;
    private javax.swing.JLabel at37;
    private javax.swing.JLabel at38;
    private javax.swing.JLabel at39;
    private javax.swing.JLabel at4;
    private javax.swing.JLabel at40;
    private javax.swing.JLabel at41;
    private javax.swing.JLabel at42;
    private javax.swing.JLabel at43;
    private javax.swing.JLabel at44;
    private javax.swing.JLabel at45;
    private javax.swing.JLabel at46;
    private javax.swing.JLabel at47;
    private javax.swing.JLabel at48;
    private javax.swing.JLabel at49;
    private javax.swing.JLabel at5;
    private javax.swing.JLabel at50;
    private javax.swing.JLabel at51;
    private javax.swing.JLabel at52;
    private javax.swing.JLabel at53;
    private javax.swing.JLabel at54;
    private javax.swing.JLabel at55;
    private javax.swing.JLabel at56;
    private javax.swing.JLabel at57;
    private javax.swing.JLabel at58;
    private javax.swing.JLabel at59;
    private javax.swing.JLabel at6;
    private javax.swing.JLabel at60;
    private javax.swing.JLabel at7;
    private javax.swing.JLabel at8;
    private javax.swing.JLabel at9;
    private javax.swing.JLabel decide;
    private javax.swing.JLabel decide1;
    private javax.swing.JLabel decide2;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h10;
    private javax.swing.JLabel h11;
    private javax.swing.JLabel h12;
    private javax.swing.JLabel h13;
    private javax.swing.JLabel h14;
    private javax.swing.JLabel h15;
    private javax.swing.JLabel h16;
    private javax.swing.JLabel h17;
    private javax.swing.JLabel h18;
    private javax.swing.JLabel h19;
    private javax.swing.JLabel h2;
    private javax.swing.JLabel h20;
    private javax.swing.JLabel h21;
    private javax.swing.JLabel h22;
    private javax.swing.JLabel h23;
    private javax.swing.JLabel h24;
    private javax.swing.JLabel h25;
    private javax.swing.JLabel h26;
    private javax.swing.JLabel h27;
    private javax.swing.JLabel h28;
    private javax.swing.JLabel h29;
    private javax.swing.JLabel h3;
    private javax.swing.JLabel h30;
    private javax.swing.JLabel h31;
    private javax.swing.JLabel h32;
    private javax.swing.JLabel h33;
    private javax.swing.JLabel h34;
    private javax.swing.JLabel h35;
    private javax.swing.JLabel h36;
    private javax.swing.JLabel h37;
    private javax.swing.JLabel h38;
    private javax.swing.JLabel h39;
    private javax.swing.JLabel h4;
    private javax.swing.JLabel h40;
    private javax.swing.JLabel h41;
    private javax.swing.JLabel h42;
    private javax.swing.JLabel h43;
    private javax.swing.JLabel h44;
    private javax.swing.JLabel h45;
    private javax.swing.JLabel h46;
    private javax.swing.JLabel h47;
    private javax.swing.JLabel h48;
    private javax.swing.JLabel h49;
    private javax.swing.JLabel h5;
    private javax.swing.JLabel h50;
    private javax.swing.JLabel h51;
    private javax.swing.JLabel h52;
    private javax.swing.JLabel h53;
    private javax.swing.JLabel h54;
    private javax.swing.JLabel h55;
    private javax.swing.JLabel h56;
    private javax.swing.JLabel h57;
    private javax.swing.JLabel h58;
    private javax.swing.JLabel h59;
    private javax.swing.JLabel h6;
    private javax.swing.JLabel h60;
    private javax.swing.JLabel h7;
    private javax.swing.JLabel h8;
    private javax.swing.JLabel h9;
    private javax.swing.JLabel ha1;
    private javax.swing.JLabel ha10;
    private javax.swing.JLabel ha11;
    private javax.swing.JLabel ha12;
    private javax.swing.JLabel ha2;
    private javax.swing.JLabel ha3;
    private javax.swing.JLabel ha4;
    private javax.swing.JLabel ha5;
    private javax.swing.JLabel ha6;
    private javax.swing.JLabel ha7;
    private javax.swing.JLabel ha8;
    private javax.swing.JLabel ha9;
    private javax.swing.JLabel hb1;
    private javax.swing.JLabel hb10;
    private javax.swing.JLabel hb100;
    private javax.swing.JLabel hb101;
    private javax.swing.JLabel hb102;
    private javax.swing.JLabel hb103;
    private javax.swing.JLabel hb104;
    private javax.swing.JLabel hb105;
    private javax.swing.JLabel hb106;
    private javax.swing.JLabel hb107;
    private javax.swing.JLabel hb108;
    private javax.swing.JLabel hb109;
    private javax.swing.JLabel hb11;
    private javax.swing.JLabel hb110;
    private javax.swing.JLabel hb111;
    private javax.swing.JLabel hb112;
    private javax.swing.JLabel hb113;
    private javax.swing.JLabel hb114;
    private javax.swing.JLabel hb115;
    private javax.swing.JLabel hb116;
    private javax.swing.JLabel hb117;
    private javax.swing.JLabel hb118;
    private javax.swing.JLabel hb119;
    private javax.swing.JLabel hb12;
    private javax.swing.JLabel hb120;
    private javax.swing.JLabel hb13;
    private javax.swing.JLabel hb14;
    private javax.swing.JLabel hb15;
    private javax.swing.JLabel hb16;
    private javax.swing.JLabel hb17;
    private javax.swing.JLabel hb18;
    private javax.swing.JLabel hb19;
    private javax.swing.JLabel hb2;
    private javax.swing.JLabel hb20;
    private javax.swing.JLabel hb21;
    private javax.swing.JLabel hb22;
    private javax.swing.JLabel hb23;
    private javax.swing.JLabel hb24;
    private javax.swing.JLabel hb25;
    private javax.swing.JLabel hb26;
    private javax.swing.JLabel hb27;
    private javax.swing.JLabel hb28;
    private javax.swing.JLabel hb29;
    private javax.swing.JLabel hb3;
    private javax.swing.JLabel hb30;
    private javax.swing.JLabel hb31;
    private javax.swing.JLabel hb32;
    private javax.swing.JLabel hb33;
    private javax.swing.JLabel hb34;
    private javax.swing.JLabel hb35;
    private javax.swing.JLabel hb36;
    private javax.swing.JLabel hb37;
    private javax.swing.JLabel hb38;
    private javax.swing.JLabel hb39;
    private javax.swing.JLabel hb4;
    private javax.swing.JLabel hb40;
    private javax.swing.JLabel hb41;
    private javax.swing.JLabel hb42;
    private javax.swing.JLabel hb43;
    private javax.swing.JLabel hb44;
    private javax.swing.JLabel hb45;
    private javax.swing.JLabel hb46;
    private javax.swing.JLabel hb47;
    private javax.swing.JLabel hb48;
    private javax.swing.JLabel hb49;
    private javax.swing.JLabel hb5;
    private javax.swing.JLabel hb50;
    private javax.swing.JLabel hb51;
    private javax.swing.JLabel hb52;
    private javax.swing.JLabel hb53;
    private javax.swing.JLabel hb54;
    private javax.swing.JLabel hb55;
    private javax.swing.JLabel hb56;
    private javax.swing.JLabel hb57;
    private javax.swing.JLabel hb58;
    private javax.swing.JLabel hb59;
    private javax.swing.JLabel hb6;
    private javax.swing.JLabel hb60;
    private javax.swing.JLabel hb61;
    private javax.swing.JLabel hb62;
    private javax.swing.JLabel hb63;
    private javax.swing.JLabel hb64;
    private javax.swing.JLabel hb65;
    private javax.swing.JLabel hb66;
    private javax.swing.JLabel hb67;
    private javax.swing.JLabel hb68;
    private javax.swing.JLabel hb69;
    private javax.swing.JLabel hb7;
    private javax.swing.JLabel hb70;
    private javax.swing.JLabel hb71;
    private javax.swing.JLabel hb72;
    private javax.swing.JLabel hb73;
    private javax.swing.JLabel hb74;
    private javax.swing.JLabel hb75;
    private javax.swing.JLabel hb76;
    private javax.swing.JLabel hb77;
    private javax.swing.JLabel hb78;
    private javax.swing.JLabel hb79;
    private javax.swing.JLabel hb8;
    private javax.swing.JLabel hb80;
    private javax.swing.JLabel hb81;
    private javax.swing.JLabel hb82;
    private javax.swing.JLabel hb83;
    private javax.swing.JLabel hb84;
    private javax.swing.JLabel hb85;
    private javax.swing.JLabel hb86;
    private javax.swing.JLabel hb87;
    private javax.swing.JLabel hb88;
    private javax.swing.JLabel hb89;
    private javax.swing.JLabel hb9;
    private javax.swing.JLabel hb90;
    private javax.swing.JLabel hb91;
    private javax.swing.JLabel hb92;
    private javax.swing.JLabel hb93;
    private javax.swing.JLabel hb94;
    private javax.swing.JLabel hb95;
    private javax.swing.JLabel hb96;
    private javax.swing.JLabel hb97;
    private javax.swing.JLabel hb98;
    private javax.swing.JLabel hb99;
    private javax.swing.JLabel help2;
    private javax.swing.JLabel help2pg;
    private javax.swing.JLabel help2pg1;
    private javax.swing.JLabel help2pg2;
    private javax.swing.JLabel help2pg3;
    private javax.swing.JLabel help3;
    private javax.swing.JLabel help4;
    private javax.swing.JLabel help5;
    private javax.swing.JLabel home;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n10;
    private javax.swing.JLabel n100;
    private javax.swing.JLabel n11;
    private javax.swing.JLabel n12;
    private javax.swing.JLabel n13;
    private javax.swing.JLabel n14;
    private javax.swing.JLabel n15;
    private javax.swing.JLabel n16;
    private javax.swing.JLabel n17;
    private javax.swing.JLabel n18;
    private javax.swing.JLabel n19;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n20;
    private javax.swing.JLabel n21;
    private javax.swing.JLabel n22;
    private javax.swing.JLabel n23;
    private javax.swing.JLabel n24;
    private javax.swing.JLabel n25;
    private javax.swing.JLabel n26;
    private javax.swing.JLabel n27;
    private javax.swing.JLabel n28;
    private javax.swing.JLabel n29;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n30;
    private javax.swing.JLabel n31;
    private javax.swing.JLabel n32;
    private javax.swing.JLabel n33;
    private javax.swing.JLabel n34;
    private javax.swing.JLabel n35;
    private javax.swing.JLabel n36;
    private javax.swing.JLabel n37;
    private javax.swing.JLabel n38;
    private javax.swing.JLabel n39;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n40;
    private javax.swing.JLabel n41;
    private javax.swing.JLabel n42;
    private javax.swing.JLabel n43;
    private javax.swing.JLabel n44;
    private javax.swing.JLabel n45;
    private javax.swing.JLabel n46;
    private javax.swing.JLabel n47;
    private javax.swing.JLabel n48;
    private javax.swing.JLabel n49;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel n50;
    private javax.swing.JLabel n51;
    private javax.swing.JLabel n52;
    private javax.swing.JLabel n53;
    private javax.swing.JLabel n54;
    private javax.swing.JLabel n55;
    private javax.swing.JLabel n56;
    private javax.swing.JLabel n57;
    private javax.swing.JLabel n58;
    private javax.swing.JLabel n59;
    private javax.swing.JLabel n6;
    private javax.swing.JLabel n60;
    private javax.swing.JLabel n61;
    private javax.swing.JLabel n62;
    private javax.swing.JLabel n63;
    private javax.swing.JLabel n64;
    private javax.swing.JLabel n65;
    private javax.swing.JLabel n66;
    private javax.swing.JLabel n67;
    private javax.swing.JLabel n68;
    private javax.swing.JLabel n69;
    private javax.swing.JLabel n7;
    private javax.swing.JLabel n70;
    private javax.swing.JLabel n71;
    private javax.swing.JLabel n72;
    private javax.swing.JLabel n73;
    private javax.swing.JLabel n74;
    private javax.swing.JLabel n75;
    private javax.swing.JLabel n76;
    private javax.swing.JLabel n77;
    private javax.swing.JLabel n78;
    private javax.swing.JLabel n79;
    private javax.swing.JLabel n8;
    private javax.swing.JLabel n80;
    private javax.swing.JLabel n81;
    private javax.swing.JLabel n82;
    private javax.swing.JLabel n83;
    private javax.swing.JLabel n84;
    private javax.swing.JLabel n85;
    private javax.swing.JLabel n86;
    private javax.swing.JLabel n87;
    private javax.swing.JLabel n88;
    private javax.swing.JLabel n89;
    private javax.swing.JLabel n9;
    private javax.swing.JLabel n90;
    private javax.swing.JLabel n91;
    private javax.swing.JLabel n92;
    private javax.swing.JLabel n93;
    private javax.swing.JLabel n94;
    private javax.swing.JLabel n95;
    private javax.swing.JLabel n96;
    private javax.swing.JLabel n97;
    private javax.swing.JLabel n98;
    private javax.swing.JLabel n99;
    private javax.swing.JLabel nxt;
    private javax.swing.JLabel nxt1;
    private javax.swing.JLabel nxt2;
    private javax.swing.JLabel nxt3;
    private javax.swing.JLabel nxt4;
    private javax.swing.JLabel nxttxt;
    private javax.swing.JLabel nxttxt1;
    private javax.swing.JLabel nxttxt2;
    private javax.swing.JLabel nxttxt3;
    private javax.swing.JLabel nxttxt4;
    private javax.swing.JLabel op1;
    private javax.swing.JLabel op2;
    private javax.swing.JLabel op3;
    private javax.swing.JLabel op4;
    private javax.swing.JLabel op5;
    private javax.swing.JLabel op6;
    private javax.swing.JLabel play;
    private javax.swing.JLabel play1;
    private javax.swing.JLabel play2;
    private javax.swing.JLabel resbox;
    private javax.swing.JLabel resbox1;
    private javax.swing.JLabel resbox2;
    private javax.swing.JLabel reslabel;
    private javax.swing.JLabel reslabel1;
    private javax.swing.JLabel reslabel2;
    private javax.swing.JLabel sn1;
    private javax.swing.JLabel sn2;
    private javax.swing.JLabel sn3;
    private javax.swing.JLabel sn4;
    private javax.swing.JLabel sn5;
    private javax.swing.JLabel sn6;
    private javax.swing.JLabel sn7;
    private javax.swing.JLabel sn8;
    private javax.swing.JLabel sn9;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextArea ta2;
    private javax.swing.JLabel tno;
    private javax.swing.JLabel tno1;
    private javax.swing.JLabel tno2;
    private javax.swing.JLabel txtLabel1;
    private javax.swing.JLabel txtLabel2;
    private javax.swing.JLabel txtLabel3;
    private javax.swing.JTextArea txtnum;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel v10;
    private javax.swing.JLabel v11;
    private javax.swing.JLabel v12;
    private javax.swing.JLabel v13;
    private javax.swing.JLabel v14;
    private javax.swing.JLabel v15;
    private javax.swing.JLabel v16;
    private javax.swing.JLabel v17;
    private javax.swing.JLabel v18;
    private javax.swing.JLabel v19;
    private javax.swing.JLabel v2;
    private javax.swing.JLabel v20;
    private javax.swing.JLabel v21;
    private javax.swing.JLabel v22;
    private javax.swing.JLabel v23;
    private javax.swing.JLabel v24;
    private javax.swing.JLabel v25;
    private javax.swing.JLabel v26;
    private javax.swing.JLabel v27;
    private javax.swing.JLabel v28;
    private javax.swing.JLabel v29;
    private javax.swing.JLabel v3;
    private javax.swing.JLabel v30;
    private javax.swing.JLabel v31;
    private javax.swing.JLabel v32;
    private javax.swing.JLabel v33;
    private javax.swing.JLabel v4;
    private javax.swing.JLabel v5;
    private javax.swing.JLabel v6;
    private javax.swing.JLabel v7;
    private javax.swing.JLabel v8;
    private javax.swing.JLabel v9;
    private javax.swing.JLabel va1;
    private javax.swing.JLabel va10;
    private javax.swing.JLabel va11;
    private javax.swing.JLabel va12;
    private javax.swing.JLabel va13;
    private javax.swing.JLabel va14;
    private javax.swing.JLabel va15;
    private javax.swing.JLabel va16;
    private javax.swing.JLabel va17;
    private javax.swing.JLabel va18;
    private javax.swing.JLabel va19;
    private javax.swing.JLabel va2;
    private javax.swing.JLabel va20;
    private javax.swing.JLabel va3;
    private javax.swing.JLabel va4;
    private javax.swing.JLabel va5;
    private javax.swing.JLabel va6;
    private javax.swing.JLabel va7;
    private javax.swing.JLabel va8;
    private javax.swing.JLabel va9;
    private javax.swing.JLabel vb1;
    private javax.swing.JLabel vb10;
    private javax.swing.JLabel vb100;
    private javax.swing.JLabel vb101;
    private javax.swing.JLabel vb102;
    private javax.swing.JLabel vb103;
    private javax.swing.JLabel vb104;
    private javax.swing.JLabel vb105;
    private javax.swing.JLabel vb106;
    private javax.swing.JLabel vb107;
    private javax.swing.JLabel vb108;
    private javax.swing.JLabel vb109;
    private javax.swing.JLabel vb11;
    private javax.swing.JLabel vb110;
    private javax.swing.JLabel vb111;
    private javax.swing.JLabel vb112;
    private javax.swing.JLabel vb113;
    private javax.swing.JLabel vb114;
    private javax.swing.JLabel vb115;
    private javax.swing.JLabel vb116;
    private javax.swing.JLabel vb117;
    private javax.swing.JLabel vb118;
    private javax.swing.JLabel vb119;
    private javax.swing.JLabel vb12;
    private javax.swing.JLabel vb120;
    private javax.swing.JLabel vb13;
    private javax.swing.JLabel vb14;
    private javax.swing.JLabel vb15;
    private javax.swing.JLabel vb16;
    private javax.swing.JLabel vb17;
    private javax.swing.JLabel vb18;
    private javax.swing.JLabel vb19;
    private javax.swing.JLabel vb2;
    private javax.swing.JLabel vb20;
    private javax.swing.JLabel vb21;
    private javax.swing.JLabel vb22;
    private javax.swing.JLabel vb23;
    private javax.swing.JLabel vb24;
    private javax.swing.JLabel vb25;
    private javax.swing.JLabel vb26;
    private javax.swing.JLabel vb27;
    private javax.swing.JLabel vb28;
    private javax.swing.JLabel vb29;
    private javax.swing.JLabel vb3;
    private javax.swing.JLabel vb30;
    private javax.swing.JLabel vb31;
    private javax.swing.JLabel vb32;
    private javax.swing.JLabel vb33;
    private javax.swing.JLabel vb34;
    private javax.swing.JLabel vb35;
    private javax.swing.JLabel vb36;
    private javax.swing.JLabel vb37;
    private javax.swing.JLabel vb38;
    private javax.swing.JLabel vb39;
    private javax.swing.JLabel vb4;
    private javax.swing.JLabel vb40;
    private javax.swing.JLabel vb41;
    private javax.swing.JLabel vb42;
    private javax.swing.JLabel vb43;
    private javax.swing.JLabel vb44;
    private javax.swing.JLabel vb45;
    private javax.swing.JLabel vb46;
    private javax.swing.JLabel vb47;
    private javax.swing.JLabel vb48;
    private javax.swing.JLabel vb49;
    private javax.swing.JLabel vb5;
    private javax.swing.JLabel vb50;
    private javax.swing.JLabel vb51;
    private javax.swing.JLabel vb52;
    private javax.swing.JLabel vb53;
    private javax.swing.JLabel vb54;
    private javax.swing.JLabel vb55;
    private javax.swing.JLabel vb56;
    private javax.swing.JLabel vb57;
    private javax.swing.JLabel vb58;
    private javax.swing.JLabel vb59;
    private javax.swing.JLabel vb6;
    private javax.swing.JLabel vb60;
    private javax.swing.JLabel vb61;
    private javax.swing.JLabel vb62;
    private javax.swing.JLabel vb63;
    private javax.swing.JLabel vb64;
    private javax.swing.JLabel vb65;
    private javax.swing.JLabel vb66;
    private javax.swing.JLabel vb67;
    private javax.swing.JLabel vb68;
    private javax.swing.JLabel vb69;
    private javax.swing.JLabel vb7;
    private javax.swing.JLabel vb70;
    private javax.swing.JLabel vb71;
    private javax.swing.JLabel vb72;
    private javax.swing.JLabel vb73;
    private javax.swing.JLabel vb74;
    private javax.swing.JLabel vb75;
    private javax.swing.JLabel vb76;
    private javax.swing.JLabel vb77;
    private javax.swing.JLabel vb78;
    private javax.swing.JLabel vb79;
    private javax.swing.JLabel vb8;
    private javax.swing.JLabel vb80;
    private javax.swing.JLabel vb81;
    private javax.swing.JLabel vb82;
    private javax.swing.JLabel vb83;
    private javax.swing.JLabel vb84;
    private javax.swing.JLabel vb85;
    private javax.swing.JLabel vb86;
    private javax.swing.JLabel vb87;
    private javax.swing.JLabel vb88;
    private javax.swing.JLabel vb89;
    private javax.swing.JLabel vb9;
    private javax.swing.JLabel vb90;
    private javax.swing.JLabel vb91;
    private javax.swing.JLabel vb92;
    private javax.swing.JLabel vb93;
    private javax.swing.JLabel vb94;
    private javax.swing.JLabel vb95;
    private javax.swing.JLabel vb96;
    private javax.swing.JLabel vb97;
    private javax.swing.JLabel vb98;
    private javax.swing.JLabel vb99;
    private javax.swing.JLabel xno;
    private javax.swing.JLabel xno1;
    private javax.swing.JLabel xno2;
    private javax.swing.JLabel yno;
    private javax.swing.JLabel yno1;
    private javax.swing.JLabel yno2;
    // End of variables declaration//GEN-END:variables
}
