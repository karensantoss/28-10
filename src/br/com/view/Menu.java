/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

/**
 *
 * @author karen_luiz
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public Menu() {
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

        jPanel1 = new javax.swing.JPanel();
        btLivro = new javax.swing.JButton();
        btAutor = new javax.swing.JButton();
        btEditora = new javax.swing.JButton();
        btColecao = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btProfessor = new javax.swing.JButton();
        Diretor = new javax.swing.JButton();
        DVD = new javax.swing.JButton();
        assunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btLivro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btLivro.setText("Livros");
        btLivro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray));
        btLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLivroActionPerformed(evt);
            }
        });

        btAutor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAutor.setText("Autores");
        btAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutorActionPerformed(evt);
            }
        });

        btEditora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btEditora.setText("Editoras");
        btEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditoraActionPerformed(evt);
            }
        });

        btColecao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btColecao.setText(" Coleção");
        btColecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btColecaoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Disciplinas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btProfessor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btProfessor.setText("Professor");
        btProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProfessorActionPerformed(evt);
            }
        });

        Diretor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Diretor.setText("Diretor");
        Diretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiretorActionPerformed(evt);
            }
        });

        DVD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DVD.setText("DVD");
        DVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DVDActionPerformed(evt);
            }
        });

        assunto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        assunto.setText("Assunto");
        assunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Diretor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btColecao, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(btLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEditora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(DVD, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(assunto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Diretor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(DVD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btColecao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(assunto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLivroActionPerformed
        ListarLivrosGUI gui = new ListarLivrosGUI ();
        gui.setVisible(true);
    }//GEN-LAST:event_btLivroActionPerformed

    private void btAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutorActionPerformed
         ListarAutorGUI gui = new ListarAutorGUI ();
        gui.setVisible(true);
    }//GEN-LAST:event_btAutorActionPerformed

    private void btEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditoraActionPerformed
         ListarEditoraGUI gui = new ListarEditoraGUI ();
        gui.setVisible(true);
    }//GEN-LAST:event_btEditoraActionPerformed

    private void btColecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btColecaoActionPerformed
        ListarColecaoGUI gui = new ListarColecaoGUI ();
        gui.setVisible(true);
    }//GEN-LAST:event_btColecaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListarDisciplinaGUI gui = new ListarDisciplinaGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProfessorActionPerformed
        ListarProfessorGUI gui = new ListarProfessorGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_btProfessorActionPerformed

    private void DiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiretorActionPerformed
ListarDiretorGUI gui = new ListarDiretorGUI();
        gui.setVisible(true);

    }//GEN-LAST:event_DiretorActionPerformed

    private void DVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DVDActionPerformed
      ListarDvdGUI gui = new ListarDvdGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_DVDActionPerformed

    private void assuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assuntoActionPerformed
        ListarAssuntoGUI gui = new ListarAssuntoGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_assuntoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DVD;
    private javax.swing.JButton Diretor;
    private javax.swing.JButton assunto;
    private javax.swing.JButton btAutor;
    private javax.swing.JButton btColecao;
    private javax.swing.JButton btEditora;
    private javax.swing.JButton btLivro;
    private javax.swing.JButton btProfessor;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
