package com.gomatch.jogae.service;

import com.gomatch.jogae.repos.PrateleiraRepository;
import org.springframework.stereotype.Service;

@Service
public class PrateleiraService {
    final PrateleiraRepository prateleiraRepository;
    public PrateleiraService(PrateleiraRepository prateleiraRepository){
        this.prateleiraRepository = prateleiraRepository;
    }
}
