package view.main;

import com.jgoodies.looks.plastic.PlasticXPLookAndFeel;
import com.jgoodies.looks.plastic.theme.SkyBlue;
import controller.*;

public class Main extends javax.swing.JFrame {
    
    private ActorController actorController;
    private CityController cityController;
    private CountryController countryController;
    private GenreController genreController;
    private LocationController locationController;
    private MovieController movieController;
    private PersonController customerController;
    private PersonController supplierController;
    private PersonController employeeController;
    private ReportController reportController;
    private ReservationController reservationController;
    private StateController stateController;
    
    public Main() {
        initComponents();

        loadControllers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        entriesMenu = new javax.swing.JMenu();
        customersMenuItem = new javax.swing.JMenuItem();
        suppliersMenuItem = new javax.swing.JMenuItem();
        employeesMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        citiesMenuItem = new javax.swing.JMenuItem();
        statesMenuItem = new javax.swing.JMenuItem();
        countriesMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        movieMenu = new javax.swing.JMenu();
        reservationMenuItem = new javax.swing.JMenuItem();
        locationMenuItem = new javax.swing.JMenuItem();
        devolutionMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        moviesMenuItem = new javax.swing.JMenuItem();
        genresMenuItem = new javax.swing.JMenuItem();
        actorsMenuItem = new javax.swing.JMenuItem();
        reportMenu = new javax.swing.JMenu();
        locationsByPeriodMenuItem = new javax.swing.JMenuItem();
        listMoviesMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestão de Video Locadoras");
        setPreferredSize(getMaximumSize());

        entriesMenu.setMnemonic('f');
        entriesMenu.setText("Cadastros");

        customersMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/customers_16.png"))); // NOI18N
        customersMenuItem.setMnemonic('o');
        customersMenuItem.setText("Clientes");
        customersMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersMenuItemActionPerformed(evt);
            }
        });
        entriesMenu.add(customersMenuItem);

        suppliersMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/suppliers_16.png"))); // NOI18N
        suppliersMenuItem.setMnemonic('s');
        suppliersMenuItem.setText("Fornecedores");
        suppliersMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersMenuItemActionPerformed(evt);
            }
        });
        entriesMenu.add(suppliersMenuItem);

        employeesMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/employees_16.png"))); // NOI18N
        employeesMenuItem.setMnemonic('a');
        employeesMenuItem.setText("Colaboradores");
        employeesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesMenuItemActionPerformed(evt);
            }
        });
        entriesMenu.add(employeesMenuItem);
        entriesMenu.add(jSeparator1);

        citiesMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/tag_1.png"))); // NOI18N
        citiesMenuItem.setText("Cidades");
        citiesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citiesMenuItemActionPerformed(evt);
            }
        });
        entriesMenu.add(citiesMenuItem);

        statesMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/tag_2.png"))); // NOI18N
        statesMenuItem.setText("Estados");
        statesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statesMenuItemActionPerformed(evt);
            }
        });
        entriesMenu.add(statesMenuItem);

        countriesMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/tag_3.png"))); // NOI18N
        countriesMenuItem.setText("Países");
        countriesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countriesMenuItemActionPerformed(evt);
            }
        });
        entriesMenu.add(countriesMenuItem);
        entriesMenu.add(jSeparator2);

        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/sign_out_16.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Sair");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        entriesMenu.add(exitMenuItem);

        menuBar.add(entriesMenu);

        movieMenu.setMnemonic('e');
        movieMenu.setText("Filmes");

        reservationMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Schedule.png"))); // NOI18N
        reservationMenuItem.setText("Reserva");
        reservationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationMenuItemActionPerformed(evt);
            }
        });
        movieMenu.add(reservationMenuItem);

        locationMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Up.png"))); // NOI18N
        locationMenuItem.setText("Locação");
        locationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationMenuItemActionPerformed(evt);
            }
        });
        movieMenu.add(locationMenuItem);

        devolutionMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Down.png"))); // NOI18N
        devolutionMenuItem.setText("Devolução");
        devolutionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolutionMenuItemActionPerformed(evt);
            }
        });
        movieMenu.add(devolutionMenuItem);
        movieMenu.add(jSeparator4);

        moviesMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Movie.png"))); // NOI18N
        moviesMenuItem.setText("Filmes");
        moviesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviesMenuItemActionPerformed(evt);
            }
        });
        movieMenu.add(moviesMenuItem);

        genresMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/category_16.png"))); // NOI18N
        genresMenuItem.setMnemonic('t');
        genresMenuItem.setText("Generos");
        genresMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genresMenuItemActionPerformed(evt);
            }
        });
        movieMenu.add(genresMenuItem);

        actorsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Employee.png"))); // NOI18N
        actorsMenuItem.setText("Atores");
        actorsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actorsMenuItemActionPerformed(evt);
            }
        });
        movieMenu.add(actorsMenuItem);

        menuBar.add(movieMenu);

        reportMenu.setText("Relatórios");

        locationsByPeriodMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Report.png"))); // NOI18N
        locationsByPeriodMenuItem.setText("Locações Por Período");
        locationsByPeriodMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationsByPeriodMenuItemActionPerformed(evt);
            }
        });
        reportMenu.add(locationsByPeriodMenuItem);

        listMoviesMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Report.png"))); // NOI18N
        listMoviesMenuItem.setText("Listagem de Filmes");
        listMoviesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMoviesMenuItemActionPerformed(evt);
            }
        });
        reportMenu.add(listMoviesMenuItem);

        menuBar.add(reportMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ajuda");

        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/about_16.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Sobre");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void genresMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genresMenuItemActionPerformed
        genreController.list();
    }//GEN-LAST:event_genresMenuItemActionPerformed

    private void actorsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actorsMenuItemActionPerformed
        actorController.list();
    }//GEN-LAST:event_actorsMenuItemActionPerformed

    private void locationsByPeriodMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationsByPeriodMenuItemActionPerformed
        reportController.locationsByPeriod();
    }//GEN-LAST:event_locationsByPeriodMenuItemActionPerformed

    private void listMoviesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listMoviesMenuItemActionPerformed
        reportController.listMovies();
    }//GEN-LAST:event_listMoviesMenuItemActionPerformed

    private void reservationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationMenuItemActionPerformed
        reservationController.newReservation();
    }//GEN-LAST:event_reservationMenuItemActionPerformed

    private void locationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationMenuItemActionPerformed
        locationController.newLocation();
    }//GEN-LAST:event_locationMenuItemActionPerformed

    private void devolutionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolutionMenuItemActionPerformed
