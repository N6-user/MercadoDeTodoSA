/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadodetodosa;

import javax.swing.JOptionPane;

/**
 *
 * @author nahue
 */
public class JIFGestionProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionProductos
     */
    public JIFGestionProductos() {
        initComponents();
        armarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlGestionProductos = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jlDescripcion = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jlStock = new javax.swing.JLabel();
        jlRubro = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfDescripcion = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        jtfStock = new javax.swing.JTextField();
        jcbRubro = new javax.swing.JComboBox<>();
        jbNuevo = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbBuscarCod = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlCodNuevo = new javax.swing.JLabel();

        setClosable(true);

        jlGestionProductos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlGestionProductos.setText("Gestión de Productos");

        jlCodigo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlCodigo.setText("Código");

        jlDescripcion.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlDescripcion.setText("Descripción");

        jlPrecio.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlPrecio.setText("Precio");

        jlStock.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlStock.setText("Stock");

        jlRubro.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlRubro.setText("Rubro");

        jtfCodigo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCodigoKeyReleased(evt);
            }
        });

        jtfDescripcion.setEditable(false);
        jtfDescripcion.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtfDescripcion.setEnabled(false);
        jtfDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDescripcionKeyReleased(evt);
            }
        });

        jtfPrecio.setEditable(false);
        jtfPrecio.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtfPrecio.setEnabled(false);
        jtfPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPrecioKeyReleased(evt);
            }
        });

        jtfStock.setEditable(false);
        jtfStock.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtfStock.setEnabled(false);
        jtfStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfStockKeyReleased(evt);
            }
        });

        jcbRubro.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jcbRubro.setEnabled(false);

        jbNuevo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.setEnabled(false);
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.setEnabled(false);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbBuscarCod.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbBuscarCod.setText("Buscar");
        jbBuscarCod.setEnabled(false);
        jbBuscarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarCodActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setEnabled(false);
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jlCodNuevo.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jlCodNuevo.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jlGestionProductos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jlPrecio)
                        .addGap(41, 41, 41)
                        .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jlRubro)
                        .addGap(42, 42, 42)
                        .addComponent(jcbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jlCodigo)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscarCod))
                            .addComponent(jlCodNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jlDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlStock)
                                .addGap(45, 45, 45)
                                .addComponent(jtfStock, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbGuardar)
                                        .addGap(40, 40, 40)
                                        .addComponent(jbCancelar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbNuevo)
                                        .addGap(40, 40, 40)
                                        .addComponent(jbModificar)
                                        .addGap(40, 40, 40)
                                        .addComponent(jbLimpiar)))
                                .addGap(40, 40, 40)
                                .addComponent(jbEliminar)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlGestionProductos)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCodigo)))
                    .addComponent(jbBuscarCod))
                .addGap(7, 7, 7)
                .addComponent(jlCodNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDescripcion))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPrecio))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlRubro))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlStock))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardar)
                    .addComponent(jbCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbModificar)
                        .addComponent(jbNuevo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbEliminar)
                        .addComponent(jbLimpiar)))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jlCodNuevo.setText("");
        // inhabilitar 
        jtfCodigo.setEnabled(false);
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbBuscarCod.setEnabled(false);
        // habilitar
        jbCancelar.setEnabled(true);
        jbLimpiar.setEnabled(true);
        jtfDescripcion.setEnabled(true);
        jtfPrecio.setEnabled(true);
        jtfStock.setEnabled(true);
        jcbRubro.setEnabled(true);
        // volver editable
        jtfDescripcion.setEditable(true);
        jtfPrecio.setEditable(true);
        jtfStock.setEditable(true);
        // volver enfocable
        jtfDescripcion.setFocusable(true);
        jtfPrecio.setFocusable(true);
        jtfStock.setFocusable(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbBuscarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCodActionPerformed
        // posible excepción al convertir String a tipos numéricos
        try {
            int cod = Integer.parseInt(jtfCodigo.getText());
            if (cod < 0) {
                JOptionPane.showMessageDialog(this, "El código debe ser un número entero no negativo.", "Datos inválidos", 0);
                return;
            }
            // Buscando en la estructura un producto con el código ingresado.             
            for (Producto prod : JFMenuGeneral.tsProductos) {
                if (prod.getCodigo() == cod) {
                    jlCodNuevo.setText("");
                    // habilitar
                    jtfDescripcion.setEnabled(true);
                    jtfPrecio.setEnabled(true);
                    jtfStock.setEnabled(true);
                    jbModificar.setEnabled(true);
                    jbEliminar.setEnabled(true);
                    // Se muestran sus datos en los campos correspondientes
                    jtfDescripcion.setText(prod.getDescripcion());
                    jtfPrecio.setText(prod.getPrecio() + "");
                    jtfStock.setText(prod.getStock() + "");
                    jcbRubro.setSelectedItem(prod.getRubro());
                    // volver no enfocable
                    jtfDescripcion.setFocusable(false);
                    jtfPrecio.setFocusable(false);
                    jtfStock.setFocusable(false);
                    return;
                }
            }
            // Si no se ha encontrado el producto en la estructura, se avisa al usuario y se habilita el botón "Nuevo".            
            JOptionPane.showMessageDialog(this, "No se ha encontrado en la lista de productos un producto almacenado\ncon el código ingresado.", "Código no encontrado", 1);
            jbNuevo.setEnabled(true);
            jlCodNuevo.setText("Este código puede usarse para registrar un nuevo producto.");
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "El código debe ser un número entero no negativo.", "Datos inválidos", 0);
        }
    }//GEN-LAST:event_jbBuscarCodActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // inhabilitar 
        jtfCodigo.setEnabled(false);
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbBuscarCod.setEnabled(false);
        // habilitar
        jbGuardar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbLimpiar.setEnabled(true);
        jcbRubro.setEnabled(true);
        // volver editable
        jtfDescripcion.setEditable(true);
        jtfPrecio.setEditable(true);
        jtfStock.setEditable(true);
        // volver enfocable
        jtfDescripcion.setFocusable(true);
        jtfPrecio.setFocusable(true);
        jtfStock.setFocusable(true);
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        if (jtfDescripcion.getText().equals("") && jtfPrecio.getText().equals("") && jtfStock.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No hay campos que limpiar.", "Campos vacíos", 1);
        } else {
            jtfDescripcion.setText("");
            jtfPrecio.setText("");
            jtfStock.setText("");
        }
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jtfCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoKeyReleased
        if (jtfCodigo.getText().compareTo("!") < 0) {
            jbBuscarCod.setEnabled(false);
        } else {
            jbBuscarCod.setEnabled(true);
        }
    }//GEN-LAST:event_jtfCodigoKeyReleased

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        // consultado si el usuario desea llevar a cabo la acción
        // 0 = Si, 1 = No
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro de realizar estos cambios en la lista de productos?", "Confirmar acción", 0) == 0) {
            // posible excepción al convertir String a tipos numéricos.
            boolean seEncontro = false;
            try {
                // tomando datos del formulario y comprobando datos numéricos coherentes            
                int stock = Integer.parseInt(jtfStock.getText());
                if (stock < 0) {
                    JOptionPane.showMessageDialog(this, "El stock debe ser un número entero mayor o igual que 0.", "Datos inválidos", 0);
                    return;
                }
                float precio = Float.parseFloat(jtfPrecio.getText());
                if (precio < 0) {
                    JOptionPane.showMessageDialog(this, "El precio debe ser un número real mayor o igual que 0.", "Datos inválidos", 0);
                    return;
                }
                int cod = Integer.parseInt(jtfCodigo.getText());    // no se evalúa la coherencia de "cod" porque, dada la manera en que está diseñado el programa, si se llega hasta este método, entonces ya se ha validado el contenido de "jtfCodigo"
                String descrip = jtfDescripcion.getText();
                Rubro rubro = (Rubro) jcbRubro.getSelectedItem();
                // revisa si ya aparece en un producto con el código buscado.
                for (Producto prod : JFMenuGeneral.tsProductos) {
                    if (prod.getCodigo() == cod) {
                        // modifica los datos del producto buscado
                        prod.setDescripcion(descrip);
                        prod.setPrecio(precio);
                        prod.setRubro(rubro);
                        prod.setStock(stock);
                        JOptionPane.showMessageDialog(this, "Se ha modificado el producto.", "Modificación completada", 1);
                        seEncontro = true;
                        break;
                    }
                }
                // si no se ha encontrado en la estructura un producto con el código buscado, entonces se agrega un nuevo producto con los datos ingresados en el formulario
                if (seEncontro == false) {
                    JFMenuGeneral.tsProductos.add(new Producto(cod, descrip, precio, stock, rubro));
                    JOptionPane.showMessageDialog(this, "El producto ha sido cargado correctamente.", "Carga completada", 1);
                }
                // limpiando los campos.
                jtfCodigo.setText("");
                jtfDescripcion.setText("");
                jtfPrecio.setText("");
                jtfStock.setText("");
                // volver ineditable
                jtfDescripcion.setEditable(false);
                jtfPrecio.setEditable(false);
                jtfStock.setEditable(false);
                jcbRubro.setEditable(false);
                // inhabilitar
                jtfDescripcion.setEnabled(false);
                jtfPrecio.setEnabled(false);
                jtfStock.setEnabled(false);
                jcbRubro.setEnabled(false);
                jbGuardar.setEnabled(false);
                jbCancelar.setEnabled(false);
                jbNuevo.setEnabled(false);
                jbModificar.setEnabled(false);
                jbEliminar.setEnabled(false);
                jbLimpiar.setEnabled(false);
                // habilitar
                jtfCodigo.setEnabled(true);
                jbBuscarCod.setEnabled(true);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Uno o más campos numéricos han sido llenados incorrectamente."
                        + "\nRecuede que el campo \"Stock\" sólo acepta enteros no negativos, mientras que el campo\n"
                        + "\"Precio\" sólo acepta números reales no negativos.", "Datos inválidos", 0);
            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtfDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDescripcionKeyReleased
        // revisando si alguno de los 'jtf' no tienen nada en su contenido o si sólo tiene espacios
        // esto se hace para evitar que queden producto con campos que no muestren información alguna
        if (jtfPrecio.getText().compareTo("!") < 0 || jtfDescripcion.getText().compareTo("!") < 0 || jtfPrecio.getText().compareTo("!") < 0 || jtfStock.getText().compareTo("!") < 0) {
            jbGuardar.setEnabled(false);
        } else {
            jbGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_jtfDescripcionKeyReleased

    private void jtfPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecioKeyReleased
        // revisando si alguno de los 'jtf' no tienen nada en su contenido o si sólo tiene espacios
        // esto se hace para evitar que queden producto con campos que no muestren información alguna
        if (jtfPrecio.getText().compareTo("!") < 0 || jtfDescripcion.getText().compareTo("!") < 0 || jtfPrecio.getText().compareTo("!") < 0 || jtfStock.getText().compareTo("!") < 0) {
            jbGuardar.setEnabled(false);
        } else {
            jbGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_jtfPrecioKeyReleased

    private void jtfStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfStockKeyReleased
        // revisando si alguno de los 'jtf' no tienen nada en su contenido o si sólo tiene espacios
        // esto se hace para evitar que queden producto con campos que no muestren información alguna
        if (jtfPrecio.getText().compareTo("!") < 0 || jtfDescripcion.getText().compareTo("!") < 0 || jtfPrecio.getText().compareTo("!") < 0 || jtfStock.getText().compareTo("!") < 0) {
            jbGuardar.setEnabled(false);
        } else {
            jbGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_jtfStockKeyReleased

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro de descartar cambios en la lista de productos?", "Confirmar acción", 0) == 0) {
            // volver ineditable
            jtfDescripcion.setEditable(false);
            jtfPrecio.setEditable(false);
            jtfStock.setEditable(false);
            jcbRubro.setEditable(false);
            //inhabilitar
            jcbRubro.setEnabled(false);
            // habilitar
            jtfCodigo.setEnabled(true);
            jbBuscarCod.setEnabled(true);
            // volver no enfocable
            jtfDescripcion.setFocusable(false);
            jtfPrecio.setFocusable(false);
            jtfStock.setFocusable(false);
            // revisa si ya aparece en un producto con el código buscado.
            int cod = Integer.parseInt(jtfCodigo.getText());    // no se evalúa la coherencia de "cod" porque, dada la manera en que está diseñado el programa, si se llega hasta este método, entonces ya se ha validado el contenido de "jtfCodigo"                        
            for (Producto prod : JFMenuGeneral.tsProductos) {
                if (prod.getCodigo() == cod) {
                    // se colocan los datos del producto en los campos correspondientes
                    jtfDescripcion.setText(prod.getDescripcion());
                    jtfPrecio.setText(prod.getPrecio() + "");
                    jtfStock.setText(prod.getStock() + "");
                    jcbRubro.setSelectedItem(prod.getRubro());
                    // inhabilitar
                    jbGuardar.setEnabled(false);
                    jbCancelar.setEnabled(false);
                    jbNuevo.setEnabled(false);
                    jbLimpiar.setEnabled(false);
                    // habilitar
                    jbEliminar.setEnabled(true);
                    jbModificar.setEnabled(true);
                    return;
                }
            }
            // si no se ha encontrado en la estructura un producto con el código buscado
            jlCodNuevo.setText("Este código puede usarse para registrar un nuevo producto.");
            // limpiando los campos.
            jtfDescripcion.setText("");
            jtfPrecio.setText("");
            jtfStock.setText("");
            // inhabilitar
            jtfDescripcion.setEnabled(false);
            jtfPrecio.setEnabled(false);
            jtfStock.setEnabled(false);
            jbGuardar.setEnabled(false);
            jbCancelar.setEnabled(false);
            jbModificar.setEnabled(false);
            jbEliminar.setEnabled(false);
            jbLimpiar.setEnabled(false);
        }
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // busca el producto cuyo código es el buscado
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar este producto?", "Confirmar acción", 0) == 0) {
            int cod = Integer.parseInt(jtfCodigo.getText());
            for (Producto prod : JFMenuGeneral.tsProductos) {
                if (prod.getCodigo() == cod) {
                    JFMenuGeneral.tsProductos.remove(prod);
                    // limpiar
                    jtfCodigo.setText("");
                    jtfDescripcion.setText("");
                    jtfPrecio.setText("");
                    jtfStock.setText("");
                    // habilitar
                    jtfCodigo.setEnabled(true);
                    jbBuscarCod.setEnabled(true);
                    // inhabilitar
                    jtfDescripcion.setEnabled(false);
                    jtfPrecio.setEnabled(false);
                    jtfStock.setEnabled(false);
                    jbModificar.setEnabled(false);
                    jbEliminar.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "El producto " + prod.getDescripcion() + " (código: " + cod + ") se ha eliminado de la lista de productos.", "Baja completada", 1);
                    return;
                }
            }
        }        
    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBuscarCod;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JComboBox<Rubro> jcbRubro;
    private javax.swing.JLabel jlCodNuevo;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlDescripcion;
    private javax.swing.JLabel jlGestionProductos;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlRubro;
    private javax.swing.JLabel jlStock;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfDescripcion;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JTextField jtfStock;
    // End of variables declaration//GEN-END:variables

    // métodos extra
    private void armarComboBox() {
        jcbRubro.addItem(Rubro.COMESTIBLE);
        jcbRubro.addItem(Rubro.LIMPIEZA);
        jcbRubro.addItem(Rubro.PERFUMERÍA);
    }
}