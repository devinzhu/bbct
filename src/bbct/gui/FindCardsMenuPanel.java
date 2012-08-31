/*
 * This file is part of BBCT.
 *
 * Copyright 2012 codeguru <codeguru@users.sourceforge.net>
 *
 * BBCT is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BBCT is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package bbct.gui;

import bbct.data.BaseballCardIO;
import java.awt.CardLayout;
import java.awt.Container;

/**
 * TODO: JavaDoc
 *
 * @author codeguru <codeguru@users.sourceforge.net>
 */
public class FindCardsMenuPanel extends javax.swing.JPanel {

    /**
     * Creates {@link FindCardsMenuPanel}.
     */
    public FindCardsMenuPanel() {
        initComponents();
    }

    /**
     * Creates {@link FindCardsMenuPanel}.
     *
     * @param bcio The {@link BaseballCardIO} object which is used to search for
     * baseball cards using the criteria input by the user.
     */
    public FindCardsMenuPanel(BaseballCardIO bcio) {
        this.bcio = bcio;

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

        findCardsByYearButton = new javax.swing.JButton();
        findCardsByNumberButton = new javax.swing.JButton();
        findCardsByYearAndNumberButton = new javax.swing.JButton();
        findCardsByPlayerNameButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(40, 70, 40, 70));
        setMinimumSize(new java.awt.Dimension(370, 360));
        setPreferredSize(new java.awt.Dimension(370, 360));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        setLayout(new java.awt.GridLayout(5, 1, 0, 30));

        findCardsByYearButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        findCardsByYearButton.setText("Find Cards By Year");
        findCardsByYearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCardsByYearButtonActionPerformed(evt);
            }
        });
        add(findCardsByYearButton);

        findCardsByNumberButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        findCardsByNumberButton.setText("Find Cards By Number");
        findCardsByNumberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCardsByNumberButtonActionPerformed(evt);
            }
        });
        add(findCardsByNumberButton);

        findCardsByYearAndNumberButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        findCardsByYearAndNumberButton.setText("Find Cards By Year and Number");
        findCardsByYearAndNumberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCardsByYearAndNumberButtonActionPerformed(evt);
            }
        });
        add(findCardsByYearAndNumberButton);

        findCardsByPlayerNameButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        findCardsByPlayerNameButton.setText("Find Cards By Player Name");
        findCardsByPlayerNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCardsByPlayerNameButtonActionPerformed(evt);
            }
        });
        add(findCardsByPlayerNameButton);

        backButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Container parent = this.getParent();
        CardLayout cl = (CardLayout) parent.getLayout();

        cl.show(parent, BBCTFrame.MENU_CARD_NAME);
    }//GEN-LAST:event_backButtonActionPerformed

    private void findCardsByYearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCardsByYearButtonActionPerformed
        Container parent = this.getParent();
        CardLayout cl = (CardLayout) parent.getLayout();

        cl.show(parent, BBCTFrame.FIND_CARDS_BY_YEAR_CARD_NAME);
    }//GEN-LAST:event_findCardsByYearButtonActionPerformed

    private void findCardsByNumberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCardsByNumberButtonActionPerformed
        Container parent = this.getParent();
        CardLayout cl = (CardLayout) parent.getLayout();

        cl.show(parent, BBCTFrame.FIND_CARDS_BY_NUMBER_CARD_NAME);
    }//GEN-LAST:event_findCardsByNumberButtonActionPerformed

    private void findCardsByYearAndNumberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCardsByYearAndNumberButtonActionPerformed
        Container parent = this.getParent();
        CardLayout cl = (CardLayout) parent.getLayout();

        cl.show(parent, BBCTFrame.FIND_CARDS_BY_YEAR_AND_NUMBER_CARD_NAME);
    }//GEN-LAST:event_findCardsByYearAndNumberButtonActionPerformed

    private void findCardsByPlayerNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCardsByPlayerNameButtonActionPerformed
        Container parent = this.getParent();
        CardLayout cl = (CardLayout) parent.getLayout();

        cl.show(parent, BBCTFrame.FIND_CARDS_BY_PLAYER_NAME_CARD_NAME);
    }//GEN-LAST:event_findCardsByPlayerNameButtonActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        Container topLevelAncestor = this.getTopLevelAncestor();

        if (topLevelAncestor instanceof BBCTFrame) {
            BBCTFrame frame = (BBCTFrame) topLevelAncestor;
            frame.setTitle(GUIResources.FIND_CARDS_MENU_PANEL_TITLE);
            frame.setInstructions("Chose an option:");
            frame.setDefaultButton(null);
        }
    }//GEN-LAST:event_formAncestorAdded
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton findCardsByNumberButton;
    private javax.swing.JButton findCardsByPlayerNameButton;
    private javax.swing.JButton findCardsByYearAndNumberButton;
    private javax.swing.JButton findCardsByYearButton;
    // End of variables declaration//GEN-END:variables
    private BaseballCardIO bcio = null;
}
