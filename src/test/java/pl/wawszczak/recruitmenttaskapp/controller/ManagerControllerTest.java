package pl.wawszczak.recruitmenttaskapp.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pl.wawszczak.recruitmenttaskapp.entity.Manager;
import pl.wawszczak.recruitmenttaskapp.entity.Position;
import pl.wawszczak.recruitmenttaskapp.entity.dto.ManagerDto;
import pl.wawszczak.recruitmenttaskapp.entity.dto.ManagerGetDto;
import pl.wawszczak.recruitmenttaskapp.service.ManagerService;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ManagerController.class)
class ManagerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ManagerService managerService;


    @Test
    void getAllManagers() throws Exception {
        Set<ManagerDto> managers = new HashSet<>(Arrays.asList(new ManagerDto("Paweł Wawszczak", "21321", Position.MANAGER_EXPERT, "Polska")));

        when(managerService.getAllManagers()).thenReturn(managers);

        mockMvc.perform(MockMvcRequestBuilders.
                get("/api/manager").
                contentType(MediaType.APPLICATION_JSON)).
                andExpect(status().isOk()).
                andExpect(jsonPath("$", hasSize(1))).
                andExpect(jsonPath("$[0].fullName", is("Paweł Wawszczak")));
    }

    @Test
    void getManagerById() {
        ManagerGetDto managerGetDto = new ManagerGetDto();
        fail();
    }

    @Test
    void createNewManager() {
        fail();
    }
}