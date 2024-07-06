package com.redeemwinners.BeyondKlasses.controller;

import com.redeemwinners.BeyondKlasses.model.WinnerGallery;
import com.redeemwinners.BeyondKlasses.service.WinnerGalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/winnergallery")
public class WinnerGalleryController {
    @Autowired
    private WinnerGalleryService winnerGalleryService;

    @GetMapping
    public List<WinnerGallery> getAllWinnerGalleries(){
        return winnerGalleryService.getAllWinnerGalleries();
    }
    @PostMapping
    public WinnerGallery createWinnerGallery(@RequestBody WinnerGallery winnerGallery){
        return winnerGalleryService.createWinnerGallery(winnerGallery);
    }
    @GetMapping("/{id}")
    public Optional <WinnerGallery> getWinnerGalleryById(@PathVariable Long id ){
        return winnerGalleryService.getWinnerGalleryById(id);
    }
    @PutMapping("/{id}")
    public WinnerGallery updateWinnerGalleryById(@PathVariable Long id , @RequestBody WinnerGallery winnerGallery){
        return winnerGalleryService.updateWinnerGalleryById(id,winnerGallery);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity <Void> deleteWinnerGalleryById(@PathVariable Long id){
        try {
            winnerGalleryService.deleteWinnerGalleryById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch(RuntimeException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


    }





}
