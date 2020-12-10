/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keremtigre.CoronaVirusApp;

import com.google.gson.JsonObject;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


/**
 *
 * @author kerem
 */
public class ListTotalData extends javax.swing.JFrame {

    /**
     * Creates new form ListTotalData
     */
    public ListTotalData() {
        initComponents();
        //Frame'in ortalanmasını istiyoruz.
        setLocationRelativeTo(this);
   //Jtree mizdeki ana kökümüzü oluşturduk
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Dünya Geneli Veriler");
     //oluşturduğumuz yaprakları ekliyoruz
        root.add(new DefaultMutableTreeNode("Bugün Tespit Edilen Vakalar"));
        root.add( new DefaultMutableTreeNode("Toplam Vaka"));
        root.add(new DefaultMutableTreeNode("Bugünkü Ölüm Sayısı"));
        root.add(new DefaultMutableTreeNode("Toplam Ölüm Sayısı"));
      root.add( new DefaultMutableTreeNode("Bugün Kurtulanlar"));
       root.add(new DefaultMutableTreeNode("Toplam Kurtulanlar"));
       
       DefaultTreeModel model = new DefaultTreeModel(root);
       //Oluşturduğumuz modeli jtree'e ekliyoruz ve jtree miz hazır.
        jTree1.setModel(model);
       
        
        
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Jdata = new javax.swing.JLabel();
        Jlabel_tarih = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        Jdata.setFont(new java.awt.Font("Liberation Sans", 3, 12)); // NOI18N
        Jdata.setToolTipText("");
        Jdata.setVerifyInputWhenFocusTarget(false);

        Jlabel_tarih.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(Jdata, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Jlabel_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Jlabel_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(Jdata, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 10)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Bilgileri Görüntülemek İçin Yazıların  \nÜstüne Tıklamanız Yeterlidir");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
      
        
        try {
            //CoronaVirusData classından nesne oluşturuyoruz.
            CoronaVirusData CoronaData2=new CoronaVirusData();
        JsonObject getDataObject;
        //Burada CoronaData2 classındaki getCoronaVirusData() methodundan objeyi çağırıyoruz.
            getDataObject = CoronaData2.getCoronaVirusData().getAsJsonObject();
            //Mevcut Düğümün ismini alıyoruz
            String getNodeName=evt.getPath().toString().substring(23).replace("]", "");
            //Frame'in sağ üst köşesine tarih bilgisini yazdırıyoruz.
            Jlabel_tarih.setText("Tarih: "+getDataObject.get("Date").getAsString());
     
            //Aldığımız Değişkeni switch'in seçim kısmında belirtiyoruz
       switch(getNodeName){
        //Case Gerekli şartı sağlarsa
          
           case "Bugün Tespit Edilen Vakalar": 
                //İsmini aldığımız mevcut durumdaki düğümün , Json formatında karşılık gelen ismiyle çağırıyoruz ve String değişkenine atıyoruz...
               String result=getNodeName+": "+getDataObject.get("Global").getAsJsonObject().get("NewConfirmed").getAsString();
               //yukarıdaki işlemden sonra kullanıcyı 100 milisaniye bekletiyoruz
               Thread.sleep(100);
               //verimizi jlabelda yazdırıyoruz
            Jdata.setText(result);
            break; //Diğer Case'ler içinde aynı işlemleri yapıyoruz
            case "Toplam Vaka": 
               String result1=getNodeName+": "+getDataObject.get("Global").getAsJsonObject().get("TotalConfirmed").getAsString();
               Thread.sleep(100);
            Jdata.setText(result1);
            break;
            case "Bugünkü Ölüm Sayısı": 
                String result2=getNodeName+": "+getDataObject.get("Global").getAsJsonObject().get("NewDeaths").getAsString();
                Thread.sleep(100);
            Jdata.setText(result2);
            break;
            case "Toplam Ölüm Sayısı": 
                String result3=getNodeName+": "+getDataObject.get("Global").getAsJsonObject().get("TotalDeaths").getAsString();
                Thread.sleep(100);
            Jdata.setText(result3);
            break;
            case "Bugün Kurtulanlar": 
                 String result4=getNodeName+": "+getDataObject.get("Global").getAsJsonObject().get("NewRecovered").getAsString();
                 Thread.sleep(100);
            Jdata.setText(result4);
            break;
            case "Toplam Kurtulanlar": 
                String result5=getNodeName+": "+getDataObject.get("Global").getAsJsonObject().get("TotalRecovered").getAsString();
                Thread.sleep(100);
            Jdata.setText(result5);
            break;
            //Yanlış Seçim Gelmesi Durumda Yapıalcak işlemi belirtiyoruz
            default: System.out.println("Hatalı Veri");
            break;
           
        
    }
        } catch (Exception ex) {
            //hata oluşması durumda kullanıcıyı bilgilendiriyoruz.
            JOptionPane.showMessageDialog(null, "Veriler Çağırılırken Hata Oluştu.İşlem Yoğunluğu Oluşmuş Olabilir.Lütfen Tekrar Deneyiniz");
           
        }
                            
    }//GEN-LAST:event_jTree1ValueChanged

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
            java.util.logging.Logger.getLogger(ListTotalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListTotalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListTotalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListTotalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListTotalData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jdata;
    private javax.swing.JLabel Jlabel_tarih;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
