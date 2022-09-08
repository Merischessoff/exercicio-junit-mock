package org.acme.usercase;

import org.acme.entity.User;

public class UserUseCase implements IUser{
    boolean result = false;
    @Override
    public boolean registerUser(String name, String password) {
        if(password.length() >= 8){
                User u = new User();
                u.setNome(name);
                u.setPassword(password);
            
            result = true;
        }
        return result;
    }
}
