package com.redeemwinners.BeyondKlasses.service;

import com.redeemwinners.BeyondKlasses.model.WinnerGallery;
import com.redeemwinners.BeyondKlasses.repository.WinnerGalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WinnerGalleryService {
    @Autowired
    private WinnerGalleryRepository winnerGalleryRepository;

    public List<WinnerGallery> getAllWinnerGalleries() {
        return winnerGalleryRepository.findAll();
    }

    public WinnerGallery createWinnerGallery(WinnerGallery winnerGallery) {
        return winnerGalleryRepository.save(winnerGallery);
    }

    public Optional<WinnerGallery> getWinnerGalleryById(Long id) {
        return winnerGalleryRepository.findById(id);
    }
    public WinnerGallery updateWinnerGalleryById(Long id, WinnerGallery winnerGallery) {
        winnerGallery.setId(id);
        return winnerGalleryRepository.save(winnerGallery);

    }

    public void deleteWinnerGalleryById(Long id) {
        Optional<WinnerGallery> winnerGallery = winnerGalleryRepository.findById(id);
        if(winnerGallery .isPresent()){
            winnerGalleryRepository.deleteById(id);
        } else {
            throw new RuntimeException("winnerGallery not found with id " + id);
        }

        }
    }



