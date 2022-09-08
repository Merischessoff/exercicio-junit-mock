package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.acme.usercase.IUser;
import org.acme.usercase.UserUseCase;
import org.junit.jupiter.api.*;;

public class UserTest {

    @Test
    void testRegisterSuccess(){
        IUser uc = new UserUseCase();
        boolean result = uc.registerUser("Meri", "12345678");
        assertEquals(true, result);
    }

    @Test
    void testRegisterFail(){
        IUser uc = new UserUseCase();
        //boolean result = uc.registerUser("Meri", "12345");
        //assertEquals(false, result);
        Assertions.assertThrows(IllegalAccessException.class, ()->{
            uc.registerUser("Meri", "12345"); 
        )};
    }
    
}
