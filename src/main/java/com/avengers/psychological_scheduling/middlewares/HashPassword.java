package com.avengers.psychological_scheduling.middlewares;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class HashPassword {
  public static String getSalt() {
    return BCrypt.gensalt(10);
  }

  public static String hash(String plainPassword, String salt) {
    return BCrypt.hashpw(plainPassword, salt);
  }

  public static boolean validateHash(String hashedPassword, String plainPassword) {
    return BCrypt.checkpw(plainPassword, hashedPassword);
  }
}
