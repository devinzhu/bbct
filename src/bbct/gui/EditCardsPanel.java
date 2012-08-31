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

import bbct.data.BaseballCard;
import bbct.data.BaseballCardIO;
import java.awt.CardLayout;
import java.awt.Container;
import java.util.List;
import javax.swing.JPanel;

/**
 * TODO: JavaDoc
 *
 * TODO: Commit changes to storage.
 *
 * TODO: What if 1,000 cards match a search? Scrolling through one at a time
 * will be painful!
 *
 * TODO: Update instructions label appropriately.
 *
 * @author codeguru <codeguru@users.sourceforge.net>
 */
public class EditCardsPanel extends JPanel {

    /**
     * Creates new {@link EditCardsPanel}.
     */
    public EditCardsPanel() {
        initComponents();
    }

    /**
     * Creates new {@link EditCardsPanel}.
     *
     * @param cards
     * @param bcio The {@link BaseballCardIO} object which is used to update
     * data in the underlying persistent storage mechanism.
     */
    public EditCardsPanel(List<BaseballCard> cards, BaseballCardIO bcio) {
        this.bcio = bcio;

        initComponents();

        for (BaseballCard card : cards) {
            JPanel cardDetailsPanel = new CardDetailsPanel(card, false);

            this.allCardDetailsPanel.add(cardDetailsPanel);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel buttonsPanel = new javax.swing.JPanel();
        javax.swing.JButton prevButton = new javax.swing.JButton();
        javax.swing.JButton nextButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        allCardDetailsPanel = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(370, 350));
        setPreferredSize(new java.awt.Dimension(370, 350));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        setLayout(new java.awt.BorderLayout());

        prevButton.setText("<-- Previous");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(prevButton);

        nextButton.setText("Next -->");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(nextButton);

        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(doneButton);

        add(buttonsPanel, java.awt.BorderLayout.SOUTH);

        allCardDetailsPanel.setLayout(new java.awt.CardLayout());
        add(allCardDetailsPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        CardLayout layout = (CardLayout) this.allCardDetailsPanel.getLayout();
        layout.previous(this.allCardDetailsPanel);
    }//GEN-LAST:event_prevButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        CardLayout layout = (CardLayout) this.allCardDetailsPanel.getLayout();
        layout.next(this.allCardDetailsPanel);
    }//GEN-LAST:event_nextButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        Container parent = this.getParent();
        CardLayout layout = (CardLayout) parent.getLayout();

        parent.remove(this);
        layout.show(parent, BBCTFrame.FIND_CARDS_MENU_CARD_NAME);
    }//GEN-LAST:event_doneButtonActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        Container topLevelAncestor = this.getTopLevelAncestor();

        if (topLevelAncestor instanceof BBCTFrame) {
            BBCTFrame frame = (BBCTFrame) topLevelAncestor;
            frame.setTitle(GUIResources.EDIT_CARD_PANEL_TITLE);
            frame.setDefaultButton(this.doneButton);
        }
    }//GEN-LAST:event_formAncestorAdded
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allCardDetailsPanel;
    private javax.swing.JButton doneButton;
    // End of variables declaration//GEN-END:variables
    BaseballCardIO bcio = null;
}
