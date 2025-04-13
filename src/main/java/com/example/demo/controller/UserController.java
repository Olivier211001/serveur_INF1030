package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody UserDTO userDTO) {
        try {
            Firestore db = FirestoreClient.getFirestore();

            // Génère un ID automatique
            String userId = UUID.randomUUID().toString();

            DocumentReference docRef = db.collection("users").document(userId);
            ApiFuture<WriteResult> result = docRef.set(userDTO);

            return ResponseEntity.ok("Utilisateur créé à : " + result.get().getUpdateTime());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erreur Firestore : " + e.getMessage());
        }
    }
}
