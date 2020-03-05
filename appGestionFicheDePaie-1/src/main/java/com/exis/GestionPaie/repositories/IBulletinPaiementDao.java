package com.exis.GestionPaie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exis.GestionPaie.entities.BulletinPaiement;



public interface IBulletinPaiementDao  extends JpaRepository<BulletinPaiement, Long> {

}
