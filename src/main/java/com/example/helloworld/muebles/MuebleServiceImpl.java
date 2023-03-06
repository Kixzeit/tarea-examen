package com.example.helloworld.muebles;

import java.util.List;

import org.springframework.stereotype.Service;

@Service(value = "primeraImplementacion")
public class MuebleServiceImpl implements MuebleService {
    private MuebleMapper muebleMapper;
    
    public MuebleServiceImpl(MuebleMapper muebleMapper) {
        this.muebleMapper = muebleMapper;
    }
    public Mueble calcula(String ua, String v1, String v2, String v3, String v4) {
        return muebleMapper.getById(7534);
    }
    @Override
    public List<Mueble> getAll() {
        return muebleMapper.getAll();
    }
}
