package com.example.helloworld.muebles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mueble {
    private int id;
    private String nombre;
    private String color;
    private float precio;
    private boolean agotado;
    
    /*
    CREATE TABLE Mueble (
      id INT,
      nombre VARCHAR(64),
      color VARCHAR(64),
      precio DECIMAL,
      agotado BOOLEAN,
      PRIMARY KEY(id)
    );
    INSERT INTO Persona Values(117, 'silla', 'roja',124.50, false);
    INSERT INTO Persona Values(118, 'sofa', 'chocolate', 222.12, false);
    */
}
