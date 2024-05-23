/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author veman
 */
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import controller.ConectarDao;
import controller.Usuariodao;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Acesso;
import model.User;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        PanelImg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelLogin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passSenha = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        Entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        PanelImg.setBackground(new java.awt.Color(161, 236, 242));
        PanelImg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4725909-cute-corgi-dog-abracando-gato-vetor Mask.png"))); // NOI18N
        PanelImg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 310, 310));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 3.png"))); // NOI18N
        PanelImg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 400, 440));

        getContentPane().add(PanelImg);
        PanelImg.setBounds(0, 0, 500, 500);

        PanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        PanelLogin.setMinimumSize(new java.awt.Dimension(350, 500));
        PanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(59, 61, 75));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pet Finder");
        jLabel3.setToolTipText("");
        PanelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 110));

        textLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        textLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLoginActionPerformed(evt);
            }
        });
        PanelLogin.add(textLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(59, 61, 75));
        jLabel4.setText("Senha");
        PanelLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(59, 61, 75));
        jLabel5.setText("Email");
        PanelLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        passSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        PanelLogin.add(passSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 240, 40));

        jButton2.setBackground(new java.awt.Color(243, 246, 230));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(59, 61, 75));
        jButton2.setText("Criar conta");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelLogin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 90, 40));

        Entrar.setBackground(new java.awt.Color(161, 236, 242));
        Entrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Entrar.setForeground(new java.awt.Color(59, 61, 75));
        Entrar.setText("Entrar");
        Entrar.setBorder(null);
        Entrar.setBorderPainted(false);
        Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarMouseClicked(evt);
            }
        });
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        PanelLogin.add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 90, 40));

        getContentPane().add(PanelLogin);
        PanelLogin.setBounds(500, 0, 300, 500);

        setSize(new java.awt.Dimension(816, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLoginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_EntrarActionPerformed

    private void EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseClicked
        // TODO add your handling code here:
        logar();

    }//GEN-LAST:event_EntrarMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        CriarConta criarconta = new CriarConta();
        criarconta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ConectarDao dao = new ConectarDao();
        dao.verificaOuCriaBD();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JPanel PanelImg;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField passSenha;
    private javax.swing.JTextField textLogin;
    // End of variables declaration//GEN-END:variables

    private void logar() {
        try {
            String user_login, user_pass;
            

            

            user_login = textLogin.getText();
            user_pass = passSenha.getText();
            

            User objuser = new User();
            objuser.setEmail(user_login);
            objuser.setPass(user_pass);
            

            Usuariodao objuserdao = new Usuariodao();
            ResultSet rsusuariodao = objuserdao.autenticar(objuser);

            if (rsusuariodao.next()) {
                //chamar a tela que eu quero abrir
                int acesso = rsusuariodao.getInt("cod_acesso");
                
                if(acesso == 1){
                
                TelaInicioADM objinicioadm = new TelaInicioADM(rsusuariodao.getInt("id_user"));
                
                
                objinicioadm.setVisible(true);
                dispose();
                }
                else if(acesso == 2){
                                    
                TelaInicioUSER objinicio = new TelaInicioUSER(rsusuariodao.getInt("id_user"));
                objinicio.setVisible(true);
                dispose();
                }

            } else {
                //enviar msg dizendo que está incorreto
                JOptionPane.showMessageDialog(null, "E-mail ou Senha inválida");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Login" + e);
        }
    }
    


    
    

}
