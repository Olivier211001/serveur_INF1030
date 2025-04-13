package com.example.demo.controller;

import com.example.demo.dto.NurseDTO;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nurse")
public class NurseController {

    @PostMapping("/create")
    public ResponseEntity<String> createNurse(@RequestBody NurseDTO nurseDTO) {
        try {
            Firestore db = FirestoreClient.getFirestore();

            ApiFuture<WriteResult> future = db.collection("nurses")
                    .document(nurseDTO.getId())
                    .set(nurseDTO);

            WriteResult result = future.get();

            return ResponseEntity.ok("Infirmier(ère) enregistré(e) à : " + result.getUpdateTime());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erreur Firestore : " + e.getMessage());
        }
    }
}
