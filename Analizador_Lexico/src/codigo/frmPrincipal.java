/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
 
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author candelariasarahi
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Yoyo");
    }
    public String AbrirArchivo(File archivo){
    String documento = "";
    try{
     entrada = new FileInputStream(archivo);
     int ascci;
     while((ascci=entrada.read())!=-1){
     char caracter = (char)ascci;
     documento+= caracter;
     }
    }
    catch(Exception e){
    
    }
    return documento;
    } 
    public String GuardarArchivo(File archivo,String documento){
    String mensaje=null;
    try{
    salida = new FileOutputStream(archivo);
    byte [] bytxt = documento.getBytes();
    salida.write(bytxt);
    mensaje="Archivo guardado";
    }
    catch(Exception e){
    }
    return mensaje;
    }
    private void AnalizarLexico() throws IOException{
        int cont=1;
        String expr=(String)txtEntrada.getText();
        Lexer lexer=new Lexer(new StringReader(expr));
        String resultado="Linea: " + cont +"\t\tSimbolo\n";
        while(true){
            Tokens token =lexer.yylex();
            if(token == null){
              txtResultado.setText(resultado);
              return;
            }
            switch(token){
                case Linea:
                    cont++;
                    resultado += "Linea: " + cont + "\n";
                    break;
                case Start:
                    resultado += " Reservada Start\t" + lexer.lexeme + "\n";
                    break;
                case End:
                    resultado += " Reservada End\t" + lexer.lexeme + "\n";
                    break;
                case Int:
                    resultado += " Reservada Int\t" + lexer.lexeme + "\n";
                    break;
                case Float:
                    resultado += " Reservada Float\t" + lexer.lexeme + "\n";
                    break;
                case String:
                    resultado += " Reservada String\t" + lexer.lexeme + "\n";
                    break;
                case Ob:
                    resultado += " Reservada Ob\t" + lexer.lexeme + "\n";
                    break;
                case If:
                    resultado += " Reservada If\t" + lexer.lexeme + "\n";
                    break;
                case Default:
                    resultado += " Reservada Default\t" + lexer.lexeme + "\n";
                    break;  
                case Def:
                    resultado += " Reservada Def\t" + lexer.lexeme + "\n";
                    break;
                case Switch:
                    resultado += " Reservada Switch\t" + lexer.lexeme + "\n";
                    break;
                case Op:
                    resultado += " Reservada Op\t" + lexer.lexeme + "\n";
                    break;
                case While:
                    resultado += " Reservada While\t" + lexer.lexeme + "\n";
                    break;
                case Wh:
                    resultado += " Reservada Wh\t" + lexer.lexeme + "\n";
                    break;   
                case Sum:
                    resultado += " Operator Sum\t" + lexer.lexeme + "\n";
                    break;
                case Subtraction:
                    resultado += " Operator Subtraction\t" + lexer.lexeme + "\n";
                    break;
                case Multiplication:
                    resultado += " Operator Multiplication\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += " Operator Division\t" + lexer.lexeme + "\n";
                    break;
                case GreaterThan:
                    resultado += " LogicalOperator GreaterThan\t" + lexer.lexeme + "\n";
                    break;
                case LessThan:
                    resultado += " LogicalOperator LessThan\t" + lexer.lexeme + "\n";
                    break;
                case Or:
                    resultado += " LogicalOperator Or\t" + lexer.lexeme + "\n";
                    break;
                case And:
                    resultado += " LogicalOperator And\t" + lexer.lexeme + "\n";
                    break;
                case Negative:
                    resultado += " LogicalOperator Negative\t" + lexer.lexeme + "\n";
                    break;
                case DoublePoint:
                    resultado += " Symbol DoublePoint\t" + lexer.lexeme + "\n";
                    break;
                case Parenthesis_O:
                    resultado += " Symbol Parenthesis_O\t" + lexer.lexeme + "\n";
                    break;
                case Parenthesis_C:
                    resultado += " Symbol Parenthesis_C\t" + lexer.lexeme + "\n";
                    break;
                case Init:
                    resultado += " Symbol Init\t" + lexer.lexeme + "\n";
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
        btnAnalyze = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSintactico = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnAnalyzeSin = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        MenuOpen = new javax.swing.JMenuItem();
        MenuSave = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/yoyoIcon.png"))); // NOI18N

        btnAnalyze.setText("Analyze");
        btnAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jLabel2.setText("Analizador Lexico");

        txtSintactico.setColumns(20);
        txtSintactico.setRows(5);
        jScrollPane2.setViewportView(txtSintactico);

        jLabel3.setText("Analizador Sintactico");

        btnAnalyzeSin.setText("Analyze");
        btnAnalyzeSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeSinActionPerformed(evt);
            }
        });

        txtEntrada.setColumns(20);
        txtEntrada.setRows(5);
        jScrollPane3.setViewportView(txtEntrada);

        jMenu3.setText("File");

        MenuOpen.setText("Open");
        MenuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOpenActionPerformed(evt);
            }
        });
        jMenu3.add(MenuOpen);

        MenuSave.setText("Save");
        MenuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSaveActionPerformed(evt);
            }
        });
        jMenu3.add(MenuSave);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)
                                .addComponent(btnAnalyzeSin)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAnalyze)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnalyze)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnAnalyzeSin))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeActionPerformed
        try {
            AnalizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*File archivo=new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir =new PrintWriter(archivo);
            escribir.print(txtEntrada.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Reader lector =new BufferedReader(new FileReader("archivo.txt"));
            Lexer lexer =new Lexer(lector);
            String resultado="";
            while (true) {                
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "End";
                    txtResultado.setText(resultado);
                    return;
                }
                switch(tokens){
                    case ERROR:
                        resultado += "Undefined symbol \n";
                        break;
                    case Identifier: case Number: case ReserverWord:
                        resultado += lexer.lexeme + " :Is a " + tokens +"\n";
                        break;
                    default:
                        resultado += "Tokens: " + tokens + "\n";
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_btnAnalyzeActionPerformed

    private void MenuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOpenActionPerformed
        // TODO add your handling code here:
        if(seleccionar.showDialog(null,"Abrir")==JFileChooser.APPROVE_OPTION){
  archivo = seleccionar.getSelectedFile();
  if(archivo.canRead()){
   if(archivo.getName().endsWith("txt")){
       String documento = AbrirArchivo(archivo);
       txtEntrada.setText(documento);
    } else{ JOptionPane.showMessageDialog(null, "Archivo no compatible"); }
   }
  } 
    }//GEN-LAST:event_MenuOpenActionPerformed

    private void MenuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSaveActionPerformed
        // TODO add your handling code here:
        if(seleccionar.showDialog(null, "Guardar")==JFileChooser.APPROVE_OPTION){
       archivo = seleccionar.getSelectedFile();
       if(archivo.getName().endsWith("txt")){
       String Documento = txtEntrada.getText();
       String mensaje = GuardarArchivo(archivo, Documento);
       if(mensaje!=null){
       JOptionPane.showMessageDialog(null, mensaje);
       } else { JOptionPane.showMessageDialog(null, "Archivo no compatible"); }
       } else { JOptionPane.showMessageDialog(null, "Guardar documento de texto"); }
      }
    }//GEN-LAST:event_MenuSaveActionPerformed

    private void btnAnalyzeSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeSinActionPerformed
        // TODO add your handling code here:
        String ST=txtEntrada.getText();
        Sintax s= new Sintax(new codigo.LexerCup(new StringReader(ST)));

        try{
            s.parse();
            txtSintactico.setText("Analisis Realizado correctamente");
            txtSintactico.setForeground(Color.GREEN);
        }catch(Exception ex){
            Symbol sym=s.getS();
            txtSintactico.setText("Syntax ERROR. Linea: " + (sym.right + 1) + "Column: " + (sym.left +1) + "Text: \"" + sym.value + "\"");
        }
    }//GEN-LAST:event_btnAnalyzeSinActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuOpen;
    private javax.swing.JMenuItem MenuSave;
    private javax.swing.JButton btnAnalyze;
    private javax.swing.JButton btnAnalyzeSin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextArea txtSintactico;
    // End of variables declaration//GEN-END:variables
}
