package com.example.demo.controller;

import com.example.demo.dto.VisitDTO;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/visit")
public class VisitController {

    @PostMapping("/create")
    public ResponseEntity<String> createVisit(@RequestBody VisitDTO visitDTO) {
        try {
            Firestore db = FirestoreClient.getFirestore();

            // Utilise un UUID comme clé du document
            String visitId = UUID.randomUUID().toString();

            ApiFuture<WriteResult> future = db.collection("visits")
                    .document(visitId)
                    .set(visitDTO);

            WriteResult result = future.get();

            return ResponseEntity.ok("Visite enregistrée à : " + result.getUpdateTime());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erreur Firestore : " + e.getMessage());
        }
    }
}
