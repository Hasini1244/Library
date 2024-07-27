/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.homePage;


import edu.ijse.view.BookCategoryView;
import edu.ijse.view.BookView;
import edu.ijse.view.BorrowingTransactionsView;
import edu.ijse.view.MemberView;
import edu.ijse.view.ReturnView;
import edu.ijse.welcome.Welcome;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class homePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public homePage() {
        initComponents();
               setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBooks = new javax.swing.JButton();
        btnBookCategories = new javax.swing.JButton();
        btnMembers = new javax.swing.JButton();
        btnBorrowingTransactions = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home Page");

        btnBooks.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBooks.setText("Manage Books");
        btnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBooksActionPerformed(evt);
            }
        });

        btnBookCategories.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBookCategories.setText("Manage Book Categories");
        btnBookCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookCategoriesActionPerformed(evt);
            }
        });

        btnMembers.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMembers.setText("Manage Members");
        btnMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembersActionPerformed(evt);
            }
        });

        btnBorrowingTransactions.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBorrowingTransactions.setText("Manage Borrowing Transactions");
        btnBorrowingTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowingTransactionsActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReturn.setText("Return & Apply Fines");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReturn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBookCategories, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBooks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrowingTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnBooks)
                .addGap(42, 42, 42)
                .addComponent(btnBookCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnBorrowingTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembersActionPerformed
       setVisible(false);
        try { 
            new MemberView().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMembersActionPerformed

    private void btnBookCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookCategoriesActionPerformed
       setVisible(false);
        try {
            new BookCategoryView().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnBookCategoriesActionPerformed

    private void btnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBooksActionPerformed

        setVisible(false);
        try {
            new BookView().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnBooksActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
         setVisible(false);
         new Welcome().setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnBorrowingTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowingTransactionsActionPerformed
        setVisible(false);
        try {
            new BorrowingTransactionsView().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnBorrowingTransactionsActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        setVisible(false);
        try {
            new ReturnView().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnReturnActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookCategories;
    private javax.swing.JButton btnBooks;
    private javax.swing.JButton btnBorrowingTransactions;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMembers;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
