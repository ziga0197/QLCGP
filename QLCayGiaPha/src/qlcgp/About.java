/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcgp;

/**
 *
 * @author Admin
 */
public class About extends javax.swing.JInternalFrame {

    /**
     * Creates new form About
     */
    public About() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setClosable(true);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("------------------\nSystem Information\n------------------\nMachine name\t: MY-PC\nOperating System\t: Windows 8.1 Pro 64-bit (6.3, Build 9600) (9600.winblue_ltsb.160723-0600)\nLanguage\t\t: Vietnamese (Regional Setting: Vietnamese)\nSystem Manufacturer\t: Dell Inc.\nSystem Model\t\t: Inspiron 5547\nBIOS\t\t: InsydeH2O Version 03.73.02A05\nProcessor\t\t: Intel(R) Core(TM) i7-4510U CPU @ 2.00GHz (4 CPUs), ~2.6GHz\nMemory\t\t: 8192MB RAM\nAvailable OS Memory\t: 8080MB RAM\nPage File\t\t: 6060MB used, 4131MB available\nWindows Dir\t\t: C:\\Windows\nDirectX Version\t: DirectX 11\n------------------\nSofware information\n------------------\nJava\t\t: 8\nNetbeans\t\t: 8.2\nSQL server\t\t: 2012\nGit\t\t: 2.14.1\n------------------\nCopyright © 2017 SuperFourTeam.\n\n\n\n");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}