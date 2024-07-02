/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.controllerMoneda;
import Model.Moneda;
import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author roble
 */
public class convertidorMonedas extends javax.swing.JPanel {

    String primerCantidad;
    String segundaCantidad;
    
    public convertidorMonedas() {
        initComponents();
        InitStyle();
        carga_cambioMoneda();
    }

    private void InitStyle(){
        Border lineBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE);

        tituloLabel.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        tituloLabel.setForeground(Color.WHITE);
        
        descripcionLabel.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        descripcionLabel.setForeground(Color.WHITE);
        
        cantidadLabel.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        cantidadLabel.setForeground(Color.WHITE);
        
        convertidorLabel.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        convertidorLabel.setForeground(Color.WHITE);
        
        resultadoLabel.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        resultadoLabel.setForeground(Color.WHITE);
        
        conversor.setBackground(new Color(0x1587C0));
        conversor.setForeground(Color.WHITE);

        conversor.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(0x1587C0), 2),
            BorderFactory.createEmptyBorder(10, 20, 10, 20)
        ));
        conversor.setOpaque(true);
        conversor.setFocusPainted(false);
        
        cantidad.setBorder(BorderFactory.createEmptyBorder());
        cantidad.setBorder(lineBorder);
        cantidad.setForeground(Color.WHITE);
        cantidad.setOpaque(false);
        
        resultado.setBorder(BorderFactory.createEmptyBorder());
        resultado.setBorder(lineBorder);
        resultado.setForeground(Color.WHITE);
        resultado.setOpaque(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        descripcionLabel = new javax.swing.JLabel();
        cantidadLabel = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        itemsConvertidor2 = new javax.swing.JComboBox<>();
        convertidorLabel = new javax.swing.JLabel();
        itemsConvertidor1 = new javax.swing.JComboBox<>();
        conversor = new javax.swing.JButton();
        resultadoLabel = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("CONVERSOR DE MONEDAS");

        descripcionLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        descripcionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionLabel.setText("Escoge los tipos de monedas y la cantidad para la conversión");

        cantidadLabel.setText("Cantidad:");

        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        itemsConvertidor2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));

        convertidorLabel.setText("Seleccione la moneda para convertir su dinero");

        itemsConvertidor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));

        conversor.setText("Aceptar");
        conversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversorActionPerformed(evt);
            }
        });

        resultadoLabel.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertidorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(itemsConvertidor2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(59, 59, 59)
                            .addComponent(conversor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(itemsConvertidor1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(descripcionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(descripcionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(cantidadLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemsConvertidor1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(convertidorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemsConvertidor2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conversor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(resultadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void conversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversorActionPerformed
        if (!cantidad.getText().isEmpty()) {   
            if (!itemsConvertidor1.getSelectedItem().equals("Selecciona una opción")) {
                for (String[] Monedas : cambioMonedas) {
                    if (Monedas[0].equals(itemsConvertidor1.getSelectedItem())) {
                        primerCantidad = Monedas[0];
                    }
                }                              
                if (!itemsConvertidor2.getSelectedItem().equals("Selecciona una opción")) {
                    for (String[] tipoMonedas : cambioMonedas) {
                        if (tipoMonedas[0].equals(itemsConvertidor2.getSelectedItem())) {
                            segundaCantidad = tipoMonedas[0];
                        }
                    }
                    
                    buscarResultado(Double.parseDouble(cantidad.getText()), primerCantidad, segundaCantidad);

                }else{
                    JOptionPane.showMessageDialog(null, "Campo vacio: Tipo moneda", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    itemsConvertidor2.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Campo vacio: Tipo moneda", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                itemsConvertidor1.requestFocus();
            }
        
        }else{
            JOptionPane.showMessageDialog(null, "Campo vacio: Cantidad", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            cantidad.requestFocus();
        }
    }//GEN-LAST:event_conversorActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        char c = evt.getKeyChar();
        String text = cantidad.getText();
    
        if (!(Character.isDigit(c) || (c == '.' && text.indexOf('.') == -1))) {
            evt.consume();
            return;
        }
 
        if (c == '.' && text.isEmpty()) {
            evt.consume();
            return;
        }

        if (text.contains(".")) {
            int index = text.indexOf('.');
            String decimals = text.substring(index + 1);
            if (decimals.length() >= 2 && c != evt.VK_BACK_SPACE) {
                evt.consume();
            }
        }
        
    }//GEN-LAST:event_cantidadKeyTyped
    
    private void Limpiar_Añadir(){
        cantidad.setText("");
        itemsConvertidor1.setSelectedIndex(0);
        itemsConvertidor2.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JButton conversor;
    private javax.swing.JLabel convertidorLabel;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JComboBox<String> itemsConvertidor1;
    private javax.swing.JComboBox<String> itemsConvertidor2;
    private javax.swing.JTextField resultado;
    private javax.swing.JLabel resultadoLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
    int tam_monedas;
    String[][] cambioMonedas;

    private void carga_cambioMoneda() {
        controllerMoneda cm = new controllerMoneda();
        List<Moneda> lista = cm.getAllconversion();
        tam_monedas = lista.size();
        cambioMonedas = new String[tam_monedas][2];
        for (int i = 0; i < tam_monedas; i++) {
            cambioMonedas[i][0] = lista.get(i).getTipo();
            cambioMonedas[i][1] =Double.toString(lista.get(i).getCambio());
            itemsConvertidor1.addItem(lista.get(i).getTipo());
            itemsConvertidor2.addItem(lista.get(i).getTipo());
        }
    }
    
    private void buscarResultado(double cantidad, String from, String to) {
        
        controllerMoneda cm = new controllerMoneda();
        
        double resultadoConvert = cm.convertCurrency(from, to, cantidad);
        
        Limpiar_Añadir();
        
        resultado.setText(Double.toString(resultadoConvert));
        
    }
}
