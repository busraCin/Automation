import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class MovieScreen extends javax.swing.JDialog {
    
    DefaultTableModel model;
    AutomationProcesses aProcesses = new AutomationProcesses();
    
    
    public MovieScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) movieTable.getModel();
        viewMovie();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        movieTable = new javax.swing.JTable();
        searchBar = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        movieBar = new javax.swing.JTextField();
        genreBar = new javax.swing.JTextField();
        hallBar = new javax.swing.JTextField();
        timeBar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        messageBar = new javax.swing.JLabel();
        addMovie = new javax.swing.JButton();
        update = new javax.swing.JButton();
        deleteBar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));

        movieTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "film", "tür", "salon", "süre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        movieTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movieTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(movieTable);
        if (movieTable.getColumnModel().getColumnCount() > 0) {
            movieTable.getColumnModel().getColumn(0).setResizable(false);
            movieTable.getColumnModel().getColumn(1).setResizable(false);
            movieTable.getColumnModel().getColumn(2).setResizable(false);
            movieTable.getColumnModel().getColumn(3).setResizable(false);
            movieTable.getColumnModel().getColumn(4).setResizable(false);
        }

        searchBar.setBackground(new java.awt.Color(204, 204, 204));
        searchBar.setForeground(new java.awt.Color(153, 153, 153));
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        jLabel1.setText("Film : ");

        jLabel2.setText(" Tür :");

        jLabel3.setText("Salon : ");

        jLabel4.setText("Süre : ");

        movieBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieBarActionPerformed(evt);
            }
        });

        messageBar.setForeground(new java.awt.Color(153, 153, 255));
        messageBar.setText("-");

        addMovie.setBackground(new java.awt.Color(204, 204, 255));
        addMovie.setText("Film Ekle");
        addMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(204, 204, 255));
        update.setText("Güncelle");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        deleteBar.setBackground(new java.awt.Color(204, 204, 255));
        deleteBar.setText("Sil");
        deleteBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchBar)
                            .addComponent(jSpinner1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(genreBar, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(movieBar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timeBar)
                                    .addComponent(hallBar, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addMovie, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(messageBar, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hallBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(timeBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(movieBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addMovie))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(genreBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(deleteBar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)))
                .addComponent(messageBar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void dynamicSearch(String search){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        movieTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }
    
    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        String search = searchBar.getText();
        dynamicSearch(search);
    }//GEN-LAST:event_searchBarKeyReleased

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void movieBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movieBarActionPerformed

    private void addMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieActionPerformed
        messageBar.setText("");
        String movie = movieBar.getText();
        String genre = genreBar.getText();
        String hall = hallBar.getText();
        String time = timeBar.getText();
        
        aProcesses.addMovie(movie,genre,hall,time);
        
        viewMovie();
        messageBar.setText("Film Başarılı Bir Şekilde Eklendi");
        
    }//GEN-LAST:event_addMovieActionPerformed

    private void movieTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movieTableMouseClicked
        int selectedrow = movieTable.getSelectedRow();
        
        movieBar.setText(model.getValueAt(selectedrow, 1).toString());
        genreBar.setText(model.getValueAt(selectedrow, 2).toString());
        hallBar.setText(model.getValueAt(selectedrow, 3).toString());
        timeBar.setText(model.getValueAt(selectedrow, 4).toString());
    }//GEN-LAST:event_movieTableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        String movie = movieBar.getText();
        String genre = genreBar.getText();
        String hall = hallBar.getText();
        String time = timeBar.getText();
        
        int selectedrow = movieTable.getSelectedRow();
         
         if(selectedrow == -1){
             if(model.getRowCount() == 0){
                 messageBar.setText("Tablo Boş");
             }else{
                 messageBar.setText("Lütfen Güncellemek İstediğiniz Filmi Seçiniz");
             }
         }else{
             int id = (int)model.getValueAt(selectedrow,0);
             aProcesses.movieUpdate(id,movie,genre,hall,time);
             viewMovie();
             messageBar.setText("Güncelleme İşlemi Yapıldı");
         }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBarActionPerformed
       messageBar.setText("");
       int selectedrow = movieTable.getSelectedRow();
       if(selectedrow == -1){
           if(model.getRowCount() == 0){
               messageBar.setText("Tablo Boş");
           }else{
               messageBar.setText("Lütfen Silmek İstediğiniz Filmi Seçiniz");
           }
       }else{
           int id = (int)model.getValueAt(selectedrow,0);
           aProcesses.deleteMovie(id);
           viewMovie();
           messageBar.setText("Silme İşlemi Gerçekleştirildi");
       }
    }//GEN-LAST:event_deleteBarActionPerformed

    
    public void viewMovie(){
        model.setRowCount(0);
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies = aProcesses.fetchMovie();
        if(movies != null){
            for(Movie movie : movies){
                Object[] added = {movie.getId(),movie.getMovie(),movie.getGenre(),movie.getHall(),movie.getTime()};
                model.addRow(added);
            }
        }
     
    }
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MovieScreen dialog = new MovieScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMovie;
    private javax.swing.JButton deleteBar;
    private javax.swing.JTextField genreBar;
    private javax.swing.JTextField hallBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel messageBar;
    private javax.swing.JTextField movieBar;
    private javax.swing.JTable movieTable;
    private javax.swing.JTextField searchBar;
    private javax.swing.JTextField timeBar;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
