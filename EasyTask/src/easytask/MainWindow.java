/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Thibault
 */
public class MainWindow extends javax.swing.JFrame {
    private int mousepX;
    private int mousepY;
    private Utilisateur UserConnected;

    /**
     * Creates new form MainWindow
     */
    public MainWindow(Utilisateur user) {
        this.UserConnected = user;
        initComponents();
        /*jScrollPane1.getViewport().setBackground(Color.WHITE);
        jScrollPane1.getViewport().setBorder(null);
        jScrollPane1.setBorder(null);*/
        
        jLabelName.setText(UserConnected.getName());
        jLabelStatut.setText(UserConnected.getStatut());
        ProjectDAO projectDao = DAOFactory.getProjectDAO();
        try {
            ArrayList<Projet> projectsList = projectDao.ReadProjects(UserConnected);
            for (int i = 0; i < projectsList.size(); i++) {
                System.out.println(projectsList.get(i).getId() + " | " + projectsList.get(i).getNom());
            }
        } catch (DaoError ex) {
            System.out.println(ex.toString());
        }
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
        jPanelAside = new javax.swing.JPanel();
        jPanelAsideArrow = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelStatut = new javax.swing.JLabel();
        jPanelBarProfilButtons = new javax.swing.JPanel();
        jLabelProfilButton = new javax.swing.JLabel();
        jLabelPowerButton = new javax.swing.JLabel();
        jLabelSettingsButton = new javax.swing.JLabel();
        jPanelMenuMain = new javax.swing.JPanel();
        jPanelMenu1 = new javax.swing.JPanel();
        jPanelMenu2 = new javax.swing.JPanel();
        jPanelMainComponent = new javax.swing.JPanel();
        jPanelCenterMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EasyTasks");
        setUndecorated(true);
        setSize(new java.awt.Dimension(1280, 720));

        jPanelMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanelMain.setLayout(new java.awt.BorderLayout());

        jPanelTopBar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTopBar.setPreferredSize(new java.awt.Dimension(1280, 50));
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

        jLabelLogoTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoTextBlueSmall.png"))); // NOI18N
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
                .addComponent(jLabelLogoTop, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 980, Short.MAX_VALUE)
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTopBarLayout.setVerticalGroup(
            jPanelTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogoTop, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabelExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelMain.add(jPanelTopBar, java.awt.BorderLayout.PAGE_START);

        jPanelAside.setBackground(new java.awt.Color(0, 184, 162));
        jPanelAside.setPreferredSize(new java.awt.Dimension(200, 670));

        jPanelAsideArrow.setBackground(new java.awt.Color(61, 63, 64));
        jPanelAsideArrow.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/ArrowLeftSmallBlue.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAsideArrowLayout = new javax.swing.GroupLayout(jPanelAsideArrow);
        jPanelAsideArrow.setLayout(jPanelAsideArrowLayout);
        jPanelAsideArrowLayout.setHorizontalGroup(
            jPanelAsideArrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAsideArrowLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelAsideArrowLayout.setVerticalGroup(
            jPanelAsideArrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLabelName.setBackground(new java.awt.Color(30, 137, 124));
        jLabelName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelName.setText("Nom");
        jLabelName.setOpaque(true);

        jLabelStatut.setBackground(new java.awt.Color(30, 158, 143));
        jLabelStatut.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelStatut.setForeground(new java.awt.Color(255, 255, 255));
        jLabelStatut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatut.setText("Statut");
        jLabelStatut.setOpaque(true);

        jPanelBarProfilButtons.setBackground(new java.awt.Color(30, 137, 124));

        jLabelProfilButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProfilButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/avatarSmallWhite.png"))); // NOI18N
        jLabelProfilButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelProfilButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelProfilButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelProfilButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelProfilButtonMouseReleased(evt);
            }
        });

        jLabelPowerButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPowerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/powerSmallWhite.png"))); // NOI18N
        jLabelPowerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelPowerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPowerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPowerButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPowerButtonMouseReleased(evt);
            }
        });

        jLabelSettingsButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/gearSmallWhite.png"))); // NOI18N
        jLabelSettingsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSettingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSettingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSettingsButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelSettingsButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelBarProfilButtonsLayout = new javax.swing.GroupLayout(jPanelBarProfilButtons);
        jPanelBarProfilButtons.setLayout(jPanelBarProfilButtonsLayout);
        jPanelBarProfilButtonsLayout.setHorizontalGroup(
            jPanelBarProfilButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarProfilButtonsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelProfilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelSettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelPowerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBarProfilButtonsLayout.setVerticalGroup(
            jPanelBarProfilButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelProfilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelPowerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelSettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelMenuMain.setOpaque(false);

        javax.swing.GroupLayout jPanelMenu1Layout = new javax.swing.GroupLayout(jPanelMenu1);
        jPanelMenu1.setLayout(jPanelMenu1Layout);
        jPanelMenu1Layout.setHorizontalGroup(
            jPanelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanelMenu1Layout.setVerticalGroup(
            jPanelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelMenu2Layout = new javax.swing.GroupLayout(jPanelMenu2);
        jPanelMenu2.setLayout(jPanelMenu2Layout);
        jPanelMenu2Layout.setHorizontalGroup(
            jPanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelMenu2Layout.setVerticalGroup(
            jPanelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelMenuMainLayout = new javax.swing.GroupLayout(jPanelMenuMain);
        jPanelMenuMain.setLayout(jPanelMenuMainLayout);
        jPanelMenuMainLayout.setHorizontalGroup(
            jPanelMenuMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelMenuMainLayout.setVerticalGroup(
            jPanelMenuMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelAsideLayout = new javax.swing.GroupLayout(jPanelAside);
        jPanelAside.setLayout(jPanelAsideLayout);
        jPanelAsideLayout.setHorizontalGroup(
            jPanelAsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAsideArrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelStatut, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(jPanelMenuMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBarProfilButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelAsideLayout.setVerticalGroup(
            jPanelAsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsideLayout.createSequentialGroup()
                .addComponent(jPanelAsideArrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelStatut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelBarProfilButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenuMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelMain.add(jPanelAside, java.awt.BorderLayout.LINE_START);

        jPanelMainComponent.setBackground(new java.awt.Color(214, 227, 225));

        jPanelCenterMain.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelCenterMainLayout = new javax.swing.GroupLayout(jPanelCenterMain);
        jPanelCenterMain.setLayout(jPanelCenterMainLayout);
        jPanelCenterMainLayout.setHorizontalGroup(
            jPanelCenterMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanelCenterMainLayout.setVerticalGroup(
            jPanelCenterMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelMainComponentLayout = new javax.swing.GroupLayout(jPanelMainComponent);
        jPanelMainComponent.setLayout(jPanelMainComponentLayout);
        jPanelMainComponentLayout.setHorizontalGroup(
            jPanelMainComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainComponentLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelCenterMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelMainComponentLayout.setVerticalGroup(
            jPanelMainComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainComponentLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanelCenterMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanelMain.add(jPanelMainComponent, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelTopBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTopBarMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanelTopBarMousePressed

    private void jPanelTopBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTopBarMouseDragged
        int coordX = evt.getXOnScreen();
        int coordY = evt.getYOnScreen();

        this.setLocation(coordX-this.mousepX, coordY-this.mousepY);
    }//GEN-LAST:event_jPanelTopBarMouseDragged

    private void jLabelExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseReleased
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseReleased

    private void jLabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseExited
        jLabelExit.setBackground(new Color(0,0,0));
        jLabelExit.setOpaque(false);
        jLabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/closeSmallBlue.png")));
    }//GEN-LAST:event_jLabelExitMouseExited

    private void jLabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseEntered
        jLabelExit.setBackground(new Color(208,2,28));
        jLabelExit.setOpaque(true);
        jLabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/closeSmallWhite.png")));
    }//GEN-LAST:event_jLabelExitMouseEntered

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

    private void jLabelProfilButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProfilButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelProfilButtonMouseReleased

    private void jLabelProfilButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProfilButtonMouseEntered
        jLabelProfilButton.setBackground(new Color(14,97,87));
        jLabelProfilButton.setOpaque(true);
    }//GEN-LAST:event_jLabelProfilButtonMouseEntered

    private void jLabelProfilButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProfilButtonMouseExited
        jLabelProfilButton.setBackground(new Color(0,0,0));
        jLabelProfilButton.setOpaque(false);
    }//GEN-LAST:event_jLabelProfilButtonMouseExited

    private void jLabelSettingsButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSettingsButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSettingsButtonMouseReleased

    private void jLabelSettingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSettingsButtonMouseEntered
        jLabelSettingsButton.setBackground(new Color(14,97,87));
        jLabelSettingsButton.setOpaque(true);
    }//GEN-LAST:event_jLabelSettingsButtonMouseEntered

    private void jLabelSettingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSettingsButtonMouseExited
        jLabelSettingsButton.setBackground(new Color(0,0,0));
        jLabelSettingsButton.setOpaque(false);
    }//GEN-LAST:event_jLabelSettingsButtonMouseExited

    private void jLabelPowerButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPowerButtonMouseReleased
        Disconnect();
    }//GEN-LAST:event_jLabelPowerButtonMouseReleased

    private void jLabelPowerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPowerButtonMouseEntered
        jLabelPowerButton.setBackground(new Color(14,97,87));
        jLabelPowerButton.setOpaque(true);
    }//GEN-LAST:event_jLabelPowerButtonMouseEntered

    private void jLabelPowerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPowerButtonMouseExited
        jLabelPowerButton.setBackground(new Color(0,0,0));
        jLabelPowerButton.setOpaque(false);
    }//GEN-LAST:event_jLabelPowerButtonMouseExited

    public void Disconnect() {
        this.dispose();
        LoginWindow logWin = new LoginWindow();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelLogoTop;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPowerButton;
    private javax.swing.JLabel jLabelProfilButton;
    private javax.swing.JLabel jLabelSettingsButton;
    private javax.swing.JLabel jLabelStatut;
    private javax.swing.JPanel jPanelAside;
    private javax.swing.JPanel jPanelAsideArrow;
    private javax.swing.JPanel jPanelBarProfilButtons;
    private javax.swing.JPanel jPanelCenterMain;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMainComponent;
    private javax.swing.JPanel jPanelMenu1;
    private javax.swing.JPanel jPanelMenu2;
    private javax.swing.JPanel jPanelMenuMain;
    private javax.swing.JPanel jPanelTopBar;
    // End of variables declaration//GEN-END:variables
}
