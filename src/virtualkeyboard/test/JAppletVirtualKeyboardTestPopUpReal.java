/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JAppletVirtualKeyboardTestPopUpReal.java
 *
 * Created on 16.11.2010, 21:19:28
 */

package virtualkeyboard.test;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import virtualkeyboard.gui.DialogVirtualKeyboardReal;

/**
 *
 * @author vladipetrenko
 */
public class JAppletVirtualKeyboardTestPopUpReal extends javax.swing.JApplet {
    Properties langProp = null;
    Locale locale=null;


    /** Initializes the applet JAppletVirtualKeyboardTestPopUpReal */
    public void init() {
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                            locale = Locale.getDefault();
        try {
            langProp = new Properties();
            langProp.load(getClass().getResourceAsStream("/virtualkeyboard/lang/Keyboard_lang.properties"));

            for (Enumeration e = langProp.propertyNames() ; e.hasMoreElements() ;) {
//                System.out.println(e.nextElement().toString());
                jComboBox1.addItem(e.nextElement().toString());
            }
            jComboBox1.setSelectedItem("de");
        } catch (IOException e) {
            System.err.println(e);
        }
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /** This method is called from within the init() method to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField = new javax.swing.JTextField();
        jLTextField = new javax.swing.JLabel();
        jLTextArea = new javax.swing.JLabel();
        jSPTextArea = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLPasswd = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jScrollPane = new javax.swing.JScrollPane();
        jEditorPane = new javax.swing.JEditorPane();
        jLEditorPane = new javax.swing.JLabel();
        jFormattedTextField = new javax.swing.JFormattedTextField();
        jLFormatedTextField = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        jTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldMousePressed(evt);
            }
        });
        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActionPerformed(evt);
            }
        });

        jLTextField.setText("jTextField:");

        jLTextArea.setText("jTextArea:");

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextAreaMousePressed(evt);
            }
        });
        jSPTextArea.setViewportView(jTextArea);

        jLPasswd.setText("Passwd:");

        jPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordFieldMousePressed(evt);
            }
        });
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jEditorPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEditorPaneMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(jEditorPane);

        jLEditorPane.setText("EditorPane:");

        jFormattedTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFormattedTextFieldMouseClicked(evt);
            }
        });
        jFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldActionPerformed(evt);
            }
        });

        jLFormatedTextField.setText("FormatedTextField:");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jCheckBox1.setText("AutoUp");

        jCheckBox2.setText("ShiftBs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFormatedTextField)
                    .addComponent(jLTextArea)
                    .addComponent(jLEditorPane)
                    .addComponent(jLTextField)
                    .addComponent(jLPasswd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSPTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(jFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLTextField)
                        .addComponent(jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTextArea)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSPTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPasswd)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLEditorPane)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFormatedTextField)
                    .addComponent(jFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldMousePressed
        DialogVirtualKeyboardReal dlg = new DialogVirtualKeyboardReal(null, false, jTextField);
        dlg.setPoitToUp(jCheckBox1.isSelected());
        dlg.setShiftBs(jCheckBox2.isSelected());
        dlg.setLocaleL(locale);
}//GEN-LAST:event_jTextFieldMousePressed

    private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActionPerformed
        DialogVirtualKeyboardReal dlg = new DialogVirtualKeyboardReal(null, false, jTextField);
        dlg.setPoitToUp(jCheckBox1.isSelected());
        dlg.setShiftBs(jCheckBox2.isSelected());
        dlg.setLocaleL(locale);
}//GEN-LAST:event_jTextFieldActionPerformed

    private void jTextAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaMousePressed
        DialogVirtualKeyboardReal dlg = new DialogVirtualKeyboardReal(null, false, jTextArea);
        dlg.setPoitToUp(jCheckBox1.isSelected());
        dlg.setShiftBs(jCheckBox2.isSelected());
        dlg.setLocaleL(locale);
}//GEN-LAST:event_jTextAreaMousePressed

    private void jPasswordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldMousePressed
        DialogVirtualKeyboardReal dlg = new DialogVirtualKeyboardReal(null, false, jPasswordField);
        dlg.setPoitToUp(jCheckBox1.isSelected());
        dlg.setShiftBs(jCheckBox2.isSelected());
        dlg.setLocaleL(locale);
}//GEN-LAST:event_jPasswordFieldMousePressed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        DialogVirtualKeyboardReal dlg = new DialogVirtualKeyboardReal(null, false, jPasswordField);
        dlg.setPoitToUp(jCheckBox1.isSelected());
        dlg.setShiftBs(jCheckBox2.isSelected());
        dlg.setLocaleL(locale);
}//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jEditorPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditorPaneMouseClicked
        DialogVirtualKeyboardReal dlg = new DialogVirtualKeyboardReal(null, false, jEditorPane);
        dlg.setPoitToUp(jCheckBox1.isSelected());
        dlg.setShiftBs(jCheckBox2.isSelected());
        dlg.setLocaleL(locale);
}//GEN-LAST:event_jEditorPaneMouseClicked

    private void jFormattedTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextFieldMouseClicked
        DialogVirtualKeyboardReal dlg = new DialogVirtualKeyboardReal(null, false, jFormattedTextField);
        dlg.setPoitToUp(jCheckBox1.isSelected());
        dlg.setShiftBs(jCheckBox2.isSelected());
        dlg.setLocaleL(locale);
}//GEN-LAST:event_jFormattedTextFieldMouseClicked

    private void jFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldActionPerformed
        DialogVirtualKeyboardReal dlg = new DialogVirtualKeyboardReal(null, false, jFormattedTextField);
        dlg.setPoitToUp(jCheckBox1.isSelected());
        dlg.setShiftBs(jCheckBox2.isSelected());
        dlg.setLocaleL(locale);
}//GEN-LAST:event_jFormattedTextFieldActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        locale= new Locale((String)jComboBox1.getSelectedItem());
}//GEN-LAST:event_jComboBox1ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JEditorPane jEditorPane;
    private javax.swing.JFormattedTextField jFormattedTextField;
    private javax.swing.JLabel jLEditorPane;
    private javax.swing.JLabel jLFormatedTextField;
    private javax.swing.JLabel jLPasswd;
    private javax.swing.JLabel jLTextArea;
    private javax.swing.JLabel jLTextField;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JScrollPane jSPTextArea;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables

}
