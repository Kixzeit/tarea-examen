package com.example.helloworld.muebles;

import java.util.List;

public interface MuebleService {
    Mueble calcula(String string, String v1, String v2, String v3, String v4);
    List<Mueble> getAll();
}
