package Classes;

import Formularios.frmLogin;


public class SistemaDeVendas {

 
    public static void main(String[] args) {
        Dados msDados = new Dados();
        frmLogin miLogin = new frmLogin();
        miLogin.setDados(msDados);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
    
}
