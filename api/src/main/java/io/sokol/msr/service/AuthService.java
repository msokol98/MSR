package io.sokol.msr.service;

import io.sokol.msr.pojo.AuthRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<?> authenticate(AuthRequest request);
}
