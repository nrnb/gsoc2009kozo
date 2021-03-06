/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJDialog.java
 *
 * Created on 2009/06/29, 9:36:01
 */

package org.cytoscape.layer;

/**
 *
 * @author kozo-ni
 */
public class NetworkIntegrationUI extends javax.swing.JDialog {

    /** Creates new form NewJDialog */
    public NetworkIntegrationUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        DefineLayerPanel = new javax.swing.JPanel();
        IntegratedNetworkPanel = new javax.swing.JPanel();
        IntegratedNetworkScrollPane = new javax.swing.JScrollPane();
        IntegratedNetworkList = new javax.swing.JList();
        AvailableNetworkPanel = new javax.swing.JPanel();
        AvailableNetworkScrollPane = new javax.swing.JScrollPane();
        AvailableNetworkList = new javax.swing.JList();
        MoveAllAvailableNetworkButton = new javax.swing.JButton();
        MoveSelectedAvailableNetworkButton = new javax.swing.JButton();
        MoveSelectedIntegratedNetworkButton = new javax.swing.JButton();
        MoveAllIntegratedNetworkButton = new javax.swing.JButton();
        LayerOrderPanel = new javax.swing.JPanel();
        LayerOrderScrollPane = new javax.swing.JScrollPane();
        LayerOrderTable = new javax.swing.JTable();
        OptionButton = new javax.swing.JButton();
        GenerateIntegratedNetworkButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TitlePanel.setBackground(new java.awt.Color(255, 255, 255));

        TitleLabel.setText("3D Layer Generator");

