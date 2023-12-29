package com.natureapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.natureapi.controller.UserController;
import com.natureapi.dto.DtoTools;
import com.natureapi.dto.LoginDto;
import com.natureapi.dto.UserDto;
import com.natureapi.dto.UserDto.UserRole;
import com.natureapi.entities.User;
import com.natureapi.repository.UserRepository;
import com.natureapi.service.UserService;
import com.natureapi.service.UserServiceImpl;

@SpringBootTest
class EssentiellementNatureApplicationTests {
	

	@Test
	void contextLoads() {
	}
	
//	@Autowired
//	private UserService userService;
//	
//	@Autowired
//	private UserController userController;

	// Mock du service
   // private UserService userService = mock(UserService.class);
    //private UserController userController = new UserController(userService);
    //private UserController userController;

//    @Test
//    public void testSaveUser() {
//        // Données de test
//        UserDto userDto = new UserDto();
//        userDto.setId(1L);
//        userDto.setFirstname("john.doe");
//
//        // Convertir UserDto en User pour la simulation
//        User user = DtoTools.convert(userDto, User.class);
//
//        // Créer un UserDto basé sur l'utilisateur sauvegardé
//        UserDto savedUserDto = DtoTools.convert(user, UserDto.class);
//
//        // Configuration du comportement du mock pour la méthode userService.save
//        when(userService.save(userDto)).thenReturn(savedUserDto);
//
//        // Exécution de la méthode save du controller
//        ResponseEntity<UserDto> responseEntity = userController.save(userDto);
//
//        // Vérification des résultats
//        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
//        assertNotNull(responseEntity.getBody());
//
//        // Vérification que la méthode userService.save a été appelée
//        verify(userService, times(1)).save(userDto);
//    }
    


//	    @Mock
//	    private UserRepository userRepository;
//
//	    @InjectMocks
//	    private UserServiceImpl userService;
//
//	    @Test
//	    public void testSaveUser() throws JsonMappingException, JsonProcessingException {
//	        UserRepository mockUserRepository = mock(UserRepository.class);
//	        doReturn(1L).when(mockUserRepository).save(Mockito.any(User.class));
//
//	        UserDto userDto = new UserDto();
//	        userDto.setEmail("johndoe@example.com");
//	        userDto.setFirstname("John");
//	        userDto.setLastName("Doe");
//	        userDto.setAge(18);
//
//	        // Convert the UserDto to a User
//	        ObjectMapper mapper = new ObjectMapper();
//	        User user = mapper.readValue(userDto.toString(), User.class);
//
//	        userService.save(user);
//
//	        verify(mockUserRepository).save(user);
//	    }
}
