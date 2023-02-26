package com.example.station_de_ski2.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.station_de_ski2.entities.Piste;
public interface PisteRepository extends JpaRepository <Piste, Long> {
}
