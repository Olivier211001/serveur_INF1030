package com.example.demo.controller;

import com.example.demo.dto.AuthDTO;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    // test
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody AuthDTO authDTO) {
        try {
            Firestore db = FirestoreClient.getFirestore();

            ApiFuture<WriteResult> future = db.collection("auth")
                    .document(authDTO.getId())
                    .set(authDTO);

            WriteResult result = future.get(); // blocque ici pour simplifier

            return ResponseEntity.ok("Utilisateur enregistré à : " + result.getUpdateTime());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erreur lors de l'enregistrement : " + e.getMessage());
        }
    }
}
