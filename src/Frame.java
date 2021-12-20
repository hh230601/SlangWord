import javax.swing.*;
import java.io.IOException;
import java.util.*;

public class Frame extends javax.swing.JFrame {

    ArrayList<String> history = new ArrayList<String>();

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SlangText = new javax.swing.JTextField();
        MeaningText = new javax.swing.JTextField();
        RandSlangButton = new javax.swing.JButton();
        DefinitionSearchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResultList = new javax.swing.JList<>();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        ShowButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        RandomButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        HistoryList = new javax.swing.JList<>();
        SlangSearchButton = new javax.swing.JButton();
        RandDefinition = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        HistoryButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setText("Meaning");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setText("Slang Word");

        RandSlangButton.setText("Random Slang Game");
        RandSlangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandSlangButtonActionPerformed(evt);
            }
        });

        DefinitionSearchButton.setText("Search Definition");
        DefinitionSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefinitionSearchButtonActionPerformed(evt);
            }
        });

        ResultList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(ResultList);

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        ShowButton.setText("Show");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        RandomButton.setText("Random");
        RandomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomButtonActionPerformed(evt);
            }
        });

        HistoryList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(HistoryList);

        SlangSearchButton.setText("Search Slang");
        SlangSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlangSearchButtonActionPerformed(evt);
            }
        });

        RandDefinition.setText("Random Definition Game");
        RandDefinition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandDefinitionActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        HistoryButton.setText("History");
        HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setText("Directory");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setText("History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(RandSlangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(RandDefinition)
                                                        .addComponent(RandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(ShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel8))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(MeaningText, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(DefinitionSearchButton))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(SlangText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(SlangSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(38, 38, 38)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(58, 58, 58))))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jScrollPane2)))))
                                .addGap(31, 31, 31))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(217, 217, 217))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SlangText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SlangSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(DefinitionSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(MeaningText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(76, 76, 76)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(ShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(RandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(RandSlangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(RandDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }

    private void SlangSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Add to history list
        String slang = SlangText.getText();
        String meaning = Main.SearchSlangWord(slang);
        DefaultListModel e = new DefaultListModel();
        e.addElement(meaning);
        ResultList.setModel(e);
        for(String i : history) {
            if (i.equalsIgnoreCase(slang)) // If slang exist on history, doesn't add again
                return;
        }
        history.add(slang);
    }

    private void DefinitionSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String meaning = MeaningText.getText();
        ArrayList<String> slang = Main.SearchMeaning(meaning);
        DefaultListModel e = new DefaultListModel();
        for(String i : slang)
            e.addElement(i);
        ResultList.setModel(e);
    }

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<Slang> list = Main.GetSlangList();
        DefaultListModel e = new DefaultListModel();
        for(Slang i : list){
            String s = i.getSlang() + "           " + i.getMeaning();
            e.addElement(s);
            ResultList.setModel(e);
        }

    }

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void RandomButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void RandSlangButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void RandDefinitionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultListModel e = new DefaultListModel();
        for(String i : history)
            e.addElement(i);
        ResultList.setModel(e);
    }

    public static void main(String args[]) throws IOException {
       Main.ReadSlang("D:\\slang.txt");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DefinitionSearchButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton HistoryButton;
    private javax.swing.JList<String> HistoryList;
    private javax.swing.JTextField MeaningText;
    private javax.swing.JButton RandDefinition;
    private javax.swing.JButton RandSlangButton;
    private javax.swing.JButton RandomButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JList<String> ResultList;
    private javax.swing.JButton ShowButton;
    private javax.swing.JButton SlangSearchButton;
    private javax.swing.JTextField SlangText;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration
}
