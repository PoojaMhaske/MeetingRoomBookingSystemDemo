package com.digitas.RoomService.controller;

import com.digitas.RoomService.model.Room;
import com.digitas.RoomService.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/room")
public class RoomController {
    @Autowired
    RoomRepository roomRepo;

    // Get All Bookings
    @GetMapping("/list")
    public List<Room> getAllBookings() {
        return roomRepo.findAll();
    }

    @PostMapping("/add")
    public Room createBooking(@Valid @RequestBody Room room) {

        return roomRepo.save(room);
    }
}
