package com.singo.Account.config;

import com.singo.Account.token.TokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogoutService  {

  private final TokenRepository tokenRepository;
  
  public void logout(String authHeader) {
    if (authHeader == null ||!authHeader.startsWith("Bearer ")) {
      return;
    }
    String jwt = authHeader.substring(7);
    var storedToken = tokenRepository.findByToken(jwt)
        .orElse(null);
    if (storedToken != null) {
      storedToken.setExpired(true);
      storedToken.setRevoked(true);
      tokenRepository.save(storedToken);
      SecurityContextHolder.clearContext();
    }
  }
}
