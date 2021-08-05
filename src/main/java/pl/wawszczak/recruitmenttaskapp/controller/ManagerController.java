package pl.wawszczak.recruitmenttaskapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.wawszczak.recruitmenttaskapp.entity.dto.ManagerDto;
import pl.wawszczak.recruitmenttaskapp.entity.dto.ManagerGetDto;
import pl.wawszczak.recruitmenttaskapp.service.ManagerService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/managers")
public class ManagerController {

    private final ManagerService managerService;

    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping
    public ResponseEntity<Set<ManagerDto>> getAllManagers(){
        return new ResponseEntity<>(managerService.getAllManagers(), HttpStatus.OK);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<ManagerGetDto> getManagerById(@PathVariable Long id){
        return new ResponseEntity<>(managerService.getManagerById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ManagerDto> createNewManager(@RequestBody ManagerDto managerDto){
        return new ResponseEntity<>(managerService.createManager(managerDto), HttpStatus.CREATED);
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<ManagerDto> updateManager(@PathVariable Long id, @RequestBody ManagerDto managerDto){
        return new ResponseEntity<>(managerService.updateManager(id, managerDto), HttpStatus.OK);

    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteManager(@PathVariable Long id){
        managerService.deleteManager(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping({"/{id}"})
    public ResponseEntity<ManagerDto> patchManager(@PathVariable Long id, @RequestBody  ManagerDto managerDto){
        return new ResponseEntity<>(managerService.patchManager(id, managerDto), HttpStatus.OK);

    }

}
