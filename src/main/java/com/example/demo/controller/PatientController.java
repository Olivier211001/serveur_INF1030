package com.example.demo.controller;

import com.example.demo.dto.PatientDTO;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/patients")
@CrossOrigin(origins = "*") // Autorise les requêtes Android
public class PatientController {

    @PostMapping
    public ResponseEntity<?> ajouterPatient(@RequestBody PatientDTO patientDTO) {
        try {
            Firestore db = FirestoreClient.getFirestore();

            Map<String, Object> data = new HashMap<>();
            data.put("nom", patientDTO.getNom());
            data.put("prenom", patientDTO.getPrenom());
            data.put("sex", patientDTO.getSex());
            data.put("dob", patientDTO.getDob());
            data.put("adresse", patientDTO.getAdresse());
            data.put("tel", patientDTO.getTel());
            data.put("email", patientDTO.getEmail());
            data.put("photo", patientDTO.getPhoto());

            String documentId = (patientDTO.getId() != null && !patientDTO.getId().isEmpty())
                    ? patientDTO.getId()
                    : db.collection("patients").document().getId();

            ApiFuture<WriteResult> result = db.collection("patients").document(documentId).set(data);

            return ResponseEntity.ok("Patient enregistré avec l'ID : " + documentId);

        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erreur : " + e.getMessage());
        }
    }
}
