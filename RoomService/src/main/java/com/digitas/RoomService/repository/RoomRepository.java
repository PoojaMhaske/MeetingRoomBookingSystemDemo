package com.digitas.RoomService.repository;

import com.digitas.RoomService.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoomRepository extends JpaRepository<Room,Long> {

    @Query("FROM Room r where r.id= ?1")
    Room findByid(@Param("id") Long id);
}
