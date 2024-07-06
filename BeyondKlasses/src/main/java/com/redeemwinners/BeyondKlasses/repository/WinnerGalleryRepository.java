package com.redeemwinners.BeyondKlasses.repository;

import com.redeemwinners.BeyondKlasses.model.WinnerGallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WinnerGalleryRepository extends JpaRepository<WinnerGallery,Long> {
}