// TODO
    }//GEN-LAST:event_devolutionMenuItemActionPerformed

    private void moviesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviesMenuItemActionPerformed
        movieController.list();
    }//GEN-LAST:event_moviesMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void countriesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countriesMenuItemActionPerformed
        countryController.list();
    }//GEN-LAST:event_countriesMenuItemActionPerformed

    private void statesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statesMenuItemActionPerformed
        stateController.list();
    }//GEN-LAST:event_statesMenuItemActionPerformed

    private void citiesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citiesMenuItemActionPerformed
        cityController.list();
    }//GEN-LAST:event_citiesMenuItemActionPerformed

    private void employeesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesMenuItemActionPerformed
        employeeController.list();
    }//GEN-LAST:event_employeesMenuItemActionPerformed

    private void suppliersMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersMenuItemActionPerformed
        supplierController.list();
    }//GEN-LAST:event_suppliersMenuItemActionPerformed

    private void customersMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersMenuItemActionPerformed
        customerController.list();
    }//GEN-LAST:event_customersMenuItemActionPerformed

   private void loadControllers() {
        actorController = new ActorController(desktopPane);
        cityController = new CityController(desktopPane);
        countryController = new CountryController(desktopPane);
        genreController = new GenreController(desktopPane);
        locationController = new LocationController(desktopPane);
        movieController = new MovieController(desktopPane);
        customerController = new PersonController(desktopPane, "customer");
        supplierController = new PersonController(desktopPane, "supplier");
        employeeController = new PersonController(desktopPane, "employee");
        reportController = new ReportController(desktopPane);
        reservationController = new ReservationController(desktopPane);
        stateController = new StateController(desktopPane);        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        PlasticXPLookAndFeel.setPlasticTheme(new SkyBlue());
        
        try {
            javax.swing.UIManager.setLookAndFeel( new PlasticXPLookAndFeel() );
        } catch (javax.swing.UnsupportedLookAndFeelException ex) { // ClassNotFoundException | InstantiationException | IllegalAccessException | 
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem actorsMenuItem;
    private javax.swing.JMenuItem citiesMenuItem;
    private javax.swing.JMenuItem countriesMenuItem;
    private javax.swing.JMenuItem customersMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem devolutionMenuItem;
    private javax.swing.JMenuItem employeesMenuItem;
    private javax.swing.JMenu entriesMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem genresMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuItem listMoviesMenuItem;
    private javax.swing.JMenuItem locationMenuItem;
    private javax.swing.JMenuItem locationsByPeriodMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu movieMenu;
    private javax.swing.JMenuItem moviesMenuItem;
    private javax.swing.JMenu reportMenu;
    private javax.swing.JMenuItem reservationMenuItem;
    private javax.swing.JMenuItem statesMenuItem;
    private javax.swing.JMenuItem suppliersMenuItem;
    // End of variables declaration//GEN-END:variables
    
}
