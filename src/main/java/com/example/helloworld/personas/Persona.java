package com.example.helloworld.personas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Persona {
    private int id;
    private String nombre;
    private String apPat;
    private String apMaterno;
    private float sueldo;
    private boolean genero;
    
    /*
     CREATE TABLE Persona(
       id INT,
       nombre VARCHAR(64),
       apPat VARCHAR(64),
       apMaterno VARCHAR(64),
       sueldo DECIMAL,
       genero BOOLEAN,
       PRIMARY KEY(id)
     );
     INSERT INTO Persona Values(1, 'Gustavo', 'Arellano', 'Fox', 111.12, true);
     INSERT INTO Persona Values(2, 'Adolfo', 'Sandoval', 'Slim', 222.12, false);

    si una clase NO tiene NINGÚN constructor, java le asigna 
    de manera automática un constructor que no recibe parámetros 
    y que además NO efectúa ninguna operación especial. O sea,
    lo equivalente (en esta clase, a lo siguiente:)
    
    public Persona() {}

    Si la calse tiene AL MENOS 1 constructor creado por el programador,
    entonces java se olvida deque existe el constructor vacio mostrado 
    en el comentario anterior y sólo considera al (o a los) constructores
    creados por el programador.

    */
    
    public Persona() {
        System.out.println("hola " + toString());
    }
    public Persona(int numero) {
        System.out.println(numero);
    }
    public String toString() {
        return "adios";
    }
    
}
