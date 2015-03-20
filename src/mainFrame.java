
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tachagon
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public GA TSP;  // Object for Travelling Salesman Problem
    public DrawDiagram cityPanel;  // create new panel for draw diagram
    public int maxGen=0, currentGen=0;
    
    public mainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        open = new javax.swing.JButton();
        nameText = new javax.swing.JTextField();
        numCityText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        maxGenText = new javax.swing.JTextField();
        runGA = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Travelling Saleman Problem GA");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 1070, 620));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1118, 690));
        setPreferredSize(new java.awt.Dimension(1118, 690));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(177, 220, 248));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 250));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 250));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(177, 220, 248));
        jPanel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        open.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        nameText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameText.setEnabled(false);

        numCityText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numCityText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        numCityText.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("No. City:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Maximum Generation:");

        maxGenText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maxGenText.setEnabled(false);

        runGA.setText("Run GA");
        runGA.setEnabled(false);
        runGA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                runGAStateChanged(evt);
            }
        });
        runGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runGAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(open)
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maxGenText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(runGA)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(numCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(open)
                    .addComponent(jLabel3)
                    .addComponent(maxGenText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(runGA))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Generation No.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        JFileChooser file = new JFileChooser();
        file.setFileFilter(new javax.swing.filechooser.FileFilter() {

            @Override
            public boolean accept(File f) {
                String filename = f.getName();
                return filename.endsWith(".tsp");
            }

            @Override
            public String getDescription() {
                return "Travelling Saleman Problem, *.tsp";
            }
        });
        int status = file.showOpenDialog(this);
        if(status != JFileChooser.APPROVE_OPTION){ // when file is not opened (may be errors)
            
        }
        else{   
            try {   // when file is opened
                BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream(file.getSelectedFile())));
                ArrayList<String> datasTemp = new ArrayList<String>();
                String data = buf.readLine();
                while(data != null){    // read data each line
                    datasTemp.add(data);    // keep data each line into ArrayList
                    data = buf.readLine();
                }
                nameText.setText(datasTemp.get(0).split(": ")[1]);      // show name of problem in text field
                numCityText.setText(datasTemp.get(3).split(": ")[1]);   // show number of city of problem in text field
                maxGenText.setEnabled(true);    // enable text field for received number of max generation
                runGA.setEnabled(true);         // enable Run GA button
                cityPanel = new DrawDiagram();  // create new panel for draw City
                cityPanel.setPreferredSize(new Dimension(500, 500));   // set size of new panel
                cityPanel.setOpaque(false);
                ArrayList<ArrayList> datas = extract(datasTemp);
                TSP = new GA();
                TSP.createCity(datas);
                TSP.initPopulation();
                initCityDraw(TSP.cities);     // draw initialization of diagram
                
                buf.close();    // close buffer
            } catch (Exception ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_openActionPerformed
    
    public void test(){
        
    }
    
    private void runGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runGAActionPerformed
        // TODO add your handling code here:
        if(this.maxGenText.getText().isEmpty()){    // if maxGenText Text Field is Empty
            JOptionPane.showMessageDialog(this, "Please fill Maximum Generation!!!");
        }
        else{   // if maxGenText Text Field is not Empty
            String maxGenStr = this.maxGenText.getText();
            try{
                this.maxGen = Integer.parseInt(maxGenStr);
                this.currentGen += 1;
                this.jLabel5.setText(this.currentGen+"");
                this.repaint();
                if(this.currentGen < this.maxGen){Thread.sleep(500); this.runGAActionPerformed(evt);}
                //println("the best path: "+TSP.bestPath.distance);
                //for(int i=0; i<=maxGen; i++){
                    //println(i);
                    //this.jLabel5.setText(i+"");
                    
                    //TSP.newPopulation = TSP.population;
                    //TSP.select();
                    //TSP.crossover();
                    //TSP.mutation();
                    //println(i+" Before: "+TSP.population);
                    //TSP.updatePop();
                    //TSP.findBestPath();
                    //println(i+" After: "+TSP.population);
                    //println("the best path: "+TSP.bestPath.distance);
                    //println("good path: "+TSP.goodPath.distance);
                    //this.updateCityDraw();
                //}
                //println("the best path: "+TSP.bestPath.distance);
            }catch(Exception e){    // not fill integer in maxGenText Text Field
                JOptionPane.showMessageDialog(this, "Please fill Maximum Generation is number!!!");
            }
        }
    }//GEN-LAST:event_runGAActionPerformed

    private void runGAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_runGAStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_runGAStateChanged

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField maxGenText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField numCityText;
    private javax.swing.JButton open;
    private javax.swing.JButton runGA;
    // End of variables declaration//GEN-END:variables

    private void initCityDraw(ArrayList<City> cities) {
        jPanel1.setVisible(false);
        cityPanel.cities = TSP.cities;
        cityPanel.population = TSP.population;
        cityPanel.bestPath = TSP.bestPath;
        cityPanel.goodPath = TSP.goodPath;
        jPanel1.add(cityPanel, BorderLayout.CENTER);           // add new panel into jPanel1
        jPanel1.setVisible(true);
    }
    
    private void updateCityDraw(){
        jPanel1.setVisible(false);
        cityPanel.population = TSP.population;
        cityPanel.bestPath = TSP.bestPath;
        cityPanel.goodPath = TSP.goodPath;
        jPanel1.add(cityPanel, BorderLayout.CENTER);           // add new panel into jPanel1
        cityPanel.startAnimate();
        cityPanel.stopAnimate();
        jPanel1.setVisible(true);
    }
    
    // This function is used for extracttion data from input file
    private ArrayList<ArrayList> extract(ArrayList<String> input){
        // remove datas are not necessary
        for(int i=0; i<6; i++){
            input.remove(0);
        }
        input.remove("EOF");
        input.remove("");
        
        ArrayList<ArrayList> output = new ArrayList<ArrayList>(); // create ArrayList for Output
        ArrayList<Double> temp;
        for(int i=0; i<input.size(); i++){
            temp = new ArrayList<Double>();
            String str[] = input.get(i).split(" "); // split data by a space
            temp.add(Double.parseDouble(str[1]));   // convert data to double and add into temp list
            temp.add(Double.parseDouble(str[2]));   // convert data to double and add into temp list
            output.add(temp);   // add data to output
        }
        return output;
    }
    
    private void println(Object obj){
        System.out.println(obj.toString());
    }
    private void print(Object obj){
        System.out.print(obj.toString());
    }
}