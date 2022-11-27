package com.anams.Model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Password {
    SecureRandom random = new SecureRandom();
    MessageDigest md;
    private static byte[] salt = new byte[16];

    private String password;

    public String hash(String pass){
        byte[] hash = md.digest(pass.getBytes());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < hash.length; i++){
            sb.append(hash[i]);
        }
        return sb.toString();
    }

    public Password(){
        createHash();
    }

    public Password(String password){
        createHash();

    }

    private void createHash() {
        try{
            md = MessageDigest.getInstance("SHA-512");
            random.nextBytes(salt);
            md.update(salt);
        }catch(NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public void setPassword(String password) { this.password = hash(password); }

}
