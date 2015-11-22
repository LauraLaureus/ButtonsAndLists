
import java.util.Collections;
import java.util.List;
import javax.swing.ListSelectionModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lala
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        simpleSelectionGroup.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        author = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dataTextField = new javax.swing.JTextField();
        toList1button = new javax.swing.JButton();
        list1Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList();
        resetList1Selectionbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        simpleSelectionGroup = new javax.swing.JToggleButton();
        intervalSelectionButton = new javax.swing.JToggleButton();
        severalSelectionButtons = new javax.swing.JToggleButton();
        toList2button = new javax.swing.JButton();
        list2Panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList();
        cleanList2Button = new javax.swing.JButton();
        ClearSelectionList2Button = new javax.swing.JButton();
        sortList2Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ButtonsAndLists Demo");

        author.setText("Autora:Laura del Pino Díaz");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dato"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(dataTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        toList1button.setText("A Lista1");
        toList1button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toList1buttonActionPerformed(evt);
            }
        });

        list1Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista1"));

        jScrollPane1.setViewportView(list1);

        resetList1Selectionbutton.setText("Limpia seleccion");
        resetList1Selectionbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetList1SelectionbuttonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Modo de selección"));

        buttonGroup.add(simpleSelectionGroup);
        simpleSelectionGroup.setText("Simple");
        simpleSelectionGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleSelectionGroupActionPerformed(evt);
            }
        });

        buttonGroup.add(intervalSelectionButton);
        intervalSelectionButton.setText("Intervalo");
        intervalSelectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervalSelectionButtonActionPerformed(evt);
            }
        });

        buttonGroup.add(severalSelectionButtons);
        severalSelectionButtons.setText("Multiples intervalos");
        severalSelectionButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                severalSelectionButtonsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(simpleSelectionGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(intervalSelectionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(severalSelectionButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simpleSelectionGroup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intervalSelectionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(severalSelectionButtons))
        );

        javax.swing.GroupLayout list1PanelLayout = new javax.swing.GroupLayout(list1Panel);
        list1Panel.setLayout(list1PanelLayout);
        list1PanelLayout.setHorizontalGroup(
            list1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(list1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(list1PanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(resetList1Selectionbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        list1PanelLayout.setVerticalGroup(
            list1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resetList1Selectionbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        toList2button.setText("A Lista2");
        toList2button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toList2buttonActionPerformed(evt);
            }
        });

        list2Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista2"));

        jScrollPane2.setViewportView(list2);

        cleanList2Button.setText("Limpia lista");
        cleanList2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanList2ButtonActionPerformed(evt);
            }
        });

        ClearSelectionList2Button.setText("Limpia seleccion");
        ClearSelectionList2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearSelectionList2ButtonActionPerformed(evt);
            }
        });

        sortList2Button.setText("Ordena lista");
        sortList2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortList2ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout list2PanelLayout = new javax.swing.GroupLayout(list2Panel);
        list2Panel.setLayout(list2PanelLayout);
        list2PanelLayout.setHorizontalGroup(
            list2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list2PanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(list2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cleanList2Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClearSelectionList2Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(list2PanelLayout.createSequentialGroup()
                        .addComponent(sortList2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        list2PanelLayout.setVerticalGroup(
            list2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cleanList2Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClearSelectionList2Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortList2Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toList1button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(list1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toList2button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(list2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(toList1button)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list2Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(list1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(toList2button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toList1buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toList1buttonActionPerformed
        String data = dataTextField.getText();

        dataTextField.setText(null);
        int listLenght = list1.getModel().getSize();
        if (listLenght == 0) {
            String[] values = new String[1];
            values[0] = data;
            list1.setListData(values);
        } else {
            list1.setSelectionInterval(0, listLenght - 1);
            List selected = list1.getSelectedValuesList();
            selected.add(data);
            list1.setListData(selected.toArray());
        }

    }//GEN-LAST:event_toList1buttonActionPerformed

    private void simpleSelectionGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleSelectionGroupActionPerformed
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_simpleSelectionGroupActionPerformed

    private void intervalSelectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervalSelectionButtonActionPerformed
        list1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_intervalSelectionButtonActionPerformed

    private void severalSelectionButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_severalSelectionButtonsActionPerformed
        list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_severalSelectionButtonsActionPerformed

    private void resetList1SelectionbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetList1SelectionbuttonActionPerformed
        List l = list1.getSelectedValuesList();
        list1.setSelectionInterval(0, list1.getModel().getSize() - 1);
        List all = list1.getSelectedValuesList();
        all.removeAll(l);
        list1.setListData(all.toArray());
    }//GEN-LAST:event_resetList1SelectionbuttonActionPerformed

    private void toList2buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toList2buttonActionPerformed
        List selected = list1.getSelectedValuesList();
        int listLenght = list2.getModel().getSize();
        if (listLenght == 0) {
            String[] values = new String[1];
            list2.setListData(selected.toArray());
        } else {
            list2.setSelectionInterval(0, listLenght - 1);
            List l2 = list2.getSelectedValuesList();
            for (Object sel : selected) {
                l2.add(sel);
            }
            list2.setListData(l2.toArray());
        }

    }//GEN-LAST:event_toList2buttonActionPerformed

    private void cleanList2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanList2ButtonActionPerformed
        list2.setListData(new String[0]);
    }//GEN-LAST:event_cleanList2ButtonActionPerformed

    private void ClearSelectionList2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearSelectionList2ButtonActionPerformed
        List selected = list2.getSelectedValuesList();
        if (selected.isEmpty()) {
            return;
        }
        list2.setSelectionInterval(0, list2.getModel().getSize() - 1);
        List totalList = list2.getSelectedValuesList();
        totalList.removeAll(selected);
        list2.setListData(totalList.toArray());
    }//GEN-LAST:event_ClearSelectionList2ButtonActionPerformed

    private void sortList2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortList2ButtonActionPerformed
        list2.setSelectionInterval(0, list2.getModel().getSize() - 1);
        List totalList = list2.getSelectedValuesList();
        Collections.sort(totalList);
        list2.setListData(totalList.toArray());
    }//GEN-LAST:event_sortList2ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearSelectionList2Button;
    private javax.swing.JLabel author;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton cleanList2Button;
    private javax.swing.JTextField dataTextField;
    private javax.swing.JToggleButton intervalSelectionButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList list1;
    private javax.swing.JPanel list1Panel;
    private javax.swing.JList list2;
    private javax.swing.JPanel list2Panel;
    private javax.swing.JButton resetList1Selectionbutton;
    private javax.swing.JToggleButton severalSelectionButtons;
    private javax.swing.JToggleButton simpleSelectionGroup;
    private javax.swing.JButton sortList2Button;
    private javax.swing.JButton toList1button;
    private javax.swing.JButton toList2button;
    // End of variables declaration//GEN-END:variables
}