        org.jdesktop.layout.GroupLayout TitlePanelLayout = new org.jdesktop.layout.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(TitleLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 303, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(TitleLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        DefineLayerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Define Layers"));

        IntegratedNetworkPanel.setBackground(new java.awt.Color(255, 255, 255));
        IntegratedNetworkPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Integrated Networks"));

        IntegratedNetworkList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        IntegratedNetworkScrollPane.setViewportView(IntegratedNetworkList);

        org.jdesktop.layout.GroupLayout IntegratedNetworkPanelLayout = new org.jdesktop.layout.GroupLayout(IntegratedNetworkPanel);
        IntegratedNetworkPanel.setLayout(IntegratedNetworkPanelLayout);
        IntegratedNetworkPanelLayout.setHorizontalGroup(
            IntegratedNetworkPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(IntegratedNetworkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(IntegratedNetworkScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        IntegratedNetworkPanelLayout.setVerticalGroup(
            IntegratedNetworkPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(IntegratedNetworkPanelLayout.createSequentialGroup()
                .add(IntegratedNetworkScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 186, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        AvailableNetworkPanel.setBackground(new java.awt.Color(255, 255, 255));
        AvailableNetworkPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Available Networks"));

        AvailableNetworkList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        AvailableNetworkScrollPane.setViewportView(AvailableNetworkList);

        org.jdesktop.layout.GroupLayout AvailableNetworkPanelLayout = new org.jdesktop.layout.GroupLayout(AvailableNetworkPanel);
        AvailableNetworkPanel.setLayout(AvailableNetworkPanelLayout);
        AvailableNetworkPanelLayout.setHorizontalGroup(
            AvailableNetworkPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(AvailableNetworkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(AvailableNetworkScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 159, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AvailableNetworkPanelLayout.setVerticalGroup(
            AvailableNetworkPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(AvailableNetworkPanelLayout.createSequentialGroup()
                .add(AvailableNetworkScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoveAllAvailableNetworkButton.setText(">>");
        MoveAllAvailableNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveAllAvailableNetworkButtonActionPerformed(evt);
            }
        });

        MoveSelectedAvailableNetworkButton.setText(">");
        MoveSelectedAvailableNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveSelectedAvailableNetworkButtonActionPerformed(evt);
            }
        });

        MoveSelectedIntegratedNetworkButton.setText("<");
        MoveSelectedIntegratedNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveSelectedIntegratedNetworkButtonActionPerformed(evt);
            }
        });

        MoveAllIntegratedNetworkButton.setText("<<");
        MoveAllIntegratedNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveAllIntegratedNetworkButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout DefineLayerPanelLayout = new org.jdesktop.layout.GroupLayout(DefineLayerPanel);
        DefineLayerPanel.setLayout(DefineLayerPanelLayout);
        DefineLayerPanelLayout.setHorizontalGroup(
            DefineLayerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(DefineLayerPanelLayout.createSequentialGroup()
                .add(231, 231, 231)
                .add(DefineLayerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(MoveAllAvailableNetworkButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(MoveSelectedAvailableNetworkButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(MoveSelectedIntegratedNetworkButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(MoveAllIntegratedNetworkButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(IntegratedNetworkPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .add(DefineLayerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(DefineLayerPanelLayout.createSequentialGroup()
                    .add(22, 22, 22)
                    .add(AvailableNetworkPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(340, Short.MAX_VALUE)))
        );
        DefineLayerPanelLayout.setVerticalGroup(
            DefineLayerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(DefineLayerPanelLayout.createSequentialGroup()
                .add(DefineLayerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(DefineLayerPanelLayout.createSequentialGroup()
                        .add(48, 48, 48)
                        .add(MoveAllAvailableNetworkButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(MoveSelectedAvailableNetworkButton)
                        .add(43, 43, 43)
                        .add(MoveSelectedIntegratedNetworkButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(MoveAllIntegratedNetworkButton))
                    .add(DefineLayerPanelLayout.createSequentialGroup()
                        .add(11, 11, 11)
                        .add(IntegratedNetworkPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                .addContainerGap())
            .add(DefineLayerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(DefineLayerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .add(AvailableNetworkPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        LayerOrderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Define Layer Order"));

        LayerOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Horizontal Layer Network", "Inter Layer Network"
            }
        ));
        LayerOrderScrollPane.setViewportView(LayerOrderTable);

        org.jdesktop.layout.GroupLayout LayerOrderPanelLayout = new org.jdesktop.layout.GroupLayout(LayerOrderPanel);
        LayerOrderPanel.setLayout(LayerOrderPanelLayout);
        LayerOrderPanelLayout.setHorizontalGroup(
            LayerOrderPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(LayerOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(LayerOrderScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );
        LayerOrderPanelLayout.setVerticalGroup(
            LayerOrderPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(LayerOrderPanelLayout.createSequentialGroup()
                .add(LayerOrderScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        OptionButton.setText("Options");
        OptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionButtonActionPerformed(evt);
            }
        });

        GenerateIntegratedNetworkButton.setText("Generate");
        GenerateIntegratedNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateIntegratedNetworkButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TitlePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(DefineLayerPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(LayerOrderPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(OptionButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 226, Short.MAX_VALUE)
                .add(GenerateIntegratedNetworkButton)
                .add(32, 32, 32)
                .add(CancelButton)
                .add(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(TitlePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(DefineLayerPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(LayerOrderPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 13, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(OptionButton)
                    .add(GenerateIntegratedNetworkButton)
                    .add(CancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void GenerateIntegratedNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateIntegratedNetworkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerateIntegratedNetworkButtonActionPerformed

    private void OptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OptionButtonActionPerformed

    private void MoveAllAvailableNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveAllAvailableNetworkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoveAllAvailableNetworkButtonActionPerformed

    private void MoveSelectedAvailableNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveSelectedAvailableNetworkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoveSelectedAvailableNetworkButtonActionPerformed

    private void MoveSelectedIntegratedNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveSelectedIntegratedNetworkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoveSelectedIntegratedNetworkButtonActionPerformed

    private void MoveAllIntegratedNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveAllIntegratedNetworkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoveAllIntegratedNetworkButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NetworkIntegrationUI dialog = new NetworkIntegrationUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList AvailableNetworkList;
    private javax.swing.JPanel AvailableNetworkPanel;
    private javax.swing.JScrollPane AvailableNetworkScrollPane;
    private javax.swing.JButton CancelButton;
    private javax.swing.JPanel DefineLayerPanel;
    private javax.swing.JButton GenerateIntegratedNetworkButton;
    private javax.swing.JList IntegratedNetworkList;
    private javax.swing.JPanel IntegratedNetworkPanel;
    private javax.swing.JScrollPane IntegratedNetworkScrollPane;
    private javax.swing.JPanel LayerOrderPanel;
    private javax.swing.JScrollPane LayerOrderScrollPane;
    private javax.swing.JTable LayerOrderTable;
    private javax.swing.JButton MoveAllAvailableNetworkButton;
    private javax.swing.JButton MoveAllIntegratedNetworkButton;
    private javax.swing.JButton MoveSelectedAvailableNetworkButton;
    private javax.swing.JButton MoveSelectedIntegratedNetworkButton;
    private javax.swing.JButton OptionButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    // End of variables declaration//GEN-END:variables

}
