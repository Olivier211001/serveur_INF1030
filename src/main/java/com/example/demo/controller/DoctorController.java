package com.example.demo.controller;

import com.example.demo.dto.DoctorDTO;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {

    @PostMapping("/create")
    public ResponseEntity<String> createDoctor(@RequestBody DoctorDTO doctorDTO) {
        try {
            Firestore db = FirestoreClient.getFirestore();

            ApiFuture<WriteResult> future = db.collection("doctors")
                    .document(doctorDTO.getId())
                    .set(doctorDTO);

            WriteResult result = future.get();

            return ResponseEntity.ok("Docteur ajouté à : " + result.getUpdateTime());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erreur Firestore : " + e.getMessage());
        }
    }
}
