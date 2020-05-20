/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JFrame;

/**
 *
 * @author Thibault, Marion, Yaning
 */
public class ProfileWindow extends javax.swing.JFrame {
    private int mousepX;
    private int mousepY;
    //Renvoie true si le mot de passe a été modifié
    private boolean pswModify = false;
    //La page principal qui à généré cette fenêtre
    private MainWindow winGeneratedBy;
    private Utilisateur UserConnected;
    /**
     * Creates new form ProfileWindow
     */
    public ProfileWindow(Utilisateur user, MainWindow mainWin) {
        this.UserConnected = user;
        this.winGeneratedBy = mainWin;
        initComponents();
        
        jNameField.setText(UserConnected.getName());
        jLabelLogin.setText(UserConnected.getLogin());
        
        jNameField.setEditable(false);
        jPasswordField.setEditable(false);
        
        try {
            jNameField.setCursor(Cursor.getSystemCustomCursor("Invalid.32x32"));
            jLabelLogin.setCursor(Cursor.getSystemCustomCursor("Invalid.32x32"));
            jPasswordField.setCursor(Cursor.getSystemCustomCursor("Invalid.32x32"));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        jButtonValidate.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonCancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelTopBar = new javax.swing.JPanel();
        jLabelLogoTop = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jPanelMainComponent = new javax.swing.JPanel();
        jPanelCenter = new javax.swing.JPanel();
        jNameField = new javax.swing.JTextField();
        jSeparatorName = new javax.swing.JSeparator();
        jLabelLogin = new javax.swing.JLabel();
        jSeparatorName1 = new javax.swing.JSeparator();
        jPasswordField = new javax.swing.JPasswordField();
        jSeparatorPsw = new javax.swing.JSeparator();
        jButtonValidate = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelEditName = new javax.swing.JLabel();
        jLabelEditPsw = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelErreur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EasyTasks - Profile");
        setBackground(new java.awt.Color(0, 184, 162));
        setName("frameProfile"); // NOI18N
        setUndecorated(true);

        jPanelMain.setBackground(new java.awt.Color(0, 184, 162));
        jPanelMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanelMain.setMinimumSize(new java.awt.Dimension(604, 576));
        jPanelMain.setLayout(new java.awt.BorderLayout());

        jPanelTopBar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTopBar.setPreferredSize(new java.awt.Dimension(1024, 50));
        jPanelTopBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelTopBarMouseDragged(evt);
            }
        });
        jPanelTopBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelTopBarMousePressed(evt);
            }
        });

        jLabelLogoTop.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelLogoTop.setForeground(new java.awt.Color(0, 184, 162));
        jLabelLogoTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoTop.setText("Profile");
        jLabelLogoTop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/closeSmallBlue.png"))); // NOI18N
        jLabelExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExitMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelExitMouseReleased(evt);
            }
        });

        jLabelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/minusSmallBlue.png"))); // NOI18N
        jLabelMinimize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelTopBarLayout = new javax.swing.GroupLayout(jPanelTopBar);
        jPanelTopBar.setLayout(jPanelTopBarLayout);
        jPanelTopBarLayout.setHorizontalGroup(
            jPanelTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopBarLayout.createSequentialGroup()
                .addComponent(jLabelLogoTop, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 790, Short.MAX_VALUE)
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanelTopBarLayout.setVerticalGroup(
            jPanelTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelLogoTop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabelExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelMain.add(jPanelTopBar, java.awt.BorderLayout.PAGE_START);

        jPanelMainComponent.setBackground(new java.awt.Color(0, 184, 162));
        jPanelMainComponent.setPreferredSize(new java.awt.Dimension(1020, 576));
        jPanelMainComponent.setLayout(new java.awt.GridBagLayout());

        jPanelCenter.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCenter.setMaximumSize(new java.awt.Dimension(650, 450));
        jPanelCenter.setMinimumSize(new java.awt.Dimension(650, 450));
        jPanelCenter.setPreferredSize(new java.awt.Dimension(650, 450));

        jNameField.setBackground(new java.awt.Color(255, 255, 255));
        jNameField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jNameField.setForeground(new java.awt.Color(0, 184, 162));
        jNameField.setText("Nom ou pseudo");
        jNameField.setBorder(null);

        jSeparatorName.setBackground(new java.awt.Color(0, 184, 162));
        jSeparatorName.setForeground(new java.awt.Color(0, 184, 162));

        jLabelLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(0, 184, 162));
        jLabelLogin.setText("Login");

        jSeparatorName1.setBackground(new java.awt.Color(0, 184, 162));
        jSeparatorName1.setForeground(new java.awt.Color(0, 184, 162));

        jPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(0, 184, 162));
        jPasswordField.setText("LeMotDePasse");
        jPasswordField.setBorder(null);

        jSeparatorPsw.setBackground(new java.awt.Color(0, 184, 162));
        jSeparatorPsw.setForeground(new java.awt.Color(0, 184, 162));

        jButtonValidate.setBackground(new java.awt.Color(0, 184, 162));
        jButtonValidate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonValidate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonValidate.setText("Valider");
        jButtonValidate.setBorder(null);
        jButtonValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidateActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(0, 184, 162));
        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("Annuler");
        jButtonCancel.setBorder(null);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabelEditName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEditName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/pencilSmallBlue.png"))); // NOI18N
        jLabelEditName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEditNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEditNameMouseExited(evt);
            }
        });

        jLabelEditPsw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEditPsw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/pencilSmallBlue.png"))); // NOI18N
        jLabelEditPsw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditPswMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEditPswMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEditPswMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 184, 162));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Login :");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 184, 162));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Mot de passe :");

        jLabel3.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 184, 162));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nom (ou pseudo) :");

        jLabelErreur.setForeground(new java.awt.Color(255, 51, 51));
        jLabelErreur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErreur.setMaximumSize(new java.awt.Dimension(324, 28));
        jLabelErreur.setMinimumSize(new java.awt.Dimension(324, 28));
        jLabelErreur.setPreferredSize(new java.awt.Dimension(324, 28));

        javax.swing.GroupLayout jPanelCenterLayout = new javax.swing.GroupLayout(jPanelCenter);
        jPanelCenter.setLayout(jPanelCenterLayout);
        jPanelCenterLayout.setHorizontalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCenterLayout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparatorName)
                    .addComponent(jSeparatorPsw)
                    .addComponent(jSeparatorName1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCenterLayout.createSequentialGroup()
                        .addComponent(jButtonValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCenterLayout.createSequentialGroup()
                        .addComponent(jPasswordField)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelEditPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCenterLayout.createSequentialGroup()
                        .addComponent(jNameField)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelEditName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(163, 163, 163))
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelErreur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCenterLayout.setVerticalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEditName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorName1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField)
                    .addComponent(jLabelEditPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErreur, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        jPanelMainComponent.add(jPanelCenter, new java.awt.GridBagConstraints());

        jPanelMain.add(jPanelMainComponent, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseEntered
        jLabelExit.setBackground(new Color(208,2,28));
        jLabelExit.setOpaque(true);
        jLabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/closeSmallWhite.png")));
    }//GEN-LAST:event_jLabelExitMouseEntered

    private void jLabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseExited
        jLabelExit.setBackground(new Color(0,0,0));
        jLabelExit.setOpaque(false);
        jLabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/closeSmallBlue.png")));
    }//GEN-LAST:event_jLabelExitMouseExited

    private void jLabelExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseReleased
        this.dispose();
    }//GEN-LAST:event_jLabelExitMouseReleased

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        jLabelMinimize.setBackground(new Color(211,211,211));
        jLabelMinimize.setOpaque(true);
        jLabelMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/minusSmallWhite.png")));
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        jLabelMinimize.setBackground(new Color(0,0,0));
        jLabelMinimize.setOpaque(false);
        jLabelMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/minusSmallBlue.png")));
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jLabelMinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseReleased
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseReleased

    private void jPanelTopBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTopBarMouseDragged
        int coordX = evt.getXOnScreen();
        int coordY = evt.getYOnScreen();

        this.setLocation(coordX-this.mousepX, coordY-this.mousepY);
    }//GEN-LAST:event_jPanelTopBarMouseDragged

    private void jPanelTopBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTopBarMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanelTopBarMousePressed

    private void jLabelEditPswMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditPswMouseExited
        jLabelEditPsw.setBackground(new Color(0,0,0));
        jLabelEditPsw.setOpaque(false);
    }//GEN-LAST:event_jLabelEditPswMouseExited

    private void jLabelEditPswMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditPswMouseEntered
        jLabelEditPsw.setBackground(new Color(211,211,211));
        jLabelEditPsw.setOpaque(true);
    }//GEN-LAST:event_jLabelEditPswMouseEntered

    private void jLabelEditPswMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditPswMouseClicked
        jPasswordField.setEditable(true);
        jPasswordField.setText("");
        jPasswordField.setBackground(new Color(240,240,240));
        jPasswordField.requestFocusInWindow();
        try {
            jPasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        pswModify = true;
    }//GEN-LAST:event_jLabelEditPswMouseClicked

    private void jLabelEditNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditNameMouseExited
        jLabelEditName.setBackground(new Color(0,0,0));
        jLabelEditName.setOpaque(false);
    }//GEN-LAST:event_jLabelEditNameMouseExited

    private void jLabelEditNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditNameMouseEntered
        jLabelEditName.setBackground(new Color(211,211,211));
        jLabelEditName.setOpaque(true);
    }//GEN-LAST:event_jLabelEditNameMouseEntered

    private void jLabelEditNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditNameMouseClicked
        jNameField.setEditable(true);
        jNameField.setBackground(new Color(240,240,240));
        jNameField.requestFocusInWindow();
        try {
            jNameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jLabelEditNameMouseClicked

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        Cancel();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidateActionPerformed
        Validate();
    }//GEN-LAST:event_jButtonValidateActionPerformed

    
    public void Validate() {
        String newName = jNameField.getText();
        String newPsw = jPasswordField.getText();
        this.UserConnected.setName(newName);
        if (Utils.IsPasswordSafe(newPsw) || !pswModify) {
            if (newName != "") {
                if (pswModify) {
                    newPsw = Utils.HashPassword(newPsw);
                    this.UserConnected.setPasswordHash(newPsw);
                }
                UserDAO userDao = DAOFactory.getUtilisateurDAO();
                userDao.update(UserConnected);
                winGeneratedBy.initDBComponents();
                this.dispose();
            }
            else
                jLabelErreur.setText("Le nom ne doit pas être vide");
        }
        else {
            jLabelErreur.setText("Le mot de passe doit contenir au minimum 8 caractères, une lettre et un chiffre");
        }
    }
    
    public void Cancel() {
        this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonValidate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelEditName;
    private javax.swing.JLabel jLabelEditPsw;
    private javax.swing.JLabel jLabelErreur;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelLogoTop;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JTextField jNameField;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMainComponent;
    private javax.swing.JPanel jPanelTopBar;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JSeparator jSeparatorName;
    private javax.swing.JSeparator jSeparatorName1;
    private javax.swing.JSeparator jSeparatorPsw;
    // End of variables declaration//GEN-END:variables
}
