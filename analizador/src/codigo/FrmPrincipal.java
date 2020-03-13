/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

/**
 *
 * @author candelariasarahi
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private void AnalizarLexico() throws IOException{
        int cont=1;
        String expr=(String)txtEntrada.getText();
        lexer Lexer=new lexer(new StringReader(expr));
        String resultado="Linea: " + cont +"\t\tSimbolo\n";
        while(true){
            Tokens token =Lexer.yylex();
            if(token == null){
              txtLexico.setText(resultado);
              return;
            }
            switch(token){
                case Linea:
                    cont++;
                    resultado += "Linea: " + cont + "\n";
                    break;
                case Start:
                    resultado += " Reservada Start\t \t" + Lexer.lexeme + "\n";
                    break;
                case End:
                    resultado += " Reservada End\t \t" + Lexer.lexeme + "\n";
                    break;
                case Int:
                    resultado += " Reservada Int\t \t" + Lexer.lexeme + "\n";
                    break;
                case Float:
                    resultado += " Reservada Float\t \t" + Lexer.lexeme + "\n";
                    break;
                case String:
                    resultado += " Reservada String\t \t" + Lexer.lexeme + "\n";
                    break;
                case Ob:
                    resultado += " Reservada Ob\t \t" + Lexer.lexeme + "\n";
                    break;
                case If:
                    resultado += " Reservada If\t \t" + Lexer.lexeme + "\n";
                    break;
                case Default:
                    resultado += " Reservada Default\t \t" + Lexer.lexeme + "\n";
                    break;  
                case Def:
                    resultado += " Reservada Def\t \t" + Lexer.lexeme + "\n";
                    break;
                case Switch:
                    resultado += " Reservada Switch\t \t" + Lexer.lexeme + "\n";
                    break;
                case Op:
                    resultado += " Reservada Op\t \t" + Lexer.lexeme + "\n";
                    break;
                case While:
                    resultado += " Reservada While\t \t" + Lexer.lexeme + "\n";
                    break;
                case Wh:
                    resultado += " Reservada Wh\t \t" + Lexer.lexeme + "\n";
                    break;   
                case Sum:
                    resultado += " Operator Sum\t \t" + Lexer.lexeme + "\n";
                    break;
                case Substraction:
                    resultado += " Operator Subtraction\t \t" + Lexer.lexeme + "\n";
                    break;
                case Multiplication:
                    resultado += " Operator Multiplication\t \t" + Lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += " Operator Division\t \t" + Lexer.lexeme + "\n";
                    break;
                case GreatheThan:
                    resultado += " LogicalOperator GreaterThan\t \t" + Lexer.lexeme + "\n";
                    break;
                case LessThan:
                    resultado += " LogicalOperator LessThan\t \t" + Lexer.lexeme + "\n";
                    break;
                case Or:
                    resultado += " LogicalOperator Or\t \t" + Lexer.lexeme + "\n";
                    break;
                case And:
                    resultado += " LogicalOperator And\t \t" + Lexer.lexeme + "\n";
                    break;
                case Negative:
                    resultado += " LogicalOperator Negative\t \t" + Lexer.lexeme + "\n";
                    break;
                case DoublePoint:
                    resultado += " Symbol DoublePoint\t \t" + Lexer.lexeme + "\n";
                    break;
                case Parenthesis_O:
                    resultado += " Symbol Parenthesis_O\t \t" + Lexer.lexeme + "\n";
                    break;
                case Parenthesis_C:
                    resultado += " Symbol Parenthesis_C\t \t" + Lexer.lexeme + "\n";
                    break;
                case Init:
                    resultado += " Symbol Init\t" + Lexer.lexeme + "\n";
                    break;
            }
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLexico = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnLexico = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSin = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnSin = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MOpen = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MSave = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        txtEntrada.setColumns(20);
        txtEntrada.setRows(5);
        jScrollPane1.setViewportView(txtEntrada);

        txtLexico.setEditable(false);
        txtLexico.setColumns(20);
        txtLexico.setRows(5);
        jScrollPane2.setViewportView(txtLexico);

        jLabel2.setText("Lexical analyzer");

        btnLexico.setText("Analyze");
        btnLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLexicoActionPerformed(evt);
            }
        });

        txtSin.setEditable(false);
        txtSin.setColumns(20);
        txtSin.setRows(5);
        jScrollPane3.setViewportView(txtSin);

        jLabel3.setText("Syntactic parse");

        btnSin.setText("Analyze");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        MOpen.setText("File");

        jMenuItem1.setText("Open");
        MOpen.add(jMenuItem1);

        MSave.setText("Save");
        MOpen.add(MSave);

        jMenuBar1.add(MOpen);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(btnLexico))
                            .addComponent(jScrollPane2)))
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)
                        .addComponent(btnSin)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLexico)
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnSin))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLexicoActionPerformed
        try {
            // TODO add your handling code here:
            AnalizarLexico();
            /* File archivo=new File("archivo.txt");
            PrintWriter escribir;
            try {
            escribir=new PrintWriter(archivo);
            escribir.print(txtEntrada.getText());
            escribir.close();
            } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
            Reader lector=new BufferedReader(new FileReader("archivo.txt"));
            lexer Lexer=new lexer(lector);
            String resultado="";
            while(true){
            Tokens tokens=Lexer.yylex();
            if(tokens == null){
            resultado+="End";
            txtLexico.setText(resultado);
            return;
            }
            switch(tokens){
            case ERROR:
            resultado="Symbol not found";
            break;
            case Identifier: case Number: case ReservedWord:
            resultado += Lexer.lexeme + " Is a " + tokens + "\n";
            break;
            default:
            resultado += "Token: " + tokens + "\n";
            break;  
            }
            }
            } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            */
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_btnLexicoActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        // TODO add your handling code here:
          String ST=txtEntrada.getText();
        Sintax s= new Sintax(new codigo.lexerCup(new StringReader(ST)));

        try{
            s.parse();
            txtSin.setText("Analisis Realizado correctamente");
            txtSin.setForeground(Color.GREEN);
        }catch(Exception ex){
            Symbol sym=s.getS();
            txtSin.setText("Syntax ERROR. Linea: " + (sym.right + 1) + "Column: " + (sym.left +1) + "Text: \"" + sym.value + "\"");
        }
    }//GEN-LAST:event_btnSinActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MOpen;
    private javax.swing.JMenuItem MSave;
    private javax.swing.JButton btnLexico;
    private javax.swing.JButton btnSin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JTextArea txtLexico;
    private javax.swing.JTextArea txtSin;
    // End of variables declaration//GEN-END:variables
}
