/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfece;

import domain.Books;
import file.Books_File;
import java.awt.Color;



public class Insert_Book extends javax.swing.JFrame {

    Books_File fileBooks;
    
    
    public Insert_Book() {
        initComponents();
        this.getContentPane().setBackground(Color.lightGray);
        this.setTitle("Add a new Book");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lb_AddBook = new javax.swing.JLabel();
        lb_NameBook = new javax.swing.JLabel();
        tf_NameBook = new javax.swing.JTextField();
        lb_CodeBook = new javax.swing.JLabel();
        lb_AuthorBook = new javax.swing.JLabel();
        lb_EditorialBook = new javax.swing.JLabel();
        btn_addBook = new javax.swing.JButton();
        tf_CodeBook = new javax.swing.JTextField();
        tf_AuthorBook = new javax.swing.JTextField();
        tf_Editorial = new javax.swing.JTextField();
        cb_Digital = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        tf_Year = new javax.swing.JTextField();
        lb_Message = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_AddBook.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lb_AddBook.setForeground(new java.awt.Color(51, 0, 255));
        lb_AddBook.setText("Add New Book");
        lb_AddBook.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lb_NameBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_NameBook.setForeground(new java.awt.Color(51, 0, 255));
        lb_NameBook.setText("Name");

        lb_CodeBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_CodeBook.setForeground(new java.awt.Color(51, 0, 255));
        lb_CodeBook.setText("Code");

        lb_AuthorBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_AuthorBook.setForeground(new java.awt.Color(51, 0, 204));
        lb_AuthorBook.setText("Author");

        lb_EditorialBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_EditorialBook.setForeground(new java.awt.Color(51, 0, 255));
        lb_EditorialBook.setText("Editorial");

        btn_addBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_addBook.setForeground(new java.awt.Color(51, 0, 255));
        btn_addBook.setText("Add");
        btn_addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addBookActionPerformed(evt);
            }
        });

        tf_AuthorBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_AuthorBookActionPerformed(evt);
            }
        });

        cb_Digital.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cb_Digital.setForeground(new java.awt.Color(51, 0, 204));
        cb_Digital.setText("  Is a Digital Book?");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Year");

        tf_Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_YearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(lb_AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_CodeBook, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lb_NameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lb_AuthorBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(34, 34, 34))
                                        .addComponent(lb_EditorialBook, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_NameBook)
                                        .addComponent(tf_CodeBook)
                                        .addComponent(tf_AuthorBook)
                                        .addComponent(tf_Editorial, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                                    .addComponent(lb_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tf_Year, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_Digital, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btn_addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_NameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_NameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_CodeBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_CodeBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_AuthorBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_AuthorBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_EditorialBook)
                    .addComponent(tf_Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(cb_Digital, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lb_Message)
                .addGap(35, 35, 35)
                .addComponent(btn_addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addBookActionPerformed

            boolean editable = false;
            if(cb_Digital.isSelected())
                editable = true;

            Books book = new Books(tf_AuthorBook.getText(), tf_Editorial.getText(), tf_NameBook.getText(),tf_CodeBook.getText() ,Integer.parseInt(tf_Year.getText()),editable);
            
            fileBooks = new Books_File();
            
            lb_Message.setText(fileBooks.writeBooks(book));
            
            tf_NameBook.setText("");
            tf_CodeBook.setText("");
            tf_Editorial.setText("");
            tf_Year.setText("");
            tf_AuthorBook.setText("");
            
    }//GEN-LAST:event_btn_addBookActionPerformed

    private void tf_AuthorBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_AuthorBookActionPerformed
        
    }//GEN-LAST:event_tf_AuthorBookActionPerformed

    private void tf_YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_YearActionPerformed

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
            java.util.logging.Logger.getLogger(Insert_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addBook;
    private javax.swing.JCheckBox cb_Digital;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_AddBook;
    private javax.swing.JLabel lb_AuthorBook;
    private javax.swing.JLabel lb_CodeBook;
    private javax.swing.JLabel lb_EditorialBook;
    private javax.swing.JLabel lb_Message;
    private javax.swing.JLabel lb_NameBook;
    private javax.swing.JTextField tf_AuthorBook;
    private javax.swing.JTextField tf_CodeBook;
    private javax.swing.JTextField tf_Editorial;
    private javax.swing.JTextField tf_NameBook;
    private javax.swing.JTextField tf_Year;
    // End of variables declaration//GEN-END:variables
}
